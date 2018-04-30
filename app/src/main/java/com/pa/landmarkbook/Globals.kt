package com.pa.landmarkbook

import android.graphics.Bitmap


//// this file is a global variables file where you can access variables from any file!

class Globals {

    companion object Chosen {
        var chosenImage : Bitmap? = null
        fun returnImage():Bitmap {
            return chosenImage!!
        }
    }




}