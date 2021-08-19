package my.edu.tarc.roomdbdemo.data

import androidx.room.Dao
import androidx.room.Insert

//this is a DAO for Query
@Dao
interface ProductDao {

    @Insert
    //suspend fun insertProduct(product : Product){}
    fun insertProduct(product : Product)


}