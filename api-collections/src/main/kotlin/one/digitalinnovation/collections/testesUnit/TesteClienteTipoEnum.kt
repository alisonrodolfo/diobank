package one.digitalinnovation.collections.testesUnit

import one.digitalinnovation.collections.Cliente.ContaTipo

fun main(){
    ContaTipo.values().forEach { elemento ->
        println("${elemento.name} - $elemento")
    }

    ContaTipo.values().forEach { println("${it.name} ${it.description}") }

}