package com.dessapplication.app.modules.forgetpasstwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.forgetpasstwo.`data`.model.ForgetPassTwoModel
import org.koin.core.KoinComponent

class ForgetPassTwoVM : ViewModel(), KoinComponent {
  val forgetPassTwoModel: MutableLiveData<ForgetPassTwoModel> =
      MutableLiveData(ForgetPassTwoModel())

  var navArguments: Bundle? = null
}
