package com.sahin.classesandfunctions

//primary constructor
class Simpson(var name : String,var job : String , var age : Int) {
    private var height = 0

    fun setHeight(num : Int){
        if(num > 100){
            height = num
        }

    }





    /*
    // property özellik.
    var name = ""
    var job = ""
    var age  = 0

    // Secondary Constructor -> inşa etmek oluşturmak.her obje oluştuğunda constructor çağrılır.
    constructor(name : String,job : String,age : Int){
        this.name = name
        this.job = job
        this.age = age

    }

     */
}