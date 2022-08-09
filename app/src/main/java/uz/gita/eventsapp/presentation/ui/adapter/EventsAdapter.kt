package uz.gita.eventsapp.presentation.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.gita.eventsapp.R
import uz.gita.eventsapp.data.local.model.EventData
import uz.gita.eventsapp.databinding.ItemEventBinding

class EventsAdapter : ListAdapter<EventData, EventsAdapter.Holder>(EventsAdapterDiffUtils) {

    private var onEventStateChangeListener: ((eventId: Int, eventState: Boolean) -> Unit)? = null

    private object EventsAdapterDiffUtils : DiffUtil.ItemCallback<EventData>() {
        override fun areItemsTheSame(oldItem: EventData, newItem: EventData): Boolean =
            oldItem.id == newItem.id

        override fun areContentsTheSame(oldItem: EventData, newItem: EventData): Boolean =
            oldItem == newItem
    }

    inner class Holder(private val viewBinding: ItemEventBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        init {
            viewBinding.container.setOnClickListener {
                val data = getItem(absoluteAdapterPosition)
                val state = !data.actionState
                data.actionState = state
                onEventStateChangeListener?.invoke(data.id, state)
                viewBinding.statusEvent.isChecked = state
            }
            viewBinding.statusEvent.setOnClickListener {
                val data = getItem(absoluteAdapterPosition)
                val state = !data.actionState
                data.actionState = state
                onEventStateChangeListener?.invoke(data.id, state)
                viewBinding.statusEvent.isChecked = state
            }
        }

        fun bind() = with(getItem(absoluteAdapterPosition)) {
            viewBinding.apply {
                imageEvent.setImageResource(actionIcon)
                textEvent.text = itemView.resources.getString(actionName)
                statusEvent.isChecked = actionState
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder = Holder(
        ItemEventBinding.bind(
            LayoutInflater.from(parent.context).inflate(R.layout.item_event, parent, false)
        )
    )

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind()
    }

    fun setOnEventStateChangeListener(block: (eventId: Int, eventState: Boolean) -> Unit) {
        onEventStateChangeListener = block
    }

}