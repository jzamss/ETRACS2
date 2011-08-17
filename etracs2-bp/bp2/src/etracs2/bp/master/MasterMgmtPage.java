/*
 * MasterMgmtPage.java
 *
 * Created on June 8, 2011, 10:50 AM
 */

package etracs2.bp.master;

/**
 *
 * @author  rameses
 */
public class MasterMgmtPage extends javax.swing.JPanel {
    
    /** Creates new form MasterMgmtPage */
    public MasterMgmtPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        xList1 = new com.rameses.rcp.control.XList();
        xSubFormPanel1 = new com.rameses.rcp.control.XSubFormPanel();

        setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("List of Master Files");
        jScrollPane1.setBorder(xTitledBorder1);
        xList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        xList1.setExpression("#{caption}");
        xList1.setItems("openers");
        xList1.setName("selectedOpener");
        xList1.setPreferredSize(new java.awt.Dimension(180, 100));
        jScrollPane1.setViewportView(xList1);

        add(jScrollPane1, java.awt.BorderLayout.WEST);

        xSubFormPanel1.setDepends(new String[] {"selectedOpener"});
        xSubFormPanel1.setDynamic(true);
        xSubFormPanel1.setHandler("selectedOpener");
        org.jdesktop.layout.GroupLayout xSubFormPanel1Layout = new org.jdesktop.layout.GroupLayout(xSubFormPanel1);
        xSubFormPanel1.setLayout(xSubFormPanel1Layout);
        xSubFormPanel1Layout.setHorizontalGroup(
            xSubFormPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 324, Short.MAX_VALUE)
        );
        xSubFormPanel1Layout.setVerticalGroup(
            xSubFormPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 464, Short.MAX_VALUE)
        );
        add(xSubFormPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private com.rameses.rcp.control.XList xList1;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel1;
    // End of variables declaration//GEN-END:variables
    
}
