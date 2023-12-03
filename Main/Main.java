package Main;

import Tributos.*;
import JuegosDelHambre.*;

import java.util.*;


public class Main{
    public static void main(String[] args) {
        ArrayList<Tributo> listaTributos = new ArrayList<Tributo>();
        Juegos juegosDelHambre;
        int op1=0;
        do{
        
            System.out.println("Bienvenido.");
            System.out.println("Seleccione:");
            System.out.println("1) Ingresar tributos.");
            System.out.println("2) Salir.");
            op1 = leerNumero();
            switch (op1) {
                case 1:
                    listaTributos = ingresarTributos();
                    juegosDelHambre = new Juegos(listaTributos);
                    juegosDelHambre.iniciar();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Ingrese un numero válido"); 
                    break;
            }
        }while(op1!=2);
        
    }

    public static int leerNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        try {
            numero = scanner.nextInt();
            return numero;
        } catch (InputMismatchException e) {
            System.out.println("Se debe ingresar un valor numerico.");
            return leerNumero();
        } finally { 
            scanner.close();
        }
    }
    public static ArrayList<Tributo> ingresarTributos(){
        ArrayList<Tributo> tributos = new ArrayList<Tributo>();
        Creador creador = new Creador();
        System.out.println("Bienvenido al registro de tributos.");
        System.out.println("Seleccione:");
        System.out.println("1) Ingresar tributos manualmente.");
        System.out.println("2) Seleccionar tributos predeterminados.");
        int op2 = leerNumero();
        switch (op2) {
            case 1:
                tributos = creador.registrarListaTributos();
                break;
            case 2:
				tributos = creador.leerListaTributos();
                break;
            default:
                break;
        }
        return tributos;
    } 
}