package com.dessapplication.app.modules.forgetpassone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityForgetPassOneBinding
import com.dessapplication.app.modules.forgetpassone.`data`.viewmodel.ForgetPassOneVM
import com.dessapplication.app.modules.forgetpassthree.ui.ForgetPassThreeActivity
import kotlin.String
import kotlin.Unit

class ForgetPassOneActivity :
    BaseActivity<ActivityForgetPassOneBinding>(R.layout.activity_forget_pass_one) {
  private val viewModel: ForgetPassOneVM by viewModels<ForgetPassOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSelanjutnya.setOnClickListener {
      val destIntent = ForgetPassThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
