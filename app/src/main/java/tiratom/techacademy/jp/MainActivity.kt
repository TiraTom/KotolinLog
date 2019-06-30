package tiratom.techacademy.jp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var customer1 = Human("Hito1", 30, "本")
        var customer2 = Human("Hito2", 45,  "煙草")

        customer1.say()
        customer1.think()

        customer2.say()
        customer2.think()

    }
}
