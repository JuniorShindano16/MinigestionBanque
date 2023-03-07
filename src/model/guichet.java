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
public class guichet {
    
    private int idGuichet;
    private String nomAgent;
    private Agence agence ;
    
    public guichet(){
    }
    
     public guichet(int idGuichet,String nomAgent, Agence agence){
         
         this.idGuichet=idGuichet;
         this.nomAgent=nomAgent;
         this.agence=agence;
    }

    public int getIdGuichet() {
        return idGuichet;
    }

    public void setIdGuichet(int idGuichet) {
        this.idGuichet = idGuichet;
    }

    public String getNomAgent() {
        return nomAgent;
    }

    public void setNomAgent(String nomAgent) {
        this.nomAgent = nomAgent;
    }

    public Agence getAgence() {
        return agence;
    }

    public void setAgence(Agence agence) {
        this.agence = agence;
    }
    
         @Override
    public String toString() {
        return "Idguichet: "+this.getIdGuichet()+"\n"+"Nom Agent: "+this.getNomAgent()+"Agence: "+this.getAgence();
    }
    
}
