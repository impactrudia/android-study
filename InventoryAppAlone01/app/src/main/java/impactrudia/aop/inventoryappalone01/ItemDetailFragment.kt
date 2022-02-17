package impactrudia.aop.inventoryappalone01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import impactrudia.aop.inventoryappalone01.base.BaseFragment
import impactrudia.aop.inventoryappalone01.data.entitiy.Item
import impactrudia.aop.inventoryappalone01.databinding.FragmentItemDetailBinding

internal class ItemDetailFragment : BaseFragment<FragmentItemDetailBinding>() {

    private val args: ItemDetailFragmentArgs by navArgs()
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
        binding = FragmentItemDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getItem(args.itemId).observe(this.viewLifecycleOwner) {
            item = it
            binding.apply {
                itemName.text = item.name
                itemCount.text = item.count.toString()
                itemPrice.text = item.price.toString()
                sellItem.setOnClickListener {
                    viewModel.countDown(item)
                }
                deleteItem.setOnClickListener {
                    viewModel.deleteItem(item)
                    findNavController().navigateUp()
                }
                editItem.setOnClickListener {
                    val actionId =
                        ItemDetailFragmentDirections.actionItemDetailFragmentToAddItemFragment(
                            "",
                            args.itemId
                        )
                    findNavController().navigate(actionId)
                }
            }
        }
    }

    override fun getViewBindig(): FragmentItemDetailBinding =
        FragmentItemDetailBinding.inflate(layoutInflater)
}