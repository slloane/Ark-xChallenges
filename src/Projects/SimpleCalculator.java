package Projects;

import java.util.Scanner;

import java.util.Scanner;

public class SimpleCalculator {

    // Méthode pour exécuter le calculateur simple
    public static void calculer() {
        // try-with-resources pour fermer automatiquement le Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Entrez le premier nombre : ");
            double num1 = scanner.nextDouble();

            System.out.print("Entrez le deuxième nombre : ");
            double num2 = scanner.nextDouble();

            System.out.print("Entrez l'opérateur (+, -, *, /) : ");
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Résultat : " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Résultat : " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Résultat : " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Erreur : division par zéro impossible !");
                    } else {
                        result = num1 / num2;
                        System.out.println("Résultat : " + result);
                    }
                    break;
                default:
                    System.out.println("Erreur : opérateur non valide !");
            }
        }
    }

    public static void main(String[] args) {
        // Appel de la méthode calculer dans le main
        calculer();
    }
}


