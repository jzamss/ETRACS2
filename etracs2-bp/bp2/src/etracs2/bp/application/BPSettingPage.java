/*
 * RuleMgmtPage.java
 *
 * Created on May 27, 2011, 10:12 AM
 */

package etracs2.bp.application;

/**
 *
 * @author  jzamora
 */
public class BPSettingPage extends javax.swing.JPanel {
    
    /** Creates new form RuleMgmtPage */
    public BPSettingPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        jPanel4 = new javax.swing.JPanel();
        xDataTable2 = new com.rameses.rcp.control.XDataTable();
        jPanel5 = new javax.swing.JPanel();
        xDataTable3 = new com.rameses.rcp.control.XDataTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        jLabel4 = new javax.swing.JLabel();
        xNumberField4 = new com.rameses.rcp.control.XNumberField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        xNumberField5 = new com.rameses.rcp.control.XNumberField();
        jLabel8 = new javax.swing.JLabel();
        xNumberField6 = new com.rameses.rcp.control.XNumberField();
        xNumberField7 = new com.rameses.rcp.control.XNumberField();
        jLabel9 = new javax.swing.JLabel();
        xNumberField8 = new com.rameses.rcp.control.XNumberField();
        xNumberField9 = new com.rameses.rcp.control.XNumberField();
        jLabel10 = new javax.swing.JLabel();
        xNumberField10 = new com.rameses.rcp.control.XNumberField();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        xActionBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        xActionBar1.setDepends(new String[] {"selectedItem"});
        xActionBar1.setDynamic(true);
        xActionBar1.setName("formActions");
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(new java.awt.BorderLayout());

        xDataTable1.setDynamic(true);
        xDataTable1.setHandler("applicationHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("applicationsignatory");
        jPanel3.add(xDataTable1, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Application Signatories", jPanel3);

        jPanel4.setLayout(new java.awt.BorderLayout());

        xDataTable2.setDynamic(true);
        xDataTable2.setHandler("assessmentHandler");
        xDataTable2.setImmediate(true);
        xDataTable2.setName("assessmentsignatory");
        jPanel4.add(xDataTable2, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Assessment Signatories", jPanel4);

        jPanel5.setLayout(new java.awt.BorderLayout());

        xDataTable3.setDynamic(true);
        xDataTable3.setHandler("requirementHandler");
        xDataTable3.setImmediate(true);
        xDataTable3.setName("requirement");
        jPanel5.add(xDataTable3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Requirements", jPanel5);

        jPanel2.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Surcharge & Interest Due Date"));
        jLabel3.setText("1st Quarter :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 30, 70, 14);

        xNumberField3.setName("setting.collection.qtr1surcharge.month");
        jPanel2.add(xNumberField3);
        xNumberField3.setBounds(90, 30, 40, 19);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(130, 30, 20, 14);

        xNumberField4.setName("setting.collection.qtr1surcharge.day");
        jPanel2.add(xNumberField4);
        xNumberField4.setBounds(150, 30, 40, 19);

        jLabel5.setText("2nd Quarter :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 60, 70, 14);

        jLabel6.setText("3rd Quarter :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 90, 70, 14);

        jLabel7.setText("4th Quarter :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 120, 70, 14);

        xNumberField5.setName("setting.collection.qtr2surcharge.month");
        jPanel2.add(xNumberField5);
        xNumberField5.setBounds(90, 60, 40, 19);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("-");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(130, 60, 20, 14);

        xNumberField6.setName("setting.collection.qtr2surcharge.day");
        jPanel2.add(xNumberField6);
        xNumberField6.setBounds(150, 60, 40, 19);

        xNumberField7.setName("setting.collection.qtr3surcharge.month");
        jPanel2.add(xNumberField7);
        xNumberField7.setBounds(90, 90, 40, 19);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("-");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(130, 90, 20, 14);

        xNumberField8.setName("setting.collection.qtr3surcharge.day");
        jPanel2.add(xNumberField8);
        xNumberField8.setBounds(150, 90, 40, 19);

        xNumberField9.setName("setting.collection.qtr4surcharge.month");
        jPanel2.add(xNumberField9);
        xNumberField9.setBounds(90, 120, 40, 19);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("-");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel10);
        jLabel10.setBounds(130, 120, 20, 14);

        xNumberField10.setName("setting.collection.qtr4surcharge.day");
        jPanel2.add(xNumberField10);
        xNumberField10.setBounds(150, 120, 40, 19);

        jPanel6.setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Discount"));
        jLabel1.setText("Due Date :");
        jPanel6.add(jLabel1);
        jLabel1.setBounds(20, 30, 60, 14);

        xNumberField1.setName("setting.collection.discount.month");
        jPanel6.add(xNumberField1);
        xNumberField1.setBounds(80, 30, 40, 19);

        xNumberField2.setName("setting.collection.discount.day");
        jPanel6.add(xNumberField2);
        xNumberField2.setBounds(140, 30, 40, 19);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel2);
        jLabel2.setBounds(120, 30, 20, 14);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE))
                .add(9, 9, 9))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );
        jTabbedPane1.addTab("Collection", jPanel1);

        add(jTabbedPane1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDataTable xDataTable2;
    private com.rameses.rcp.control.XDataTable xDataTable3;
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
    // End of variables declaration//GEN-END:variables
    
}
