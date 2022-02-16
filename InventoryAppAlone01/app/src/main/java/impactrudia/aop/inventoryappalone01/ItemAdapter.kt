package impactrudia.aop.inventoryappalone01

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import impactrudia.aop.inventoryappalone01.data.entitiy.Item
import impactrudia.aop.inventoryappalone01.databinding.ItemListItemBinding
import kotlinx.coroutines.NonDisposableHandle.parent

class ItemAdapter(private val onItemClicked: (Item)->Unit) :
    ListAdapter<Item, ItemAdapter.ItemViewHolder>(DiffCallback) {
//    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */


    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ItemViewHolder {
       return ItemViewHolder(
           ItemListItemBinding.inflate(
               LayoutInflater.from(viewGroup.context)
           )
       )
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ItemViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
//        viewHolder.textView.text = dataSet[position].name
        val current = getItem(position)
        viewHolder.itemView.setOnClickListener {
            onItemClicked(current)
        }
        viewHolder.bind(current)
    }

    // Return the size of your dataset (invoked by the layout manager)
//    override fun getItemCount() = dataSet.size

    class ItemViewHolder(private var binding: ItemListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        //     val textView: TextView
        init {
            // Define click listener for the ViewHolder's View.
//            textView = view.findViewById(R.id.item_name)
        }

        fun bind(item: Item) {
            binding.itemName.text = item.name
            binding.itemPrice.text = item.price.toString()
            binding.itemQuantity.text = item.count.toString()
        }
    }

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<Item>() {
            override fun areItemsTheSame(oldItem: Item, newItem: Item): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(oldItem: Item, newItem: Item): Boolean {
                return oldItem.name == newItem.name
            }
        }
    }
}