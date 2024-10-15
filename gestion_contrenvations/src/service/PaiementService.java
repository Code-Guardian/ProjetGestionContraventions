package service;

import model.Contravention;
import model.Paiement;

import java.util.ArrayList;
import java.util.List;

public class PaiementService {
    private List<Paiement> paiements = new ArrayList<>();

    // Ajouter un paiement pour une contravention
    public void addPaiement(Paiement paiement) {
        paiement.payer();
        paiements.add(paiement);
        System.out.println("Paiement enregistré pour la contravention: " + paiement.getContravention());
    }

    // Vérifier si une contravention est payée
    public boolean isContraventionPaid(Contravention contravention) {
        return contravention.isEstPayee();
    }

    // Lister les paiements enregistrés
    public List<Paiement> listPaiements() {
        return paiements;
    }
}
