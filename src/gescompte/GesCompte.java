/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gescompte;

import java.util.Scanner;
import model.Banque;
import model.Client;
import model.Compte;
import model.Pays;

/**
 *
 * @author shindano
 */
public class GesCompte {

    static  Client client=new Client();
    static Scanner in=new Scanner(System.in);
    static Pays pays=new Pays();
    static Banque banque=new Banque();
    static  Compte compte=new Compte();
    static int choix=0;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        startApp();
    }


    static void startApp(){
       getClientInfo();
       
        
    }
    
    
    static void getClientInfo(){
   
        System.out.println("Nouveau Client");
        System.err.println("------------------------");
        System.out.println("");
        System.out.print("Nom: ");
        client.setNom(in.nextLine());
        System.out.println("");
        System.out.print("Prenom: ");
        client.setPrenom(in.nextLine());
        System.out.println("");
         System.out.print("Téléphone: ");
        client.setTelephone(in.nextLine());
        System.out.println("");
        System.out.println("------------------------");
        System.out.println(client.toString());
        pays.setNom("RDC");
        banque.setNom("Equity BCDC");
        banque.setPays(pays);
        client.setBanque(banque);
        compte.setSolde(0);
        compte.setClient(client);
        
        startMenu();
    }
    
    
    
    static void startMenu(){
      showMenuSelection();
        while(choix!=4){
           
            switch (choix) {
                case 1:
                    getSolde();
                    break;
                case 2:
                    recharge();
                    break;
                case 3:
                    retirer();
                    break;
                default:
                    break;
            }
        }
        
        
    }

    private static void getSolde() {
        System.out.println("Solde actuel: "+compte.getSolde());
        showMenuSelection();
        
    }

    private static void recharge() {
        System.out.print("Entrer le montant à recharger: ");
        double montant=in.nextDouble();
        
        compte.setSolde(compte.getSolde()+ montant);
        System.err.println("Opération réussie!");
        showMenuSelection();
  
    }

    private static void retirer() {
       System.out.print("Entrer le montant à retirer: ");
        double montant=in.nextDouble();
        
        compte.setSolde(compte.getSolde()- montant);
        System.err.println("Opération réussie!");
        showMenuSelection();
    }
    
    static void showMenuSelection(){
           System.out.println("1. Voir le solde\n2. Recharger\n3. Retirer\n4. Quitter");
        
        choix=in.nextInt();
    }
    
    
    
}
