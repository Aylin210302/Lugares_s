package com.lugares.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.lugares.data.LugarDao
import com.lugares.model.Lugar
import com.lugares.repositorio.LugarRepositorio
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LugarViewModel(application: Application) : AndroidViewModel(application) {
    val getAllData : MutableLiveData<List<Lugar>>
    private val repositorio : LugarRepositorio = LugarRepositorio(LugarDao())

    init{
        getAllData = repositorio.getAllData
    }

    fun addLugar(lugar: Lugar){
        viewModelScope.launch(Dispatchers.IO) {repositorio.addLugar(lugar)}
    }

    fun updateLugar(lugar: Lugar){
        viewModelScope.launch(Dispatchers.IO) {repositorio.updateLugar(lugar)}
    }

    fun deleteLugar(lugar: Lugar){
        viewModelScope.launch(Dispatchers.IO) {repositorio.deleteLugar(lugar)}
    }

}