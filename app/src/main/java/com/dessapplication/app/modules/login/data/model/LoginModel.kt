package com.dessapplication.app.modules.login.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatDatang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_datang2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukkanemail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukkan_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlamatemail: String? = MyApp.getInstance().resources.getString(R.string.lbl_alamat_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLupaPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_lupa_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAtauBelumPuny: String? =
      MyApp.getInstance().resources.getString(R.string.msg_atau_belum_puny)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null
)
