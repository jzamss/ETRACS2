/*
 * AccountPage.java
 *
 * Created on February 27, 2011, 12:48 PM
 */

package etracs2.tc.liquidation;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  jzamss
 */
@StyleSheet("etracs2/tc/stylesheet/Listing.style")
public class LiquidationListMgmtPage extends javax.swing.JPanel {
    
    /** Creates new form AccountPage */
    public LiquidationListMgmtPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        xActionTextField1 = new com.rameses.rcp.control.XActionTextField();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        jPanel2 = new javax.swing.JPanel();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        xActionBar2 = new com.rameses.rcp.control.XActionBar();
        xEditorPane1 = new com.rameses.rcp.control.XEditorPane();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(748, 396));
        jSplitPane1.setDividerLocation(400);
        jPanel1.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Listing");
        jPanel1.setBorder(xTitledBorder1);
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 1, 3, 5));
        xActionTextField1.setActionName("search");
        xActionTextField1.setName("searchText");
        xActionTextField1.setPreferredSize(new java.awt.Dimension(150, 19));
        jPanel3.add(xActionTextField1, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);

        xDataTable1.setHandler("listHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("selectedItem");
        jPanel1.add(xDataTable1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Document");
        jPanel2.setBorder(xTitledBorder2);
        xActionBar1.setDepends(new String[] {"selectedItem"});
        xActionBar1.setFont(new java.awt.Font("Arial", 0, 12));
        xActionBar1.setName("formActions");
        jPanel2.add(xActionBar1, java.awt.BorderLayout.NORTH);

        xActionBar2.setFont(new java.awt.Font("Arial", 0, 12));
        xActionBar2.setName("formActions");
        jScrollPane1.setViewportView(xActionBar2);

        xEditorPane1.setDepends(new String[] {"selectedItem"});
        xEditorPane1.setName("html");
        jScrollPane1.setViewportView(xEditorPane1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XActionBar xActionBar2;
    private com.rameses.rcp.control.XActionTextField xActionTextField1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XEditorPane xEditorPane1;
    // End of variables declaration//GEN-END:variables
    
}
