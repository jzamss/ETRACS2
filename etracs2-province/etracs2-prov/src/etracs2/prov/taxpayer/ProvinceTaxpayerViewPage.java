/*
 * ProvinceTaxpayerViewPage.java
 *
 * Created on January 14, 2011, 10:02 AM
 */

package etracs2.prov.taxpayer;

/**
 *
 * @author  jzamss
 */
public class ProvinceTaxpayerViewPage extends javax.swing.JPanel {
    
    /** Creates new form ProvinceTaxpayerViewPage */
    public ProvinceTaxpayerViewPage() {
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
        xActionBar2 = new com.rameses.rcp.control.XActionBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        xEditorPane2 = new com.rameses.rcp.control.XEditorPane();

        setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Document");
        setBorder(xTitledBorder1);
        jPanel1.setLayout(new java.awt.BorderLayout());

        xActionBar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        xActionBar2.setName("formActions");
        xActionBar2.setPreferredSize(new java.awt.Dimension(89, 35));
        xActionBar2.setUseToolBar(false);
        jPanel1.add(xActionBar2, java.awt.BorderLayout.NORTH);

        xEditorPane2.setName("html");
        jScrollPane1.setViewportView(xEditorPane2);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.rameses.rcp.control.XActionBar xActionBar2;
    private com.rameses.rcp.control.XEditorPane xEditorPane2;
    // End of variables declaration//GEN-END:variables
    
}
