package com.generation

class SalesRep(firstName: String, lastName: String, registration: Int,
                    age: Int, daysWorked: Int, vacationDaysTaken: Int,
                    salary: Double, yearsWorked: Int, var sales: Double
) :
    employee(firstName, lastName, registration,
             age, daysWorked, vacationDaysTaken,
             salary, yearsWorked,) {

    fun calculateComission(): Double {

        //comission = 0.1 * salesMade
        return 0.1 * sales
    }

}

