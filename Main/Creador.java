package Main;

import Tributos.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class Creador {
    public ArrayList<Tributo> registrarListaTributos() {
        ArrayList<Tributo> listaTributos = new ArrayList<>();
        Tributo tributo1;
        ObjectOutputStream fileOut;
        for (int i=0; i<24; i++) {
            tributo1=this.registrarTributo();
            listaTributos.add(tributo1);
        }
        try
        {
            fileOut=new ObjectOutputStream(new FileOutputStream("ListaTributos"));
            fileOut.writeObject(listaTributos);
            fileOut.close();
            return listaTributos;
        } catch (FileNotFoundException e){
              System.out.println("Error:" + e.getMessage());
            return registrarListaTributos();
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
            return registrarListaTributos();
        }      
    }

    public Tributo registrarTributo() {
        Scanner sc = new Scanner(System.in);
        Tributo tributo=new Tributo();
        int tipo;
        do{
            System.out.println("Selecciona el tipo de tributo:\n1)Cazador\n2)Enfermo\n3)Estratega\n4)Guerrero\n5)Normal");
            System.out.print("Opción: ");
            tipo = sc.nextInt();
            if (tipo>5 || tipo<1){
            System.out.println("\nOpción no válida, vuelve a intentarlo\n");
            }
        } while (tipo>5 || tipo<1);
        sc.nextLine();
        System.out.println("Ingresa el nombre del tributo:");
        String nombre = sc.nextLine();
        System.out.println("Ingresa el distrito:");
        int distrito = sc.nextInt();
        tributo = switch (tipo) {
            case 1 -> new Cazador(nombre, distrito);
            case 2 -> new Enfermo(nombre, distrito);
            case 3 -> new Estratega(nombre, distrito);
            case 4 -> new Guerrero(nombre, distrito);
            case 5 -> new Normal(nombre, distrito);
            default -> tributo;
        };
        sc.close();
        return tributo;
    }

    public ArrayList<Tributo> leerListaTributos() {
        String nombreArchivo = "ListaTributos";
        ObjectInputStream file;
        ArrayList<Tributo> listaTributos = new ArrayList<>();
        try{
            file = new ObjectInputStream(new FileInputStream(nombreArchivo));
            while(true){
            try {
                listaTributos.add((Tributo) file.readObject());
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

