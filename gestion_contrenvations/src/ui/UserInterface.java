package ui;

import model.Contravention;
import service.ContraventionService;
import java.util.Scanner;

public class UserInterface {
    private ContraventionService contraventionService = new ContraventionService();
    private Scanner scanner = new Scanner(System.in);

    public void showMainMenu() {
        int choice;
        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Ajouter une contravention");
            System.out.println("2. Afficher toutes les contraventions");
            System.out.println("3. Supprimer une contravention");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consomme la nouvelle ligne

            switch (choice) {
                case 1:
                    addContravention();
                    break;
                case 2:
                    displayContraventions();
                    break;
                case 3:
                    deleteContravention();
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Essayez à nouveau.");
            }
        } while (choice != 4);
    }

    private void addContravention() {
        System.out.println("Ajouter une nouvelle contravention...");
        // Récupérer les informations depuis l'utilisateur
        // Exemple pour simplifier
        Contravention contravention = new Contravention(null, null, null, null, null);
        contraventionService.addContravention(contravention);
    }

    private void displayContraventions() {
        for (Contravention c : contraventionService.listContraventions()) {
            System.out.println(c);
        }
    }

    private void deleteContravention() {
        System.out.println("Entrez l'index de la contravention à supprimer : ");
        int index = scanner.nextInt();
        contraventionService.deleteContravention(index);
    }
}
