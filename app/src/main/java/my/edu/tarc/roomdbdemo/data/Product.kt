package my.edu.tarc.roomdbdemo.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_table")
data class Product(

    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo //(name = "Product Name") < if want to change table column name
    var name:String,

    @ColumnInfo
    var price:Double
    )
