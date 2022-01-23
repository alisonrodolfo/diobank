package one.digitalinnovation.collections

class Pessoa {
    var name: String = "Nome"
    var cpf: String = "123.123.123-11"
    private set

    constructor()

    fun pessoInfor() = "$name e $cpf"



}

fun main(){
    val name = Pessoa()

    println(name.pessoInfor())
}
