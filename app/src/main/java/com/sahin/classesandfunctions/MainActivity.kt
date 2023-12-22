package com.sahin.classesandfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sahin.classesandfunctions.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /* Fonksiyonlar kodlarımızı daha düzenli yazmamıza olanak sağlayan yapılardır.
        1-> code block
        2 ->reusable
        3 ->input
        4 -> out put ,return

        Görünümler için findviewbyıd ve viewBinding kullanılır.
        bir görünüm ilk oncreate açılır bu yüzden tanımlama yaparken dikkat edilmesi gerek.
         */

        /* öncelik set On click listenerde'dır.

        binding.button.setOnClickListener(){
            mySum(67,43)
        }

         */

        test()
        mySum(4,5)
        mySum(45,15)

        val multiplyResult = multiply(3,2)
        val sumResult = mySum(3,2)

        println(multiplyResult) // Int değer döner.
        println(sumResult) // Unit boş değer döner.

        // Class
        /*
        val homerName = "Homer Simpson"
        val homerJob = "Nuclear"
        val homerAge = 50

        */

        val homer = Simpson("Homer Simpsob","Nuclear",50)

        println(homer.name)

        // Nullability -> null güvenliği demektir.
        var myString : String? = null
        myString = "Atıl"
        println(myString)

        var myAge : Int? = null
        //myAge = 50
        // 1 ) !!  -> ünlem yüzde yüz null olmadığına eminsen kullan.
        //println(myAge!! * 10)

        // 2) safe call
        //println(myAge?.minus(10))

        // 3)
        if(myAge != null){
            //null değilse
            println(myAge.minus(15))

        }else{
            // null ise
            println("Value is null")
        }

        // 4) Elvis operatoru
        println(myAge?.minus(30) ?: -1)

        // 5 ) Let -> izin vermek anlamındadır.
        myAge?.let {
            println(myAge.minus(12))
        }




    }
    fun test(){
        println("Test Function")
    }
    fun mySum(a : Int,b : Int){
        //binding.textView.text = "Result : ${a+b}"

    }
    fun multiply(a : Int,b : Int) : Int{
        return a * b
    }
    fun makeSimpson(view : View){

        // Scope -> kapsamı içindeki kod verilerini kapsar.
        val name = binding.nameText.text.toString()
        val job = binding.jobText.text.toString()
        val age = binding.ageText.text.toString().toIntOrNull()

        if(age != null){
            val simpson = Simpson(name,job,age)
            binding.textView.text = "Name : ${simpson.name} Job : ${simpson.job} Age : ${simpson.age}"

        }else{
            binding.textView.text = "Please Enter your age  correctly"
        }

    }
}