/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author elver
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Paso 1. Declaracion de variables (identificadores)
double w, l, imc;
    //Paso 2. Asignar valores a las variables
    w=54;
    l=1.67;
    //Paso 3. Resolver el problema
    imc= w / Math.pow(l, 2);
    //Paso 4. Mostrar resultado
        System.out.println("Peso =" +w);
        System.out.println("Estatura =" +l);
        System.out.println("IMC =" +imc);
    }
    
}
