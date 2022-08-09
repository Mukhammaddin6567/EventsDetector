package uz.gita.eventsapp.presentation.ui.dialog

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import uz.gita.eventsapp.R
import uz.gita.eventsapp.databinding.DialogBottomBinding

class EventDialog : BottomSheetDialogFragment() {

    private val viewBinding by viewBinding(DialogBottomBinding::bind)
    private var onClickShareListener: (() -> Unit)? = null
    private var onClickRateListener: (() -> Unit)? = null
    private var onClickDisableAllEventsListener: (() -> Unit)? = null
    private var onClickEnableAllEventsListener: (() -> Unit)? = null
    private var onClickQuitAppListener: (() -> Unit)? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_bottom, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(viewBinding) {
        buttonEnableAllEvents.setOnClickListener { onClickEnableAllEventsListener?.invoke(); dismiss() }
        buttonDisableAllEvents.setOnClickListener { onClickDisableAllEventsListener?.invoke(); dismiss() }
        buttonShare.setOnClickListener { onClickShareListener?.invoke(); dismiss() }
        buttonRate.setOnClickListener { onClickRateListener?.invoke(); dismiss() }
        buttonQuit.setOnClickListener { onClickQuitAppListener?.invoke(); dismiss() }
    }

    fun setOnClickEnableAllEventsListener(block: () -> Unit) {
        onClickEnableAllEventsListener = block
    }

    fun setOnClickDisableAllEventsListener(block: () -> Unit) {
        onClickDisableAllEventsListener = block
    }

    fun setOnClickShareListener(block: () -> Unit) {
        onClickShareListener = block
    }

    fun setOnClickRateListener(block: () -> Unit) {
        onClickRateListener = block
    }

    fun setOnClickQuitAppListener(block: () -> Unit) {
        onClickQuitAppListener = block
    }
}