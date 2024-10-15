package model;

public class AgentDePolice {
    private String nom;
    private String numeroMatricule;
    private String posteDePolice;

    public AgentDePolice(String nom, String numeroMatricule, String posteDePolice) {
        this.nom = nom;
        this.numeroMatricule = numeroMatricule;
        this.posteDePolice = posteDePolice;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumeroMatricule() {
        return numeroMatricule;
    }

    public void setNumeroMatricule(String numeroMatricule) {
        this.numeroMatricule = numeroMatricule;
    }

    public String getPosteDePolice() {
        return posteDePolice;
    }

    public void setPosteDePolice(String posteDePolice) {
        this.posteDePolice = posteDePolice;
    }

    @Override
    public String toString() {
        return "Agent de Police: " + nom + ", Matricule: " + numeroMatricule;
    }
}
