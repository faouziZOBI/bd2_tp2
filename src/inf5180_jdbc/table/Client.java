/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inf5180_jdbc.table;

/**
 *
 * @author ag991331
 */
public class Client {

    private String nom ;
    private String prenom ;
    private String plusGrande ;
    private String telephone ;
    private int numClient ;

    public Client(int numClient  ,String nom, String prenom, String plusGrande, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.plusGrande = plusGrande;
        this.telephone = telephone;
        this.numClient = numClient  ;
    }

    public int getNumClient() {
        return numClient;
    }

    public String getNom() {
        return nom;
    }

    public String getPlusGrande() {
        return plusGrande;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPlusGrande(String plusGrande) {
        this.plusGrande = plusGrande;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    

}
