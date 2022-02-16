package impactrudia.aop.inventoryappalone01

import android.app.Application
import impactrudia.aop.inventoryappalone01.data.room.ItemRoomDatabase

class InventoryApplication : Application(){

    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getInstance(this) }
}