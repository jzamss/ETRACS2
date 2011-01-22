/*
 * FAASList.java
 *
 * Created on November 3, 2010, 4:35 PM
 */

package etracs2.prov.transmittal;

/**
 *
 * @author  jzamss
 */
public class TransmittalListPage extends javax.swing.JPanel {
    
    /** Creates new form FAASList */
    public TransmittalListPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        xTable1 = new com.rameses.rcp.control.XTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        xEditorPane1 = new com.rameses.rcp.control.XEditorPane();
        jPanel7 = new javax.swing.JPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel4 = new javax.swing.JPanel();
        xTextField7 = new com.rameses.rcp.control.XTextField();
        xButton1 = new com.rameses.rcp.control.XButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        jSplitPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jSplitPane1.setDividerLocation(430);
        jPanel5.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setFont(new java.awt.Font("Tahoma", 1, 11));
        xTitledBorder1.setTitle("List View");
        xTitledBorder1.setTitlePadding(new java.awt.Insets(2, 5, 2, 5));
        xTable1.setBorder(xTitledBorder1);
        xTable1.setAutoResize(false);
        xTable1.setDepends(new String[] {"selectedItem"});
        xTable1.setHandler("listHandler");
        xTable1.setName("selectedItem");
        xTable1.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel5.add(xTable1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(jPanel5);

        jPanel6.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setFont(new java.awt.Font("Tahoma", 1, 11));
        xTitledBorder2.setTitle("Quick View");
        xTitledBorder2.setTitlePadding(new java.awt.Insets(2, 5, 2, 5));
        jScrollPane1.setBorder(xTitledBorder2);
        xEditorPane1.setDepends(new String[] {"selectedItem"});
        xEditorPane1.setName("html");
        jScrollPane1.setViewportView(xEditorPane1);

        jPanel6.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel6);

        jPanel2.add(jSplitPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel7.setLayout(new java.awt.BorderLayout());

        xLabel1.setBackground(new java.awt.Color(0, 51, 153));
        xLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
        xLabel1.setForeground(new java.awt.Color(255, 255, 255));
        xLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        xLabel1.setName("title");
        xLabel1.setOpaque(true);
        jPanel7.add(xLabel1, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 1, 3, 1));
        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(10, 30));
        jPanel1.setLayout(new java.awt.BorderLayout());

        xActionBar1.setDepends(new String[] {"selectedItem"});
        xActionBar1.setName("formActions");
        xActionBar1.setUseToolBar(false);
        jPanel1.add(xActionBar1, java.awt.BorderLayout.EAST);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 10));
        jPanel4.setPreferredSize(new java.awt.Dimension(250, 10));
        xTextField7.setName("search.textSearch");
        xTextField7.setPreferredSize(new java.awt.Dimension(100, 18));
        jPanel4.add(xTextField7, java.awt.BorderLayout.CENTER);

        xButton1.setText("...");
        xButton1.setDefaultCommand(true);
        xButton1.setMargin(new java.awt.Insets(4, 8, 4, 8));
        xButton1.setName("doSearch");
        jPanel4.add(xButton1, java.awt.BorderLayout.EAST);

        jLabel1.setText("Search :");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));
        jPanel4.add(jLabel1, java.awt.BorderLayout.WEST);

        jPanel1.add(jPanel4, java.awt.BorderLayout.WEST);

        jPanel3.add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel7.add(jPanel3, java.awt.BorderLayout.SOUTH);

        add(jPanel7, java.awt.BorderLayout.NORTH);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XEditorPane xEditorPane1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XTable xTable1;
    private com.rameses.rcp.control.XTextField xTextField7;
    // End of variables declaration//GEN-END:variables
    
}
