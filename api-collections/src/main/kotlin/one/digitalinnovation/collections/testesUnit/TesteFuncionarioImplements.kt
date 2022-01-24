package one.digitalinnovation.collections.testesUnit

import one.digitalinnovation.collections.Controll.imprimeRelatorio
import one.digitalinnovation.collections.Controller.FuncionarioImplements

fun main(){
    imprimeRelatorio.imprimeRelatorio((FuncionarioImplements("Ronaldo","12345678911", 2000.0,"Analista")))
    imprimeRelatorio.imprimeRelatorio((FuncionarioImplements("Jockter","33319328399", 8000.0,"Senior")))
}

