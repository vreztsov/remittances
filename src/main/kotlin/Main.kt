package ru.netology

fun main(){
    val minFee = 35
    val fee = 75
    val feeDivisor = 10000

    val amount = 4000

    var totalFee: Int = amount * fee / feeDivisor
    if (totalFee <= minFee) {
        totalFee = minFee
    }
    print("Комиссия $totalFee руб.")
}