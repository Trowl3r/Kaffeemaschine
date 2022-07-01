
package kaffemaschine;

import kaffemaschine.Zutaten.Schoko;
import kaffemaschine.Zutaten.Milchschaum;
import kaffemaschine.Zutaten.Soja;
import kaffemaschine.Zutaten.Sahne;
import kaffemaschine.Zutaten.Getraenk;
import kaffemaschine.Zutaten.Hell;
import kaffemaschine.Zutaten.Roestung;
import kaffemaschine.Zutaten.Dunkel;
import java.text.DecimalFormat;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Kaffemaschine extends javax.swing.JFrame {
    double gesamtPreis;
    String safeText = "";
    Roestung r = new Roestung();
    DecimalFormat f = new DecimalFormat("#0.00");
    Getraenk getraenk;

    public Kaffemaschine() {
        initComponents();
        
        reset();
        this.setResizable(false);
        
        if(hellRadio.isSelected()==false || dunkelRadio.isSelected()==false){
            showPrice.setEnabled(false);
        }else{
            showPrice.setEnabled(true);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        showPrice = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        zusatzPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        preisText1 = new javax.swing.JLabel();
        subPrices = new javax.swing.JLabel();
        Milchschaum = new javax.swing.JButton();
        Schoko = new javax.swing.JButton();
        Sahne = new javax.swing.JButton();
        Soja = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        preisText2 = new javax.swing.JLabel();
        preisText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dunkelRadio = new javax.swing.JRadioButton();
        hellRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kaffemaschine");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Noch einen Zusatz?");

        showPrice.setText("Preis Anzeigen");
        showPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPriceActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Welches Getränk möchten sie haben?");

        zusatzPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        zusatzPanel.setToolTipText("");
        zusatzPanel.setEnabled(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 800));

        preisText1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        preisText1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preisText1.setText("Einzelne Preise:");

        subPrices.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preisText1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(subPrices, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preisText1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subPrices, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        Milchschaum.setText("Milchschaum");
        Milchschaum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilchschaumActionPerformed(evt);
            }
        });

        Schoko.setText("Schoko");
        Schoko.setToolTipText("");
        Schoko.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SchokoActionPerformed(evt);
            }
        });

        Sahne.setText("Sahne");
        Sahne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SahneActionPerformed(evt);
            }
        });

        Soja.setText("Soja");
        Soja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SojaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout zusatzPanelLayout = new javax.swing.GroupLayout(zusatzPanel);
        zusatzPanel.setLayout(zusatzPanelLayout);
        zusatzPanelLayout.setHorizontalGroup(
            zusatzPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(zusatzPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Milchschaum)
                .addGap(18, 18, 18)
                .addComponent(Schoko)
                .addGap(18, 18, 18)
                .addComponent(Sahne)
                .addGap(18, 18, 18)
                .addComponent(Soja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        zusatzPanelLayout.setVerticalGroup(
            zusatzPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(zusatzPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(zusatzPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Milchschaum)
                    .addComponent(Schoko)
                    .addComponent(Sahne)
                    .addComponent(Soja))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        reset.setText("Neues Getränk");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        preisText2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        preisText2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preisText2.setText("Zu Zahlen");

        preisText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dunkelRadio.setText("Dunkel");
        dunkelRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dunkelRadioActionPerformed(evt);
            }
        });

        hellRadio.setText("Hell");
        hellRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hellRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dunkelRadio)
                    .addComponent(hellRadio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hellRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dunkelRadio)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(zusatzPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(showPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                                .addComponent(preisText, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(preisText2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(zusatzPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(preisText2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preisText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(showPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(471, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPriceActionPerformed
            //Die Text Ausgabe:
            preisText.setText(String.valueOf(f.format(getraenk.getPreis())+" EUR"));
        
    }//GEN-LAST:event_showPriceActionPerformed

    private void hellRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hellRadioActionPerformed
        if(hellRadio.isSelected()){
            dunkelRadio.setSelected(false);
            zusatzPanel.setEnabled(true);
            showPrice.setEnabled(true);
            getraenk = new Hell(r);
        }else{
           showPrice.setEnabled(false);
        }
    }//GEN-LAST:event_hellRadioActionPerformed

    private void dunkelRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dunkelRadioActionPerformed
        if(dunkelRadio.isSelected()){
            hellRadio.setSelected(false);
            zusatzPanel.setEnabled(true);
            showPrice.setEnabled(true);
            getraenk = new Dunkel(r);
        }else{
            showPrice.setEnabled(false);
        }
    }//GEN-LAST:event_dunkelRadioActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void MilchschaumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilchschaumActionPerformed
        String a = "";
        getraenk = new Milchschaum(getraenk);
        a =  "Milchschaum: " + String.valueOf(f.format(0.1));
        safeText = subPrices.getText();
        subPrices.setText("<html>" + a + "<br>" + safeText + "<br></html>");
        preisText.setText(String.valueOf(f.format(getraenk.getPreis())+" EUR"));
    }//GEN-LAST:event_MilchschaumActionPerformed

    private void SahneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SahneActionPerformed
        String a = "";
        getraenk = new Sahne(getraenk); 
        a = "Sahne: " + String.valueOf(f.format(0.5));
        safeText = subPrices.getText();
        subPrices.setText("<html>" + a + "<br>" + safeText + "<br></html>");
        preisText.setText(String.valueOf(f.format(getraenk.getPreis())+" EUR"));
    }//GEN-LAST:event_SahneActionPerformed

    private void SchokoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SchokoActionPerformed
        String a = "";
        getraenk = new Schoko(getraenk); 
        a = "Schoko: " + String.valueOf(f.format(0.2));
        safeText = subPrices.getText();
        subPrices.setText("<html>" + a + "<br>" + safeText + "<br></html>");
        preisText.setText(String.valueOf(f.format(getraenk.getPreis())+" EUR"));
    }//GEN-LAST:event_SchokoActionPerformed

    private void SojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SojaActionPerformed
        String a = "";
        getraenk = new Soja(getraenk); 
        a = "Soja: " + String.valueOf(f.format(0.3));
        safeText = subPrices.getText();
        subPrices.setText("<html>" + a + "<br>" + safeText + "<br></html>");
        preisText.setText(String.valueOf(f.format(getraenk.getPreis())+" EUR"));
    }//GEN-LAST:event_SojaActionPerformed


    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kaffemaschine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Milchschaum;
    private javax.swing.JButton Sahne;
    private javax.swing.JButton Schoko;
    private javax.swing.JButton Soja;
    private javax.swing.JRadioButton dunkelRadio;
    private javax.swing.JRadioButton hellRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel preisText;
    private javax.swing.JLabel preisText1;
    private javax.swing.JLabel preisText2;
    private javax.swing.JButton reset;
    private javax.swing.JButton showPrice;
    private javax.swing.JLabel subPrices;
    private javax.swing.JPanel zusatzPanel;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        hellRadio.setSelected(false);
        dunkelRadio.setSelected(false);
        subPrices.setText("");
        preisText.setText("");
        showPrice.setEnabled(false);
    }
}
