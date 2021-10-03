package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

// declare variables
lateinit var clMain: ConstraintLayout

lateinit var tv_results: TextView

lateinit var bt_zero: Button
lateinit var bt_one: Button
lateinit var bt_two: Button
lateinit var bt_three: Button
lateinit var bt_four: Button
lateinit var bt_five: Button
lateinit var bt_six: Button
lateinit var bt_seven: Button
lateinit var bt_eight: Button
lateinit var bt_nine: Button

lateinit var bt_divide: Button
lateinit var bt_multiply: Button
lateinit var bt_subtract: Button
lateinit var bt_plus: Button

lateinit var bt_negative: Button
lateinit var bt_point: Button

lateinit var bt_del: Button
lateinit var bt_clear: Button
lateinit var bt_equal: Button

var result: Float = 0.0F
var numSeq = ArrayList<Float>()
var funSeq = ArrayList<Char>()
var numSeqIndex: Int = 0
var funSeqIndex: Int = 0
var userNumberInputHolder: String = ""


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initiate variables
        initVariables()

        // set on click listeners
        setClickListeners()

    }

    // initiate variables
    fun initVariables() {
        clMain = findViewById(R.id.clMain)

        bt_zero = findViewById(R.id.bt_zero)
        bt_one = findViewById(R.id.bt_one)
        bt_two = findViewById(R.id.bt_two)
        bt_three = findViewById(R.id.bt_three)
        bt_four = findViewById(R.id.bt_four)
        bt_five = findViewById(R.id.bt_five)
        bt_six = findViewById(R.id.bt_six)
        bt_seven = findViewById(R.id.bt_seven)
        bt_eight = findViewById(R.id.bt_eight)
        bt_nine = findViewById(R.id.bt_nine)

        bt_divide = findViewById(R.id.bt_divide)
        bt_multiply = findViewById(R.id.bt_multiply)
        bt_subtract = findViewById(R.id.bt_subtract)
        bt_plus = findViewById(R.id.bt_plus)

        bt_negative = findViewById(R.id.bt_negative)
        bt_point = findViewById(R.id.bt_point)

        bt_del = findViewById(R.id.bt_del)
        bt_clear = findViewById(R.id.bt_clear)
        bt_equal = findViewById(R.id.bt_equal)

        tv_results = findViewById(R.id.tv_results)
    }

    // set onClickListeners
    fun setClickListeners() {
        bt_zero.setOnClickListener { handle_zero() }
        bt_one.setOnClickListener { handle_one() }
        bt_two.setOnClickListener { handle_two() }
        bt_three.setOnClickListener { handle_three() }
        bt_four.setOnClickListener { handle_four() }
        bt_five.setOnClickListener { handle_five() }
        bt_six.setOnClickListener { handle_six() }
        bt_seven.setOnClickListener { handle_seven() }
        bt_eight.setOnClickListener { handle_eight() }
        bt_nine.setOnClickListener { handle_nine() }

        bt_divide.setOnClickListener { handle_divide() }
        bt_multiply.setOnClickListener { handle_multiply() }
        bt_subtract.setOnClickListener { handle_subtract() }
        bt_plus.setOnClickListener { handle_addition() }

        bt_negative.setOnClickListener { handle_negative() }
        bt_point.setOnClickListener { handle_point() }

        bt_del.setOnClickListener { handle_delete() }
        bt_clear.setOnClickListener { handle_clear() }
        bt_equal.setOnClickListener { handle_equal() }
    }

    // handlers
    fun handle_zero() {
        Log.d("MainActivityHandlers", "I'm 0!")
        userNumberInputHolder += "0"

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}0"
    }
    fun handle_one() {
        Log.d("MainActivityHandlers", "I'm 1!")
        userNumberInputHolder += "1"

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}1"
    }
    fun handle_two() {
        Log.d("MainActivityHandlers", "I'm 2!")
        userNumberInputHolder += "2"

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}2"
    }
    fun handle_three() {
        Log.d("MainActivityHandlers", "I'm 3!")
        userNumberInputHolder += "3"

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}3"
    }
    fun handle_four() {
        Log.d("MainActivityHandlers", "I'm 4!")
        userNumberInputHolder += "4"

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}4"
    }
    fun handle_five() {
        Log.d("MainActivityHandlers", "I'm 5!")
        userNumberInputHolder += "5"

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}5"
    }
    fun handle_six() {
        Log.d("MainActivityHandlers", "I'm 6!")
        userNumberInputHolder += "6"

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}6"
    }
    fun handle_seven() {
        Log.d("MainActivityHandlers", "I'm 7!")
        userNumberInputHolder += "7"

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}7"
    }
    fun handle_eight() {
        Log.d("MainActivityHandlers", "I'm 8!")
        userNumberInputHolder += "8"

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}8"
    }
    fun handle_nine() {
        Log.d("MainActivityHandlers", "I'm 9!")
        userNumberInputHolder += "9"

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}9"
    }


    fun handle_divide() {
        Log.d("MainActivityHandlers", "I'm /!")

        numSeq.add(userNumberInputHolder.toFloat())
        numSeqIndex++
        userNumberInputHolder = ""

        funSeq.add('/')
        funSeqIndex++

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}/"
    }
    fun handle_multiply() {
        Log.d("MainActivityHandlers", "I'm *!")

        numSeq.add(userNumberInputHolder.toFloat())
        numSeqIndex++
        userNumberInputHolder = ""

        funSeq.add('*')
        funSeqIndex++

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}*"
    }
    fun handle_subtract() {
        Log.d("MainActivityHandlers", "I'm -!")

        numSeq.add(userNumberInputHolder.toFloat())
        numSeqIndex++
        userNumberInputHolder = ""

        funSeq.add('-')
        funSeqIndex++

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}-"
    }
    fun handle_addition() {
        Log.d("MainActivityHandlers", "I'm +!")

        numSeq.add(userNumberInputHolder.toFloat())
        numSeqIndex++
        userNumberInputHolder = ""

        funSeq.add('+')
        funSeqIndex++

        // add string to results text view
        val currentText = tv_results.text
        tv_results.text = "${currentText}+"
    }


    fun handle_negative() {
        Log.d("MainActivityHandlers", "I'm neg!")
        val tempStringHolder = "-$userNumberInputHolder"
        userNumberInputHolder = tempStringHolder

        // add to results
        val currentText = tv_results.text
        tv_results.text = "${currentText}-"
    }
    fun handle_point() {
        Log.d("MainActivityHandlers", "I'm point!")
        userNumberInputHolder += "."

        // add to results
        val currentText = tv_results.text
        tv_results.text = "${currentText}."
    }

    fun handle_delete() {
        Log.d("MainActivityHandlers", "I'm DEL!")
        userNumberInputHolder
        userNumberInputHolder = userNumberInputHolder.substring(0, userNumberInputHolder.length - 1)
        var tempRes = tv_results.text
        tempRes = tempRes.substring(0, tempRes.length - 1)
        tv_results.text = tempRes
    }
    fun handle_clear() {
        Log.d("MainActivityHandlers", "I'm C!")
        tv_results.text = ""
        result = 0.0F
        numSeq = ArrayList<Float>()
        numSeqIndex = 0
        userNumberInputHolder = ""
        funSeq = ArrayList<Char>()
        funSeqIndex = 0
    }
    fun handle_equal() {
        Log.d("MainActivityHandlers", "I'm =!")
        numSeq.add(userNumberInputHolder.toFloat())
        numSeqIndex++
        userNumberInputHolder = ""
        Log.d("MainActivityHandlers", "$numSeq")
        Log.d("MainActivityHandlers", "$numSeq")
        var sum: Float = 0.0f
        if (numSeqIndex > 1) {
            sum = numSeq[0]
            for (i in 0..funSeqIndex - 1) {
                when (funSeq[i]) {
                    '/' -> {
                        if (numSeq[i + 1] == 0.0f){
                            Snackbar.make(clMain, "You can't divide by zero!", Snackbar.LENGTH_LONG).show()
                            handle_clear()
                        } else {
                            sum /= numSeq[i + 1]
                            handle_clear()
                            tv_results.text = "$sum"
                        }
                    }
                    '*' -> {
                        sum *= numSeq[i + 1]
                        handle_clear()
                        tv_results.text = "$sum"
                    }
                    '-' -> {
                        sum -= numSeq[i + 1]
                        handle_clear()
                        tv_results.text = "$sum"
                    }
                    '+' -> {
                        sum += numSeq[i + 1]
                        handle_clear()
                        tv_results.text = "$sum"
                    }
                }
            }

        }
    }





}