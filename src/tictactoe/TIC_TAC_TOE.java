/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class TIC_TAC_TOE extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    
    public TIC_TAC_TOE() {
        initComponents();
    }
    
    private void gameScore(){
        
        win1.setText(String.valueOf(xCount));
        win2.setText(String.valueOf(oCount));
    }
    
    private void choose_a_player(){
    
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
        }
        else{
            startGame = "X";
        }
        
    }
    
    private void WinningGame(){
    
        String b1 = txt1.getText();
        String b2 = txt2.getText();
        String b3 = txt3.getText();
        
        String b4 = txt4.getText();
        String b5 = txt5.getText();
        String b6 = txt6.getText();
        
        String b7 = txt7.getText();
        String b8 = txt8.getText();
        String b9 = txt9.getText();
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X")){
        
            JOptionPane.showMessageDialog(this, "Player X WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txt1.setBackground(Color.ORANGE);
            txt2.setBackground(Color.ORANGE);
            txt3.setBackground(Color.ORANGE);
            
        }
        
        if(b4 == ("X") && b5 == ("X") && b6 == ("X")){
        
            JOptionPane.showMessageDialog(this, "Player X WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txt4.setBackground(Color.ORANGE);
            txt5.setBackground(Color.ORANGE);
            txt6.setBackground(Color.ORANGE);
            
        }
        
        if(b7 == ("X") && b8 == ("X") && b9 == ("X")){
        
            JOptionPane.showMessageDialog(this, "Player X WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txt7.setBackground(Color.ORANGE);
            txt8.setBackground(Color.ORANGE);
            txt9.setBackground(Color.ORANGE);
            
        }
        
        if(b1 == ("X") && b4 == ("X") && b7 == ("X")){
        
            JOptionPane.showMessageDialog(this, "Player X WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txt1.setBackground(Color.ORANGE);
            txt4.setBackground(Color.ORANGE);
            txt7.setBackground(Color.ORANGE);
            
        }
        
        if(b2 == ("X") && b5 == ("X") && b8 == ("X")){
        
            JOptionPane.showMessageDialog(this, "Player X WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txt2.setBackground(Color.ORANGE);
            txt5.setBackground(Color.ORANGE);
            txt8.setBackground(Color.ORANGE);
            
        }
        
        if(b3 == ("X") && b6 == ("X") && b9 == ("X")){
        
            JOptionPane.showMessageDialog(this, "Player X WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txt3.setBackground(Color.ORANGE);
            txt6.setBackground(Color.ORANGE);
            txt9.setBackground(Color.ORANGE);
            
        }
        
        if(b1 == ("X") && b5 == ("X") && b9 == ("X")){
        
            JOptionPane.showMessageDialog(this, "Player X WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txt1.setBackground(Color.ORANGE);
            txt5.setBackground(Color.ORANGE);
            txt9.setBackground(Color.ORANGE);
            
        }
        if(b3 == ("X") && b5 == ("X") && b7 == ("X")){
        
            JOptionPane.showMessageDialog(this, "Player X WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            
            txt3.setBackground(Color.ORANGE);
            txt5.setBackground(Color.ORANGE);
            txt7.setBackground(Color.ORANGE);
            
        }
        if(b1 == ("O") && b2 == ("O") && b3 == ("O")){
        
            JOptionPane.showMessageDialog(this, "Player O WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txt1.setBackground(Color.ORANGE);
            txt2.setBackground(Color.ORANGE);
            txt3.setBackground(Color.ORANGE);
            
        }
        
        if(b4 == ("O") && b5 == ("O") && b6 == ("O")){
        
            JOptionPane.showMessageDialog(this, "Player O WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txt4.setBackground(Color.ORANGE);
            txt5.setBackground(Color.ORANGE);
            txt6.setBackground(Color.ORANGE);
            
        }
        
        if(b7 == ("O") && b8 == ("O") && b9 == ("O")){
        
            JOptionPane.showMessageDialog(this, "Player O WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txt7.setBackground(Color.ORANGE);
            txt8.setBackground(Color.ORANGE);
            txt9.setBackground(Color.ORANGE);
            
        }
        
        if(b1 == ("O") && b4 == ("O") && b7 == ("O")){
        
            JOptionPane.showMessageDialog(this, "Player O WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txt1.setBackground(Color.ORANGE);
            txt4.setBackground(Color.ORANGE);
            txt7.setBackground(Color.ORANGE);
            
        }
        
        if(b2 == ("O") && b5 == ("O") && b8 == ("O")){
        
            JOptionPane.showMessageDialog(this, "Player O WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txt2.setBackground(Color.ORANGE);
            txt5.setBackground(Color.ORANGE);
            txt8.setBackground(Color.ORANGE);
            
        }
        
        if(b3 == ("O") && b6 == ("O") && b9 == ("O")){
        
            JOptionPane.showMessageDialog(this, "Player O WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txt3.setBackground(Color.ORANGE);
            txt6.setBackground(Color.ORANGE);
            txt9.setBackground(Color.ORANGE);
            
        }
        
        if(b1 == ("O") && b5 == ("O") && b9 == ("O")){
        
            JOptionPane.showMessageDialog(this, "Player O WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txt1.setBackground(Color.ORANGE);
            txt5.setBackground(Color.ORANGE);
            txt9.setBackground(Color.ORANGE);
            
        }
        if(b3 == ("O") && b5 == ("O") && b7 == ("O")){
        
            JOptionPane.showMessageDialog(this, "Player O WIN!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            
            txt3.setBackground(Color.ORANGE);
            txt5.setBackground(Color.ORANGE);
            txt7.setBackground(Color.ORANGE);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt2 = new javax.swing.JButton();
        txt1 = new javax.swing.JButton();
        txt3 = new javax.swing.JButton();
        txt5 = new javax.swing.JButton();
        txt4 = new javax.swing.JButton();
        txt6 = new javax.swing.JButton();
        txt8 = new javax.swing.JButton();
        txt7 = new javax.swing.JButton();
        txt9 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        win1 = new javax.swing.JLabel();
        win2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 25)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(456, 456, 456)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt2.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        txt5.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt5ActionPerformed(evt);
            }
        });

        txt4.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });

        txt6.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt6ActionPerformed(evt);
            }
        });

        txt8.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt8ActionPerformed(evt);
            }
        });

        txt7.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt7ActionPerformed(evt);
            }
        });

        txt9.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        txt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt9ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 204, 153));
        reset.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        reset.setText("RESET");
        reset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 51, 0));
        exit.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        exit.setText("EXIT");
        exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.darkGray));

        playero.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        playero.setText("Player O:");

        playerx.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        playerx.setText("Player X:");

        win1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        win1.setForeground(new java.awt.Color(51, 102, 255));
        win1.setText("xxxxxxxxxx");

        win2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        win2.setForeground(new java.awt.Color(51, 102, 255));
        win2.setText("xxxxxxxxxx");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerx)
                    .addComponent(playero))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(win2)
                    .addComponent(win1))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx)
                    .addComponent(win1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero)
                    .addComponent(win2))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame,"Confirm if you want Exit","Tic Tac Toe", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        
        txt1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txt1.setForeground(Color.RED);
        }
        else{
            txt1.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
       
        txt2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txt2.setForeground(Color.RED);
        }
        else{
            txt2.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        txt3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txt3.setForeground(Color.RED);
        }
        else{
            txt3.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        txt4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txt4.setForeground(Color.RED);
        }
        else{
            txt4.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_txt4ActionPerformed

    private void txt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt5ActionPerformed
        txt5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txt5.setForeground(Color.RED);
        }
        else{
            txt5.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_txt5ActionPerformed

    private void txt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt6ActionPerformed
        txt6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txt6.setForeground(Color.RED);
        }
        else{
            txt6.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_txt6ActionPerformed

    private void txt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt7ActionPerformed
        txt7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txt7.setForeground(Color.RED);
        }
        else{
            txt7.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_txt7ActionPerformed

    private void txt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt8ActionPerformed
        txt8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txt8.setForeground(Color.RED);
        }
        else{
            txt8.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame();
    }//GEN-LAST:event_txt8ActionPerformed

    private void txt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt9ActionPerformed
        txt9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txt9.setForeground(Color.RED);
        }
        else{
            txt9.setForeground(Color.MAGENTA);
        }
        choose_a_player();
        WinningGame(); 
        
    }//GEN-LAST:event_txt9ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        
        txt1.setText(null);
        txt2.setText(null);
        txt3.setText(null);
        
        txt4.setText(null);
        txt5.setText(null);
        txt6.setText(null);
        
        txt7.setText(null);
        txt8.setText(null);
        txt9.setText(null);
        
        txt1.setBackground(Color.LIGHT_GRAY);
        txt2.setBackground(Color.LIGHT_GRAY);
        txt3.setBackground(Color.LIGHT_GRAY);
        
        txt4.setBackground(Color.LIGHT_GRAY);
        txt5.setBackground(Color.LIGHT_GRAY);
        txt6.setBackground(Color.LIGHT_GRAY);
        
        txt7.setBackground(Color.LIGHT_GRAY);
        txt8.setBackground(Color.LIGHT_GRAY);
        txt9.setBackground(Color.LIGHT_GRAY);
        
        
        
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton reset;
    private javax.swing.JButton txt1;
    private javax.swing.JButton txt2;
    private javax.swing.JButton txt3;
    private javax.swing.JButton txt4;
    private javax.swing.JButton txt5;
    private javax.swing.JButton txt6;
    private javax.swing.JButton txt7;
    private javax.swing.JButton txt8;
    private javax.swing.JButton txt9;
    private javax.swing.JLabel win1;
    private javax.swing.JLabel win2;
    // End of variables declaration//GEN-END:variables
}
