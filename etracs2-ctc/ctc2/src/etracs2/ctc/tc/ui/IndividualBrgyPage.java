/*
 * IndividualPage.java
 *
 * Created on April 2, 2012, 1:20 PM
 */

package etracs2.ctc.tc.ui;

/**
 *
 * @author  JAYROME VERGARA
 */
public class IndividualBrgyPage extends javax.swing.JPanel {
    
    /** Creates new form IndividualPage */
    public IndividualBrgyPage() {
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
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        xComboBox4 = new com.rameses.rcp.control.XComboBox();
        formPanel4 = new com.rameses.rcp.util.FormPanel();
        xNumberField9 = new com.rameses.rcp.control.XNumberField();
        xComboBox5 = new com.rameses.rcp.control.XComboBox();
        formPanel5 = new com.rameses.rcp.util.FormPanel();
        xNumberField10 = new com.rameses.rcp.control.XNumberField();
        xComboBox6 = new com.rameses.rcp.control.XComboBox();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        jPanel3 = new javax.swing.JPanel();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xNumberField4 = new com.rameses.rcp.control.XNumberField();
        xNumberField5 = new com.rameses.rcp.control.XNumberField();
        xNumberField6 = new com.rameses.rcp.control.XNumberField();
        xNumberField7 = new com.rameses.rcp.control.XNumberField();
        xNumberField8 = new com.rameses.rcp.control.XNumberField();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Taxpayer Information");
        jPanel1.setBorder(xTitledBorder1);

        xLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        xLabel1.setText("xLabel1");
        xLabel1.setCaption("Taxpayer");
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        xLabel2.setText("xLabel2");
        xLabel2.setCaption("Address");
        xLabel2.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel2);

        xComboBox1.setCaption("Profession");
        xComboBox1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xComboBox1);

        xTextField1.setText("xTextField1");
        xTextField1.setCaption("TIN");
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField1);

        xDateField1.setText("xDateField1");
        xDateField1.setCaption("Birth Date");
        xDateField1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xDateField1);

        xTextField2.setText("xTextField2");
        xTextField2.setCaption("Place of Birth");
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xTextField2);

        xComboBox2.setCaption("Citizenship");
        xComboBox2.setPreferredSize(new java.awt.Dimension(165, 19));
        formPanel1.add(xComboBox2);

        xTextField3.setText("xTextField3");
        xTextField3.setCaption("ICR (If Alien)");
        xTextField3.setPreferredSize(new java.awt.Dimension(165, 19));
        formPanel1.add(xTextField3);

        xComboBox3.setCaption("Gender");
        xComboBox3.setPreferredSize(new java.awt.Dimension(165, 19));
        formPanel1.add(xComboBox3);

        xComboBox4.setCaption("Civil Status");
        xComboBox4.setPreferredSize(new java.awt.Dimension(165, 19));
        formPanel1.add(xComboBox4);

        formPanel4.setCaption("Height");
        formPanel4.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel4.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xNumberField9.setText("xNumberField9");
        xNumberField9.setCaption("");
        xNumberField9.setCellPadding(new java.awt.Insets(0, 0, 0, 2));
        xNumberField9.setPreferredSize(new java.awt.Dimension(50, 19));
        xNumberField9.setShowCaption(false);
        formPanel4.add(xNumberField9);

        xComboBox5.setCaption("");
        xComboBox5.setPreferredSize(new java.awt.Dimension(111, 19));
        xComboBox5.setShowCaption(false);
        formPanel4.add(xComboBox5);

        formPanel1.add(formPanel4);

        formPanel5.setCaption("Weight");
        formPanel5.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel5.setPadding(new java.awt.Insets(0, 0, 0, 0));
        xNumberField10.setText("xNumberField9");
        xNumberField10.setCaption("");
        xNumberField10.setCellPadding(new java.awt.Insets(0, 0, 0, 2));
        xNumberField10.setPreferredSize(new java.awt.Dimension(50, 19));
        xNumberField10.setShowCaption(false);
        formPanel5.add(xNumberField10);

        xComboBox6.setCaption("");
        xComboBox6.setPreferredSize(new java.awt.Dimension(111, 19));
        xComboBox6.setShowCaption(false);
        formPanel5.add(xComboBox6);

        formPanel1.add(formPanel5);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("COMMUNITY TAX CERTIFICATE (INDIVIDUAL)");

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Salary / Business Gross / RPT Income");
        jPanel2.setBorder(xTitledBorder2);

        formPanel2.setCaptionWidth(120);
        xNumberField1.setText("xNumberField1");
        xNumberField1.setCaption("Annual Salary");
        xNumberField1.setFont(new java.awt.Font("Arial", 1, 11));
        xNumberField1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xNumberField1);

        xNumberField2.setText("xNumberField2");
        xNumberField2.setCaption("Business Gross");
        xNumberField2.setFont(new java.awt.Font("Arial", 1, 11));
        xNumberField2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xNumberField2);

        xNumberField3.setText("xNumberField3");
        xNumberField3.setCaption("Property Income");
        xNumberField3.setFont(new java.awt.Font("Arial", 1, 11));
        xNumberField3.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xNumberField3);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(formPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Community Tax Breakdown");
        jPanel3.setBorder(xTitledBorder3);

        formPanel3.setCaptionWidth(120);
        xNumberField4.setText("xNumberField3");
        xNumberField4.setCaption("Basic Tax");
        xNumberField4.setFont(new java.awt.Font("Arial", 1, 11));
        xNumberField4.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xNumberField4);

        xNumberField5.setText("xNumberField3");
        xNumberField5.setCaption("Annual Salary Tax");
        xNumberField5.setFont(new java.awt.Font("Arial", 1, 11));
        xNumberField5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xNumberField5);

        xNumberField6.setText("xNumberField3");
        xNumberField6.setCaption("Business Gross Tax");
        xNumberField6.setFont(new java.awt.Font("Arial", 1, 11));
        xNumberField6.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xNumberField6);

        xNumberField7.setText("xNumberField3");
        xNumberField7.setCaption("Property Income Tax");
        xNumberField7.setFont(new java.awt.Font("Arial", 1, 11));
        xNumberField7.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xNumberField7);

        xNumberField8.setText("xNumberField3");
        xNumberField8.setCaption("Interest");
        xNumberField8.setFont(new java.awt.Font("Arial", 1, 11));
        xNumberField8.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xNumberField8);

        xLookupField1.setText("xLookupField1");
        xLookupField1.setCaption("Barangay");
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 19));
        xLookupField1.setRequired(true);
        formPanel3.add(xLookupField1);

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(formPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(formPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(43, 43, 43))
                            .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(94, 94, 94))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel4;
    private com.rameses.rcp.util.FormPanel formPanel5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XComboBox xComboBox4;
    private com.rameses.rcp.control.XComboBox xComboBox5;
    private com.rameses.rcp.control.XComboBox xComboBox6;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField10;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    private com.rameses.rcp.control.XNumberField xNumberField4;
    private com.rameses.rcp.control.XNumberField xNumberField5;
    private com.rameses.rcp.control.XNumberField xNumberField6;
    private com.rameses.rcp.control.XNumberField xNumberField7;
    private com.rameses.rcp.control.XNumberField xNumberField8;
    private com.rameses.rcp.control.XNumberField xNumberField9;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    // End of variables declaration//GEN-END:variables
    
}