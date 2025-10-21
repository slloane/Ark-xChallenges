package Challenges.ObjectOrientedChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMMachine {
    private List<BankAccount> accounts;

    public ATMMachine() {
        accounts = new ArrayList<>();
        // Création de quelques comptes pour test avec PIN
        accounts.add(new BankAccount("12345", 1000.0, "1111"));
        accounts.add(new BankAccount("67890", 500.0, "2222"));
    }

    private BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez votre numéro de compte : ");
            String accountNumber = scanner.nextLine();

            BankAccount account = findAccount(accountNumber);
            if (account == null) {
                System.out.println("Compte non trouvé !");
                return;
            }

            System.out.print("Entrez votre PIN : ");
            String pin = scanner.nextLine();

            if (!account.verifyPin(pin)) {
                System.out.println("PIN incorrect, accès refusé.");
                return;
            }

            boolean quit = false;
            while (!quit) {
                System.out.println("\n--- Menu ---");
                System.out.println("1. Consulter solde");
                System.out.println("2. Déposer de l'argent");
                System.out.println("3. Retirer de l'argent");
                System.out.println("4. Afficher l'historique des transactions");
                System.out.println("5. Quitter");
                System.out.print("Choisissez une option : ");

                String choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println("Solde actuel : " + account.getBalance() + " €");
                        break;
                    case "2":
                        System.out.print("Montant à déposer : ");
                        try {
                            double depositAmount = Double.parseDouble(scanner.nextLine());
                            account.deposit(depositAmount);
                        } catch (NumberFormatException e) {
                            System.out.println("Montant invalide.");
                        }
                        break;
                    case "3":
                        System.out.print("Montant à retirer : ");
                        try {
                            double withdrawAmount = Double.parseDouble(scanner.nextLine());
                            account.withdraw(withdrawAmount);
                        } catch (NumberFormatException e) {
                            System.out.println("Montant invalide.");
                        }
                        break;
                    case "4":
                        account.displayTransactionHistory();
                        break;
                    case "5":
                        quit = true;
                        break;
                    default:
                        System.out.println("Option invalide, veuillez réessayer.");
                }
            }
        }
    }

    public static void main(String[] args) {
        // Test Rectangle
        Rectangle rect = new Rectangle(5, 3);
        rect.displayInfo();

        // Démarrer ATM
        ATMMachine atm = new ATMMachine();
        atm.start();
    }
}