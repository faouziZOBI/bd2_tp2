/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inf5180_jdbc.table;

/**
 *
 * @author woworolandgamy
 */
public class ItemLivraison {


    private  int codeZebre ;
    private  int noProduit ;
    private  int noCommande ;
    private  int noLivraison ;
    private  int qtiteLivree ;

    public ItemLivraison(int codeZebre, int noProduit, int noCommande, int noLivraison, int qtiteLivree ) {
        this.codeZebre = codeZebre;
        this.noProduit = noProduit;
        this.noCommande = noCommande;
        this.noLivraison = noLivraison;
        this.qtiteLivree = qtiteLivree ;
    }

    public int getCodeZebre() {
        return codeZebre;
    }

    public int getNoCommande() {
        return noCommande;
    }

    public int getNoLivraison() {
        return noLivraison;
    }

    public int getNoProduit() {
        return noProduit;
    }

    public int getQtiteLivree() {
        return qtiteLivree;
    }


    


}
