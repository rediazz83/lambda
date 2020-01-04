package com.edu.functional.formacion;

public class LambdasFactory {

    /** Devuelve una implemtacion de constante que siempre devuelve 5 */
    public Constante devuelve5() {
        return () -> 5;
    }

    /** Devuelve una implementacion de Operador con el metodo de suma de dos enteros */
    public Operador obtenSumador() {
        return (primerSumando, segundoSumando) -> primerSumando + segundoSumando;
    }

    /**
     * Devuelve un inicializador de un array de strings
     * El metodo inicializa recibe el array ya creado. Su tarea es que
     * todas las posiciones queden inicializadas con el valor indicado en el
     * seguno parametro del metodo incializa
     */
    public InicializadorArrays obtenInicializador() {
        return LambdasFactory::inicializa;
    }

    private static void inicializa(String[] array, String valor) {
        for (int x = 0; x < array.length; x++) {
            array[x] = valor;
        }
    }
}

interface Constante {
    int valor();
}

interface Operador {
    int opera ( int a, int b);
}

interface InicializadorArrays {
    void inicializa ( String[] array, String valor)  ;
}

