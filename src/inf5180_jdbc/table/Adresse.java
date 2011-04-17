/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inf5180_jdbc.table;

/**
 *
 * @author woworolandgamy
 */
public class Adresse {

    private String numCiviq = "";
    private String rue = "" ;
    private String ville = "" ;
    private String pays = "" ;
    private String codePostal = "" ;


    public Adresse () {


    }
    public Adresse(String numCiviq, String rue, String ville, String pays, String codePostal) {
        this.numCiviq = numCiviq;
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
        this.codePostal = codePostal;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getNumCiviq() {
        return numCiviq;
    }

    public String getPays() {
        return pays;
    }

    public String getRue() {
        return rue;
    }

    public String getVille() {
        return ville;
    }


    

}
