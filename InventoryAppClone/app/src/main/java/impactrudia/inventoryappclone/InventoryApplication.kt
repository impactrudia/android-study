package impactrudia.inventoryappclone

import android.app.Application
import impactrudia.inventoryappclone.data.ItemRoomDatabase

class InventoryApplication : Application() {
    val database: ItemRoomDatabase by lazy { ItemRoomDatabase.getDatabase(this) }
}