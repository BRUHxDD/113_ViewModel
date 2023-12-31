package com.example.activity4

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.activity4.data.DataForm
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CobaViewModel : ViewModel() {
    var namaUser : String by mutableStateOf("")
        private set
    var jenisKl : String by mutableStateOf("")
        private set
    var alamat : String by mutableStateOf("")
        private set
    var email : String by mutableStateOf("")
        private set
    var status : String by mutableStateOf("")
        private set
    private val _uiState = MutableStateFlow(DataForm())
    val uiState : StateFlow<DataForm> = _uiState.asStateFlow()

    fun insertData(nm : String, jk: String, almt : String, eml: String, st : string){
        namaUser = nm
        jenisKl = jk
        alamat = almt
        email = eml
        status = st

    }
    fun setJenisK(pilihJK : String){
        _uiState.update { currentState -> currentState.copy(sex = pilihJK) }

    }

}