package my.edu.tarc.roomdbdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import my.edu.tarc.roomdbdemo.data.Product
import my.edu.tarc.roomdbdemo.data.ProductDB
import my.edu.tarc.roomdbdemo.data.ProductDao

class MainActivity : AppCompatActivity() {

    private lateinit var dao : ProductDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dao = ProductDB .getInstance(application).productDao

        val btn : Button = findViewById(R.id.btnInsert)

        btn.setOnClickListener(){
            val product = Product (0, "Apple", 2.50)

            CoroutineScope(IO).launch {
                dao.insertProduct(product) //insert the product above
            }

        }

    }
}