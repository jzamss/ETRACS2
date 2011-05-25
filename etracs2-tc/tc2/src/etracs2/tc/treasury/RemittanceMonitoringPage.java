/*
 * CollectionSummaryPage.java
 *
 * Created on May 17, 2011, 10:06 AM
 */

package etracs2.tc.treasury;

import java.math.BigDecimal;

/**
 *
 * @author  jzamora
 */
public class RemittanceMonitoringPage extends javax.swing.JPanel {
    
    /** Creates new form CollectionSummaryPage */
    public RemittanceMonitoringPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        jPanel4 = new javax.swing.JPanel();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(704, 444));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        formPanel1.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        formPanel1.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);
        formPanel1.setPadding(new java.awt.Insets(10, 10, 10, 5));
        formPanel1.setPreferredSize(new java.awt.Dimension(395, 45));
        xComboBox1.setCaption("Collector");
        xComboBox1.setCaptionWidth(80);
        xComboBox1.setEmptyText("Select a collector");
        xComboBox1.setExpression("#{collectorname}");
        xComboBox1.setImmediate(true);
        xComboBox1.setIndex(-50);
        xComboBox1.setItems("collectorList");
        xComboBox1.setName("collector");
        xComboBox1.setPreferredSize(new java.awt.Dimension(300, 22));
        xComboBox1.setRequired(true);
        formPanel1.add(xComboBox1);

        jPanel5.add(formPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 10, 10, 10));
        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("List of Unremitted Collections");
        xDataTable1.setBorder(xTitledBorder1);
        xDataTable1.setDepends(new String[] {"collector"});
        xDataTable1.setDynamic(true);
        xDataTable1.setHandler("listHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setPreferredSize(new java.awt.Dimension(200, 150));
        jPanel4.add(xDataTable1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    // End of variables declaration//GEN-END:variables
    
}
