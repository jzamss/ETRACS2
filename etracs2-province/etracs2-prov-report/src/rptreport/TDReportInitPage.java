/*
 * TDReportInitPage.java
 *
 * Created on January 18, 2011, 12:06 AM
 */

package rptreport;

/**
 *
 * @author  ms
 */
public class TDReportInitPage extends javax.swing.JPanel {
    
    /** Creates new form TDReportInitPage */
    public TDReportInitPage() {
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
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();

        setLayout(null);

        jPanel1.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setFont(new java.awt.Font("Tahoma", 1, 11));
        xTitledBorder1.setTitle("Tax Declaration Report");
        jPanel1.setBorder(xTitledBorder1);

        xTextField1.setText("xTextField1");
        xTextField1.setCaption("Tax Declaration Number");
        xTextField1.setCaptionWidth(140);
        xTextField1.setRequired(true);
        formPanel1.add(xTextField1);

        jPanel1.add(formPanel1, java.awt.BorderLayout.CENTER);

        add(jPanel1);
        jPanel1.setBounds(10, 10, 340, 140);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
    
}
