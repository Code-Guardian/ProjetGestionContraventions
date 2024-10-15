package model;

public class Infraction {
    private String description;
    private double montantAmende;

    // Constructeur
    public Infraction(String description, double montantAmende) {
        this.description = description;
        this.montantAmende = montantAmende;
    }

    // Getter pour description
    public String getDescription() {
        return description;
    }

    // Setter pour description (si nécessaire)
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter pour montantAmende
    public double getMontantAmende() {
        return montantAmende;
    }

    // Setter pour montantAmende (si nécessaire)
    public void setMontantAmende(double montantAmende) {
        this.montantAmende = montantAmende;
    }

    @Override
    public String toString() {
        return "Infraction: " + description + ", Amende: " + montantAmende + " €";
    }
}
