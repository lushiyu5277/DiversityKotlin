package com.shiyulu.android.diversitykotlin.activities

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Base64
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.shiyulu.android.diversitykotlin.R
import com.shiyulu.android.diversitykotlin.utils.encryptData
import com.shiyulu.android.diversitykotlin.utils.generateRSAKeyPair
import kotlinx.android.synthetic.main.activity_encryption.*
import java.security.PrivateKey
import java.security.PublicKey

class EncryptionActivity : AppCompatActivity(){

    var privateKey: PrivateKey? = null
    var publicKey: PublicKey? = null

    var originText: String = ""

    lateinit var encryptContent: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_encryption)
        encryptContent = findViewById(R.id.encryptContent)
        originContent.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                originText = s.toString()
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

        })

        generateKey.setOnClickListener {
            val keyPair = generateRSAKeyPair()
            privateKey = keyPair.private
            publicKey = keyPair.public
        }

        encryptBtn.setOnClickListener {
            encryptContent.text = Base64.encodeToString(publicKey?.let { it1 ->
                encryptData(originText.toByteArray(),
                    it1
                )
            }, Base64.DEFAULT)
        }
    }
}

