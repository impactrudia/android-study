package impactrudia.aop.inventoryappalone01

import androidx.lifecycle.*
import impactrudia.aop.inventoryappalone01.data.entitiy.Item
import impactrudia.aop.inventoryappalone01.data.room.ItemDao
import kotlinx.coroutines.launch

class InventoryViewModel(private val itemDao: ItemDao) : ViewModel() {

    fun saveItem(itemName: String, price: String, count: String) {
        viewModelScope.launch {
            itemDao.insert(Item(name = itemName, price = price.toDouble(), count = count.toInt()))
        }
    }

    fun getItem(id: Int): LiveData<Item>{
        return itemDao.getItem(id).asLiveData()
    }

    fun deleteItem(item: Item) {
        viewModelScope.launch {
            itemDao.delete(item)
        }
    }

    fun countDown(item: Item) {
        viewModelScope.launch {
            if(item.count > 0){
                item.copy(count = item.count-1)
                itemDao.update(item)
            }
        }

    }

    fun updateItem(item: Item) {
        viewModelScope.launch {
            itemDao.update(item)
        }
    }

    val allItems: LiveData<List<Item>> = itemDao.getAll().asLiveData()
}

class InventoryViewModelFactory(private val itemDao: ItemDao) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(InventoryViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return InventoryViewModel(itemDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}