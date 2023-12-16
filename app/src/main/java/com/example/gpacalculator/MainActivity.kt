package com.example.gpacalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //วิชา
        val sub1:EditText = findViewById(R.id.sub1)
        val sub2:EditText = findViewById(R.id.sub2)
        val sub3:EditText = findViewById(R.id.sub3)
        val sub4:EditText = findViewById(R.id.sub4)
        val sub5:EditText = findViewById(R.id.sub5)
        //หน่วยกิต
        val cd1:EditText = findViewById(R.id.cd1)
        val cd2:EditText = findViewById(R.id.cd2)
        val cd3:EditText = findViewById(R.id.cd3)
        val cd4:EditText = findViewById(R.id.cd4)
        val cd5:EditText = findViewById(R.id.cd5)
        //เกรด
        val p1:EditText = findViewById(R.id.p1)
        val p2:EditText = findViewById(R.id.p2)
        val p3:EditText = findViewById(R.id.p3)
        val p4:EditText = findViewById(R.id.p4)
        val p5:EditText = findViewById(R.id.p5)
        //รวม
        val cdsum: TextView = findViewById(R.id.cdsum)
        val gpasum: TextView = findViewById(R.id.gpasum)
        //ปุ่ม
        val ok: Button = findViewById(R.id.ok)
        val clear: Button = findViewById(R.id.clear)

        ok.setOnClickListener{
            if(sub1.text.toString() == "" || sub2.text.toString() == "" || sub3.text.toString() == ""
                || sub4.text.toString() == "" || sub5.text.toString() == "" || cd1.text.toString() == ""
                || cd2.text.toString() == "" || cd3.text.toString() == "" || cd4.text.toString() == ""
                || cd5.text.toString() == "" || p1.text.toString() == "" || p2.text.toString() == ""
                || p3.text.toString() == "" || p4.text.toString() == "" || p5.text.toString() == ""){
                Toast.makeText(
                    this,
                    "Please input all space before OK!!",
                    Toast.LENGTH_SHORT)
                    .show()
            }else if(cd1.text.toString().toInt() < 1 || cd1.text.toString().toInt() > 3 ||
                cd2.text.toString().toInt() < 1 || cd2.text.toString().toInt() > 3 ||
                cd3.text.toString().toInt() < 1 || cd3.text.toString().toInt() > 3 ||
                cd4.text.toString().toInt() < 1 || cd4.text.toString().toInt() > 3 ||
                cd5.text.toString().toInt() < 1 || cd5.text.toString().toInt() > 3 ){
                Toast.makeText(
                    this,
                    "Please don't input credit '<1' and '>3'",
                    Toast.LENGTH_SHORT)
                    .show()
            }else if(p1.text.toString().toDouble() < 1 || p1.text.toString().toDouble() > 4 ||
                p2.text.toString().toDouble() < 1 || p2.text.toString().toDouble() > 4 ||
                p3.text.toString().toDouble() < 1 || p3.text.toString().toDouble() > 4 ||
                p4.text.toString().toDouble() < 1 || p4.text.toString().toDouble() > 4 ||
                p5.text.toString().toDouble() < 1 || p5.text.toString().toDouble() > 4 ){
                Toast.makeText(
                    this,
                    "Please don't input point '<1' and '>4'",
                    Toast.LENGTH_SHORT)
                    .show()
            }else{
                var c = cd1.text.toString().toInt() + cd2.text.toString().toInt() +
                        cd3.text.toString().toInt() + cd4.text.toString().toInt() +
                        cd5.text.toString().toInt()
                cdsum.setText(c.toString())

                var cmp1 = cd1.text.toString().toDouble() * p1.text.toString().toDouble()
                var cmp2 = cd2.text.toString().toDouble() * p2.text.toString().toDouble()
                var cmp3 = cd3.text.toString().toDouble() * p3.text.toString().toDouble()
                var cmp4 = cd4.text.toString().toDouble() * p4.text.toString().toDouble()
                var cmp5 = cd5.text.toString().toDouble() * p5.text.toString().toDouble()

                var cmps = cmp1+cmp2+cmp3+cmp4+cmp5

                var gpa = cmps.toString().toDouble() / c.toString().toDouble()
                val gs = String.format("%.2f",gpa)

                gpasum.setText(gs)
            }
        }

        clear.setOnClickListener{
            sub1.setText("")
            sub2.setText("")
            sub3.setText("")
            sub4.setText("")
            sub5.setText("")
            cd1.setText("")
            cd2.setText("")
            cd3.setText("")
            cd4.setText("")
            cd5.setText("")
            p1.setText("")
            p2.setText("")
            p3.setText("")
            p4.setText("")
            p5.setText("")
            cdsum.setText("")
            gpasum.setText("")
        }
    }
}