package Main;

import Tributos.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class Creador {

    public ArrayList<Tributo> registrarListaTributos() {
        ArrayList<Tributo> tributos;
        ObjectOutputStream fileOut;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la lista:");
        String filename = scanner.nextLine();
        tributos = crearListaDeTributos();
        try{
            fileOut = new ObjectOutputStream(new FileOutputStream(filename));
        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
            return tributos;
        }
        for (Tributo tributo: tributos) {
            try{
                fileOut.writeObject(tributo);
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        try {
            fileOut.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return tributos;
    }

    public Tributo registrarTributo() {
        Scanner sc = new Scanner(System.in);
        Tributo tributo;
        int tipo;
        do{
            System.out.println("Selecciona el tipo de tributo:\n1)Cazador\n2)Enfermo\n3)Estratega\n4)Guerrero\n5)Normal");
            System.out.print("Opción: ");
            tipo = Main.leerNumero();
            if (tipo>5 || tipo<1){
            System.out.println("\nOpción no válida, vuelve a intentarlo\n");
            }
        } while (tipo>5 || tipo<1);
        System.out.println("Ingresa el nombre del tributo:");
        String nombre = sc.nextLine();
        System.out.println("Ingresa el distrito:");
        int distrito = Main.leerNumero();
        tributo = switch (tipo) {
            case 1 -> new Cazador(nombre, distrito);
            case 2 -> new Enfermo(nombre, distrito);
            case 3 -> new Estratega(nombre, distrito);
            case 4 -> new Guerrero(nombre, distrito);
            case 5 -> new Normal(nombre, distrito);
            default -> new Normal(nombre, distrito);
        };
        return tributo;
    }

    public ArrayList<Tributo> crearListaDeTributos(){
        ArrayList<Tributo> listaTributos = new ArrayList<Tributo>();
        for(int i=0 ; i<24 ; i++){
            System.out.println("Tributo " + (i + 1) + ": ");
            listaTributos.add(registrarTributo());
        }
        return listaTributos;
    }

    public ArrayList<Tributo> leerListaTributos() {
        ArrayList<Tributo> listaTributos = new ArrayList<>();
        System.out.println("Ingrese el nombre del archivo: ");
        Scanner scanner = new Scanner(System.in);
        ObjectInputStream fileIn;
        Tributo tributo;
        String filename = scanner.nextLine();
        try{
            fileIn = new ObjectInputStream(new FileInputStream(filename));
            while(true){
                try {
                    tributo = (Tributo)fileIn.readObject();
                    listaTributos.add(tributo);
                }catch (EOFException e){
                    break;
                }
            }
        }
        catch (IOException e){
            System.out.println("IO Error: " + e.getMessage());
        }
        catch (ClassNotFoundException e) {
            System.out.println("ClassNotFound " + e.getMessage());
        }
        return listaTributos;
    }
}

