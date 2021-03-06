/*
 * RPTCollectionInitPage.java
 *
 * Created on July 27, 2011, 3:53 PM
 */

package etracs2.rpt.collection;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  jzamora
 */
@StyleSheet("etracs2/rpt/collection/RPTReceiptInitPage.style")
public class RPTReceiptInitPage extends javax.swing.JPanel {
    
    /** Creates new form RPTCollectionInitPage */
    public RPTReceiptInitPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xRadio1 = new com.rameses.rcp.control.XRadio();
        xRadio2 = new com.rameses.rcp.control.XRadio();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xRadio3 = new com.rameses.rcp.control.XRadio();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        formPanel4 = new com.rameses.rcp.util.FormPanel();
        xRadio4 = new com.rameses.rcp.control.XRadio();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        jLabel1 = new javax.swing.JLabel();
        xButton1 = new com.rameses.rcp.control.XButton();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Collection Initial Information");
        formPanel1.setBorder(xTitledBorder1);
        formPanel1.setCaptionFont(new java.awt.Font("Arial", 0, 12));
        xLookupField1.setCaption("Taxpayer");
        xLookupField1.setCellPadding(new java.awt.Insets(5, 0, 0, 0));
        xLookupField1.setExpression("#{entityname}");
        xLookupField1.setFont(new java.awt.Font("Arial", 0, 12));
        xLookupField1.setHandler("lookupPayor");
        xLookupField1.setHint("Search Payor");
        xLookupField1.setIndex(-10);
        xLookupField1.setName("payor");
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xLookupField1.setRequired(true);
        formPanel1.add(xLookupField1);

        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Address");
        xLabel1.setFont(new java.awt.Font("Arial", 0, 12));
        xLabel1.setName("entity.info.payoraddress");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        xTextField1.setCaption("Paid By");
        xTextField1.setFont(new java.awt.Font("Arial", 0, 12));
        xTextField1.setName("entity.info.paidby");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField1.setRequired(true);
        formPanel1.add(xTextField1);

        xTextField2.setCaption("Address");
        xTextField2.setFont(new java.awt.Font("Arial", 0, 12));
        xTextField2.setName("entity.info.paidbyaddress");
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField2.setRequired(true);
        formPanel1.add(xTextField2);

        xDateField1.setCaption("Txn Date");
        xDateField1.setCellPadding(new java.awt.Insets(0, 0, 20, 0));
        xDateField1.setName("entity.info.txndate");
        xDateField1.setPreferredSize(new java.awt.Dimension(110, 19));
        formPanel1.add(xDateField1);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Payment Options");
        formPanel2.setBorder(xTitledBorder2);
        formPanel2.setPreferredSize(new java.awt.Dimension(480, 170));
        formPanel2.setShowCaption(false);
        xRadio1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xRadio1.setMnemonic('a');
        xRadio1.setText(" Pay all properties");
        xRadio1.setCellPadding(new java.awt.Insets(10, 30, 0, 0));
        xRadio1.setFont(new java.awt.Font("Arial", 0, 12));
        xRadio1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xRadio1.setName("payoption");
        xRadio1.setOpaque(false);
        xRadio1.setOptionValue("all");
        xRadio1.setShowCaption(false);
        xRadio1.setValue("all");
        formPanel2.add(xRadio1);

        xRadio2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xRadio2.setMnemonic('l');
        xRadio2.setText("Pay by Ledger");
        xRadio2.setCellPadding(new java.awt.Insets(10, 30, 5, 0));
        xRadio2.setFont(new java.awt.Font("Arial", 0, 12));
        xRadio2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xRadio2.setName("payoption");
        xRadio2.setOpaque(false);
        xRadio2.setOptionValue("bytd");
        xRadio2.setShowCaption(false);
        formPanel2.add(xRadio2);

        formPanel3.setCaptionBorder(null);
        formPanel3.setCaptionPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel3.setCellpadding(new java.awt.Insets(5, 30, 0, 0));
        formPanel3.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel3.setPadding(new java.awt.Insets(5, 0, 5, 0));
        formPanel3.setPreferredSize(new java.awt.Dimension(0, 25));
        formPanel3.setShowCaption(false);
        xRadio3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xRadio3.setMnemonic('l');
        xRadio3.setText("Advance Payment");
        xRadio3.setFont(new java.awt.Font("Arial", 0, 12));
        xRadio3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xRadio3.setName("payoption");
        xRadio3.setOpaque(false);
        xRadio3.setOptionValue("advance");
        xRadio3.setPreferredSize(new java.awt.Dimension(130, 15));
        xRadio3.setShowCaption(false);
        formPanel3.add(xRadio3);

        xNumberField1.setCaption("Year");
        xNumberField1.setCaptionWidth(40);
        xNumberField1.setDepends(new String[] {"payoption"});
        xNumberField1.setFieldType(Integer.class);
        xNumberField1.setName("billtoyear");
        xNumberField1.setPreferredSize(new java.awt.Dimension(60, 19));
        formPanel3.add(xNumberField1);

        formPanel2.add(formPanel3);

        formPanel4.setCaptionBorder(null);
        formPanel4.setCaptionPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel4.setCellpadding(new java.awt.Insets(0, 30, 0, 0));
        formPanel4.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel4.setPadding(new java.awt.Insets(5, 0, 5, 0));
        formPanel4.setPreferredSize(new java.awt.Dimension(0, 30));
        formPanel4.setShowCaption(false);
        xRadio4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xRadio4.setMnemonic('l');
        xRadio4.setText("Remote Collection");
        xRadio4.setCaption("Remote ");
        xRadio4.setFont(new java.awt.Font("Arial", 0, 12));
        xRadio4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xRadio4.setName("payoption");
        xRadio4.setOpaque(false);
        xRadio4.setOptionValue("remote");
        xRadio4.setPreferredSize(new java.awt.Dimension(130, 15));
        xRadio4.setShowCaption(false);
        formPanel4.add(xRadio4);

        xComboBox1.setCaption("LGU");
        xComboBox1.setCaptionWidth(40);
        xComboBox1.setDepends(new String[] {"payoption"});
        xComboBox1.setExpression("#{domainname}");
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("remoteDomainList");
        xComboBox1.setName("remotedomain");
        xComboBox1.setPreferredSize(new java.awt.Dimension(150, 22));
        formPanel4.add(xComboBox1);

        formPanel2.add(formPanel4);

        formPanel1.add(formPanel2);

        jLabel1.setBackground(new java.awt.Color(1, 47, 8));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Real Property Tax Collection");
        jLabel1.setOpaque(true);

        xButton1.setMnemonic('p');
        xButton1.setText("Process");
        xButton1.setDefaultCommand(true);
        xButton1.setName("process");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(xButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 509, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel4;
    private javax.swing.JLabel jLabel1;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XRadio xRadio1;
    private com.rameses.rcp.control.XRadio xRadio2;
    private com.rameses.rcp.control.XRadio xRadio3;
    private com.rameses.rcp.control.XRadio xRadio4;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    // End of variables declaration//GEN-END:variables
    
}
