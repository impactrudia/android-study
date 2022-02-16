package impactrudia.aop.inventoryappalone01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import impactrudia.aop.inventoryappalone01.databinding.FragmentItemListBinding

internal class ItemListFragment : Fragment() {

    lateinit var binding: FragmentItemListBinding

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
            floatingActionButton.setOnClickListener {
                val actionId = ItemListFragmentDirections.actionItemListFragmentToAddItemFragment("", -1)
                findNavController().navigate(actionId)
            }
        }
    }

}