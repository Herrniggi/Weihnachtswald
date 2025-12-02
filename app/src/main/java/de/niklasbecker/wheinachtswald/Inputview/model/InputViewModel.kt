package de.niklasbecker.wheinachtswald.Inputview.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InputViewModel : ViewModel() {


//Price Value
    private val pPreis = MutableLiveData(0f)
    var preis: LiveData<Float> = pPreis;

    private val pPreisGluehwein = 6f
    var preisGluehwein = pPreisGluehwein

    private val pPreisKinderpunsch = 5f
    var preisKinderpunsch  = pPreisKinderpunsch

    private val pPreisPfand = 4f
    var preisPfand = pPreisPfand

    private val pPreisSoftgetraenk = 2f
    var preisSoftgetraenk = pPreisSoftgetraenk

    private val pPreisBier = 2.5f
    var preisBier = pPreisBier

    private val pPreisBurger = 3f
    var preisBurger = pPreisBurger

    private val pPreisGemueserolle = 4f
    var preisGemueserolle = pPreisGemueserolle



//Anzahl Value
    private val pGluehweinAnzahl = MutableLiveData(0)
    var gluehweinAnzahl: LiveData<Int> = pGluehweinAnzahl;

    private val pKinderpunschAnzahl = MutableLiveData(0)
    var kinderpunschAnzahl: LiveData<Int> = pKinderpunschAnzahl;

    private val pPfandAnzahl = MutableLiveData(0)
    var pfandAnzahl: LiveData<Int> = pPfandAnzahl;

    private val pBellarisAnzahl = MutableLiveData(0)
    var bellarisAnzahl: LiveData<Int> = pBellarisAnzahl;

    private val pColaAnzahl = MutableLiveData(0)
    var colaAnzahl: LiveData<Int> = pColaAnzahl;

    private val pFantaAnzahl = MutableLiveData(0)
    var fantaAnzahl: LiveData<Int> = pFantaAnzahl;

    private val pSpeziAnzahl = MutableLiveData(0)
    var speziAnzahl: LiveData<Int> = pSpeziAnzahl;

    private val pApfelschorleAnzahl = MutableLiveData(0)
    var apfelschorleAnzahl: LiveData<Int> = pApfelschorleAnzahl;

    private val pWasserAnzahl = MutableLiveData(0)
    var wasserAnzahl: LiveData<Int> = pWasserAnzahl;

    private val pJohannisbeerAnzahl = MutableLiveData(0)
    var johannisbeerAnzahl: LiveData<Int> = pJohannisbeerAnzahl;

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
        pBellarisAnzahl.value = 0
        pColaAnzahl.value = 0
        pFantaAnzahl.value = 0
        pSpeziAnzahl.value = 0
        pApfelschorleAnzahl.value = 0
        pWasserAnzahl.value = 0
        pJohannisbeerAnzahl.value = 0
        pBierAnzahl.value = 0
        pBurgerAnzahl.value = 0
        pGemueserolleAnzahl.value = 0
    }

    //Glühwein
    fun plusGluehwein() {
        pPreis.value = pPreis.value?.plus(preisGluehwein)
        pGluehweinAnzahl.value = pGluehweinAnzahl.value?.plus(1)
        pGluehweinStatistik.value = pGluehweinStatistik.value?.plus(1)
    }

    fun minusGluehwein(){
        pPreis.value = pPreis.value?.minus(preisGluehwein)
        pGluehweinAnzahl.value = pGluehweinAnzahl.value?.minus(1)
        pGluehweinStatistik.value = pGluehweinStatistik.value?.minus(1)
    }

    //Kinderpunsch
    fun plusKinderpunsch() {
        pPreis.value = pPreis.value?.plus(preisKinderpunsch)
        pKinderpunschAnzahl.value =  pKinderpunschAnzahl.value?.plus(1)
        pKinderpunschStatistik.value = pKinderpunschStatistik.value?.plus(1)
    }

    fun minusKinderpunsch(){
        pPreis.value = pPreis.value?.minus(preisKinderpunsch)
        pKinderpunschAnzahl.value =  pKinderpunschAnzahl.value?.minus(1)
        pKinderpunschStatistik.value = pKinderpunschStatistik.value?.minus(1)
    }

    //Pfand
    fun plusRueckgabe() {
        pPreis.value = pPreis.value?.minus(preisPfand)
        pPfandAnzahl.value = pPfandAnzahl.value?.plus(1)
    }

    fun minusRueckgabe(){
        pPreis.value = pPreis.value?.plus(preisPfand)
        pPfandAnzahl.value = pPfandAnzahl.value?.minus(1)
    }

    //Bellaris
    fun plusBellaris() {
        pPreis.value = pPreis.value?.plus(preisSoftgetraenk)
        pBellarisAnzahl.value = pBellarisAnzahl.value?.plus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.plus(1)
    }

    fun minusBellaris(){
        pPreis.value = pPreis.value?.minus(preisSoftgetraenk)
        pBellarisAnzahl.value = pBellarisAnzahl.value?.minus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.minus(1)
    }

    //Cola
    fun plusCola() {
        pPreis.value = pPreis.value?.plus(preisSoftgetraenk)
        pColaAnzahl.value = pColaAnzahl.value?.plus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.plus(1)
    }

    fun minusCola(){
        pPreis.value = pPreis.value?.minus(preisSoftgetraenk)
        pColaAnzahl.value = pColaAnzahl.value?.minus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.minus(1)
    }

    //Fanta
    fun plusFanta() {
        pPreis.value = pPreis.value?.plus(preisSoftgetraenk)
        pFantaAnzahl.value = pFantaAnzahl.value?.plus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.plus(1)
    }

    fun minusFanta(){
        pPreis.value = pPreis.value?.minus(preisSoftgetraenk)
        pFantaAnzahl.value = pFantaAnzahl.value?.minus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.minus(1)
    }

    //Spezi
    fun plusSpezi() {
        pPreis.value = pPreis.value?.plus(preisSoftgetraenk)
        pSpeziAnzahl.value = pSpeziAnzahl.value?.plus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.plus(1)
    }

    fun minusSpezi(){
        pPreis.value = pPreis.value?.minus(preisSoftgetraenk)
        pSpeziAnzahl.value = pSpeziAnzahl.value?.minus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.minus(1)
    }

    //Apfelschorle
    fun plusApfelschorle() {
        pPreis.value = pPreis.value?.plus(preisSoftgetraenk)
        pApfelschorleAnzahl.value = pApfelschorleAnzahl.value?.plus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.plus(1)
    }

    fun minusApfelschorle(){
        pPreis.value = pPreis.value?.minus(preisSoftgetraenk)
        pApfelschorleAnzahl.value = pApfelschorleAnzahl.value?.minus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.minus(1)
    }

    //Wasser
    fun plusWasser() {
        pPreis.value = pPreis.value?.plus(preisSoftgetraenk)
        pWasserAnzahl.value = pWasserAnzahl.value?.plus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.plus(1)
    }

    fun minusWasser(){
        pPreis.value = pPreis.value?.minus(preisSoftgetraenk)
        pWasserAnzahl.value = pWasserAnzahl.value?.minus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.minus(1)
    }

    //Johannisbeer
    fun plusJohannisbeer() {
        pPreis.value = pPreis.value?.plus(preisSoftgetraenk)
        pJohannisbeerAnzahl.value = pJohannisbeerAnzahl.value?.plus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.plus(1)
    }

    fun minusJohannisbeer(){
        pPreis.value = pPreis.value?.minus(preisSoftgetraenk)
        pJohannisbeerAnzahl.value = pJohannisbeerAnzahl.value?.minus(1)
        pSoftgetraenkStatistik.value = pSoftgetraenkStatistik.value?.minus(1)
    }

    //Bier
    fun plusBier() {
        pPreis.value = pPreis.value?.plus(preisBier)
        pBierAnzahl.value = pBierAnzahl.value?.plus(1)
        pBierStatistik.value = pBierStatistik.value?.plus(1)
    }

    fun minusBier(){
        pPreis.value = pPreis.value?.minus(preisBier)
        pBierAnzahl.value = pBierAnzahl.value?.minus(1)
        pBierStatistik.value = pBierStatistik.value?.minus(1)
    }

    //Burger
    fun plusBurger() {
        pPreis.value = pPreis.value?.plus(preisBurger)
        pBurgerAnzahl.value = pBurgerAnzahl.value?.plus(1)
        pBurgerStatistik.value = pBurgerStatistik.value?.plus(1)
    }

    fun minusBurger(){
        pPreis.value = pPreis.value?.minus(preisBurger)
        pBurgerAnzahl.value = pBurgerAnzahl.value?.minus(1)
        pBurgerStatistik.value = pBurgerStatistik.value?.minus(1)
    }

    //Gemueserolle
    fun plusGemueserolle() {
        pPreis.value = pPreis.value?.plus(preisGemueserolle)
        pGemueserolleAnzahl.value = pGemueserolleAnzahl.value?.plus(1)
        pGemueserolleStatistik.value = pGemueserolleStatistik.value?.plus(1)
    }

    fun minusGemueserolle(){
        pPreis.value = pPreis.value?.minus(preisGemueserolle)
        pGemueserolleAnzahl.value = pGemueserolleAnzahl.value?.minus(1)
        pGemueserolleStatistik.value = pGemueserolleStatistik.value?.minus(1)
    }


}