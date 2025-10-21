package Challenges;

import java.util.Random;
import java.util.Scanner;

public class ControlFlowChallenges {
    public static void  checkIfEvenOrOdd(){
        byte userNumber = 5;
        if(5%2==0) System.out.println(userNumber+"is an even number");
        else System.out.println(userNumber +"is an odd number");
    }
    public static void concatenateStrings(){
        String firstName = "Kaoutar";
        String lastName = "Quibous";
        System.out.println(firstName+lastName);
    }
    public static void converseTemperature(){
        int c = 33;
        int F = (c * 9/5) + 32;
        System.out.println(F);
    }

    public static void checkIfPositiveOrNegative(){
        System.out.println("Enter number to check if negative or positive: ");
        Scanner sc = new Scanner(System.in);
        int numberToCheck = sc.nextInt();
        if(numberToCheck>0) System.out.println(numberToCheck+" is positive");
        else if(numberToCheck<0) System.out.println(numberToCheck+" is negative");
        else System.out.println(numberToCheck+" is neutral");
    }
    public static void getWeekDayName(){
        System.out.println("Enter a number presenting a day of the week : ");
        Scanner sc = new Scanner(System.in);
        int dayNumber = sc.nextInt();
        switch(dayNumber){
            case 1 : System.out.println("Lundi");
            case 2 : System.out.println("Mardi");
            case 3 : System.out.println("Mercredi");
            case 4 : System.out.println("Jeudi");
            case 5 : System.out.println("Vendredi");
            case 6 : System.out.println("Samedi");
            case 7 : System.out.println("Dimanche");
        }
    }
    public static void getMultiplicationTable(){
        System.out.println("Enter a number to get multiplication table : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i=0;
        while(i<=10){
            System.out.println(number + "*" +i+"="+i*number);
            i++;
        }
    }
    public static void calculateFactorial(){
        System.out.println("Let's calculate factorial, please enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = number;
        for (int i = 1; i < number; i++) {
            result = i*result;
        }
        System.out.println(number +"! = "+result);
    }
    public static void GuessTheNumber(){
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        Scanner sc = new Scanner(System.in);
        int guess;
        do{
            System.out.println("Guess the number from 1 to 10");
            guess = sc.nextInt();
            if(guess ==randomNumber) System.out.println("Congrats ! you won");
            else if(guess<randomNumber) System.out.println("Hint : it's a higher number");
            else System.out.println("Hint : it's a lower number");

        }while(guess!=randomNumber);
    }
    public static void oddOrEven(){
        for (int i = 1; i <11 ; i++) {
            if(i%2==0) System.out.println(i+"is an even number");
            else System.out.println(i+"is an odd number");
        }
    }
    public static void vowelOrConsonant(){
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toLowerCase();
        if(input.length()==1 && Character.isLetter(input.charAt(0))){
            char letter = input.charAt(0);
            if("aeoui".indexOf(letter)!=-1) System.out.println("It's a vowel");
            else System.out.println("it's a consonant");
        }
        else System.out.println("Invalid input");
    }
    public static void sumOfSquares(){
        double i = 1;
        double sum = 0;
        while(i<6){
            sum +=sum+Math.pow(i,2);
            i++;
        }
    }
    // Challenge 9 : Vérificateur d'année bissextile
    public static void verifierAnneeBissextile() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez une année : ");
            int annee = scanner.nextInt();

            // Règles pour année bissextile :
            // divisible par 400 OU divisible par 4 mais pas par 100
            if ((annee % 400 == 0) || (annee % 4 == 0 && annee % 100 != 0)) {
                System.out.println(annee + " est une année bissextile.");
            } else {
                System.out.println(annee + " n'est pas une année bissextile.");
            }
        }
    }

    // Challenge 10 : Affichage des 10 premiers nombres de la série de Fibonacci
    public static void afficherFibonacci() {
        int n1 = 0, n2 = 1;
        System.out.print("Les 10 premiers nombres de Fibonacci : ");

        for (int i = 1; i <= 10; i++) {
            System.out.print(n1 + " ");

            int somme = n1 + n2;
            n1 = n2;
            n2 = somme;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("Hello, Kaoutar!");
//        checkIfPositiveOrNegative();
//        getWeekDayName();
//        getMultiplicationTable();
//        calculateFactorial();
//          GuessTheNumber();
        verifierAnneeBissextile();
        afficherFibonacci();
    }
}
