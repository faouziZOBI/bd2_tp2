/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * AffichageClient.java
 *
 * Created on 2011-04-09, 15:36:37
 */

package inf5180_jdbc;

import inf5180_jdbc.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JTextField;

/**
 *
 * @author woworolandgamy
 */
public class AffichageClient extends javax.swing.JFrame implements ActionListener {

     private Client c ;
     private Adresse a ;
    /** Creates new form AffichageClient */
    public AffichageClient(String nomFenetre , Client c, Adresse a) {
        initComponents();
        ajouterEvent () ;
        this.setTitle (nomFenetre) ;
        this.c = c ;
        this.a = a ;
        seterInteface () ;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Annuler = new javax.swing.JButton();
        Livraison = new javax.swing.JButton();
        lnumclient = new javax.swing.JLabel();
        lnomclient = new javax.swing.JLabel();
        lprenomclient = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lnumcivique = new javax.swing.JLabel();
        lnomrue = new javax.swing.JLabel();
        lnompays = new javax.swing.JLabel();
        lcodepostal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lville = new javax.swing.JLabel();
        tnumclient = new javax.swing.JTextField();
        tnomclient = new javax.swing.JTextField();
        tprenomclient = new javax.swing.JTextField();
        ltelephone = new javax.swing.JLabel();
        lplusgrande = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Annuler.setText("ANNULER");

        Livraison.setText("LIVRAISON");

        lnumclient.setText("Numero Client:");

        lnomclient.setText("    Nom Client:");

        lprenomclient.setText("Prenom Client:");

        jLabel6.setText("Telephone :");

        jLabel7.setText("Plus Grande Qualite :");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Adresse"));

        jLabel2.setText("Nocivique");

        jLabel5.setText("Rue");

        jLabel8.setText("Pays");

        jLabel9.setText("CodePostal");

        lnumcivique.setText("8848");

        lnomrue.setText("Curé-Léagault-De la savane");

        lnompays.setText("Gabon");

        lcodepostal.setText("J4J1R9");

        jLabel1.setText("Ville");

        lville.setText("jLabel3");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(lnumcivique))
                .add(42, 42, 42)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lnomrue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 187, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 131, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(38, 38, 38)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lville)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 73, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lnompays, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(1, 1, 1)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(lcodepostal, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jLabel9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jLabel8)
                    .add(jLabel2)
                    .add(jLabel1)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lnompays)
                    .add(lcodepostal)
                    .add(lnumcivique)
                    .add(lnomrue)
                    .add(lville))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tnumclient.setEditable(false);
        tnumclient.setText(" ");

        tnomclient.setEditable(false);
        tnomclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnomclientActionPerformed(evt);
            }
        });

        tprenomclient.setEditable(false);

        ltelephone.setText("514-364-7898");

        lplusgrande.setText("Conard-kalisssss");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lnumclient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 106, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(lnomclient)
                                    .add(lprenomclient))
                                .add(50, 50, 50)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(tprenomclient, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                                    .add(tnomclient, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                                    .add(tnumclient, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel6)
                                    .add(jLabel7))
                                .add(18, 18, 18)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(lplusgrande, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 119, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(ltelephone, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 202, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(36, 36, 36)
                        .add(Annuler)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 472, Short.MAX_VALUE)
                        .add(Livraison))
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lnumclient)
                    .add(tnumclient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lnomclient)
                    .add(tnomclient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lprenomclient)
                    .add(tprenomclient, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(ltelephone)
                    .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(56, 56, 56)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(Livraison)
                            .add(Annuler)))
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel7)
                        .add(lplusgrande)))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnomclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnomclientActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tnomclientActionPerformed

    /**
    * @param args the command line arguments
    */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Annuler;
    private javax.swing.JButton Livraison;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lcodepostal;
    private javax.swing.JLabel lnomclient;
    private javax.swing.JLabel lnompays;
    private javax.swing.JLabel lnomrue;
    private javax.swing.JLabel lnumcivique;
    private javax.swing.JLabel lnumclient;
    private javax.swing.JLabel lplusgrande;
    private javax.swing.JLabel lprenomclient;
    private javax.swing.JLabel ltelephone;
    private javax.swing.JLabel lville;
    private javax.swing.JTextField tnomclient;
    private javax.swing.JTextField tnumclient;
    private javax.swing.JTextField tprenomclient;
    // End of variables declaration//GEN-END:variables


    public void ajouterEvent () {

       Annuler.addActionListener (this) ;
       Livraison.addActionListener(this);
    }

    public void seterInteface (){

        tnumclient.setHorizontalAlignment(JTextField.RIGHT) ;
        tnomclient.setHorizontalAlignment(JTextField.RIGHT) ;
        tprenomclient.setHorizontalAlignment(JTextField.RIGHT) ;


        tnumclient.setText(Integer.toString(c.getNumClient()) );
        tnomclient.setText(c.getNom());
        tprenomclient.setText(c.getPrenom());
        lplusgrande.setText (c.getPlusGrande()) ;
        ltelephone.setText (c.getTelephone()) ;



        lnumcivique.setText(a.getNumCiviq());
        lnomrue.setText(a.getRue());
        lnompays.setText (a.getPays()) ;
        lville.setText (a.getVille());
        lcodepostal.setText(a.getCodePostal());

    }

    
    public void fermerApplication (){

         addWindowListener (new WindowAdapter(){
          public void windowClosing (WindowEvent e) {
            System.exit (0) ;
           }
         }) ;
    }  

    public void actionPerformed(ActionEvent e) {

         Object source = e.getSource() ;

         if (source ==  Annuler){
             fermerApplication () ;
             this.setVisible (false) ;
            
         }else if (source == Livraison){
            Livraison livraison = new Livraison ("Livraison") ;
            livraison.setVisible (true) ;

         }


    }

}
