package tw.edu.pu.csim.s1085559.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.*
        var counter: Int = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text = counter.toString()
    }

    fun Add(v: View) {
        if (v.id == R.id.btn) {
            counter++
        } else {
            counter += 2
        }
        txv.text = counter.toString()
    }
}
