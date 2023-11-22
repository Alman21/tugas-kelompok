package com.dessapplication.app.modules.forgetpassone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.forgetpassone.`data`.model.ForgetPassOneModel
import org.koin.core.KoinComponent

class ForgetPassOneVM : ViewModel(), KoinComponent {
  val forgetPassOneModel: MutableLiveData<ForgetPassOneModel> =
      MutableLiveData(ForgetPassOneModel())

  var navArguments: Bundle? = null
}
