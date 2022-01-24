package one.digitalinnovation.collections.Controller

import one.digitalinnovation.collections.Cliente.Pessoa
import java.math.BigDecimal

abstract class Funcionario(
    override val name: String,
    override val cpf: String,
    val salario: Double
) : Pessoa(name, cpf) {

    protected abstract fun calculoAuxilio(): Double
    override fun toString(): String {
        return "Funcionario(name='$name', cpf='$cpf', salario=$salario) Auxilio: ${calculoAuxilio()}"
    }


}