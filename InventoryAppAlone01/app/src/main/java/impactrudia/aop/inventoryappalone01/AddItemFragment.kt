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
import impactrudia.aop.inventoryappalone01.databinding.FragmentAddItemBinding

class AddItemFragment : Fragment() {

    lateinit var binding: FragmentAddItemBinding
    val args: ItemDetailFragmentArgs by navArgs()
    lateinit var item: Item

    private val viewModel: InventoryViewModel by activityViewModels {
        InventoryViewModelFactory(
            (activity?.application as InventoryApplication).database.itemDao()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddItemBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getItem(args.itemId).observe(viewLifecycleOwner) {
            binding.apply {
                item = it
                itemName.setText(it.name)
                itemCount.setText(it.count.toString())
                itemPrice.setText(it.price.toString())
            }
        }

        binding.apply {
            saveAction.setOnClickListener {
                if(args.itemId > 0){
                    item.id = args.itemId
//                    viewModel.updateItem(item.copy(
//                        itemName.text.toString(),
//                        itemPrice.text.toString().toDouble(),
//                        itemCount.text.toString().toInt()
//                    ))
                    findNavController().navigateUp()
                }else{
                    viewModel.saveItem(
                        itemName.text.toString(),
                        itemPrice.text.toString(),
                        itemCount.text.toString()
                    )
                    val actionId = AddItemFragmentDirections.actionAddItemFragmentToItemListFragment()
                    findNavController().navigate(actionId)
                }

            }
        }
    }
}