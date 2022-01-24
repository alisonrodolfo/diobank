package one.digitalinnovation.collections.Controller

import java.math.BigDecimal

class FuncionarioImplements(name: String, cpf: String, salario: Double,cargo: String) : Funcionario(name, cpf, salario) {
    var cargo : String = cargo
    override fun calculoAuxilio(): Double =
            when(cargo){
                "Analista" -> salario * 0.1
                "Junior" -> salario * 0.2
                "Pleno" -> salario * 0.3
                "Senior" -> salario * 0.5
                else -> {0.0}
            }
}
