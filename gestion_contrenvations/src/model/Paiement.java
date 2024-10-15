package model;

import java.util.Date;

public class Paiement {
    private Date datePaiement;
    private double montantPaye;
    private Contravention contravention;

    public Paiement(Date datePaiement, double montantPaye, Contravention contravention) {
        this.datePaiement = datePaiement;
        this.montantPaye = montantPaye;
        this.contravention = contravention;
    }

    // Getters et Setters
    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public double getMontantPaye() {
        return montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public Contravention getContravention() {
        return contravention;
    }

    public void setContravention(Contravention contravention) {
        this.contravention = contravention;
    }

    public void payer() {
        if (!contravention.isEstPayee()) {
            contravention.setEstPayee(true);
            System.out.println("Contravention payée avec succès.");
        } else {
            System.out.println("La contravention a déjà été payée.");
        }
    }

    @Override
    public String toString() {
        return "Paiement de " + montantPaye + " pour la contravention: " + contravention;
    }
}
