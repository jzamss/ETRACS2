/*
 * GeneralCollectionPage.java
 *
 * Created on April 20, 2011, 11:00 AM
 */

package etracs2.bp.collection;

import com.rameses.rcp.ui.annotations.StyleSheet;
import java.math.BigDecimal;

/**
 *
 * @author  jzamora
 */
@StyleSheet("etracs2/tc/collection/CollectionPage.style")
public class GeneralCollectionPage extends javax.swing.JPanel {
    
    /** Creates new form GeneralCollectionPage */
    public GeneralCollectionPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel3 = new javax.swing.JPanel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        xLabel10 = new com.rameses.rcp.control.XLabel();
        xLabel8 = new com.rameses.rcp.control.XLabel();
        xLookupField2 = new com.rameses.rcp.control.XLookupField();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xSubFormPanel1 = new com.rameses.rcp.control.XSubFormPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        xLabel1 = new com.rameses.rcp.control.XLabel();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(884, 487));
        jPanel3.setLayout(new java.awt.BorderLayout());

        xLabel9.setBackground(new java.awt.Color(1, 47, 8));
        xLabel9.setForeground(new java.awt.Color(255, 255, 255));
        xLabel9.setFont(new java.awt.Font("Arial", 1, 18));
        xLabel9.setName("collectiontitle");
        xLabel9.setOpaque(true);
        jPanel3.add(xLabel9, java.awt.BorderLayout.SOUTH);

        xActionBar1.setName("formActions");
        jPanel3.add(xActionBar1, java.awt.BorderLayout.CENTER);

        add(jPanel3, java.awt.BorderLayout.NORTH);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(230, 100));
        jPanel2.setLayout(null);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel3.setText("Amount Due:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(12, 14, 158, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel4.setText("Total Payment:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(12, 92, 206, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Change:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(12, 170, 158, 20);

        xNumberField1.setDepends(new String[] {"year", "qtr"});
        xNumberField1.setFieldType(BigDecimal.class);
        xNumberField1.setFont(new java.awt.Font("Tahoma", 1, 24));
        xNumberField1.setImmediate(true);
        xNumberField1.setIndex(100);
        xNumberField1.setName("entity.info.amount");
        xNumberField1.setOpaque(false);
        xNumberField1.setPattern("#,##0.00");
        xNumberField1.setReadonly(true);
        jPanel2.add(xNumberField1);
        xNumberField1.setBounds(12, 38, 206, 48);

        xNumberField2.setFieldType(BigDecimal.class);
        xNumberField2.setFont(new java.awt.Font("Tahoma", 1, 24));
        xNumberField2.setImmediate(true);
        xNumberField2.setIndex(100);
        xNumberField2.setName("entity.info.totalpayment");
        xNumberField2.setOpaque(false);
        xNumberField2.setPattern("#,##0.00");
        xNumberField2.setReadonly(true);
        jPanel2.add(xNumberField2);
        xNumberField2.setBounds(12, 116, 206, 48);

        xNumberField3.setFieldType(BigDecimal.class);
        xNumberField3.setFont(new java.awt.Font("Tahoma", 1, 24));
        xNumberField3.setForeground(new java.awt.Color(204, 0, 0));
        xNumberField3.setImmediate(true);
        xNumberField3.setIndex(100);
        xNumberField3.setName("entity.info.change");
        xNumberField3.setOpaque(false);
        xNumberField3.setPattern("#,##0.00");
        xNumberField3.setReadonly(true);
        jPanel2.add(xNumberField3);
        xNumberField3.setBounds(12, 196, 206, 48);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.EAST);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        formPanel1.setCaptionBorder(null);
        formPanel1.setCaptionFont(new java.awt.Font("Arial", 0, 12));
        formPanel1.setPadding(new java.awt.Insets(8, 8, 8, 8));

        formPanel2.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        formPanel2.setCaptionFont(new java.awt.Font("Arial", 0, 12));
        formPanel2.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel2.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel2.setPreferredSize(new java.awt.Dimension(0, 22));
        formPanel2.setShowCaption(false);
        xLabel4.setForeground(new java.awt.Color(204, 0, 0));
        xLabel4.setCaption("AF No. ");
        xLabel4.setCaptionWidth(75);
        xLabel4.setFont(new java.awt.Font("Arial", 1, 14));
        xLabel4.setName("entity.info.afid");
        xLabel4.setPreferredSize(new java.awt.Dimension(60, 20));
        formPanel2.add(xLabel4);

        xLabel7.setForeground(new java.awt.Color(204, 0, 0));
        xLabel7.setCaption("Serial No.");
        xLabel7.setCaptionWidth(80);
        xLabel7.setFont(new java.awt.Font("Arial", 1, 14));
        xLabel7.setName("entity.info.serialno");
        xLabel7.setPreferredSize(new java.awt.Dimension(150, 20));
        formPanel2.add(xLabel7);

        xLabel10.setForeground(new java.awt.Color(204, 0, 0));
        xLabel10.setCaption("Stub No.");
        xLabel10.setCaptionWidth(65);
        xLabel10.setFont(new java.awt.Font("Arial", 1, 14));
        xLabel10.setName("entity.info.stubno");
        xLabel10.setPreferredSize(new java.awt.Dimension(100, 20));
        formPanel2.add(xLabel10);

        xLabel8.setForeground(new java.awt.Color(204, 0, 0));
        xLabel8.setCaption("Mode");
        xLabel8.setCaptionWidth(50);
        xLabel8.setFont(new java.awt.Font("Arial", 1, 14));
        xLabel8.setName("entity.info.mode");
        xLabel8.setPreferredSize(new java.awt.Dimension(150, 20));
        formPanel2.add(xLabel8);

        formPanel1.add(formPanel2);

        xLookupField2.setCaption("Trade Name");
        xLookupField2.setCaptionWidth(100);
        xLookupField2.setExpression("#{tradename}");
        xLookupField2.setHandler("lookupBusiness");
        xLookupField2.setName("bp");
        xLookupField2.setPreferredSize(new java.awt.Dimension(0, 19));
        xLookupField2.setRequired(true);
        formPanel1.add(xLookupField2);

        xTextField1.setCaption("Owner");
        xTextField1.setCaptionWidth(100);
        xTextField1.setFont(new java.awt.Font("Arial", 0, 12));
        xTextField1.setName("entity.info.payorname");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField1.setReadonly(true);
        formPanel1.add(xTextField1);

        xTextField3.setCaption("Paid By");
        xTextField3.setCaptionWidth(100);
        xTextField3.setFont(new java.awt.Font("Arial", 0, 12));
        xTextField3.setName("entity.info.paidby");
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField3.setRequired(true);
        formPanel1.add(xTextField3);

        xTextField2.setCaption("Address");
        xTextField2.setCaptionWidth(100);
        xTextField2.setFont(new java.awt.Font("Arial", 0, 12));
        xTextField2.setName("entity.info.paidbyaddress");
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField2.setRequired(true);
        formPanel1.add(xTextField2);

        xDateField1.setCaption("Txn Date ");
        xDateField1.setCaptionWidth(100);
        xDateField1.setDepends(new String[] {"af"});
        xDateField1.setFont(new java.awt.Font("Arial", 0, 12));
        xDateField1.setInputFormat("MM-dd-yyyy");
        xDateField1.setName("entity.info.txndate");
        xDateField1.setOutputFormat("MM-dd-yyyy");
        xDateField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xDateField1.setReadonly(true);
        formPanel1.add(xDateField1);

        jPanel5.add(formPanel1, java.awt.BorderLayout.NORTH);

        xSubFormPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        xSubFormPanel1.setHandler("paymentSummary");
        xSubFormPanel1.setPreferredSize(new java.awt.Dimension(40, 120));
        jPanel5.add(xSubFormPanel1, java.awt.BorderLayout.SOUTH);

        jPanel6.setLayout(new java.awt.BorderLayout());

        jPanel6.setPreferredSize(new java.awt.Dimension(772, 487));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jPanel8.setLayout(new java.awt.BorderLayout());

        jPanel8.setPreferredSize(new java.awt.Dimension(179, 50));
        xTextArea1.setColumns(20);
        xTextArea1.setRows(5);
        xTextArea1.setHint("Remarks");
        xTextArea1.setName("entity.info.remarks");
        xTextArea1.setPreferredSize(new java.awt.Dimension(169, 50));
        jScrollPane1.setViewportView(xTextArea1);

        jPanel8.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel7.add(jPanel8, java.awt.BorderLayout.SOUTH);

        formPanel3.setCellpadding(new java.awt.Insets(0, 0, 10, 0));
        formPanel3.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel3.setPreferredSize(new java.awt.Dimension(100, 35));
        xComboBox1.setAllowNull(false);
        xComboBox1.setCaption("Year");
        xComboBox1.setCaptionWidth(100);
        xComboBox1.setCellPadding(new java.awt.Insets(0, 0, 10, 10));
        xComboBox1.setDynamic(true);
        xComboBox1.setImmediate(true);
        xComboBox1.setItems("years");
        xComboBox1.setName("year");
        xComboBox1.setPreferredSize(new java.awt.Dimension(50, 22));
        xComboBox1.setRequired(true);
        formPanel3.add(xComboBox1);

        xComboBox2.setAllowNull(false);
        xComboBox2.setCaption("Qtr");
        xComboBox2.setCaptionWidth(30);
        xComboBox2.setImmediate(true);
        xComboBox2.setItems("qtrs");
        xComboBox2.setName("qtr");
        formPanel3.add(xComboBox2);

        jPanel7.add(formPanel3, java.awt.BorderLayout.NORTH);

        xDataTable1.setCaption("Collection Entry");
        xDataTable1.setDepends(new String[] {"year", "qtr"});
        xDataTable1.setDynamic(true);
        xDataTable1.setHandler("listHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("selectedItem");
        xDataTable1.setRowHeight(20);
        xDataTable1.setShowHorizontalLines(true);
        xDataTable1.setShowRowHeader(true);
        xDataTable1.setVarStatus("listItem");
        jPanel7.add(xDataTable1, java.awt.BorderLayout.CENTER);

        jPanel6.add(jPanel7, java.awt.BorderLayout.CENTER);

        xLabel1.setForeground(new java.awt.Color(204, 0, 0));
        xLabel1.setDepends(new String[] {"selectedItem"});
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel1.setName("message");
        xLabel1.setPreferredSize(new java.awt.Dimension(42, 20));
        jPanel6.add(xLabel1, java.awt.BorderLayout.SOUTH);

        jPanel5.add(jPanel6, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel5, java.awt.BorderLayout.CENTER);

        add(jPanel4, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel10;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLabel xLabel8;
    private com.rameses.rcp.control.XLabel xLabel9;
    private com.rameses.rcp.control.XLookupField xLookupField2;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    private com.rameses.rcp.control.XSubFormPanel xSubFormPanel1;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    // End of variables declaration//GEN-END:variables
    
}
