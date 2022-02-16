package impactrudia.aop.inventoryappalone01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import impactrudia.aop.inventoryappalone01.databinding.FragmentItemDetailBinding
import impactrudia.aop.inventoryappalone01.databinding.FragmentItemListBinding

internal class ItemDetailFragment : Fragment() {

    lateinit var binding: FragmentItemDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentItemDetailBinding.inflate(layoutInflater)
        return binding.root
    }
}