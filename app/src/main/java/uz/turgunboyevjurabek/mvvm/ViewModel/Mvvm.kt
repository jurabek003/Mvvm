package uz.turgunboyevjurabek.mvvm.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import uz.turgunboyevjurabek.mvvm.Madels.Data

class Mvvm :ViewModel(){

    var click=0
    var click2=0
    var data=Data()

    var liveData=MutableLiveData(data.count)
    var liveData2=MutableLiveData(data.count2)


    fun addClick(){
        click++
        liveData.postValue(click)
        data.count++
    }

    fun addClick2(){
        click2++
        liveData.postValue(click2)
        data.count2++
    }

    fun getData():LiveData<Int>{
     return liveData
    }
    fun getData2():LiveData<Int>{
     return liveData2
    }
}