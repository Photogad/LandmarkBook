package com.pa.landmarkbook

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.pa.landmarkbook.R.id.listView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //// create the landmark names array list and add items to it
        var landmarkNames = ArrayList<String>()
        landmarkNames.add("Pisa")
        landmarkNames.add("Colosseum")
        landmarkNames.add("Eiffel Tower")

        //// add array adapter, context is parent (this), add display type, and connect it to the landmarkNames array list
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkNames)

        //// connect the adapter to the actual listview we want to display array items in
        listView.adapter = arrayAdapter





        //// define the drawable images as constant variables
        val pisa = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.pisa)
        val colosseum = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.colosseum)
        val eiffel = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.eiffel)


        //// create the landmark images array list and add items to it
        val landmarkImages = ArrayList<Bitmap>()
        landmarkImages.add(pisa)
        landmarkImages.add(colosseum)
        landmarkImages.add(eiffel)


        //// bring up correct detail view when they click on an item in the listview
        listView.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->


            //// where are we sending the intent? To the detail activity.
            val intent = Intent(applicationContext,DetailActivity::class.java)

            //// what are we sending to the detail activity?
            intent.putExtra("name", landmarkNames[i])

            val bitmap = landmarkImages[i]
            val chosen = Globals.Chosen
            chosen.chosenImage = bitmap


            //// start the DetailActivity when they click on an item in the listview.
            startActivity(intent)
        }


    }
}
