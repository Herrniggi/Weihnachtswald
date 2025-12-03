package de.niklasbecker.wheinachtswald.Inputview.model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InputViewModel : ViewModel() {

    //Price Value
    private val pPreis = MutableLiveData(0f)
    val preis: LiveData<Float> = pPreis

    val preisGluehwein = 6f

    val preisKinderpunsch = 5f

    val preisPfand = 4f

    val preisSoftgetraenk = 2f

    val preisBier = 2.5f

    val preisBurger = 3f

    val preisGemueserolle = 4f

    //Anzahl Value
    private val pGluehweinAnzahl = MutableLiveData(0)
    val gluehweinAnzahl: LiveData<Int> = pGluehweinAnzahl

    private val pKinderpunschAnzahl = MutableLiveData(0)
    val kinderpunschAnzahl: LiveData<Int> = pKinderpunschAnzahl

    private val pPfandAnzahl = MutableLiveData(0)
    val pfandAnzahl: LiveData<Int> = pPfandAnzahl

    private val pBellarisAnzahl = MutableLiveData(0)
    val bellarisAnzahl: LiveData<Int> = pBellarisAnzahl

    private val pColaAnzahl = MutableLiveData(0)
    val colaAnzahl: LiveData<Int> = pColaAnzahl

    private val pFantaAnzahl = MutableLiveData(0)
    val fantaAnzahl: LiveData<Int> = pFantaAnzahl

    private val pSpeziAnzahl = MutableLiveData(0)
    val speziAnzahl: LiveData<Int> = pSpeziAnzahl

    private val pApfelschorleAnzahl = MutableLiveData(0)
    val apfelschorleAnzahl: LiveData<Int> = pApfelschorleAnzahl

    private val pWasserAnzahl = MutableLiveData(0)
    val wasserAnzahl: LiveData<Int> = pWasserAnzahl

    private val pJohannisbeerAnzahl = MutableLiveData(0)
    val johannisbeerAnzahl: LiveData<Int> = pJohannisbeerAnzahl

    private val pBierAnzahl = MutableLiveData(0)
    val bierAnzahl: LiveData<Int> = pBierAnzahl

    private val pBurgerAnzahl = MutableLiveData(0)
    val burgerAnzahl: LiveData<Int> = pBurgerAnzahl

    private val pGemueserolleAnzahl = MutableLiveData(0)
    val gemueserolleAnzahl: LiveData<Int> = pGemueserolleAnzahl

    //Statistik Value
    private val pGluehweinStatistik = MutableLiveData(0)
    val gluehweinStatistik: LiveData<Int> = pGluehweinStatistik

    private val pKinderpunschStatistik = MutableLiveData(0)
    val kinderpunschStatistik: LiveData<Int> = pKinderpunschStatistik

    private val pSoftgetraenkStatistik = MutableLiveData(0)
    val softgetraenkStatistik: LiveData<Int> = pSoftgetraenkStatistik

    private val pBierStatistik = MutableLiveData(0)
    val bierStatistik: LiveData<Int> = pBierStatistik

    private val pBurgerStatistik = MutableLiveData(0)
    val burgerStatistik: LiveData<Int> = pBurgerStatistik

    private val pGemueserolleStatistik = MutableLiveData(0)
    val gemueserolleStatistik: LiveData<Int> = pGemueserolleStatistik

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

    // Helper functions
    private fun addFloat(liveData: MutableLiveData<Float>, amount: Float) {
        liveData.value = (liveData.value ?: 0f) + amount
    }

    private fun subFloat(liveData: MutableLiveData<Float>, amount: Float) {
        liveData.value = (liveData.value ?: 0f) - amount
    }

    private fun addInt(liveData: MutableLiveData<Int>, amount: Int) {
        liveData.value = (liveData.value ?: 0) + amount
    }

    private fun subInt(liveData: MutableLiveData<Int>, amount: Int) {
        liveData.value = (liveData.value ?: 0) - amount
    }

    //Glühwein
    fun plusGluehwein() {
        print("!!!TEST!!!")
        addFloat(pPreis, preisGluehwein)
        addInt(pGluehweinAnzahl, 1)
        addInt(pGluehweinStatistik, 1)
    }

    fun minusGluehwein(){
        subFloat(pPreis, preisGluehwein)
        subInt(pGluehweinAnzahl, 1)
        subInt(pGluehweinStatistik, 1)
    }

    //Kinderpunsch
    fun plusKinderpunsch() {
        addFloat(pPreis, preisKinderpunsch)
        addInt(pKinderpunschAnzahl, 1)
        addInt(pKinderpunschStatistik, 1)
    }

    fun minusKinderpunsch(){
        subFloat(pPreis, preisKinderpunsch)
        subInt(pKinderpunschAnzahl, 1)
        subInt(pKinderpunschStatistik, 1)
    }

    //Pfand
    fun plusRueckgabe() {
        subFloat(pPreis, preisPfand)
        addInt(pPfandAnzahl, 1)
    }

    fun minusRueckgabe(){
        addFloat(pPreis, preisPfand)
        subInt(pPfandAnzahl, 1)
    }

    //Bellaris
    fun plusBellaris() {
        addFloat(pPreis, preisSoftgetraenk)
        addInt(pBellarisAnzahl, 1)
        addInt(pSoftgetraenkStatistik, 1)
    }

    fun minusBellaris(){
        subFloat(pPreis, preisSoftgetraenk)
        subInt(pBellarisAnzahl, 1)
        subInt(pSoftgetraenkStatistik, 1)
    }

    //Cola
    fun plusCola() {
        addFloat(pPreis, preisSoftgetraenk)
        addInt(pColaAnzahl, 1)
        addInt(pSoftgetraenkStatistik, 1)
    }

    fun minusCola(){
        subFloat(pPreis, preisSoftgetraenk)
        subInt(pColaAnzahl, 1)
        subInt(pSoftgetraenkStatistik, 1)
    }

    //Fanta
    fun plusFanta() {
        addFloat(pPreis, preisSoftgetraenk)
        addInt(pFantaAnzahl, 1)
        addInt(pSoftgetraenkStatistik, 1)
    }

    fun minusFanta(){
        subFloat(pPreis, preisSoftgetraenk)
        subInt(pFantaAnzahl, 1)
        subInt(pSoftgetraenkStatistik, 1)
    }

    //Spezi
    fun plusSpezi() {
        addFloat(pPreis, preisSoftgetraenk)
        addInt(pSpeziAnzahl, 1)
        addInt(pSoftgetraenkStatistik, 1)
    }

    fun minusSpezi(){
        subFloat(pPreis, preisSoftgetraenk)
        subInt(pSpeziAnzahl, 1)
        subInt(pSoftgetraenkStatistik, 1)
    }

    //Apfelschorle
    fun plusApfelschorle() {
        addFloat(pPreis, preisSoftgetraenk)
        addInt(pApfelschorleAnzahl, 1)
        addInt(pSoftgetraenkStatistik, 1)
    }

    fun minusApfelschorle(){
        subFloat(pPreis, preisSoftgetraenk)
        subInt(pApfelschorleAnzahl, 1)
        subInt(pSoftgetraenkStatistik, 1)
    }

    //Wasser
    fun plusWasser() {
        addFloat(pPreis, preisSoftgetraenk)
        addInt(pWasserAnzahl, 1)
        addInt(pSoftgetraenkStatistik, 1)
    }

    fun minusWasser(){
        subFloat(pPreis, preisSoftgetraenk)
        subInt(pWasserAnzahl, 1)
        subInt(pSoftgetraenkStatistik, 1)
    }

    //Johannisbeer
    fun plusJohannisbeer() {
        addFloat(pPreis, preisSoftgetraenk)
        addInt(pJohannisbeerAnzahl, 1)
        addInt(pSoftgetraenkStatistik, 1)
    }

    fun minusJohannisbeer(){
        subFloat(pPreis, preisSoftgetraenk)
        subInt(pJohannisbeerAnzahl, 1)
        subInt(pSoftgetraenkStatistik, 1)
    }

    //Bier
    fun plusBier() {
        addFloat(pPreis, preisBier)
        addInt(pBierAnzahl, 1)
        addInt(pBierStatistik, 1)
    }

    fun minusBier(){
        subFloat(pPreis, preisBier)
        subInt(pBierAnzahl, 1)
        subInt(pBierStatistik, 1)
    }

    //Burger
    fun plusBurger() {
        addFloat(pPreis, preisBurger)
        addInt(pBurgerAnzahl, 1)
        addInt(pBurgerStatistik, 1)
    }

    fun minusBurger(){
        subFloat(pPreis, preisBurger)
        subInt(pBurgerAnzahl, 1)
        subInt(pBurgerStatistik, 1)
    }

    //Gemueserolle
    fun plusGemueserolle() {
        addFloat(pPreis, preisGemueserolle)
        addInt(pGemueserolleAnzahl, 1)
        addInt(pGemueserolleStatistik, 1)
    }

    fun minusGemueserolle(){
        subFloat(pPreis, preisGemueserolle)
        subInt(pGemueserolleAnzahl, 1)
        subInt(pGemueserolleStatistik, 1)
    }
}