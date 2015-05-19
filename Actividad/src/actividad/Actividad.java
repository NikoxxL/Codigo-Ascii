/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad;

import java.util.Scanner;

/**
 * Enunciado: Aplicacion que en base a un numero (Codigo Ascii), muestra su equivalente en Hexadecimal y en Simbolo.
 *            El usuario ingresa el valor y la aplicacion muestra los valores correspondientes, dando la opcion de volver
 *            a consultar otro valor sin reiniciar la aplicacion. 
 * 
 * Autores:
 * Claudio Lopez
 * Arcadio Maripil
 * Patricio Navarrete
 * Israel Jara
 */
public class Actividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Iniciacion y asignacion de variables.
        int numero;
        int decision = 0;
        String usuario;

        // Enunciado e instrucciones para el usuario
        System.out.println("Este programa esta diseñado para que usted, en base a un Codigo Ascii, tenga un resultado en codigo Hexadecimal y en Simbolo");
        System.out.println("Instrucciones:\tIngrese un numero entre 0 y 127 (Incluyendo el 0 y el 127)\n\t\tcorrespondiente al rango de Codigo Ascii para obtener el resultado \n\t\ten Hexadecimal y en Simbolo.");
        //Creacion de objeto leer (Scanner)
        do { //Inicio del ciclo general del programa
            System.out.println("Ingrese el numero:");//Se le pide al usuario ingresar un numero
            Scanner leer = new Scanner(System.in);//Se crea el objeto leer 
            usuario = leer.nextLine();//Se lee y guarda el valor
            switch (usuario) {
                case "0":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (0) y su valor en Simbolo es (NUL).");//Se le muestra al usuario los datos solicitados
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");//Se le pregunta al usuario si desea buscar otro valor sin la necesidad de reiniciar la aplicacion
                    decision = leer.nextInt();//El usuario ingresa una respuesta a la pregunta anterior
                    break;
                case "1":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (1) y su valor en Simbolo es (SOH).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "2":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (2) y su valor en Simbolo es (STX).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "3":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (3) y su valor en Simbolo es (ETX).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "4":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (4) y su valor en Simbolo es (EOT).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "5":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (5) y su valor en Simbolo es (ENQ).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "6":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (6) y su valor en Simbolo es (ACK).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "7":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (7) y su valor en Simbolo es (BEL).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "8":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (8) y su valor en Simbolo es (BS).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "9":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (9) y su valor en Simbolo es (PAB).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "10":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (a) y su valor en Simbolo es (LF).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "11":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (b) y su valor en Simbolo es (VT).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "12":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (c) y su valor en Simbolo es (FF).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "13":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (d) y su valor en Simbolo es (CR).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "14":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (e) y su valor en Simbolo es (SO).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "15":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (f) y su valor en Simbolo es (SI).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "16":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (10) y su valor en Simbolo es (DLE).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "17":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (11) y su valor en Simbolo es (DC1).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "18":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (12) y su valor en Simbolo es (DC2).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "19":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (13) y su valor en Simbolo es (DC3).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "20":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (14) y su valor en Simbolo es (DC4).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "21":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (15) y su valor en Simbolo es (NAK).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "22":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (16) y su valor en Simbolo es (SYN).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "23":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (17) y su valor en Simbolo es (ETB).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "24":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (18) y su valor en Simbolo es (CAN).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "25":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (19) y su valor en Simbolo es (EM).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "26":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (1a) y su valor en Simbolo es (SUB).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "27":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (1b) y su valor en Simbolo es (ESC).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "28":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (1c) y su valor en Simbolo es (FS).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "29":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (1d) y su valor en Simbolo es (GS).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "30":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (1e) y su valor en Simbolo es (RS).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "31":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (1f) y su valor en Simbolo es (US).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "32":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (20) y su valor en Simbolo es (space).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "33":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (21) y su valor en Simbolo es (!).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "34":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (22) y su valor en Simbolo es (\").");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "35":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (23) y su valor en Simbolo es (#).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "36":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (24) y su valor en Simbolo es ($).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "37":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (25) y su valor en Simbolo es (%).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "38":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (26) y su valor en Simbolo es (&).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "39":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (27) y su valor en Simbolo es (').");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "40":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (28) y su valor en Simbolo es (\"(\").");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "41":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (29) y su valor en Simbolo es (\")\").");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "42":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (2a) y su valor en Simbolo es (*).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "43":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (2b) y su valor en Simbolo es (+).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "44":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (2c) y su valor en Simbolo es (,).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "45":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (2d) y su valor en Simbolo es (-).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "46":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (2e) y su valor en Simbolo es (.).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "47":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (2f) y su valor en Simbolo es (/).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "48":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (30) y su valor en Simbolo es (0).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "49":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (31) y su valor en Simbolo es (1).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "50":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (32) y su valor en Simbolo es (2).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "51":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (33) y su valor en Simbolo es (3).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "52":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (34) y su valor en Simbolo es (4).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "53":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (35) y su valor en Simbolo es (5).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "54":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (36) y su valor en Simbolo es (6).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "55":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (37) y su valor en Simbolo es (7).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "56":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (38) y su valor en Simbolo es (8).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "57":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (39) y su valor en Simbolo es (9).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "58":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (3a) y su valor en Simbolo es (:).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "59":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (3b) y su valor en Simbolo es (;).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "60":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (3c) y su valor en Simbolo es (<).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "61":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (3d) y su valor en Simbolo es (=).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "62":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (3e) y su valor en Simbolo es (>).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "63":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (3f) y su valor en Simbolo es (?).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "64":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (40) y su valor en Simbolo es (@).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "65":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (41) y su valor en Simbolo es (A).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "66":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (42) y su valor en Simbolo es (B).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "67":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (43) y su valor en Simbolo es (C).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "68":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (44) y su valor en Simbolo es (D).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "69":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (45) y su valor en Simbolo es (E).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "70":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (46) y su valor en Simbolo es (F).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "71":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (47) y su valor en Simbolo es (G).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "72":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (48) y su valor en Simbolo es (H).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "73":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (49) y su valor en Simbolo es (I).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "74":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (4a) y su valor en Simbolo es (J).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "75":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (4b) y su valor en Simbolo es (K).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "76":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (4c) y su valor en Simbolo es (L).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "77":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (4d) y su valor en Simbolo es (M).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "78":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (4e) y su valor en Simbolo es (N).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "79":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (4f) y su valor en Simbolo es (O).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "80":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (50) y su valor en Simbolo es (P).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "81":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (51) y su valor en Simbolo es (Q).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "82":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (52) y su valor en Simbolo es (R).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "83":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (53) y su valor en Simbolo es (S).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "84":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (54) y su valor en Simbolo es (T).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "85":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (55) y su valor en Simbolo es (U).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "86":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (56) y su valor en Simbolo es (V).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "87":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (57) y su valor en Simbolo es (W).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "88":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (58) y su valor en Simbolo es (X).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "89":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (59) y su valor en Simbolo es (Y).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "90":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (5a) y su valor en Simbolo es (Z).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "91":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (5b) y su valor en Simbolo es ([).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "92":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (5c) y su valor en Simbolo es (\"\\).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "93":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (5d) y su valor en Simbolo es (]).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "94":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (5e) y su valor en Simbolo es (^).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "95":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (5f) y su valor en Simbolo es (_).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "96":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (60) y su valor en Simbolo es (`).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "97":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (61) y su valor en Simbolo es (a).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "98":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (62) y su valor en Simbolo es (b).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "99":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (63) y su valor en Simbolo es (c).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "100":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (64) y su valor en Simbolo es (d).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "101":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (65) y su valor en Simbolo es (e).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "102":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (66) y su valor en Simbolo es (f).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "103":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (67) y su valor en Simbolo es (g).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "104":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (68) y su valor en Simbolo es (h).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "105":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (69) y su valor en Simbolo es (i).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "106":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (6a) y su valor en Simbolo es (j).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "107":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (6b) y su valor en Simbolo es (k).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "108":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (6c) y su valor en Simbolo es (l).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "109":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (6d) y su valor en Simbolo es (m).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "110":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (6e) y su valor en Simbolo es (n).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "111":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (6f) y su valor en Simbolo es (o).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "112":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (70) y su valor en Simbolo es (p).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "113":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (71) y su valor en Simbolo es (q).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "114":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (72) y su valor en Simbolo es (r).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "115":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (73) y su valor en Simbolo es (s).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "116":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (74) y su valor en Simbolo es (t).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "117":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (75) y su valor en Simbolo es (u).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "118":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (76) y su valor en Simbolo es (v).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "119":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (77) y su valor en Simbolo es (w).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "120":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (78) y su valor en Simbolo es (x).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "121":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (79) y su valor en Simbolo es (y).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "122":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (7a) y su valor en Simbolo es (z).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "123":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (7b) y su valor en Simbolo es ({).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "124":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (7c) y su valor en Simbolo es (|).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "125":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (7d) y su valor en Simbolo es (}).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "126":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (7e) y su valor en Simbolo es (~).");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                case "127":
                    System.out.println("Para el Codigo Ascii (" + usuario + "). Su valor Hexadecimal es (7f) y su valor en Simbolo es ().");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
                    break;
                default://Muestra de mensaje de error y, como en los demas casos, se le pregunta al usuario si desea buscar otro valor.
                    System.out.println("Error: \tHa ingresado un valor no valido.\n\tRecuerde que debe ingresar un valor entre 0 y 127 (Incluyendo el 0 y el 127)");
                    System.out.println("¿Desea buscar otro valor? (SI = 1 ; NO = 0)");
                    decision = leer.nextInt();
            }// Llave switch
        } while (decision == 1);//Evalula la respuesta del usuario en relacion a repetir la busqueda. Si es "1" la respuesta, se activa el ciclo. otro valor, dentendra el ciclo
        System.out.println("¡Gracias por usar nuestra aplicacion!\n\t\t¡Nos Vemos!");//Mensaje de despedida
    }//Llave publick static
}//Llave public class
