package com.generation

import kotlin.math.min

open class employee (var firstName: String, var lastName: String, var registration: Int,
                        var age: Int, var daysWorked: Int, var vacationDaysTaken: Int,
                        var salary: Double, var yearsWorked: Int) {

    fun timeToRetirement() {
        var retirement = min(60 - age, 40 - yearsWorked)
        return println("Tempo para se aposentar: $retirement")
    }

    fun vacationTimeLeft() {
        var vacationTimeRemaining = (daysWorked/360)*(30 - vacationDaysTaken)
        return println("Tempo de férias: $vacationTimeRemaining")
    }

    open fun calculateBonus() {
        var bonus = 2.2*salary
        return println("O bônus salarial é de: R$$bonus")
    }

}

