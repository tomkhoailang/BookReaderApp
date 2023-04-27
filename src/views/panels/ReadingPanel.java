/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.panels;


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.html.HTMLDocument;
import other.CustomScrollBar;
import other.SetButton;

/**
 *
 * @author ADMIN
 */
public class ReadingPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReadingPanel
     */
    public ReadingPanel() throws FileNotFoundException, IOException {
        initComponents();
        jEditorPane1.setContentType("text/html");
        jScrollPane1.getVerticalScrollBar().setUI(new CustomScrollBar());
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Arial", "Times New Roman"}));
        jEditorPane1.setEditable(false);
        HTMLDocument doc = new HTMLDocument();
        fontsizeSpinner.setValue(20);
        paddingSpinner.setValue(20);
        
        
        File file = new File("src/other/text.txt");
        String path = file.getAbsolutePath();
        BufferedReader br = null;
        FileReader fr = null;
        String re = "";
        System.out.println(path);;
        if (!file.exists()) {

            boolean temp = file.createNewFile();
            System.out.println(temp);
            this.getjEditorPane1().putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
            jComboBox1.setSelectedItem("Times New Roman");
            jTextField2.setText("15");
            jTextField3.setText("20");
            Insets insets = new Insets(0, 20, 0, 20);
            jEditorPane1.setMargin(insets);
            this.getjEditorPane1().setFont(new Font((String) this.getjComboBox1().getSelectedItem(), Font.PLAIN, Integer.parseInt(this.getjTextField2().getText())));
            MutableAttributeSet set = new SimpleAttributeSet();
            StyleConstants.setAlignment(set, StyleConstants.ALIGN_JUSTIFIED);
            doc.setParagraphAttributes(0, doc.getLength(), set, false);
            this.getjEditorPane1().setDocument(doc);
        } else {

            fr = new FileReader(file);
            br = new BufferedReader(fr);
            re = br.readLine();

            this.getjEditorPane1().putClientProperty(JEditorPane.HONOR_DISPLAY_PROPERTIES, Boolean.TRUE);
            String[] result = re.split(",");
            int paddingNum = Integer.parseInt(result[0]);
            int sizeNum = Integer.parseInt(result[1]);
            String fontStyle = result[2];
            jComboBox1.setSelectedItem(fontStyle);
            jTextField2.setText("" + sizeNum);
            jTextField3.setText("" + paddingNum);
            Insets insets = new Insets(0, paddingNum, 0, paddingNum);
            jEditorPane1.setMargin(insets);
            this.getjEditorPane1().setFont(new Font(fontStyle, Font.PLAIN, sizeNum));
            MutableAttributeSet set = new SimpleAttributeSet();
            doc.setParagraphAttributes(0, doc.getLength(), set, false);
            this.getjEditorPane1().setDocument(doc);
        }
    }

    public javax.swing.JComboBox<String> getBoxChapter() {
        return this.boxChapter;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }

    public JTextField getjTextField3() {
        return jTextField3;
    }

    public void onBtnPrevious(ActionListener action) {
        this.btnPrevious.addActionListener(action);
    }

    public void onBtnNext(ActionListener action) {
        this.btnNext.addActionListener(action);
    }

    public void onBoxChapter(ActionListener action) {
        this.boxChapter.addActionListener(action);
    }

    public void onApply(ActionListener action) {
        this.jButton1.addActionListener(action);
    }

    public JEditorPane getjEditorPane1() {
        return jEditorPane1;
    }

    public JComboBox<String> getjComboBox1() {
        return jComboBox1;
    }

    public void setjComboBox1(JComboBox<String> jComboBox1) {
        this.jComboBox1 = jComboBox1;
    }
    
    public void onBtnBack(MouseAdapter action) {
        this.btnBack.addMouseListener(new SetButton.SetLabelEffectB(btnBack));
        this.btnBack.addMouseListener(action);
    }

    public JSpinner getFontsizeSpinner() {
        return fontsizeSpinner;
    }

    public JSpinner getPaddingSpinner() {
        return paddingSpinner;
    }

    
    public void setjEditorPane1(JEditorPane jEditorPane1) {
        this.jEditorPane1 = jEditorPane1;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        boxChapter = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fontsizeSpinner = new javax.swing.JSpinner();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        paddingSpinner = new javax.swing.JSpinner();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1272, 800));
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1270, 40));

        btnPrevious.setBackground(new java.awt.Color(240, 173, 78));
        btnPrevious.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 255, 255));
        btnPrevious.setText("Previous");

        btnNext.setBackground(new java.awt.Color(240, 173, 78));
        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(255, 255, 255));
        btnNext.setText("Next");
        btnNext.setPreferredSize(new java.awt.Dimension(78, 23));

        boxChapter.setMaximumRowCount(5);
        boxChapter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8" }));

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrevious)
                .addGap(436, 436, 436)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(boxChapter, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(boxChapter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1270, 675));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1258, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 675, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1272, 40));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        jPanel3.setLayout(flowLayout1);

        jLabel1.setText("Kiểu chữ");
        jPanel3.add(jLabel1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(jComboBox1);

        jLabel3.setText("Kích cỡ chữ");
        jPanel3.add(jLabel3);

        fontsizeSpinner.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel3.add(fontsizeSpinner);

        jTextField2.setText("jTextField2");
        jPanel3.add(jTextField2);

        jLabel4.setText("Padding");
        jPanel3.add(jLabel4);

        paddingSpinner.setPreferredSize(new java.awt.Dimension(100, 22));
        jPanel3.add(paddingSpinner);

        jTextField3.setText("jTextField2");
        jPanel3.add(jTextField3);

        jButton1.setText("Áp dụng");
        jPanel3.add(jButton1);

        add(jPanel3);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxChapter;
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JSpinner fontsizeSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JSpinner paddingSpinner;
    // End of variables declaration//GEN-END:variables
}
