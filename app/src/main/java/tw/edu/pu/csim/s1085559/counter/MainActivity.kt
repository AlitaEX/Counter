package tw.edu.pu.csim.s1085559.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.*
        var counter: Int = 0

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text = counter.toString()
        txv.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btnHappy.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                counter=(1..100).random()
                txv.text = counter.toString()
            }
        })
    }

    fun Add(v: View) {
        //if (v.id == R.id.btn) {
        if(v == btn){
            counter++
        } else {
            counter += 2
        }
        txv.text = counter.toString()
    }

    override fun onClick(v: View?) {
        if(v==txv){
            counter++
        }else {
            counter = 0
        }
        txv.text = counter.toString()
    }
}

