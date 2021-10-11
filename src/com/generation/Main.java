package com.generation;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /*//Estructura de control if
        if(condicion){

        } else if(){

        }else{

        }*/
        //para importar ctrl + espacio

        /*//Scanner sc es un objeto de la clase Scanner
        Scanner sc = new Scanner(System.in);
        //PREGUNTA EN LA CONSOLA
        System.out.println("Ingresa tu edad");
        //Lee la opción que ingresamos
        int edad = sc.nextInt();
        //Pregunta otra vez
        System.out.println("Cuál es tu nombre?");
        //Limpia espacio en blanco, lo pone en blanco e ingresa el nuevo valor y puede volver a solicitar el datos
        sc.nextLine();
        //Lee la opción que ingresamos
        String nombre = sc.nextLine();

        if(edad>18){
            System.out.println("Felicidades, " + nombre + " Puedes votar");
        } else {
            System.out.println("Hola" + nombre + " puedes votar");
        } */
        //cerrar scanner
        //sc.close();

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer angulo");
        int angulo1 = sc.nextInt();
        System.out.println("Ingresa el segundo angulo");
        sc.nextLine();
        int angulo2 = sc.nextInt();
        System.out.println("Ingresa el tercer angulo");
        sc.nextLine();
        int angulo3 = sc.nextInt();

        if(angulo1==angulo2 && angulo2==angulo3 && angulo1==angulo3){
            System.out.println("Es un triangulo equilatero porque tiene 3 angulos iguales");
        } if(angulo1==angulo2 && angulo2!=angulo3 && angulo1!=angulo3 || angulo1!=angulo2 && angulo2!=angulo3 && angulo3==angulo1 || angulo1!=angulo2 && angulo2==angulo3 && angulo3!=angulo1 ){
            System.out.println("Es un triangulo Isósceles porque tiene 2 angulos iguales");
        }if(angulo1!=angulo2 && angulo2!=angulo3 && angulo1!=angulo3) {
            System.out.println("Es un triangulo Escaleno porque todos sus angulos son distintos");
        }
        //se limpia cuando se cambia de datos y cuando se acaba el programa



        */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un año");
        int anio = sc.nextInt();
        if(anio % 4 == 0 && anio % 100 != 0 || anio % 100 == 0 && anio % 400 == 0){
            System.out.println("Es año bisiesto");
        }
        else{
            System.out.println("No es año bisiesto");
        }
    */

      /*  switch (condicion){
            case 1:
                codigo
            break;
            case 1:
                codigo
            break;

            default:
            break;
        }*/

        /*
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro numero");
        int numero2 = sc.nextInt();
        System.out.println("Ingresa la operación deseada: \n1) suma \n2) Resta" +
                "\n3) Multiplicación \n4) División");
        int operacion = sc.nextInt();
        sc.nextLine();
        float resultado = 0;

        switch (operacion){
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
            resultado = numero1 * numero2;
            break;
            case 4:
                resultado = numero1 / numero2;
                break;

            default:
                System.out.println("La operación que seleccionaste es" +
                        "invalida");
                break;
        }
        sc.close();
        System.out.println(resultado);
        */






    }
}
