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
public class User {
    
    private String mail;
    private String pass;
    private Person person;

    public User(String mail, String pass, Person person) {
        this.mail = mail;
        this.pass = pass;
        this.person = person;
    }
    
    public String getMail(){
    return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

      public void printData(ArrayList<User>listUser)
    {
    for (int i = 0; i<listUser.size();i++)
    {
    System.out.println(""+listUser.get(i));
    }
    }
    
    @Override
    public String toString() {
        return "User{" + "Correo=" + mail + ", contrasena=" + pass + ", Nombre=" + person + '}';
    }
    
}
