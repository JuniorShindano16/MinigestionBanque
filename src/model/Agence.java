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
public class Agence {
    private int idAgence;
    private Banque banque;
    
    
    public Agence (){
    }
    
     public Agence (int idAgence, Banque banque){
         this.idAgence=idAgence;
         this.banque=banque;
    }

    public int getIdAgence() {
        return idAgence;
    }

    public void setIdAgence(int idAgence) {
        this.idAgence = idAgence;
    }

    public Banque getBanque() {
        return banque;
    }

    public void setBanque(Banque banque) {
        this.banque = banque;
    }
     
      @Override
    public String toString() {
        return "IdAgence: "+this.getIdAgence()+"\n"+"Banque: "+this.getBanque();
    }
    
    
    
}
