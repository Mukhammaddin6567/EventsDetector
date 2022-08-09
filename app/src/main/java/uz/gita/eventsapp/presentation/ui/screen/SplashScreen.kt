package uz.gita.eventsapp.presentation.ui.screen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import uz.gita.eventsapp.R
import uz.gita.eventsapp.presentation.viewmodel.SplashViewModel
import uz.gita.eventsapp.presentation.viewmodel.impl.SplashViewModelImpl

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashScreen : Fragment(R.layout.screen_splash) {

    private val viewModel: SplashViewModel by viewModels<SplashViewModelImpl>()

    override fun onCreate(savedInstanceState: Bundle?) = with(viewModel) {
        super.onCreate(savedInstanceState)
        navigateMainScreenLiveData.observe(this@SplashScreen) {
            findNavController().navigate(R.id.action_splashScreen_to_eventsScreen)
        }
    }

}