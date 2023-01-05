/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3bucles;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class Person {
    
    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(int age) {
        this.age = age;
    }   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String clasiAge(){
    String response="";
    
    if (this.age < 18)
    {
    response = "Es menor de edad";
    }
    else {
    
     if (this.age >=65){
     response = "adulto mayor";
     }
     else {
     
     response ="Mayor de edad";
     }
    
    }
    return response;
    }
    private String registerPerson(){
    
    
    return "persona registrada";
    }
    
    public String getRegisterPerson()
    {
    return this.registerPerson();
    }
    
    public String updatePerson(){
    
        return "Persona actualizada";
        
    }   
    
    public void printData(ArrayList<Person>listPerson)
    {
    for (int i = 0; i<listPerson.size();i++)
    {
    System.out.println(""+listPerson.get(i));
    }
    
    }

    @Override
    public String toString() {
        return "Person{" + "nombre =" + name + ", Apellido=" + lastName + ", Edad=" + age + '}';
    }
    
}
