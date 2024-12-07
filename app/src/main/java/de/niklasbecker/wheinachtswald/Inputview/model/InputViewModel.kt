package de.niklasbecker.wheinachtswald.Inputview.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InputViewModel : ViewModel() {



    private val pPreis = MutableLiveData(0f)
    var preis: LiveData<Float> = pPreis;


//Anzahl Value
    private val pGluehweinAnzahl = MutableLiveData(0)
    var gluehweinAnzahl: LiveData<Int> = pGluehweinAnzahl;

    private val pKinderpunschAnzahl = MutableLiveData(0)
    var kinderpunschAnzahl: LiveData<Int> = pKinderpunschAnzahl;

    private val pPfandAnzahl = MutableLiveData(0)
    var pfandAnzahl: LiveData<Int> = pPfandAnzahl;

    private val pSoftgetraenkAnzahl = MutableLiveData(0)
    var softgetraenkAnzahl: LiveData<Int> = pSoftgetraenkAnzahl;

    private val pBierAnzahl = MutableLiveData(0)
    var bierAnzahl: LiveData<Int> = pBierAnzahl;

    private val pBurgerAnzahl = MutableLiveData(0)
    var burgerAnzahl: LiveData<Int> = pBurgerAnzahl;

    private val pGemueserolleAnzahl = MutableLiveData(0)
    var gemueserolleAnzahl: LiveData<Int> = pGemueserolleAnzahl;

//Statistik Value
    private val pGluehweinStatistik = MutableLiveData(0)
    var gluehweinStatistik: LiveData<Int> = pGluehweinStatistik;

    private val pKinderpunschStatistik = MutableLiveData(0)
    var kinderpunschStatistik: LiveData<Int> = pKinderpunschStatistik;

    private val pPfandStatistik = MutableLiveData(0)
    var pfandStatistik: LiveData<Int> = pPfandStatistik;

    private val pSoftgetraenkStatistik = MutableLiveData(0)
    var softgetraenkStatistik: LiveData<Int> = pSoftgetraenkStatistik;

    private val pBierStatistik = MutableLiveData(0)
    var bierStatistik: LiveData<Int> = pBierStatistik;

    private val pBurgerStatistik = MutableLiveData(0)
    var burgerStatistik: LiveData<Int> = pBurgerStatistik;

    private val pGemueserolleStatistik = MutableLiveData(0)
    var gemueserolleStatistik: LiveData<Int> = pGemueserolleStatistik;



    //Reset Value
    fun preisReset(){
        pPreis.value = 0f
        pGluehweinAnzahl.value = 0
        pKinderpunschAnzahl.value = 0
        pPfandAnzahl.value = 0
        pSoftgetraenkAnzahl.value = 0
        pBierAnzahl.value = 0
        pBurgerAnzahl.value = 0
        pGemueserolleAnzahl.value = 0
    }

    //Glühwein
    fun plusGluehwein() {
        pPreis.value = pPreis.value?.plus(6)
        pGluehweinAnzahl.value = pGluehweinAnzahl.value?.plus(1)
        pGluehweinStatistik.value = pGluehweinStatistik.value?.plus(1)
    }

    fun minusGluehwein(){
        pPreis.value = pPreis.value?.minus(6)
        pGluehweinAnzahl.value = pGluehweinAnzahl.value?.minus(1)
        pGluehweinStatistik.value = pGluehweinStatistik.value?.minus(1)
    }

    //Kinderpunsch
    fun plusKinderpunsch() {
        pPreis.value = pPreis.value?.plus(5)
        pKinderpunschAnzahl.value =  pKinderpunschAnzahl.value?.plus(1)
        pKinderpunschStatistik.value = pKinderpunschStatistik.value?.plus(1)
    }

    fun minusKinderpunsch(){
        pPreis.value = pPreis.value?.minus(5)
        pKinderpunschAnzahl.value =  pKinderpunschAnzahl.value?.minus(1)
        pKinderpunschStatistik.value = pKinderpunschStatistik.value?.minus(1)
    }

    //Pfand
    fun plusRueckgabe() {
        pPreis.value = pPreis.value?.minus(4)
        pPfandAnzahl.value = pPfandAnzahl.value?.plus(1)
    }

    fun minusRueckgabe(){
        pPreis.value = pPreis.value?.plus(4)
        pPfandAnzahl.value = pPfandAnzahl.value?.minus(1)
    }

    //Softgetraänk
    fun plusSoftgetraenk() {
        pPreis.value = pPreis.value?.plus(2)
        pSoftgetraenkAnzahl.value = pSoftgetraenkAnzahl.value?.plus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.plus(1)
    }

    fun minusSoftgetraenk(){
        pPreis.value = pPreis.value?.minus(2)
        pSoftgetraenkAnzahl.value = pSoftgetraenkAnzahl.value?.minus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.minus(1)
    }

    //Bier
    fun plusBier() {
        pPreis.value = pPreis.value?.plus(2.5f)
        pBierAnzahl.value = pBierAnzahl.value?.plus(1)
        pBierStatistik.value = pBierStatistik.value?.plus(1)
    }

    fun minusBier(){
        pPreis.value = pPreis.value?.minus(2.5f)
        pBierAnzahl.value = pBierAnzahl.value?.minus(1)
        pBierStatistik.value = pBierStatistik.value?.minus(1)
    }

    //Burger
    fun plusBurger() {
        pPreis.value = pPreis.value?.plus(3)
        pBurgerAnzahl.value = pBurgerAnzahl.value?.plus(1)
        pBurgerStatistik.value = pBurgerStatistik.value?.plus(1)
    }

    fun minusBurger(){
        pPreis.value = pPreis.value?.minus(3)
        pBurgerAnzahl.value = pBurgerAnzahl.value?.minus(1)
        pBurgerStatistik.value = pBurgerStatistik.value?.minus(1)
    }

    //Gemueserolle
    fun plusGemueserolle() {
        pPreis.value = pPreis.value?.plus(4)
        pGemueserolleAnzahl.value = pGemueserolleAnzahl.value?.plus(1)
        pGemueserolleStatistik.value = pGemueserolleStatistik.value?.plus(1)
    }

    fun minusGemueserolle(){
        pPreis.value = pPreis.value?.minus(4)
        pGemueserolleAnzahl.value = pGemueserolleAnzahl.value?.minus(1)
        pGemueserolleStatistik.value = pGemueserolleStatistik.value?.minus(1)
    }


}