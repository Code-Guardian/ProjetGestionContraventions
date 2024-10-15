package model;

import java.util.Date;

public class Contravention {
    private Date dateEmission;
    private String lieu;
    private Contrevenant contrevenant;
    private AgentDePolice agentDePolice;
    private String infraction;
    private boolean estPayee;

    public Contravention(Date dateEmission, String lieu, Contrevenant contrevenant, AgentDePolice agentDePolice, String infraction) {
        this.dateEmission = dateEmission;
        this.lieu = lieu;
        this.contrevenant = contrevenant;
        this.agentDePolice = agentDePolice;
        this.infraction = infraction;
        this.estPayee = false; // Par défaut, la contravention est non payée
    }

    // Getters et Setters
    public Date getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Contrevenant getContrevenant() {
        return contrevenant;
    }

    public void setContrevenant(Contrevenant contrevenant) {
        this.contrevenant = contrevenant;
    }

    public AgentDePolice getAgentDePolice() {
        return agentDePolice;
    }

    public void setAgentDePolice(AgentDePolice agentDePolice) {
        this.agentDePolice = agentDePolice;
    }

    public String getInfraction() {
        return infraction;
    }
    

    public void setInfraction(String infraction) {
        this.infraction = infraction;
    }

    public boolean isEstPayee() {
        return estPayee;
    }

    public void setEstPayee(boolean estPayee) {
        this.estPayee = estPayee;
    }

    @Override
    public String toString() {
        return "Contravention: " + infraction + ", émise par " + agentDePolice + " pour " + contrevenant + " à " + lieu + " le " + dateEmission;
    }
}
