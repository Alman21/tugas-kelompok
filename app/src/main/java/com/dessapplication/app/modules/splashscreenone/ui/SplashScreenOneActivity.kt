package com.dessapplication.app.modules.splashscreenone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivitySplashScreenOneBinding
import com.dessapplication.app.modules.login.ui.LoginActivity
import com.dessapplication.app.modules.signin.ui.SigninActivity
import com.dessapplication.app.modules.splashscreenone.`data`.viewmodel.SplashScreenOneVM
import kotlin.String
import kotlin.Unit

class SplashScreenOneActivity :
    BaseActivity<ActivitySplashScreenOneBinding>(R.layout.activity_splash_screen_one) {
  private val viewModel: SplashScreenOneVM by viewModels<SplashScreenOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnSignIn.setOnClickListener {
      val destIntent = SigninActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SPLASH_SCREEN_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashScreenOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
