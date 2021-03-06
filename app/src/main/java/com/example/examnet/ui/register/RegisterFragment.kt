package com.example.examnet.ui.register

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.examnet.R
import com.example.examnet.ui.register.registerModel.RegisterPost
import com.example.examnet.ui.register.registerRepository.RgstrRepository
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : Fragment() {

    private lateinit var registerViewModel: RegisterViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val repository = RgstrRepository();
        val viewModelFactory = RegisterViewModelFactory(repository)
        registerViewModel = ViewModelProvider(this, viewModelFactory).get(RegisterViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_register, container, false)

        val textView: TextView = root.findViewById(R.id.text_register)
        registerViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonConfirm = view.findViewById<Button>(R.id.singIn_register)
        buttonConfirm.setOnClickListener {
            var continut1 = username_register.text.toString()
            var continut2 = email_register.text.toString()
            var continut3 = password_register.text.toString()

            val textView = view.findViewById<TextView>(R.id.text_register)

            val myPost = RegisterPost(username = continut1, email = continut2, password = continut3)
            registerViewModel.pushPost(myPost)
            registerViewModel.myResponse.observe(viewLifecycleOwner, Observer { response ->
                if(response.isSuccessful){
                    mesaj_register.text = "??nregistrare efectuat?? cu succes!"
                    Log.d("Response", response.code().toString())
                    Log.d("Response body", response.body().toString())
                } else{
                    Log.d("Response", response.errorBody().toString())
                    mesaj_register.text = "Adresa de email este deja utilizat??!"
                    textView.text = response.code().toString()
                }
            })
        }
    }
}