package com.dessapplication.app.modules.forgetpass.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.forgetpass.`data`.model.ForgetPassModel
import org.koin.core.KoinComponent

class ForgetPassVM : ViewModel(), KoinComponent {
  val forgetPassModel: MutableLiveData<ForgetPassModel> = MutableLiveData(ForgetPassModel())

  var navArguments: Bundle? = null
}
