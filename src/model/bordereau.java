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
public class bordereau {
    
    private int idbordereau;
    private guichet guichet;
    private Client client;
    
    public bordereau(){
    }
    
     public bordereau(int idbord,guichet gui, Client cli){
         
         this.idbordereau=idbord;
         this.guichet= gui;
         this.client=cli;
    }

    public int getIdbordereau() {
        return idbordereau;
    }

    public void setIdbordereau(int idbordereau) {
        this.idbordereau = idbordereau;
    }

    public guichet getGuichet() {
        return guichet;
    }

    public void setGuichet(guichet guichet) {
        this.guichet = guichet;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
     
     
         @Override
    public String toString() {
        return "IdBordereau: "+this.getIdbordereau()+"\n"+"Guichet: "+this.getGuichet()+"Client: "+this.getClient();
    }
}
