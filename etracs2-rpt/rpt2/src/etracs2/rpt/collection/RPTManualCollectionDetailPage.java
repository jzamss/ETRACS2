/*
 * RPTManualCollectionDetailPage.java
 *
 * Created on September 2, 2011, 10:35 AM
 */

package etracs2.rpt.collection;

import com.rameses.rcp.ui.annotations.StyleSheet;
import java.math.BigDecimal;

/**
 *
 * @author  jzamora
 */
@StyleSheet("etracs2/rpt/collection/RPTManualCollectionDetailPage.style")
public class RPTManualCollectionDetailPage extends javax.swing.JPanel {
    
    /** Creates new form RPTManualCollectionDetailPage */
    public RPTManualCollectionDetailPage() {
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
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        formPanel6 = new com.rameses.rcp.util.FormPanel();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        formPanel7 = new com.rameses.rcp.util.FormPanel();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        formPanel8 = new com.rameses.rcp.util.FormPanel();
        xComboBox4 = new com.rameses.rcp.control.XComboBox();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        formPanel4 = new com.rameses.rcp.util.FormPanel();
        xNumberField16 = new com.rameses.rcp.control.XNumberField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        formPanel5 = new com.rameses.rcp.util.FormPanel();
        xNumberField19 = new com.rameses.rcp.control.XNumberField();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xButton3 = new com.rameses.rcp.control.XButton();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        xNumberField8 = new com.rameses.rcp.control.XNumberField();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        xNumberField4 = new com.rameses.rcp.control.XNumberField();
        xNumberField5 = new com.rameses.rcp.control.XNumberField();
        xNumberField6 = new com.rameses.rcp.control.XNumberField();
        xNumberField7 = new com.rameses.rcp.control.XNumberField();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xNumberField9 = new com.rameses.rcp.control.XNumberField();
        xNumberField10 = new com.rameses.rcp.control.XNumberField();
        xNumberField11 = new com.rameses.rcp.control.XNumberField();
        xNumberField12 = new com.rameses.rcp.control.XNumberField();
        xNumberField13 = new com.rameses.rcp.control.XNumberField();
        xNumberField14 = new com.rameses.rcp.control.XNumberField();
        xNumberField15 = new com.rameses.rcp.control.XNumberField();
        xButton1 = new com.rameses.rcp.control.XButton();
        xButton2 = new com.rameses.rcp.control.XButton();
        xNumberField17 = new com.rameses.rcp.control.XNumberField();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(598, 555));

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Manual Collection Information");
        formPanel1.setBorder(xTitledBorder1);
        xTextField1.setCaption("Declared Owner");
        xTextField1.setCaptionWidth(120);
        xTextField1.setName("item.taxpayername");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField1.setRequired(true);
        formPanel1.add(xTextField1);

        xTextField4.setCaption("Address");
        xTextField4.setCaptionWidth(120);
        xTextField4.setName("item.taxpayeraddress");
        xTextField4.setPreferredSize(new java.awt.Dimension(0, 19));
        xTextField4.setRequired(true);
        formPanel1.add(xTextField4);

        formPanel6.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel6.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel6.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel6.setShowCaption(false);
        xTextField2.setCaption("TD No.");
        xTextField2.setCaptionWidth(120);
        xTextField2.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xTextField2.setName("item.tdno");
        xTextField2.setPreferredSize(new java.awt.Dimension(162, 19));
        xTextField2.setRequired(true);
        formPanel6.add(xTextField2);

        xTextField3.setCaption("PIN");
        xTextField3.setCaptionWidth(70);
        xTextField3.setName("item.fullpin");
        xTextField3.setPreferredSize(new java.awt.Dimension(200, 19));
        formPanel6.add(xTextField3);

        formPanel1.add(formPanel6);

        formPanel7.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel7.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel7.setPreferredSize(new java.awt.Dimension(0, 22));
        formPanel7.setShowCaption(false);
        xTextField5.setCaption("Cadastral Lot No");
        xTextField5.setCaptionWidth(120);
        xTextField5.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xTextField5.setName("item.cadastrallotno");
        xTextField5.setPreferredSize(new java.awt.Dimension(162, 19));
        xTextField5.setRequired(true);
        formPanel7.add(xTextField5);

        xComboBox3.setCaption("Barangay");
        xComboBox3.setCaptionWidth(70);
        xComboBox3.setItems("barangays");
        xComboBox3.setName("item.barangay");
        xComboBox3.setPreferredSize(new java.awt.Dimension(200, 22));
        xComboBox3.setRequired(true);
        formPanel7.add(xComboBox3);

        formPanel1.add(formPanel7);

        formPanel8.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel8.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel8.setPreferredSize(new java.awt.Dimension(0, 22));
        formPanel8.setShowCaption(false);
        xComboBox4.setCaption("Classification");
        xComboBox4.setCaptionWidth(120);
        xComboBox4.setCellPadding(new java.awt.Insets(0, 0, 0, 12));
        xComboBox4.setItems("classifications");
        xComboBox4.setName("item.classcode");
        xComboBox4.setPreferredSize(new java.awt.Dimension(160, 22));
        formPanel8.add(xComboBox4);

        xComboBox5.setCaption("RPU Type");
        xComboBox5.setCaptionWidth(70);
        xComboBox5.setItems("rputypes");
        xComboBox5.setName("item.rputype");
        xComboBox5.setPreferredSize(new java.awt.Dimension(200, 22));
        formPanel8.add(xComboBox5);

        formPanel1.add(formPanel8);

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));
        org.jdesktop.layout.GroupLayout xSeparator1Layout = new org.jdesktop.layout.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 564, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );
        formPanel1.add(xSeparator1);

        formPanel4.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel4.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel4.setPreferredSize(new java.awt.Dimension(0, 24));
        formPanel4.setShowCaption(false);
        xNumberField16.setCaption("From Year");
        xNumberField16.setCaptionWidth(120);
        xNumberField16.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xNumberField16.setFieldType(Integer.class);
        xNumberField16.setName("item.fromyear");
        xNumberField16.setPreferredSize(new java.awt.Dimension(100, 22));
        xNumberField16.setRequired(true);
        formPanel4.add(xNumberField16);

        xComboBox1.setAllowNull(false);
        xComboBox1.setCaption("From Qtr");
        xComboBox1.setCaptionWidth(80);
        xComboBox1.setItems("quarters");
        xComboBox1.setName("item.fromqtr");
        xComboBox1.setPreferredSize(new java.awt.Dimension(100, 22));
        xComboBox1.setRequired(true);
        formPanel4.add(xComboBox1);

        formPanel1.add(formPanel4);

        formPanel5.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel5.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel5.setPreferredSize(new java.awt.Dimension(0, 24));
        formPanel5.setShowCaption(false);
        xNumberField19.setCaption("To Year");
        xNumberField19.setCaptionWidth(120);
        xNumberField19.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xNumberField19.setFieldType(Integer.class);
        xNumberField19.setName("item.toyear");
        xNumberField19.setPreferredSize(new java.awt.Dimension(100, 22));
        xNumberField19.setRequired(true);
        formPanel5.add(xNumberField19);

        xComboBox2.setAllowNull(false);
        xComboBox2.setCaption("To Qtr");
        xComboBox2.setCaptionWidth(80);
        xComboBox2.setItems("quarters");
        xComboBox2.setName("item.toqtr");
        xComboBox2.setPreferredSize(new java.awt.Dimension(100, 22));
        xComboBox2.setRequired(true);
        formPanel5.add(xComboBox2);

        formPanel1.add(formPanel5);

        xNumberField1.setCaption("Assessed Value");
        xNumberField1.setCaptionWidth(120);
        xNumberField1.setFieldType(BigDecimal.class);
        xNumberField1.setName("item.assessedvalue");
        xNumberField1.setPattern("#,##0.00");
        xNumberField1.setPreferredSize(new java.awt.Dimension(162, 19));
        xNumberField1.setRequired(true);
        formPanel1.add(xNumberField1);

        xButton3.setMnemonic('m');
        xButton3.setText("Compute");
        xButton3.setImmediate(true);
        xButton3.setName("compute");
        xButton3.setShowCaption(false);
        formPanel1.add(xButton3);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("BASIC Breakdown");
        formPanel2.setBorder(xTitledBorder2);
        xNumberField2.setCaption("Basic Current");
        xNumberField2.setCaptionWidth(140);
        xNumberField2.setDepends(new String[] {"item.toyear"});
        xNumberField2.setFieldType(BigDecimal.class);
        xNumberField2.setName("basic");
        xNumberField2.setPattern("#,##0.00");
        xNumberField2.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField2.setRequired(true);
        formPanel2.add(xNumberField2);

        xNumberField8.setCaption("Basic Discount");
        xNumberField8.setCaptionWidth(140);
        xNumberField8.setDepends(new String[] {"item.toyear"});
        xNumberField8.setFieldType(BigDecimal.class);
        xNumberField8.setName("basicdisc");
        xNumberField8.setPattern("#,##0.00");
        xNumberField8.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField8.setRequired(true);
        formPanel2.add(xNumberField8);

        xNumberField3.setCaption("Basic Current Penalty");
        xNumberField3.setCaptionWidth(140);
        xNumberField3.setDepends(new String[] {"item.toyear"});
        xNumberField3.setFieldType(BigDecimal.class);
        xNumberField3.setName("basicint");
        xNumberField3.setPattern("#,##0.00");
        xNumberField3.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField3.setRequired(true);
        formPanel2.add(xNumberField3);

        xNumberField4.setCaption("Basic Previous");
        xNumberField4.setCaptionWidth(140);
        xNumberField4.setFieldType(BigDecimal.class);
        xNumberField4.setName("basicprev");
        xNumberField4.setPattern("#,##0.00");
        xNumberField4.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField4.setRequired(true);
        formPanel2.add(xNumberField4);

        xNumberField5.setCaption("Basic Previous Penalty");
        xNumberField5.setCaptionWidth(140);
        xNumberField5.setFieldType(BigDecimal.class);
        xNumberField5.setName("basicprevint");
        xNumberField5.setPattern("#,##0.00");
        xNumberField5.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField5.setRequired(true);
        formPanel2.add(xNumberField5);

        xNumberField6.setCaption("Basic Prior");
        xNumberField6.setCaptionWidth(140);
        xNumberField6.setFieldType(BigDecimal.class);
        xNumberField6.setName("basicprior");
        xNumberField6.setPattern("#,##0.00");
        xNumberField6.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField6.setRequired(true);
        formPanel2.add(xNumberField6);

        xNumberField7.setCaption("Basic Prior Penalty");
        xNumberField7.setCaptionWidth(140);
        xNumberField7.setFieldType(BigDecimal.class);
        xNumberField7.setName("basicpriorint");
        xNumberField7.setPattern("#,##0.00");
        xNumberField7.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField7.setRequired(true);
        formPanel2.add(xNumberField7);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("SEF Breakdown");
        formPanel3.setBorder(xTitledBorder3);
        xNumberField9.setCaption("SEF Current");
        xNumberField9.setCaptionWidth(140);
        xNumberField9.setDepends(new String[] {"basic", "item.toyear"});
        xNumberField9.setFieldType(BigDecimal.class);
        xNumberField9.setName("item.sef");
        xNumberField9.setPattern("#,##0.00");
        xNumberField9.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField9.setRequired(true);
        formPanel3.add(xNumberField9);

        xNumberField10.setCaption("SEF Discount");
        xNumberField10.setCaptionWidth(140);
        xNumberField10.setDepends(new String[] {"basicdisc", "item.toyear"});
        xNumberField10.setFieldType(BigDecimal.class);
        xNumberField10.setName("item.sefdisc");
        xNumberField10.setPattern("#,##0.00");
        xNumberField10.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField10.setRequired(true);
        formPanel3.add(xNumberField10);

        xNumberField11.setCaption("SEF Current Penalty");
        xNumberField11.setCaptionWidth(140);
        xNumberField11.setDepends(new String[] {"basicint", "item.toyear"});
        xNumberField11.setFieldType(BigDecimal.class);
        xNumberField11.setName("item.sefint");
        xNumberField11.setPattern("#,##0.00");
        xNumberField11.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField11.setRequired(true);
        formPanel3.add(xNumberField11);

        xNumberField12.setCaption("SEF Previous");
        xNumberField12.setCaptionWidth(140);
        xNumberField12.setDepends(new String[] {"basicprev"});
        xNumberField12.setFieldType(BigDecimal.class);
        xNumberField12.setName("item.sefprev");
        xNumberField12.setPattern("#,##0.00");
        xNumberField12.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField12.setRequired(true);
        formPanel3.add(xNumberField12);

        xNumberField13.setCaption("SEF Previous Penalty");
        xNumberField13.setCaptionWidth(140);
        xNumberField13.setDepends(new String[] {"basicprevint"});
        xNumberField13.setFieldType(BigDecimal.class);
        xNumberField13.setName("item.sefprevint");
        xNumberField13.setPattern("#,##0.00");
        xNumberField13.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField13.setRequired(true);
        formPanel3.add(xNumberField13);

        xNumberField14.setCaption("SEF Prior");
        xNumberField14.setCaptionWidth(140);
        xNumberField14.setDepends(new String[] {"basicprior"});
        xNumberField14.setFieldType(BigDecimal.class);
        xNumberField14.setName("item.sefprior");
        xNumberField14.setPattern("#,##0.00");
        xNumberField14.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField14.setRequired(true);
        formPanel3.add(xNumberField14);

        xNumberField15.setCaption("SEF Prior Penalty");
        xNumberField15.setCaptionWidth(140);
        xNumberField15.setDepends(new String[] {"basicpriorint"});
        xNumberField15.setFieldType(BigDecimal.class);
        xNumberField15.setName("item.sefpriorint");
        xNumberField15.setPattern("#,##0.00");
        xNumberField15.setPreferredSize(new java.awt.Dimension(200, 19));
        xNumberField15.setRequired(true);
        formPanel3.add(xNumberField15);

        xButton1.setMnemonic('c');
        xButton1.setText("Cancel");
        xButton1.setImmediate(true);
        xButton1.setName("_close");

        xButton2.setMnemonic('o');
        xButton2.setText("OK");
        xButton2.setCaption("OK");
        xButton2.setDefaultCommand(true);
        xButton2.setName("ok");

        xNumberField17.setEnabled(false);
        xNumberField17.setFieldType(BigDecimal.class);
        xNumberField17.setFont(new java.awt.Font("Arial", 1, 18));
        xNumberField17.setName("item.amount");
        xNumberField17.setPattern("#,##0.00");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Total Amount :");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(formPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 276, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(formPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(layout.createSequentialGroup()
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(xNumberField17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 132, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(layout.createSequentialGroup()
                            .add(xButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(xButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, formPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, formPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(xNumberField17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(xButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(xButton2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel4;
    private com.rameses.rcp.util.FormPanel formPanel5;
    private com.rameses.rcp.util.FormPanel formPanel6;
    private com.rameses.rcp.util.FormPanel formPanel7;
    private com.rameses.rcp.util.FormPanel formPanel8;
    private javax.swing.JLabel jLabel1;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XButton xButton2;
    private com.rameses.rcp.control.XButton xButton3;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox4;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField10;
    private com.rameses.rcp.control.XNumberField xNumberField11;
    private com.rameses.rcp.control.XNumberField xNumberField12;
    private com.rameses.rcp.control.XNumberField xNumberField13;
    private com.rameses.rcp.control.XNumberField xNumberField14;
    private com.rameses.rcp.control.XNumberField xNumberField15;
    private com.rameses.rcp.control.XNumberField xNumberField16;
    private com.rameses.rcp.control.XNumberField xNumberField17;
    private com.rameses.rcp.control.XNumberField xNumberField19;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    private com.rameses.rcp.control.XNumberField xNumberField4;
    private com.rameses.rcp.control.XNumberField xNumberField5;
    private com.rameses.rcp.control.XNumberField xNumberField6;
    private com.rameses.rcp.control.XNumberField xNumberField7;
    private com.rameses.rcp.control.XNumberField xNumberField8;
    private com.rameses.rcp.control.XNumberField xNumberField9;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    // End of variables declaration//GEN-END:variables
    
}
