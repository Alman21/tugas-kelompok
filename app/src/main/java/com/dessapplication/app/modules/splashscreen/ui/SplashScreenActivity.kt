package com.dessapplication.app.modules.splashscreen.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivitySplashScreenBinding
import com.dessapplication.app.modules.splashscreen.`data`.viewmodel.SplashScreenVM
import com.dessapplication.app.modules.splashscreentwo.ui.SplashScreenTwoActivity
import kotlin.String
import kotlin.Unit

class SplashScreenActivity :
    BaseActivity<ActivitySplashScreenBinding>(R.layout.activity_splash_screen) {
  private val viewModel: SplashScreenVM by viewModels<SplashScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = SplashScreenTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.imageCosmopilteThree.setOnClickListener {
        val destIntent = SplashScreenTwoActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "SPLASH_SCREEN_ACTIVITY"

    }
  }
