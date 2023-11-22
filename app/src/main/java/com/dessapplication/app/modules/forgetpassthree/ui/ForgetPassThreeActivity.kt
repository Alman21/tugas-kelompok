package com.dessapplication.app.modules.forgetpassthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityForgetPassThreeBinding
import com.dessapplication.app.modules.forgetpassthree.`data`.viewmodel.ForgetPassThreeVM
import com.dessapplication.app.modules.login.ui.LoginActivity
import kotlin.String
import kotlin.Unit

class ForgetPassThreeActivity :
    BaseActivity<ActivityForgetPassThreeBinding>(R.layout.activity_forget_pass_three) {
  private val viewModel: ForgetPassThreeVM by viewModels<ForgetPassThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAturUlangSandiOne.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
