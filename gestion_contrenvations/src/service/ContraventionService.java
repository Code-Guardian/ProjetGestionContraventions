package service;

import model.Contravention;
import model.Contrevenant;


import java.util.ArrayList;
import java.util.List;

public class ContraventionService {
    private List<Contravention> contraventions = new ArrayList<>();

    // Ajouter une nouvelle contravention
    public void addContravention(Contravention contravention) {
        contraventions.add(contravention);
        System.out.println("Contravention ajoutée: " + contravention);
    }

    // Supprimer une contravention par index
    public void deleteContravention(int index) {
        if (index >= 0 && index < contraventions.size()) {
            contraventions.remove(index);
            System.out.println("Contravention supprimée.");
        } else {
            System.out.println("Index de contravention invalide.");
        }
    }

    // Mettre à jour une contravention
    public void updateContravention(int index, Contravention updatedContravention) {
        if (index >= 0 && index < contraventions.size()) {
            contraventions.set(index, updatedContravention);
            System.out.println("Contravention mise à jour.");
        } else {
            System.out.println("Index de contravention invalide.");
        }
    }

    // Lister toutes les contraventions
    public List<Contravention> listContraventions() {
        return contraventions;
    }

    // Rechercher une contravention par contrevenant
    public List<Contravention> searchByContrevenant(Contrevenant contrevenant) {
        List<Contravention> results = new ArrayList<>();
        for (Contravention c : contraventions) {
            if (c.getContrevenant().equals(contrevenant)) {
                results.add(c);
            }
        }
        return results;
    }

    // Rechercher une contravention par type d'infraction
    /**
     * @param infractionDescription
     * @return
     */
    public List<Contravention> searchByInfraction(String infractionDescription) {
        List<Contravention> results = new ArrayList<>();
        for (Contravention c : contraventions) {
            // Vérifiez que l'infraction n'est pas null
            if (c.getInfraction() != null && c.getInfraction().equals(infractionDescription)) {
                results.add(c);
            }
        }
        return results;
    }
    
    
    
}
