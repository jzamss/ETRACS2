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
@StyleSheet("etracs2/bp/application/PermitPage.style")
public class PermitInfoPage extends javax.swing.JPanel {
    
    /** Creates new form ApplicationInitialPage */
    public PermitInfoPage() {
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
        jPanel3 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xTextField6 = new com.rameses.rcp.control.XTextField();
        xTextField7 = new com.rameses.rcp.control.XTextField();
        xButton1 = new com.rameses.rcp.control.XButton();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(815, 531));
        jPanel3.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Habal-Habal/Motorela Information");
        jPanel3.setBorder(xTitledBorder1);

        xTextField1.setCaption("Model");
        xTextField1.setName("permit.info.model");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel1.add(xTextField1);

        xTextField2.setCaption("Type");
        xTextField2.setName("permit.info.type");
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel1.add(xTextField2);

        xTextField3.setCaption("Color");
        xTextField3.setName("permit.info.color");
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel1.add(xTextField3);

        xTextField4.setCaption("Engine No.");
        xTextField4.setName("permit.info.engineno");
        xTextField4.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel1.add(xTextField4);

        xTextField5.setCaption("Chassis No.");
        xTextField5.setName("permit.info.chassisno");
        xTextField5.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel1.add(xTextField5);

        xTextField6.setCaption("CR/OR No.");
        xTextField6.setName("permit.info.orno");
        xTextField6.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel1.add(xTextField6);

        xTextField7.setCaption("Plate No.");
        xTextField7.setName("permit.info.plateno");
        xTextField7.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel1.add(xTextField7);

        jPanel3.add(formPanel1);
        formPanel1.setBounds(0, 20, 330, 180);

        xButton1.setMnemonic('o');
        xButton1.setText("OK");
        xButton1.setDefaultCommand(true);
        xButton1.setName("_default");
        jPanel3.add(xButton1);
        xButton1.setBounds(250, 200, 77, 23);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 342, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 238, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    private com.rameses.rcp.control.XTextField xTextField6;
    private com.rameses.rcp.control.XTextField xTextField7;
    // End of variables declaration//GEN-END:variables
    
}
