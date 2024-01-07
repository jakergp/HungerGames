package Main;

import Tributos.*;
import JuegosDelHambre.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        ArrayList<Tributo> listaTributos;
        Juegos juegosDelHambre;
        int op1;
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
        try {
            int numero;
            numero = scanner.nextInt();
            return numero;
        } catch (InputMismatchException e) {
            System.out.println("Se debe ingresar un valor numérico.");
            return leerNumero();
        }

    }

    public static ArrayList<Tributo> ingresarTributos(){
        ArrayList<Tributo> tributos = new ArrayList<>();
        Creador creador = new Creador();
        System.out.println("Bienvenido al registro de tributos.");
        System.out.println("Seleccione:");
        System.out.println("1) Ingresar tributos y crear archivo.");
        System.out.println("2) Seleccionar archivo.");
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