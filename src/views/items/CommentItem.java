/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.items;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import models.ReviewModel;

/**
 *
 * @author ADMIN
 */
public class CommentItem extends javax.swing.JPanel {

    /**
     * Creates new form ChapterItem
     */
    private ReviewModel reviewModels;
    public CommentItem(ReviewModel reviewModels) {
        initComponents();
        this.reviewModels = reviewModels;
        this.txtComment.setText("" + reviewModels.getUser_id()+ " : " + reviewModels.getComment());
        this.txtRate.setText("Rating: " + reviewModels.getRating() + "/" + 5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtComment = new javax.swing.JLabel();
        txtRate = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(32767, 40));
        setPreferredSize(new java.awt.Dimension(980, 50));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 5, 0));

        txtComment.setBackground(new java.awt.Color(255, 255, 255));
        txtComment.setText("jLabel1");
        txtComment.setAlignmentY(0.0F);
        txtComment.setPreferredSize(new java.awt.Dimension(700, 50));
        add(txtComment);

        txtRate.setText("jLabel1");
        txtRate.setPreferredSize(new java.awt.Dimension(200, 50));
        add(txtRate);

        btnDelete.setText("X");
        btnDelete.setPreferredSize(new java.awt.Dimension(50, 48));
        add(btnDelete);
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public void setBtnDelete(JButton btnDelete) {
        this.btnDelete = btnDelete;
    }

    public void onBtnDeleteClick(ActionListener action) {
        this.btnDelete.addActionListener(action);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel txtComment;
    private javax.swing.JLabel txtRate;
    // End of variables declaration//GEN-END:variables
}
