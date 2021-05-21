package com.example.fris_icecream_app.ui.main.pay

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fris_icecream_app.ui.main.database.AppDatabase
import com.example.fris_icecream_app.ui.main.database.OrderDAO
import com.example.fris_icecream_app.ui.main.database.TypeObject
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CheckOutViewModel: ViewModel() {
   val typeListLiveData: MutableLiveData<List<TypeObject>> = MutableLiveData()

    fun fetchAllOrders(database: AppDatabase){
        CoroutineScope(Dispatchers.IO).launch {
            val orderDAO= database.orderDAO()
            val list = orderDAO.getAllItems()

            typeListLiveData.postValue(list)
        }
    }
}