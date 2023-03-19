package com.example.pariscafe

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Menu(val image :Int,val name:String?,val fiyat:String?) :Parcelable