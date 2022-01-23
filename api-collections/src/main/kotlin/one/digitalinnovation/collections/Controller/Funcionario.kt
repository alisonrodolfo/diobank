package one.digitalinnovation.collections.Controller

import one.digitalinnovation.collections.Cliente.Pessoa
import java.math.BigDecimal

abstract class Funcionario(
    override val name: String,
    override val cpf: String,
    val salario: BigDecimal
) : Pessoa(name, cpf) {

    abstract fun calculoAuxilio()
}