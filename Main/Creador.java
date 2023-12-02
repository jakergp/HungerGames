package Main;

import Tributos.*;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;


public class Creador {
    public void registrarListaTributos() {
        //TODO: Registrar lista de 24 tributos y guardarlos en un archivo de objetos.
      ArrayList<Tributo> listaTributos = new ArrayList<Tributo>();
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
      } catch (FileNotFoundException e){
          System.out.println("Error:" + e.getMessage());
      }catch (IOException e){
        System.out.println("Error: " + e.getMessage());
      }
      
    }

    public Tributo registrarTributo() {
       //TODO: El usuario podrá ingresar los datos de un tributo y se registrará.
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
      switch(tipo){
        case 1:
          tributo = new Cazador(nombre, distrito);
          break;
        case 2:
          tributo = new Enfermo(nombre, distrito);
          break;
        case 3:
          tributo = new Estratega(nombre, distrito);
          break;
        case 4:
          tributo = new Guerrero(nombre, distrito);
          break;
        case 5:
          tributo = new Normal(nombre, distrito);
          break;
      }
      return tributo;
      
    }

    public ArrayList<Tributo> leerListaTributos() throws IOException, ClassNotFoundException{
        //TODO: Leer archivo de objetos que devuelva la lista de los tributos registrados.
      String nombreArchivo = "ListaTributos";
      ObjectInputStream file;
      ArrayList<Tributo> listaTributos = new ArrayList<Tributo>();
      try{
        file = new ObjectInputStream(new FileInputStream(nombreArchivo));
        listaTributos = (ArrayList<Tributo>) file.readObject();
        for (Tributo tributo : listaTributos) {
            tributo.display();
        }
        file.close();

      } catch (IOException | ClassNotFoundException e) {
         System.out.println("Error: " + e.getMessage());          
      }
      
      return listaTributos;
     
    }
}

