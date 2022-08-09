package uz.gita.eventsapp.presentation.ui.screen

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.gita.eventsapp.R
import uz.gita.eventsapp.databinding.ScreenTestBinding
import uz.gita.eventsapp.presentation.service.TestService

class TestScreen : Fragment(R.layout.screen_test), CompoundButton.OnCheckedChangeListener {

    private val viewBinding by viewBinding(ScreenTestBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewBinding.switchScreenOn.setOnCheckedChangeListener(this)
        viewBinding.switchScreenOff.setOnCheckedChangeListener(this)
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        val intent = Intent(requireContext(), TestService::class.java)
        when (buttonView) {
            viewBinding.switchScreenOn -> {
                intent.putExtra("START_SERVICE", isChecked)
                intent.action = "SCREEN_ON"
                requireContext().startService(intent)
            }
            viewBinding.switchScreenOff -> {
                intent.putExtra("START_SERVICE", isChecked)
                intent.action = "SCREEN_OFF"
                requireContext().startService(intent)
            }
        }
    }

}