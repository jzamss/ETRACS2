/*
 * SubdivisionPage.java
 *
 * Created on July 1, 2011, 4:55 PM
 */

package etracs2.rpt.txn.subdivision;

import com.rameses.rcp.ui.annotations.StyleSheet;

/**
 *
 * @author  rameses
 */
@StyleSheet("etracs2/rpt/txn/subdivision/SubdivisionPage.style")
public class SubdivisionPage extends javax.swing.JPanel {
    
    /** Creates new form SubdivisionPage */
    public SubdivisionPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        xSeparator1 = new com.rameses.rcp.control.XSeparator();
        xActionBar1 = new com.rameses.rcp.control.XActionBar();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        jPanel2 = new javax.swing.JPanel();
        formPanel7 = new com.rameses.rcp.util.FormPanel();
        xLabel10 = new com.rameses.rcp.control.XLabel();
        xLabel12 = new com.rameses.rcp.control.XLabel();
        xActionBar2 = new com.rameses.rcp.control.XActionBar();
        jPanel7 = new javax.swing.JPanel();
        xDataTable2 = new com.rameses.rcp.control.XDataTable();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        formPanel4 = new com.rameses.rcp.util.FormPanel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xLabel8 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        xLabel11 = new com.rameses.rcp.control.XLabel();
        formPanel3 = new com.rameses.rcp.util.FormPanel();
        xLabel13 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        formPanel13 = new com.rameses.rcp.util.FormPanel();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xNumberField4 = new com.rameses.rcp.control.XNumberField();
        formPanel12 = new com.rameses.rcp.util.FormPanel();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        formPanel9 = new com.rameses.rcp.util.FormPanel();
        xActionTextField4 = new com.rameses.rcp.control.XActionTextField();
        xDateField5 = new com.rameses.rcp.control.XDateField();
        formPanel10 = new com.rameses.rcp.util.FormPanel();
        xActionTextField5 = new com.rameses.rcp.control.XActionTextField();
        xDateField6 = new com.rameses.rcp.control.XDateField();
        formPanel11 = new com.rameses.rcp.util.FormPanel();
        xActionTextField6 = new com.rameses.rcp.control.XActionTextField();
        xDateField7 = new com.rameses.rcp.control.XDateField();

        xSeparator1.setPreferredSize(new java.awt.Dimension(0, 20));
        org.jdesktop.layout.GroupLayout xSeparator1Layout = new org.jdesktop.layout.GroupLayout(xSeparator1);
        xSeparator1.setLayout(xSeparator1Layout);
        xSeparator1Layout.setHorizontalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 535, Short.MAX_VALUE)
        );
        xSeparator1Layout.setVerticalGroup(
            xSeparator1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 20, Short.MAX_VALUE)
        );

        setLayout(new java.awt.BorderLayout());

        xActionBar1.setBorder(new com.rameses.rcp.control.border.XUnderlineBorder());
        xActionBar1.setName("formActions");
        xActionBar1.setPadding(new java.awt.Insets(1, 1, 1, 1));
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        xDataTable1.setAutoscrolls(true);
        xDataTable1.setDynamic(true);
        xDataTable1.setHandler("landListHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("selectedLand");

        jPanel2.setLayout(new java.awt.BorderLayout());

        formPanel7.setCaptionWidth(100);
        formPanel7.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xLabel10.setCaption("Total Area (sqm)");
        xLabel10.setCellPadding(new java.awt.Insets(0, 0, 0, 10));
        xLabel10.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel10.setName("totalareasqm");
        xLabel10.setPadding(new java.awt.Insets(3, 3, 3, 3));
        xLabel10.setPreferredSize(new java.awt.Dimension(150, 19));
        formPanel7.add(xLabel10);

        xLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xLabel12.setCaption("(ha.)");
        xLabel12.setCaptionWidth(40);
        xLabel12.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel12.setName("totalareaha");
        xLabel12.setPadding(new java.awt.Insets(3, 3, 3, 3));
        xLabel12.setPreferredSize(new java.awt.Dimension(150, 19));
        formPanel7.add(xLabel12);

        jPanel2.add(formPanel7, java.awt.BorderLayout.EAST);

        xActionBar2.setDepends(new String[] {"selectedLand"});
        xActionBar2.setName("subdividedlandActions");
        xActionBar2.setUseToolBar(false);
        jPanel2.add(xActionBar2, java.awt.BorderLayout.WEST);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, xDataTable1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(xDataTable1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jTabbedPane1.addTab("Subdivided Lands", jPanel4);

        xDataTable2.setHandler("affectedrpuListHandler");
        xDataTable2.setImmediate(true);
        xDataTable2.setName("selectedAffectedRpu");

        xLabel1.setForeground(new java.awt.Color(153, 0, 0));
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel1.setName("errorMsg");

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, xLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, xDataTable2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .add(xDataTable2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 159, Short.MAX_VALUE)
                .add(xLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jTabbedPane1.addTab("Real Property Units Affected by the Subdivision", jPanel7);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Mother Land Information");
        formPanel4.setBorder(xTitledBorder1);
        xLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel4.setCaption("TD No.");
        xLabel4.setCaptionWidth(100);
        xLabel4.setName("subdivision.mothertdno");
        xLabel4.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel4.add(xLabel4);

        xLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel5.setCaption(" PIN");
        xLabel5.setCaptionWidth(100);
        xLabel5.setName("subdivision.motherpin");
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel4.add(xLabel5);

        xLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel6.setCaption("Owner");
        xLabel6.setCaptionWidth(100);
        xLabel6.setName("subdivision.mothertaxpayername");
        xLabel6.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel4.add(xLabel6);

        xLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel8.setCaption("Cadastral Lot No.");
        xLabel8.setCaptionWidth(100);
        xLabel8.setName("subdivision.mothercadastrallotno");
        xLabel8.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel4.add(xLabel8);

        xLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel7.setCaption("Survey No.");
        xLabel7.setCaptionWidth(100);
        xLabel7.setName("subdivision.mothersurveyno");
        xLabel7.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel4.add(xLabel7);

        xLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel9.setCaption("Area (sq.m.)");
        xLabel9.setCaptionWidth(100);
        xLabel9.setName("subdivision.motherareasqm");
        xLabel9.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel4.add(xLabel9);

        xLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel11.setCaption("Area (ha.)");
        xLabel11.setCaptionWidth(100);
        xLabel11.setName("subdivision.motherareaha");
        xLabel11.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel4.add(xLabel11);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Subdivision Detail");
        formPanel3.setBorder(xTitledBorder2);
        formPanel3.setCaptionWidth(95);
        xLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel13.setForeground(new java.awt.Color(153, 0, 0));
        xLabel13.setCaption("State");
        xLabel13.setCaptionWidth(115);
        xLabel13.setFont(new java.awt.Font("Arial", 1, 14));
        xLabel13.setName("subdivision.docstate");
        xLabel13.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xLabel13);

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel3.setCaption("Revision Year");
        xLabel3.setCaptionWidth(115);
        xLabel3.setName("subdivision.ry");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel3.add(xLabel3);

        formPanel13.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel13.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel13.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel13.setShowCaption(false);
        xDateField1.setCaption("Issue Date");
        xDateField1.setCaptionWidth(115);
        xDateField1.setCellPadding(new java.awt.Insets(0, 0, 0, 15));
        xDateField1.setName("subdivision.issuedate");
        xDateField1.setPreferredSize(new java.awt.Dimension(130, 19));
        xDateField1.setRequired(true);
        formPanel13.add(xDateField1);

        xNumberField4.setCaption("No. of Subd. Lands");
        xNumberField4.setCaptionWidth(120);
        xNumberField4.setCellPadding(new java.awt.Insets(0, 0, 0, 20));
        xNumberField4.setFieldType(int.class);
        xNumberField4.setName("subdivision.subdivisioncount");
        xNumberField4.setPreferredSize(new java.awt.Dimension(72, 19));
        xNumberField4.setRequired(true);
        formPanel13.add(xNumberField4);

        formPanel3.add(formPanel13);

        formPanel12.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel12.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel12.setPreferredSize(new java.awt.Dimension(0, 21));
        formPanel12.setShowCaption(false);
        xNumberField1.setCaption("Effectivity Year");
        xNumberField1.setCaptionWidth(115);
        xNumberField1.setCellPadding(new java.awt.Insets(0, 0, 0, 15));
        xNumberField1.setFieldType(int.class);
        xNumberField1.setName("subdivision.effectivityyear");
        xNumberField1.setPreferredSize(new java.awt.Dimension(130, 19));
        xNumberField1.setRequired(true);
        formPanel12.add(xNumberField1);

        xComboBox1.setAllowNull(false);
        xComboBox1.setCaption("Effectivity Qtr");
        xComboBox1.setCaptionWidth(120);
        xComboBox1.setItems("quarterList");
        xComboBox1.setName("subdivision.effectivityqtr");
        xComboBox1.setPreferredSize(new java.awt.Dimension(72, 21));
        xComboBox1.setRequired(true);
        formPanel12.add(xComboBox1);

        formPanel3.add(formPanel12);

        formPanel9.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel9.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel9.setShowCaption(false);
        xActionTextField4.setActionName("lookupAppraiser");
        xActionTextField4.setCaption("Appraised By");
        xActionTextField4.setCaptionWidth(115);
        xActionTextField4.setCellPadding(new java.awt.Insets(0, 0, 0, 5));
        xActionTextField4.setName("subdivision.appraisedby");
        xActionTextField4.setPreferredSize(new java.awt.Dimension(240, 19));
        xActionTextField4.setRequired(true);
        formPanel9.add(xActionTextField4);

        xDateField5.setCaption("Date");
        xDateField5.setCaptionWidth(50);
        xDateField5.setName("subdivision.dtappraised");
        xDateField5.setPreferredSize(new java.awt.Dimension(120, 19));
        xDateField5.setRequired(true);
        formPanel9.add(xDateField5);

        formPanel3.add(formPanel9);

        formPanel10.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel10.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel10.setShowCaption(false);
        xActionTextField5.setActionName("lookupRecommender");
        xActionTextField5.setCaption("Recommended By");
        xActionTextField5.setCaptionWidth(115);
        xActionTextField5.setCellPadding(new java.awt.Insets(0, 0, 0, 5));
        xActionTextField5.setName("subdivision.recommendedby");
        xActionTextField5.setPreferredSize(new java.awt.Dimension(240, 19));
        xActionTextField5.setRequired(true);
        formPanel10.add(xActionTextField5);

        xDateField6.setCaption("Date");
        xDateField6.setCaptionWidth(50);
        xDateField6.setName("subdivision.dtrecommended");
        xDateField6.setPreferredSize(new java.awt.Dimension(120, 19));
        xDateField6.setRequired(true);
        formPanel10.add(xDateField6);

        formPanel3.add(formPanel10);

        formPanel11.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        formPanel11.setPadding(new java.awt.Insets(0, 0, 0, 0));
        formPanel11.setShowCaption(false);
        xActionTextField6.setActionName("lookupApprover");
        xActionTextField6.setCaption("Approved By");
        xActionTextField6.setCaptionWidth(115);
        xActionTextField6.setCellPadding(new java.awt.Insets(0, 0, 0, 5));
        xActionTextField6.setName("subdivision.approvedby");
        xActionTextField6.setPreferredSize(new java.awt.Dimension(240, 19));
        xActionTextField6.setRequired(true);
        formPanel11.add(xActionTextField6);

        xDateField7.setCaption("Date");
        xDateField7.setCaptionWidth(50);
        xDateField7.setName("subdivision.dtapproved");
        xDateField7.setPreferredSize(new java.awt.Dimension(120, 19));
        xDateField7.setRequired(true);
        formPanel11.add(xDateField7);

        formPanel3.add(formPanel11);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 853, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                        .add(formPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 549, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(formPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(formPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .add(formPanel3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addContainerGap())
        );
        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel10;
    private com.rameses.rcp.util.FormPanel formPanel11;
    private com.rameses.rcp.util.FormPanel formPanel12;
    private com.rameses.rcp.util.FormPanel formPanel13;
    private com.rameses.rcp.util.FormPanel formPanel3;
    private com.rameses.rcp.util.FormPanel formPanel4;
    private com.rameses.rcp.util.FormPanel formPanel7;
    private com.rameses.rcp.util.FormPanel formPanel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XActionBar xActionBar2;
    private com.rameses.rcp.control.XActionTextField xActionTextField4;
    private com.rameses.rcp.control.XActionTextField xActionTextField5;
    private com.rameses.rcp.control.XActionTextField xActionTextField6;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDataTable xDataTable2;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XDateField xDateField5;
    private com.rameses.rcp.control.XDateField xDateField6;
    private com.rameses.rcp.control.XDateField xDateField7;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel10;
    private com.rameses.rcp.control.XLabel xLabel11;
    private com.rameses.rcp.control.XLabel xLabel12;
    private com.rameses.rcp.control.XLabel xLabel13;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLabel xLabel8;
    private com.rameses.rcp.control.XLabel xLabel9;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField4;
    private com.rameses.rcp.control.XSeparator xSeparator1;
    // End of variables declaration//GEN-END:variables
    
}
