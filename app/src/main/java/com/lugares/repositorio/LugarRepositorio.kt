package com.lugares.repositorio

import androidx.lifecycle.MutableLiveData
import com.lugares.data.LugarDao
import com.lugares.model.Lugar

class LugarRepositorio(private val lugarDao: LugarDao) {
    val getAllData : MutableLiveData<List<Lugar>> = lugarDao.getLugares()

    suspend fun addLugar(lugar: Lugar){
        lugarDao.saveLugar(lugar)
    }

    suspend fun updateLugar(lugar: Lugar){
        lugarDao.saveLugar(lugar)
    }

    suspend fun deleteLugar(lugar: Lugar){
        lugarDao.deleteLugar(lugar)
    }
}