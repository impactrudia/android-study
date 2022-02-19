package impactrudia.aop.inventoryappalone01.data.room

import androidx.room.*
import impactrudia.aop.inventoryappalone01.data.entitiy.Item
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {

    @Query("SELECT * FROM Item")
    fun getAll(): Flow<List<Item>>

    @Query("SELECT * FROM Item WHERE id=:id")
    fun getItem(id: Int): Flow<Item>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(item: Item)

    @Update
    suspend fun update(item: Item)

    @Delete
    suspend fun delete(item: Item)
}