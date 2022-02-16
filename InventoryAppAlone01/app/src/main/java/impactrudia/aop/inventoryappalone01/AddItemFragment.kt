package impactrudia.aop.inventoryappalone01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import impactrudia.aop.inventoryappalone01.databinding.FragmentAddItemBinding

class AddItemFragment : Fragment() {

    lateinit var binding: FragmentAddItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAddItemBinding.inflate(layoutInflater)
        return binding.root
    }
}