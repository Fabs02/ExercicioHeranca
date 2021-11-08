import com.generation.*


fun main(args: Array<String>) {

    val fabricio: employee = employee("Fabricio", "Calvanese",
        123, 20, 30, 30, 2000.00,
        2)

    val roberto: SalesRep = SalesRep("Roberto", "da Silva",
        456, 31, 40, 31, 3000.00,
        5, 5.0)

    val elena: SalesRep = SalesRep("Elena", "Ferreira",
        127, 23, 45, 29, 5000.00,
        3, 7.0)

    val jose: SalesRep = SalesRep("Jose", "Almeida",
        765, 42, 45, 30, 1500.00,
        3, 4.0)

    val amanda: SalesManager = SalesManager("Amanda", "da Silva",
        234, 25, 60, 30, 2500.00,
        6)

    println("INFORMAÇÕES ROBERTO")
    println(roberto.timeToRetirement())
    println(roberto.vacationTimeLeft())
    println(roberto.calculateBonus())
    println(roberto.calculateComission())
    println("--------------------------")

    amanda.addSalesRep(roberto)
    amanda.addSalesRep(elena)
    amanda.addSalesRep(jose)

    println("Comissão da equipe toda: ")
    amanda.calculateComission()
}