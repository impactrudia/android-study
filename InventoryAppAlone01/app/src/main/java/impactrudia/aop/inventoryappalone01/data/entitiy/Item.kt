package impactrudia.aop.inventoryappalone01.data.entitiy

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    val name: String,
    val price: Double,
    var count: Int
)