package dev.ygordoring.apipkmn.model

import android.content.Context
import android.os.Parcelable
import android.widget.FrameLayout
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Tipo (
        val name:String,
        val url: String
        ): Parcelable
{
        fun getThumbnail(context: Context,frameLayout: FrameLayout ): Int {
                setColor(context.resources
                        .getIdentifier("ic_type_"+name+"_foreground","drawable",context.packageName) ,frameLayout)
                return context.resources
                        .getIdentifier(name,"drawable",context.packageName)
        }

        fun setColor(int:Int, frameLayout: FrameLayout) {
                frameLayout.setBackgroundResource(int)

        }
}