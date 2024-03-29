package impactrudia.aop.inventoryappalone01.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

internal abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    protected lateinit var binding: VB
    abstract fun getViewBindig(): VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getViewBindig()
        return binding.root
    }
}