package tiratom.techacademy.jp

import android.util.Log

public open class Dog: Animal, Movable{

    constructor(name: String, age: Int): super(name, age){
    }

    override fun say(){
        Log.d("kotolintest", "${this.name} is ${this.age} old years.")
    }

    override fun move(){
        Log.d("kotlintest", "${this.name} ran with it's utmost effort")
    }
}