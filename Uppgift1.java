/*
 * Samuela Segal
 * Folkuniveristetet Programmering 1
 * samuelasegal14@gmail.com
 * Uppgiften går ut på att fråga användaren om viss information, så som namn och ålder. 
 */

import java.util.Scanner;
public class Uppgift1 {
public static Scanner input = new Scanner(System.in); //hämtar in en klass som har metoder som behöver användas för denna kod 
    public static void main(String[] args) {
        String name; //skapar en string variabel som heter "name"
        int age; //skapar en int variabel som heter "age"
        System.out.println("vad heter du? "); //skickar ut en output med en fråga till användaren
        name = input.nextLine(); //ber användaren om en input där name får värdet som användaren skriver in 
        System.out.println("hur gamal är du?"); // skickar ut en output med en fråga till användaren
        age = input.nextInt(); //ber användaren om en input där age får värdet som snvändaren skriver in
        System.out.println("du heter " + name + " Du är " + age + " år gamal "); //printar ut text till användaren med användarens input 

    }
}