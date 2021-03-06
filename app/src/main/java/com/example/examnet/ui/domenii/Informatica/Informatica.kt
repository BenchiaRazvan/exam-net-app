package com.example.examnet.ui.domenii.Informatica

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.examnet.R
import com.example.examnet.StaticClass
import com.example.examnet.ui.domenii.Informatica.informaticaModel.InformaticaResponse
import com.example.examnet.ui.domenii.Informatica.informaticaRepository.InformaticaRepository
import com.example.examnet.ui.score.Score
import kotlinx.android.synthetic.main.activity_item1.*

class Informatica : AppCompatActivity() {

    private lateinit var viewModel : InformaticaViewModel
    private lateinit var viewModel2 : InformaticaViewModel

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item1)

        val repository = InformaticaRepository()
        val viewModelFactory = InformaticaViewModelFactory(repository)
        val viewModelFactory2 = InformaticaViewModelFactory2(repository)
        viewModel = ViewModelProvider(this, viewModelFactory).get(InformaticaViewModel::class.java)
        viewModel2 = ViewModelProvider(this, viewModelFactory2).get(InformaticaViewModel::class.java)
        viewModel.getPost()
        val responsesArray: ArrayList<String> = arrayListOf("", "", "", "", "", "", "", "", "", "", "")
        viewModel.myResponse.observe(this, Observer { response ->
            if (response.isSuccessful) {
                val problemsArray: List<Any> = response.body() as List<Any>
                for (i in problemsArray.indices) {
                    Log.d(i.toString(), problemsArray[i].toString())
                }

                enuntProblema1.text = (problemsArray[0] as InformaticaResponse).enunt
                var array = (problemsArray[0] as InformaticaResponse).variante.split(",")
                var rgp: RadioGroup = findViewById(R.id.groupProblema1)
                var buttons = array.size
                for (i in 0 until buttons) {
                    val rbn = RadioButton(this)
                    rbn.id = View.generateViewId()
                    rbn.text = array[i]
                    rbn.setTextColor(Color.BLACK)
                    rbn.buttonTintList = ColorStateList.valueOf(getColor(R.color.darker_gray))
                    rgp.addView(rbn)
                }
                rgp.setOnCheckedChangeListener { group, checkedId ->
                    val radioButton : RadioButton = findViewById(checkedId)
                    responsesArray[0] = radioButton.text as String
                }

                enuntProblema2.text = (problemsArray[1] as InformaticaResponse).enunt
                array = (problemsArray[1] as InformaticaResponse).variante.split(",")
                rgp  = findViewById(R.id.groupProblema2)
                buttons = array.size
                for (i in 0 until buttons) {
                    val rbn = RadioButton(this)
                    rbn.id = View.generateViewId()
                    rbn.text = array[i]
                    rbn.setTextColor(Color.BLACK)
                    rbn.buttonTintList = ColorStateList.valueOf(getColor(R.color.darker_gray))
                    rgp.addView(rbn)
                }
                rgp.setOnCheckedChangeListener{ group, checkedId ->
                    val radioButton : RadioButton = findViewById(checkedId)
                    responsesArray[1] = radioButton.text as String
                }

                enuntProblema3.text = (problemsArray[2] as InformaticaResponse).enunt
                array = (problemsArray[2] as InformaticaResponse).variante.split(",")
                rgp  = findViewById(R.id.groupProblema3)
                buttons = array.size
                for (i in 0 until buttons) {
                    val rbn = RadioButton(this)
                    rbn.id = View.generateViewId()
                    rbn.text = array[i]
                    rbn.setTextColor(Color.BLACK)
                    rbn.buttonTintList = ColorStateList.valueOf(getColor(R.color.darker_gray))
                    rgp.addView(rbn)
                }
                rgp.setOnCheckedChangeListener{ group, checkedId ->
                    val radioButton : RadioButton = findViewById(checkedId)
                    responsesArray[2] = radioButton.text as String
                }

                enuntProblema4.text = (problemsArray[3] as InformaticaResponse).enunt
                array = (problemsArray[3] as InformaticaResponse).variante.split(",")
                rgp  = findViewById(R.id.groupProblema4)
                buttons = array.size
                for (i in 0 until buttons) {
                    val rbn = RadioButton(this)
                    rbn.id = View.generateViewId()
                    rbn.text = array[i]
                    rbn.setTextColor(Color.BLACK)
                    rbn.buttonTintList = ColorStateList.valueOf(getColor(R.color.darker_gray))
                    rgp.addView(rbn)
                }
                rgp.setOnCheckedChangeListener{ group, checkedId ->
                    val radioButton : RadioButton = findViewById(checkedId)
                    responsesArray[3] = radioButton.text as String
                }

                enuntProblema5.text = (problemsArray[4] as InformaticaResponse).enunt
                array = (problemsArray[4] as InformaticaResponse).variante.split(",")
                rgp  = findViewById(R.id.groupProblema5)
                buttons = array.size
                for (i in 0 until buttons) {
                    val rbn = RadioButton(this)
                    rbn.id = View.generateViewId()
                    rbn.text = array[i]
                    rbn.setTextColor(Color.BLACK)
                    rbn.buttonTintList = ColorStateList.valueOf(getColor(R.color.darker_gray))
                    rgp.addView(rbn)
                }
                rgp.setOnCheckedChangeListener{ group, checkedId ->
                    val radioButton : RadioButton = findViewById(checkedId)
                    responsesArray[4] = radioButton.text as String
                }

                enuntProblema6.text = (problemsArray[5] as InformaticaResponse).enunt
                array = (problemsArray[5] as InformaticaResponse).variante.split(",")
                rgp  = findViewById(R.id.groupProblema6)
                buttons = array.size
                for (i in 0 until buttons) {
                    val rbn = RadioButton(this)
                    rbn.id = View.generateViewId()
                    rbn.text = array[i]
                    rbn.setTextColor(Color.BLACK)
                    rbn.buttonTintList = ColorStateList.valueOf(getColor(R.color.darker_gray))
                    rgp.addView(rbn)
                }
                rgp.setOnCheckedChangeListener{ group, checkedId ->
                    val radioButton : RadioButton = findViewById(checkedId)
                    responsesArray[5] = radioButton.text as String
                }

                enuntProblema7.text = (problemsArray[6] as InformaticaResponse).enunt
                array = (problemsArray[6] as InformaticaResponse).variante.split(",")
                rgp  = findViewById(R.id.groupProblema7)
                buttons = array.size
                for (i in 0 until buttons) {
                    val rbn = RadioButton(this)
                    rbn.id = View.generateViewId()
                    rbn.text = array[i]
                    rbn.setTextColor(Color.BLACK)
                    rbn.buttonTintList = ColorStateList.valueOf(getColor(R.color.darker_gray))
                    rgp.addView(rbn)
                }
                rgp.setOnCheckedChangeListener{ group, checkedId ->
                    val radioButton : RadioButton = findViewById(checkedId)
                    responsesArray[6] = radioButton.text as String
                }

                enuntProblema8.text = (problemsArray[7] as InformaticaResponse).enunt
                array = (problemsArray[7] as InformaticaResponse).variante.split(",")
                rgp  = findViewById(R.id.groupProblema8)
                buttons = array.size
                for (i in 0 until buttons) {
                    val rbn = RadioButton(this)
                    rbn.id = View.generateViewId()
                    rbn.text = array[i]
                    rbn.setTextColor(Color.BLACK)
                    rbn.buttonTintList = ColorStateList.valueOf(getColor(R.color.darker_gray))
                    rgp.addView(rbn)
                }
                rgp.setOnCheckedChangeListener{ group, checkedId ->
                    val radioButton : RadioButton = findViewById(checkedId)
                    responsesArray[7] = radioButton.text as String
                }

                enuntProblema9.text = (problemsArray[8] as InformaticaResponse).enunt
                array = (problemsArray[8] as InformaticaResponse).variante.split(",")
                rgp  = findViewById(R.id.groupProblema9)
                buttons = array.size
                for (i in 0 until buttons) {
                    val rbn = RadioButton(this)
                    rbn.id = View.generateViewId()
                    rbn.text = array[i]
                    rbn.setTextColor(Color.BLACK)
                    rbn.buttonTintList = ColorStateList.valueOf(getColor(R.color.darker_gray))
                    rgp.addView(rbn)
                }
                rgp.setOnCheckedChangeListener{ group, checkedId ->
                    val radioButton : RadioButton = findViewById(checkedId)
                    responsesArray[8] = radioButton.text as String
                }

                enuntProblema10.text = (problemsArray[9] as InformaticaResponse).enunt
                array = (problemsArray[9] as InformaticaResponse).variante.split(",")
                rgp  = findViewById(R.id.groupProblema10)
                buttons = array.size
                for (i in 0 until buttons) {
                    val rbn = RadioButton(this)
                    rbn.id = View.generateViewId()
                    rbn.text = array[i]
                    rbn.setTextColor(Color.BLACK)
                    rbn.buttonTintList = ColorStateList.valueOf(getColor(R.color.darker_gray))
                    rgp.addView(rbn)
                }
                rgp.setOnCheckedChangeListener{ group, checkedId ->
                    val radioButton : RadioButton = findViewById(checkedId)
                    responsesArray[9] = radioButton.text as String
                }

                enuntProblema11.text = (problemsArray[10] as InformaticaResponse).enunt
            }
        })

        val buttonConfirm = findViewById<Button>(R.id.confirm_problem)
        var score: String
        buttonConfirm.setOnClickListener {
            responsesArray[10] = raspunsProblema11.text.toString()
            viewModel2.pushPost(responsesArray)
            viewModel2.myResponse2.observe(this, Observer { response ->
                if(response.isSuccessful) {
                    Log.d("CodRaspuns", response.code().toString())
                    Log.d("Scor", response.body().toString())
                    Log.d("AlegeriUtilizator", responsesArray.toString())
                    score = response.body().toString()

                    StaticClass.value = score
                    startActivity(Intent(this, Score::class.java))
                }
            })
        }
    }
}