package impactrudia.aop.inventoryappalone01

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import impactrudia.aop.inventoryappalone01.databinding.FragmentItemListBinding

internal class ItemListFragment : Fragment() {

    lateinit var binding: FragmentItemListBinding
    private val adapter = ItemAdapter {
        val action =
            ItemListFragmentDirections.actionItemListFragmentToItemDetailFragment(it.id)
        findNavController().navigate(action)
    }

    private val viewModel: InventoryViewModel by activityViewModels {
        InventoryViewModelFactory(
            (activity?.application as InventoryApplication).database.itemDao()
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentItemListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            recyclerView.adapter = adapter
            floatingActionButton.setOnClickListener {
                val actionId = ItemListFragmentDirections.actionItemListFragmentToAddItemFragment("", -1)
                findNavController().navigate(actionId)
            }
        }

        viewModel.allItems.observe(this.viewLifecycleOwner) { items ->
            items.let {
                adapter.submitList(it)
            }
        }
    }
}