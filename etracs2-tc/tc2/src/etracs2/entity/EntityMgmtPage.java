/*
 * AccountPage.java
 *
 * Created on February 27, 2011, 12:48 PM
 */

package etracs2.entity;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  jzamss
 */
@StyleSheet("etracs2/entity/EntityMgmtPage.style")
public class EntityMgmtPage extends javax.swing.JPanel {
    
    /** Creates new form AccountPage */
    public EntityMgmtPage() {
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
        xSubFormPanel1 = new com.rameses.rcp.control.XSubFormPanel();

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
        xActionTextField1.setCaptionMnemonic('h');
        xActionTextField1.setHint("Search");
        xActionTextField1.setIndex(-1);
        xActionTextField1.setName("searchText");
        xActionTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        jPanel3.add(xActionTextField1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, java.awt.BorderLayout.NORTH);

        xDataTable1.setHandler("listHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("selectedItem");
        jPanel1.add(xDataTable1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setLayout(new java.awt.BorderLayout());

        xSubFormPanel1.setDepends(new String[] {"selectedItem"});
        xSubFormPanel1.setDynamic(true);
        xSubFormPanel1.setHandler("opener");
        org.jdesktop.layout.GroupLayout xSubFormPanel1Layout = new org.jdesktop.layout.GroupLayout(xSubFormPanel1);
        xSubFormPanel1.setLayout(xSubFormPanel1Layout);
        xSubFormPanel1Layout.setHorizontalGroup(
            xSubFormPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 574, Short.MAX_VALUE)
        );
        xSubFormPanel1Layout.setVerticalGroup(
            xSubFormPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 469, Short.MAX_VALUE)
        );
        jPanel2.add(xSubFormPanel1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPane1;
    private com.rameses.rcp.control.XActionTextField xActionTextField1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel1;
    // End of variables declaration//GEN-END:variables
    
}
