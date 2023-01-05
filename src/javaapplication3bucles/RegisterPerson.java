/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3bucles;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class RegisterPerson {
    
      public static void main(String[] args) {
    
    Scanner read = new Scanner(System.in);
    short option =0;
 
    System.out.println("Seleccione que desea hacer ");
    System.out.println("1. Registrar persona ");
    System.out.println("2. Registar Usuarios");
    System.out.println("3. Registar Usuarios");
    option = read.nextShort();
    if(option == 1){
    Persona();
    }else 
        if(option == 2){
        User();
        }
        else if(option == 3){
        System.out.println("ha salido con exito");
        }
    }
      
   public static void User(){
    Scanner read = new Scanner(System.in);
    String email;
    String password;
    String nam;
    String lastNam;
    int ag;
    Person person; 
    User user;
    ArrayList<User> list = new ArrayList<>();
    
    
    int end =0;
    
      do {
        System.out.println("nombre:");
        nam = read.next();
        System.out.println("apellido:");
        lastNam = read.next();
        System.out.println("edad:");
        ag = read.nextInt();
        System.out.println("correo");
        email = read.next();
        System.out.println("contraseña");
        password = read.next();
        person = new Person(nam,lastNam,ag);
        user = new User(email, password, person);
         list.add(user);
        System.out.println("Desea seguir agregando personas "
                + "presione 0 para salir ;");
       
        try {
            end = read.nextInt();
        }catch (Exception e) {
            System.out.println("Error, Opcion invalida ");
            System.out.println("ingrese las opciones correctas");
           end = 1; 
          
        }               
        
}while(end !=0);
     user.printData(list);
       
   }
   public static void Persona(){
          
    Scanner read = new Scanner(System.in);
    String nam;
    String lastNam;
    int ag;
    Person person; 
    ArrayList<Person> list = new ArrayList<>();
    int end =0;
    
      do {
        System.out.println("nombre:");
        nam = read.next();
        System.out.println("apellido:");
        lastNam = read.next();
        System.out.println("edad:");
        ag = read.nextInt();
        person = new Person(nam,lastNam,ag);
        list.add(person);
        System.out.println("Desea seguir agregando personas "
                + "presione 0 para salir ;");
       
        try {
            end = read.nextInt();
        }catch (Exception e) {
            System.out.println("Error, Opcion invalida ");
            System.out.println("ingrese las opciones correctas");
           end = 1; 
          
        }               
        
}while(end !=0);
    
    person.printData(list);
    
      }
      

}
