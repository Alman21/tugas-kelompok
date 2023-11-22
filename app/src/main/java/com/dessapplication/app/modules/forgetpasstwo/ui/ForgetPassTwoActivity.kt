package com.dessapplication.app.modules.forgetpasstwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityForgetPassTwoBinding
import com.dessapplication.app.modules.forgetpass.ui.ForgetPassActivity
import com.dessapplication.app.modules.forgetpassone.ui.ForgetPassOneActivity
import com.dessapplication.app.modules.forgetpasstwo.`data`.viewmodel.ForgetPassTwoVM
import kotlin.String
import kotlin.Unit

class ForgetPassTwoActivity :
    BaseActivity<ActivityForgetPassTwoBinding>(R.layout.activity_forget_pass_two) {
  private val viewModel: ForgetPassTwoVM by viewModels<ForgetPassTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtResetdenganno.setOnClickListener {
      val destIntent = ForgetPassActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnKirimkanKode.setOnClickListener {
      val destIntent = ForgetPassOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
