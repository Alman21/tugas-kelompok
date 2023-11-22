package com.dessapplication.app.modules.forgetpass.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityForgetPassBinding
import com.dessapplication.app.modules.forgetpass.`data`.viewmodel.ForgetPassVM
import com.dessapplication.app.modules.forgetpassone.ui.ForgetPassOneActivity
import com.dessapplication.app.modules.forgetpasstwo.ui.ForgetPassTwoActivity
import kotlin.String
import kotlin.Unit

class ForgetPassActivity : BaseActivity<ActivityForgetPassBinding>(R.layout.activity_forget_pass) {
  private val viewModel: ForgetPassVM by viewModels<ForgetPassVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtResetdenganem.setOnClickListener {
      val destIntent = ForgetPassTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnKirimkanKode.setOnClickListener {
      val destIntent = ForgetPassOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
