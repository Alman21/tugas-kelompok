package com.dessapplication.app.modules.forgetpassone.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgetPassOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifikasiKode: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_verifikasi_kode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukkankodee: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukkan_kode_e)

)
