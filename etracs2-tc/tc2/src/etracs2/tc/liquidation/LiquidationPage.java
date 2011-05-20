/*
 * LiquidationPage.java
 *
 * Created on May 2, 2011, 3:41 PM
 */

package etracs2.tc.liquidation;

/**
 *
 * @author  alvin
 */
public class LiquidationPage extends javax.swing.JPanel {
    
    /**
     * Creates new form LiquidationPage
     */
    public LiquidationPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xButton2 = new com.rameses.rcp.control.XButton();
        xSubFormPanel1 = new com.rameses.rcp.control.XSubFormPanel();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        jPanel3 = new javax.swing.JPanel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xNumberField9 = new com.rameses.rcp.control.XNumberField();
        xNumberField10 = new com.rameses.rcp.control.XNumberField();
        xNumberField11 = new com.rameses.rcp.control.XNumberField();
        xButton1 = new com.rameses.rcp.control.XButton();
        xButton3 = new com.rameses.rcp.control.XButton();
        xSubFormPanel2 = new com.rameses.rcp.control.XSubFormPanel();

        xButton2.setMnemonic('d');
        xButton2.setText("Check Details");
        xButton2.setFont(new java.awt.Font("Arial", 1, 12));
        xSubFormPanel1.setHandler("cashBreakdownHandler");
        xSubFormPanel1.setPreferredSize(new java.awt.Dimension(259, 289));

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(642, 466));
        xActionBar1.setName("formActions");
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Liquidation Information");
        jPanel2.setBorder(xTitledBorder1);

        xTextField2.setCaption("Doc No.");
        xTextField2.setCaptionFont(new java.awt.Font("Arial", 0, 14));
        xTextField2.setCaptionWidth(130);
        xTextField2.setFont(new java.awt.Font("Arial", 0, 14));
        xTextField2.setName("entity.info.txnno");
        xTextField2.setPreferredSize(new java.awt.Dimension(160, 21));
        xTextField2.setReadonly(true);
        formPanel3.add(xTextField2);

        xTextField1.setCaption("Liquidating Officer");
        xTextField1.setCaptionFont(new java.awt.Font("Arial", 0, 14));
        xTextField1.setCaptionWidth(130);
        xTextField1.setFont(new java.awt.Font("Arial", 0, 14));
        xTextField1.setName("entity.info.liquidatingofficername");
        xTextField1.setPreferredSize(new java.awt.Dimension(450, 21));
        xTextField1.setReadonly(true);
        formPanel3.add(xTextField1);

        xDateField1.setCaption("Date");
        xDateField1.setCaptionFont(new java.awt.Font("Arial", 0, 14));
        xDateField1.setCaptionWidth(130);
        xDateField1.setFont(new java.awt.Font("Arial", 0, 14));
        xDateField1.setInputFormat("MM-dd-yyyy");
        xDateField1.setName("entity.info.txndate");
        xDateField1.setOutputFormat("MM-dd-yyyy");
        xDateField1.setPreferredSize(new java.awt.Dimension(100, 21));
        xDateField1.setReadonly(true);
        formPanel3.add(xDateField1);

        jPanel2.add(formPanel3);
        formPanel3.setBounds(10, 20, 530, 80);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 620, 110);

        jPanel3.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Liquidation Summary");
        jPanel3.setBorder(xTitledBorder2);

        formPanel2.setCaptionFont(new java.awt.Font("Arial", 0, 12));
        formPanel2.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);
        xNumberField9.setCaption("Total Cash");
        xNumberField9.setCaptionWidth(120);
        xNumberField9.setFont(new java.awt.Font("Arial", 0, 12));
        xNumberField9.setName("entity.info.totalcash");
        xNumberField9.setPreferredSize(new java.awt.Dimension(140, 25));
        xNumberField9.setReadonly(true);
        formPanel2.add(xNumberField9);

        xNumberField10.setCaption("Other Payments");
        xNumberField10.setCaptionWidth(120);
        xNumberField10.setFont(new java.awt.Font("Arial", 0, 12));
        xNumberField10.setName("entity.info.totalotherpayment");
        xNumberField10.setPreferredSize(new java.awt.Dimension(140, 25));
        xNumberField10.setReadonly(true);
        formPanel2.add(xNumberField10);

        xNumberField11.setCaption("Liquidation Amount");
        xNumberField11.setCaptionWidth(120);
        xNumberField11.setFont(new java.awt.Font("Arial", 0, 12));
        xNumberField11.setName("entity.info.amount");
        xNumberField11.setPreferredSize(new java.awt.Dimension(140, 25));
        xNumberField11.setReadonly(true);
        formPanel2.add(xNumberField11);

        jPanel3.add(formPanel2);
        formPanel2.setBounds(40, 50, 270, 100);

        xButton1.setMnemonic('o');
        xButton1.setText("Other Payments");
        xButton1.setFont(new java.awt.Font("Arial", 1, 12));
        xButton1.setName("viewOtherPayments");
        jPanel3.add(xButton1);
        xButton1.setBounds(90, 180, 150, 25);

        xButton3.setMnemonic('r');
        xButton3.setText("View Remittances");
        xButton3.setFont(new java.awt.Font("Arial", 1, 12));
        xButton3.setName("viewRemittances");
        jPanel3.add(xButton3);
        xButton3.setBounds(90, 210, 150, 25);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 130, 350, 290);

        xSubFormPanel2.setHandler("cashBreakdownHandler");
        jPanel1.add(xSubFormPanel2);
        xSubFormPanel2.setBounds(370, 130, 260, 290);

        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XButton xButton2;
    private com.rameses.rcp.control.XButton xButton3;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XNumberField xNumberField10;
    private com.rameses.rcp.control.XNumberField xNumberField11;
    private com.rameses.rcp.control.XNumberField xNumberField9;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel1;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel2;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    // End of variables declaration//GEN-END:variables
    
}