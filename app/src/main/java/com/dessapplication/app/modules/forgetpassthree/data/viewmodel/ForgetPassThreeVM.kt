package com.dessapplication.app.modules.forgetpassthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.forgetpassthree.`data`.model.ForgetPassThreeModel
import org.koin.core.KoinComponent

class ForgetPassThreeVM : ViewModel(), KoinComponent {
  val forgetPassThreeModel: MutableLiveData<ForgetPassThreeModel> =
      MutableLiveData(ForgetPassThreeModel())

  var navArguments: Bundle? = null
}
