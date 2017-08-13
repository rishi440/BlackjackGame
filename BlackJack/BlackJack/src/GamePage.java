/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rrr101
 */
public class GamePage extends javax.swing.JFrame {

    /**
     * Creates new form GamePage
     */
    Deck gameDeck = new Deck();
    Hand playerHand = new Hand();
    Hand dealerHand = new Hand();
    Integer bet ;
    public static int bank = 10000;
    
    
    
    
    public GamePage() {
        initComponents();
        
        
        gameDeck.shuffle();
        gameDeck.shuffle();
        
        playerHand.addCard(gameDeck.draw());
        playerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+playerHand.lastCard().getSuitAsString()+"/"+playerHand.lastCard().getValueAsString()+".png")));
        dealerHand.addCard(gameDeck.draw());
        dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+dealerHand.lastCard().getSuitAsString()+"/"+dealerHand.lastCard().getValueAsString()+".png")));
        playerHand.addCard(gameDeck.draw());
        playerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+playerHand.lastCard().getSuitAsString()+"/"+playerHand.lastCard().getValueAsString()+".png")));
        
        
    }
    
    public void setBet(String s)
    {
        this.bet = Integer.parseInt(s);
        bank -= bet;
        playerBank.setText(Integer.toString(bank));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        playerCard4 = new javax.swing.JLabel();
        playerCard3 = new javax.swing.JLabel();
        playerCard2 = new javax.swing.JLabel();
        playerCard1 = new javax.swing.JLabel();
        dealerCard4 = new javax.swing.JLabel();
        dealerCard3 = new javax.swing.JLabel();
        dealerCard2 = new javax.swing.JLabel();
        dealerCard1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        playerBank = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        playerCard4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(playerCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 80, 100));

        playerCard3.setForeground(new java.awt.Color(255, 255, 255));
        playerCard3.setMaximumSize(new java.awt.Dimension(18, 14));
        playerCard3.setMinimumSize(new java.awt.Dimension(18, 14));
        playerCard3.setPreferredSize(new java.awt.Dimension(18, 14));
        getContentPane().add(playerCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 80, 100));

        playerCard2.setForeground(new java.awt.Color(255, 255, 255));
        playerCard2.setToolTipText("");
        getContentPane().add(playerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 80, 100));

        playerCard1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(playerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 80, 100));

        dealerCard4.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dealerCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 64, 70, 90));

        dealerCard3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dealerCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 64, 70, 90));

        dealerCard2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dealerCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 64, 70, 90));

        dealerCard1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(dealerCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 64, 70, 90));

        jButton1.setText("Hit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 510, 80, -1));

        jButton2.setText("Stand");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, 73, -1));

        playerBank.setForeground(new java.awt.Color(255, 255, 255));
        playerBank.setText("playerBank");
        getContentPane().add(playerBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 510, 110, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player Cards");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 100, 30));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Dealer Cards");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 80, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/GameScreen.jpg"))); // NOI18N
        jLabel1.setText("4");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 790, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        /*do
        {
            if(dealerHand.getHandValue() <16)
            dealerHand.addCard(gameDeck.draw());
            else
            break;*/
            
        dealerHand.addCard(gameDeck.draw());
        
          
        if(dealerHand.getNumberOfCards()==2)
        dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+dealerHand.lastCard().getSuitAsString()+"/"+dealerHand.lastCard().getValueAsString()+".png")));
        else if(dealerHand.getNumberOfCards()==3)
        dealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+dealerHand.lastCard().getSuitAsString()+"/"+dealerHand.lastCard().getValueAsString()+".png")));
        else if(dealerHand.getNumberOfCards()==4)
        dealerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+dealerHand.lastCard().getSuitAsString()+"/"+dealerHand.lastCard().getValueAsString()+".png")));
            
          
        //} while(dealerHand.getNumberOfCards() <= 4);
        
        if(dealerHand.getHandValue()>21 && playerHand.getHandValue()>21)
        {
            bank += bet;
            PushScreen p = new PushScreen();
            p.setVisible(true);
            
        }
        else if(dealerHand.getHandValue()>21 && playerHand.getHandValue()<=21)
        {
            bank += 2*bet;
            WinScreen w = new WinScreen();
            w.setVisible(true);   
            
        }
        if(playerHand.getHandValue()>21)
        {
            bank -= bet;
            LoseScreen l = new LoseScreen();
            l.setVisible(true);
            
        }
        else if(dealerHand.getHandValue() == playerHand.getHandValue())
        {
            bank += bet;
            PushScreen p = new PushScreen();
            p.setVisible(true);
            
        }
        else if(dealerHand.getHandValue() > playerHand.getHandValue())
        {
            bank -= bet;
            LoseScreen l = new LoseScreen();
            l.setVisible(true);      
            
        }
        else if(playerHand.getHandValue() > dealerHand.getHandValue() )
        {
            bank += 2*bet;
            WinScreen w = new WinScreen();
            w.setVisible(true);   
            
        }    
            
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
        playerHand.addCard(gameDeck.draw());
        if(playerHand.getHandValue()>21)
        {
        LoseScreen l = new LoseScreen();
            l.setVisible(true);
        }
        
        System.out.println(playerHand.getHandValue());
        
        if(playerHand.getNumberOfCards()==3)
        playerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+playerHand.lastCard().getSuitAsString()+"/"+playerHand.lastCard().getValueAsString()+".png")));
        else if(playerHand.getNumberOfCards()==4)
        playerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/"+playerHand.lastCard().getSuitAsString()+"/"+playerHand.lastCard().getValueAsString()+".png")));
        
        
        
        
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dealerCard1;
    private javax.swing.JLabel dealerCard2;
    private javax.swing.JLabel dealerCard3;
    private javax.swing.JLabel dealerCard4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel playerBank;
    private javax.swing.JLabel playerCard1;
    private javax.swing.JLabel playerCard2;
    private javax.swing.JLabel playerCard3;
    private javax.swing.JLabel playerCard4;
    // End of variables declaration//GEN-END:variables
}