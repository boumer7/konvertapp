package com.example.konvertapp

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        TranslateButton.setOnClickListener {

            Output.setTextColor(getResources().getColor(R.color.Black))
            Input.setTextColor(getResources().getColor(R.color.Black))

            var ExtractedInput = Input.text.toString()

            ExtractedInput = ExtractedInput.replace("А","A")
            ExtractedInput = ExtractedInput.replace("Б","B")
            ExtractedInput = ExtractedInput.replace("В","V")
            ExtractedInput = ExtractedInput.replace("Г","G")
            ExtractedInput = ExtractedInput.replace("Д","D")
            ExtractedInput = ExtractedInput.replace("Е","E")
            ExtractedInput = ExtractedInput.replace("Ё","YO")
            ExtractedInput = ExtractedInput.replace("Ж","ZH")
            ExtractedInput = ExtractedInput.replace("З","Z")
            ExtractedInput = ExtractedInput.replace("И","I")
            ExtractedInput = ExtractedInput.replace("Й","Y")
            ExtractedInput = ExtractedInput.replace("К","K")
            ExtractedInput = ExtractedInput.replace("Л","L")
            ExtractedInput = ExtractedInput.replace("М","M")
            ExtractedInput = ExtractedInput.replace("Н","N")
            ExtractedInput = ExtractedInput.replace("О","O")
            ExtractedInput = ExtractedInput.replace("П","P")
            ExtractedInput = ExtractedInput.replace("Р","R")
            ExtractedInput = ExtractedInput.replace("С","S")
            ExtractedInput = ExtractedInput.replace("Т","T")
            ExtractedInput = ExtractedInput.replace("У","U")
            ExtractedInput = ExtractedInput.replace("Ф","F")
            ExtractedInput = ExtractedInput.replace("Х","KH")
            ExtractedInput = ExtractedInput.replace("Ц","TS")
            ExtractedInput = ExtractedInput.replace("Ч","CH")
            ExtractedInput = ExtractedInput.replace("Ш","SH")
            ExtractedInput = ExtractedInput.replace("Щ","SCH")
            ExtractedInput = ExtractedInput.replace("Ы","Y")
            ExtractedInput = ExtractedInput.replace("Ь","'")
            ExtractedInput = ExtractedInput.replace("Ъ","hardsign")
            ExtractedInput = ExtractedInput.replace("Э","E")
            ExtractedInput = ExtractedInput.replace("Ю","YU")
            ExtractedInput = ExtractedInput.replace("Я","YA")

            // What's up buddy OwO. Looking for sth in my code? Add me on Discord gachiBASS#0127

            ExtractedInput = ExtractedInput.replace("а","a")
            ExtractedInput = ExtractedInput.replace("б","b")
            ExtractedInput = ExtractedInput.replace("в","v")
            ExtractedInput = ExtractedInput.replace("г","g")
            ExtractedInput = ExtractedInput.replace("д","d")
            ExtractedInput = ExtractedInput.replace("е","e")
            ExtractedInput = ExtractedInput.replace("ё","yo")
            ExtractedInput = ExtractedInput.replace("ж","zh")
            ExtractedInput = ExtractedInput.replace("з","z")
            ExtractedInput = ExtractedInput.replace("и","i")
            ExtractedInput = ExtractedInput.replace("й","y")
            ExtractedInput = ExtractedInput.replace("к","k")
            ExtractedInput = ExtractedInput.replace("л","l")
            ExtractedInput = ExtractedInput.replace("м","m")
            ExtractedInput = ExtractedInput.replace("н","n")
            ExtractedInput = ExtractedInput.replace("о","o")
            ExtractedInput = ExtractedInput.replace("п","p")
            ExtractedInput = ExtractedInput.replace("р","r")
            ExtractedInput = ExtractedInput.replace("с","s")
            ExtractedInput = ExtractedInput.replace("т","t")
            ExtractedInput = ExtractedInput.replace("у","u")
            ExtractedInput = ExtractedInput.replace("ф","f")
            ExtractedInput = ExtractedInput.replace("х","kh")
            ExtractedInput = ExtractedInput.replace("ц","ts")
            ExtractedInput = ExtractedInput.replace("ч","ch")
            ExtractedInput = ExtractedInput.replace("ш","sh")
            ExtractedInput = ExtractedInput.replace("щ","sch")
            ExtractedInput = ExtractedInput.replace("ы","y")
            ExtractedInput = ExtractedInput.replace("ь","'")
            ExtractedInput = ExtractedInput.replace("ъ","hardsign")
            ExtractedInput = ExtractedInput.replace("э","e")
            ExtractedInput = ExtractedInput.replace("ю","yu")
            ExtractedInput = ExtractedInput.replace("я","ya")

            if (ExtractedInput.toUpperCase() === ExtractedInput) {

                ExtractedInput = ExtractedInput.toUpperCase()

            }else if (ExtractedInput.startsWith("ZH")) {

                ExtractedInput = ExtractedInput.replace(ExtractedInput[1].toString(),ExtractedInput[1].toString().toLowerCase())

            }else if (ExtractedInput.startsWith("YO")) {

                ExtractedInput = ExtractedInput.replace(ExtractedInput[1].toString(),ExtractedInput[1].toString().toLowerCase())

            }else if (ExtractedInput.startsWith("KH")) {

                ExtractedInput = ExtractedInput.replace(ExtractedInput[1].toString(),ExtractedInput[1].toString().toLowerCase())

            }else if (ExtractedInput.startsWith("TS")) {

                ExtractedInput = ExtractedInput.replace(ExtractedInput[1].toString(),ExtractedInput[1].toString().toLowerCase())

            }else if (ExtractedInput.startsWith("CH")) {

                ExtractedInput = ExtractedInput.replace(ExtractedInput[1].toString(),ExtractedInput[1].toString().toLowerCase())

            }else if (ExtractedInput.startsWith("SH")) {

                ExtractedInput = ExtractedInput.replace(ExtractedInput[1].toString(),ExtractedInput[1].toString().toLowerCase())

            }else if (ExtractedInput.startsWith("YU")) {

                ExtractedInput = ExtractedInput.replace(ExtractedInput[1].toString(),ExtractedInput[1].toString().toLowerCase())

            }else if (ExtractedInput.startsWith("YA")) {

                ExtractedInput = ExtractedInput.replace(ExtractedInput[1].toString(),ExtractedInput[1].toString().toLowerCase())

            }else if (ExtractedInput.startsWith("SCH")) {

                ExtractedInput = ExtractedInput.replace(ExtractedInput[1].toString(),ExtractedInput[1].toString().toLowerCase())
                ExtractedInput = ExtractedInput.replace(ExtractedInput[2].toString(),ExtractedInput[2].toString().toLowerCase())

            }

            if (ExtractedInput.contains("yy")) ExtractedInput = ExtractedInput.replace("yy","iy")
            if (ExtractedInput.contains("YY")) ExtractedInput = ExtractedInput.replace("YY","IY")
            if (ExtractedInput.contains("yY")) ExtractedInput = ExtractedInput.replace("yY","iY")
            if (ExtractedInput.contains("Yy")) ExtractedInput = ExtractedInput.replace("Yy","Iy")

            if (ExtractedInput.contains("hardsign"+"E") || ExtractedInput.contains("hardsign"+"e")){

                ExtractedInput = ExtractedInput.replace("hardsign"+"E","YE")
                ExtractedInput = ExtractedInput.replace("hardsign"+"e","ye")

            } else ExtractedInput = ExtractedInput.replace("hardsign","")

            // -----------------------------------------------------------------------

            Output.setText(ExtractedInput)

            // -----------------------------------------------------------------------

            // -----------------------------------------------------------------------

            // some alerts

            val alertSuccessfulTranslate = getResources().getString(R.string.alertSuccessfulTranslate)

            val alertNothingBeenEntered = getResources().getString(R.string.alertNothingBeenEntered)

            val alertSuccessfullyCopied = getResources().getString(R.string.SuccessfullyCopied)

            val alertSuccessfullyRemoved = getResources().getString(R.string.alertDeletedSuccessfully)

            val alertRestoredSuccessfully = getResources().getString(R.string.alertRestoredSuccessfully)

            // -----------------------------------------------------------------------

            changetoUppercase.setOnClickListener{
                if (changetoUppercase.isChecked){
                    Output.setText(ExtractedInput.toUpperCase())
                }else Output.setText(ExtractedInput.toLowerCase())

            }

            restoreText.setOnClickListener {

                Output.setText(ExtractedInput)

                Toast.makeText(this, alertRestoredSuccessfully, Toast.LENGTH_LONG).show()

                copyToClipboard.setOnClickListener{

                    var clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

                    var clip = ClipData.newPlainText("label",ExtractedInput)

                    clipboard.setPrimaryClip(clip)

                    Toast.makeText(this, alertSuccessfullyCopied, Toast.LENGTH_LONG).show()

                }

                copyToClipboard.setOnClickListener {

                    var clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

                    if (changetoUppercase.isChecked) {

                        var clip = ClipData.newPlainText("label", ExtractedInput.toUpperCase())

                        clipboard.setPrimaryClip(clip)

                        Toast.makeText(this, alertSuccessfullyCopied, Toast.LENGTH_LONG).show()


                    }else if(ExtractedInput.toLowerCase()===ExtractedInput){

                        var clip = ClipData.newPlainText("label",ExtractedInput.toLowerCase())

                        clipboard.setPrimaryClip(clip)

                        Toast.makeText(this, alertSuccessfullyCopied, Toast.LENGTH_LONG).show()

                    }else{

                        var clip = ClipData.newPlainText("label",ExtractedInput)

                        clipboard.setPrimaryClip(clip)

                        Toast.makeText(this, alertSuccessfullyCopied, Toast.LENGTH_LONG).show()

                    }

                }

            }

            copyToClipboard.setOnClickListener {

                var clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

                if (changetoUppercase.isChecked) {

                    var clip = ClipData.newPlainText("label", ExtractedInput.toUpperCase())

                    clipboard.setPrimaryClip(clip)

                    Toast.makeText(this, alertSuccessfullyCopied, Toast.LENGTH_LONG).show()


                }else if(ExtractedInput.toLowerCase()===ExtractedInput){

                    var clip = ClipData.newPlainText("label",ExtractedInput.toLowerCase())

                    clipboard.setPrimaryClip(clip)

                    Toast.makeText(this, alertSuccessfullyCopied, Toast.LENGTH_LONG).show()

                }else{

                    var clip = ClipData.newPlainText("label",ExtractedInput)

                    clipboard.setPrimaryClip(clip)

                    Toast.makeText(this, alertSuccessfullyCopied, Toast.LENGTH_LONG).show()

                }

            }

            clearButton.setOnClickListener{

                if(!ExtractedInput.isNullOrBlank()) {

                    Output.setText(null)
                    Input.setText(null)

                    Toast.makeText(this, alertSuccessfullyRemoved, Toast.LENGTH_LONG).show()
                }

                copyToClipboard.setOnClickListener {

                    var clipboard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager

                    if (changetoUppercase.isChecked) {

                        var clip = ClipData.newPlainText("label", ExtractedInput.toUpperCase())

                        clipboard.setPrimaryClip(clip)

                        Toast.makeText(this, alertSuccessfullyCopied, Toast.LENGTH_LONG).show()



                    }else if(ExtractedInput.toLowerCase()===ExtractedInput){

                        var clip = ClipData.newPlainText("label",ExtractedInput.toLowerCase())

                        clipboard.setPrimaryClip(clip)

                        Toast.makeText(this, alertSuccessfullyCopied, Toast.LENGTH_LONG).show()

                    }else{

                        var clip = ClipData.newPlainText("label",ExtractedInput)

                        clipboard.setPrimaryClip(clip)

                        Toast.makeText(this, alertSuccessfullyCopied, Toast.LENGTH_LONG).show()

                    }
                }
            }

            if (ExtractedInput.isNullOrBlank()) {

                Toast.makeText(this, alertNothingBeenEntered, Toast.LENGTH_LONG).show()

            }else Toast.makeText(this, alertSuccessfulTranslate, Toast.LENGTH_LONG).show()

        } // Where the Translate Button Listener ends

        Input.movementMethod = ScrollingMovementMethod()
        Input.setTextIsSelectable(true)

        Output.movementMethod = ScrollingMovementMethod()
        Output.setTextIsSelectable(true)

        settingsGear.setOnClickListener {
            val settingsWindow = Intent(this, settingsActivity::class.java)
            startActivity(settingsWindow)
        }

        //-------------------------------------------------------------

    }
}
