/*
 * ApplicationInitialPage.java
 *
 * Created on June 6, 2011, 1:20 PM
 */

package etracs2.bp.application;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  MS
 */
@StyleSheet("etracs2/bp/application/ApplicationInitialPage.style")
public class ApplicationInitialPageB extends javax.swing.JPanel {
    
    /** Creates new form ApplicationInitialPage */
    public ApplicationInitialPageB() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xActionTextField1 = new com.rameses.rcp.control.XActionTextField();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(546, 229));
        xActionBar1.setName("formActions");
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(null);

        jPanel1.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setFont(new java.awt.Font("Tahoma", 1, 11));
        xTitledBorder1.setTitle(" Business Application");
        jPanel1.setBorder(xTitledBorder1);

        xActionTextField1.setActionName("lookupBusiness");
        xActionTextField1.setCaption("Search");
        xActionTextField1.setIndex(-1);
        xActionTextField1.setName("app.appno");
        xActionTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xActionTextField1.setRequired(true);
        formPanel1.add(xActionTextField1);

        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel1.setBorder(xLineBorder1);
        xLabel1.setCaption("Trade Name");
        xLabel1.setCaptionFont(new java.awt.Font("Tahoma", 0, 11));
        xLabel1.setDepends(new String[] {"business.appno"});
        xLabel1.setExpression("#{app.tradename}");
        xLabel1.setFont(new java.awt.Font("Tahoma", 0, 11));
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(204, 204, 204));
        xLabel2.setBorder(xLineBorder2);
        xLabel2.setCaption("Address");
        xLabel2.setCaptionFont(new java.awt.Font("Tahoma", 0, 11));
        xLabel2.setDepends(new String[] {"business.appno"});
        xLabel2.setExpression("#{app.businessaddress}");
        xLabel2.setFont(new java.awt.Font("Tahoma", 0, 11));
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel2);

        jPanel1.add(formPanel1);
        formPanel1.setBounds(0, 20, 490, 80);

        xComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "application.txntype" }));
        xComboBox1.setCaption("Type");
        xComboBox1.setCaptionFont(new java.awt.Font("Tahoma", 0, 11));
        xComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11));
        xComboBox1.setItems("typeList");
        xComboBox1.setName("application.txntype");
        xComboBox1.setPreferredSize(new java.awt.Dimension(200, 22));
        xComboBox1.setRequired(true);
        formPanel2.add(xComboBox1);

        xComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "application.txnmode" }));
        xComboBox2.setCaption("Mode");
        xComboBox2.setCaptionFont(new java.awt.Font("Tahoma", 0, 11));
        xComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11));
        xComboBox2.setItems("modeList");
        xComboBox2.setName("application.txnmode");
        xComboBox2.setPreferredSize(new java.awt.Dimension(200, 22));
        xComboBox2.setRequired(true);
        formPanel2.add(xComboBox2);

        jPanel1.add(formPanel2);
        formPanel2.setBounds(0, 100, 490, 60);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(10, 0, 500, 170);

        add(jPanel2, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XActionTextField xActionTextField1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    // End of variables declaration//GEN-END:variables
    
}
