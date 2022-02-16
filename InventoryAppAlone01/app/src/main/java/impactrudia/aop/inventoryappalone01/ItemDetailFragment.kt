package impactrudia.aop.inventoryappalone01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import impactrudia.aop.inventoryappalone01.data.entitiy.Item
import impactrudia.aop.inventoryappalone01.databinding.FragmentItemDetailBinding
import impactrudia.aop.inventoryappalone01.databinding.FragmentItemListBinding

internal class ItemDetailFragment : Fragment() {

    lateinit var binding: FragmentItemDetailBinding
    lateinit var item: Item
    val args: ItemDetailFragmentArgs by navArgs()

    private val viewModel: InventoryViewModel by activityViewModels {
        InventoryViewModelFactory(
            (activity?.application as InventoryApplication).database.itemDao()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentItemDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getItem(args.itemId).observe(this.viewLifecycleOwner){
            item = it
            binding.apply {
                itemName.text = item.name
                itemCount.text = item.count.toString()
                itemPrice.text = item.price.toString()
            }
        }

        binding.apply {
            sellItem.setOnClickListener {
                viewModel.countDown(item)
            }
            deleteItem.setOnClickListener {
                viewModel.deleteItem(item)
                findNavController().navigateUp()
            }
            editItem.setOnClickListener {
                val actionId = ItemDetailFragmentDirections.actionItemDetailFragmentToAddItemFragment("", args.itemId)
                findNavController().navigate(actionId)
            }
        }

    }
}