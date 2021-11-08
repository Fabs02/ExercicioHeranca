package com.generation

class SalesManager (firstName: String,
                        lastName: String,
                        registration: Int,
                        age: Int,
                        daysWorked: Int,
                        vacationDaysTaken: Int,
                        salary: Double,
                        yearsWorked: Int,
) : employee (
    firstName, lastName, registration, age, daysWorked, vacationDaysTaken,
    salary, yearsWorked
) {

    val salesTeam = hashMapOf<Int,SalesRep>()

    fun addSalesRep (salesRep: SalesRep){
        salesTeam.put(salesRep.registration, salesRep)
    }

    fun calculateComission() {
        // 0.03 * all sales made by team
        var salesNum = 0.0
        if(salesTeam.isEmpty()) {
            println("Não há representantes de vendas na equipe")
        }else{
            for(item in salesTeam){
                salesNum += item.value.sales
            }
            val comission = 0.03 * salesNum

            println("A comissão geral, com base nas vendas realizadas peala equipe" +
                    " é R$$comission")
        }
    }

}
