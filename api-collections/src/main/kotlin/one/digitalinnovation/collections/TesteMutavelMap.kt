package one.digitalinnovation.collections

fun main() {
    val joao = FFF("Joao", 2000.0, "CLT")
    val pedro = FFF("Pedro", 1500.0, "PJ")
    val maria = FFF("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<FFF>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))

    println("----------------------")
    repositorio.findAll().forEach { println(it) }

    println("----------------------")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }
}