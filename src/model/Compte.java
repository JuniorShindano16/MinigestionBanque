/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author shindano
 */
public class Compte {
    
    private int id;
    private double solde;
       private Client client;
    public Compte() {
    }

    public Compte(int id, double solde) {
        this.id = id;
        this.solde = solde;
    }

    public Compte(int id, double solde, Client client) {
        this.id = id;
        this.solde = solde;
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the solde
     */
    public double getSolde() {
        return solde;
    }

    /**
     * @param solde the solde to set
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
  public void recharger(double montant){
      this.solde+=montant;
      
  }
  
  
  public void debiter(double montant){
      this.solde-=montant;
  }
}
