*Namn: Samuela Segal
 *Skola: Folkuniversitetet 
 *Kurs:  Programering 1
 *Mail:  samuelasegal14@gmail.com
 *Uppgiften går ut på att utforma en kod med en variabel inefattande ett heltal samt två variabler innefattande text 
 */

import java.util.Scanner; 
public class uppgift2 {
public static Scanner input = new Scanner(System.in); //hämtar in en klass med tillhörande metoder som behöver användas för denna kod
    public static void main(String[] args) {
      String movie; //skapar en string (textvariabel) som heter "movie"
      String day; //skapar en string (textvariabel) som heter "day"
      int age; //skapar en int (heltalsvariabel) som heter "age"
      System.out.println("Vilken film vill du se på bio?"); //skickar ut en output med en fråga till användare om vilken film den vill se på bio
      movie = input.nextLine(); //ber användaren om input där "movie" får värdet som användaren skriver in
      System.out.println("Vilken dag vill du gå på bio?"); //skickar en output med en fråga till användaren om vilken dag den vill gå på bio
      day = input.nextLine(); //ber användaren om input där "day" får värdet som användaren skriver in
      System.out.println("Vilken åldersgräns är det på den filmen?"); //skickar ut en output med en fråga till användaren om vilken åldersgräns filmen som den vill se på bio har
      age = input.nextInt(); //ber användaren om input där "age" får värdet som användaren skriver in
      System.out.println("Du vill se " + movie + " på " + day + " åldersgränsen på den filmen är " + age + " år"); //printar ut text till användaren med frågeställningarna samt användarens input. Man kan säga att det är frågorna samt svaren i en löpande text.
    }
