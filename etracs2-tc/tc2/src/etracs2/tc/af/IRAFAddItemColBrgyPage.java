/*
 * IRAFAddItem.java
 *
 * Created on May 9, 2011, 1:47 PM
 */

package etracs2.tc.af;

import com.rameses.rcp.ui.annotations.StyleSheet;
import java.awt.FlowLayout;

/**
 *
 * @author  MS
 */
public class IRAFAddItemColBrgyPage extends javax.swing.JPanel {
    
    /** Creates new form IRAFAddItem */
    public IRAFAddItemColBrgyPage() {
        initComponents();
        jPanel11.setLayout( new FlowLayout( FlowLayout.TRAILING ) );
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        xButton1 = new com.rameses.rcp.control.XButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(221, 117));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel11.setPreferredSize(new java.awt.Dimension(100, 34));
        xButton1.setText("Save");
        xButton1.setName("addItem");
        jPanel11.add(xButton1);

        jPanel1.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel1.add(jSeparator1, java.awt.BorderLayout.NORTH);

        add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Add Item");
        formPanel1.setBorder(xTitledBorder1);
        xComboBox1.setCaption("AF No.");
        xComboBox1.setCaptionWidth(100);
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("afList");
        xComboBox1.setName("afId");
        xComboBox1.setPreferredSize(new java.awt.Dimension(100, 19));
        xComboBox1.setRequired(true);
        formPanel1.add(xComboBox1);

        xNumberField1.setCaption("Qty Received");
        xNumberField1.setCaptionWidth(100);
        xNumberField1.setName("item.qtyreceived");
        xNumberField1.setPreferredSize(new java.awt.Dimension(100, 19));
        xNumberField1.setRequired(true);
        formPanel1.add(xNumberField1);

        jPanel2.add(formPanel1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    // End of variables declaration//GEN-END:variables
    
}
