/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.clase1grupo42;

/**
 *
 * @author Usuario
 */
public class Clase1Grupo42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // comentarios en linea es con doble slash
        // sigo escribiendo
        /* comentar grandes pedazos de código
        para que no se pierda ninguna descripción
        de lo que hace el programa   
        este es el comentario en Bloque*/
        //----------------datos primitivos de Java-----------------
        int a = 10;//Java es un lenguaje tipado: Que debo definir de manera explicita
        //el tipo de dato, así es la definición un Entero 'int'
        long a1 = 11;// entero es de 32 bits mientras que long es de 64 bits
        short a2=32767;//un entero de 16 bits
        float b = 10;//32 bits para la parte entera y 32 bits para punto decimal
        double c = 10;//64 bits para la parte entera y 364 bits para punto decimal
        char d = 'M';//unico caracter pero este funciona diferente a los str de Python
        boolean f = true;// true o false
        int x, y, z;//creación de varias variables del mismo tipo (entero)
        x = 1;
        y = 2;
        z = 5;//Asingación de un valor a una variable

        //'null' es equivalente a 'None' de Python
        System.out.print(a);//print() sin salto de linea
        System.out.println(a1);//print() con salto de linea
        System.out.println("");//sout + tecla Tab

        Perro Lazzi = new Perro();//Objeto de Clase Perro
        Perro Rocky = new Perro();//Otro Objeto de Clase Perro
        Chiguagua taco = new Chiguagua();
        taco.peso = 500;

        //and en Python es &&
        //or en Python es ||
        //not en Python es !
        //= es de asiganción
        //== comparación valores
        //< > <= >= != siguen iguales a los de python
        //casteo:
        //int -> long -> float -> double -> String
        float suma = a + b;//sumar con operador +
        float resta = a - b;//resta con -
        float multiplicacion = a * b;//multiplica con *
        float division = a / b;

        System.out.println(suma(1.5f, 5));

        /* 
        if (a==b){ System.out.println("son iguales");}
        
        if (a < b && a < c ) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        //---------------------Clases predefinidas de Java------------
        String s = "MIsael Fdo Perilla Benitez";
        Integer I = null;
        Float F = 10f;
        Double D = 10d;
        a++;//incrementa el valor de la variable en +1
        a--;//decrementa
        --a;
        ++a;
        
        boolean iguales=s.equals("MIsael Fdo Perilla Benitez");

        String arreglo[] = new String[s.length()];//funciona similar a una lista
        //tamaño fijo 
        char letra;
        for (int i = 0; i < s.length(); i++) {//len(algo)
            letra = s.charAt(i);
            System.out.print(s.charAt(i));
            arreglo[i] = "" + letra;
        }
        System.out.println("Arreglo= ");
        for (int i = 0; i < s.length(); i++) {
            System.out.println(arreglo[i]);
        }
         */
    }

    static float suma(float a, float b) {
        return a + b;
    }

}
