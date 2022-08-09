package uz.gita.eventsapp.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import uz.gita.eventsapp.data.local.entity.EventEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class EventDao_Impl implements EventDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EventEntity> __insertionAdapterOfEventEntity;

  private final SharedSQLiteStatement __preparedStmtOfChangeEventState;

  private final SharedSQLiteStatement __preparedStmtOfEnableAllEventStates;

  private final SharedSQLiteStatement __preparedStmtOfDisableAllEventStates;

  public EventDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEventEntity = new EntityInsertionAdapter<EventEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `events` (`id`,`actionIcon`,`action`,`actionName`,`actionState`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EventEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindLong(2, value.getActionIcon());
        if (value.getAction() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAction());
        }
        stmt.bindLong(4, value.getActionName());
        final int _tmp = value.getActionState() ? 1 : 0;
        stmt.bindLong(5, _tmp);
      }
    };
    this.__preparedStmtOfChangeEventState = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update events set actionState=? where id=?";
        return _query;
      }
    };
    this.__preparedStmtOfEnableAllEventStates = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update events set actionState=1";
        return _query;
      }
    };
    this.__preparedStmtOfDisableAllEventStates = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "update events set actionState=0";
        return _query;
      }
    };
  }

  @Override
  public Object insertInitialEvents(final List<EventEntity> events,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEventEntity.insert(events);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object changeEventState(final int eventId, final boolean state,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfChangeEventState.acquire();
        int _argIndex = 1;
        final int _tmp = state ? 1 : 0;
        _stmt.bindLong(_argIndex, _tmp);
        _argIndex = 2;
        _stmt.bindLong(_argIndex, eventId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfChangeEventState.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object enableAllEventStates(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfEnableAllEventStates.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfEnableAllEventStates.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object disableAllEventStates(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDisableAllEventStates.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDisableAllEventStates.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object isAvailableEvents(final Continuation<? super Boolean> continuation) {
    final String _sql = "select exists (select * from events)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllEvents(final Continuation<? super List<EventEntity>> continuation) {
    final String _sql = "select * from events";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<EventEntity>>() {
      @Override
      public List<EventEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfActionIcon = CursorUtil.getColumnIndexOrThrow(_cursor, "actionIcon");
          final int _cursorIndexOfAction = CursorUtil.getColumnIndexOrThrow(_cursor, "action");
          final int _cursorIndexOfActionName = CursorUtil.getColumnIndexOrThrow(_cursor, "actionName");
          final int _cursorIndexOfActionState = CursorUtil.getColumnIndexOrThrow(_cursor, "actionState");
          final List<EventEntity> _result = new ArrayList<EventEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EventEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final int _tmpActionIcon;
            _tmpActionIcon = _cursor.getInt(_cursorIndexOfActionIcon);
            final String _tmpAction;
            if (_cursor.isNull(_cursorIndexOfAction)) {
              _tmpAction = null;
            } else {
              _tmpAction = _cursor.getString(_cursorIndexOfAction);
            }
            final int _tmpActionName;
            _tmpActionName = _cursor.getInt(_cursorIndexOfActionName);
            final boolean _tmpActionState;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfActionState);
            _tmpActionState = _tmp != 0;
            _item = new EventEntity(_tmpId,_tmpActionIcon,_tmpAction,_tmpActionName,_tmpActionState);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
