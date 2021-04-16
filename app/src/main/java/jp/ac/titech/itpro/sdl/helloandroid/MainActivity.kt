package jp.ac.titech.itpro.sdl.helloandroid

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

public class MainActivity : AppCompatActivity() {
    private var outputView: TextView? = null
    private var inputName: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        outputView = findViewById<TextView>(R.id.output_view)
        inputName = findViewById<EditText>(R.id.input_name)
    }

    fun greet(v: View?) {
        val name = inputName!!.text.toString().trim { it <= ' ' }
        if (name.isNotEmpty()) {
            outputView!!.text = "Hello $name!\nNice to see you!"
        }
    }
}