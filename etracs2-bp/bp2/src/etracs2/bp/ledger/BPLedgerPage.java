/*
 * BPLedgerPage.java
 *
 * Created on June 23, 2011, 9:41 AM
 */

package etracs2.bp.ledger;

/**
 *
 * @author  user
 */
public class BPLedgerPage extends javax.swing.JPanel {
    
    /** Creates new form BPLedgerPage */
    public BPLedgerPage() {
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
        jPanel1 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        jPanel2 = new javax.swing.JPanel();
        xDataTable2 = new com.rameses.rcp.control.XDataTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();
        xDataTable3 = new com.rameses.rcp.control.XDataTable();
        jPanel3 = new javax.swing.JPanel();
        xDataTable4 = new com.rameses.rcp.control.XDataTable();
        xButton1 = new com.rameses.rcp.control.XButton();

        setLayout(new java.awt.BorderLayout());

        xActionBar1.setName("formActions");
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Business Info");
        formPanel1.setBorder(xTitledBorder1);
        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel1.setCaption("Trade Name");
        xLabel1.setExpression("#{entity.business.tradename}");
        xLabel1.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        xLabel2.setCaption("Address");
        xLabel2.setExpression("#{entity.business.businessaddress}");
        xLabel2.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel2);

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel3.setCaption("Owner Name");
        xLabel3.setExpression("#{entity.business.taxpayername}");
        xLabel3.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel3);

        xLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(javax.swing.UIManager.getDefaults().getColor("TextField.shadow")));
        xLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        xLabel4.setCaption("Address");
        xLabel4.setExpression("#{entity.business.taxpayeraddress}");
        xLabel4.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel1.add(xLabel4);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Application List");
        jPanel2.setBorder(xTitledBorder2);
        com.rameses.rcp.control.border.XLineBorder xLineBorder1 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder1.setLineColor(new java.awt.Color(204, 204, 204));
        xDataTable2.setBorder(xLineBorder1);
        xDataTable2.setDynamic(true);
        xDataTable2.setHandler("appHandler");
        xDataTable2.setImmediate(true);
        xDataTable2.setName("application");
        xDataTable2.setShowRowHeader(true);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("");
        jPanel4.setBorder(xTitledBorder3);
        com.rameses.rcp.control.border.XTitledBorder xTitledBorder4 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder4.setTitle("Receivables");
        xDataTable1.setBorder(xTitledBorder4);
        xDataTable1.setDepends(new String[] {"application"});
        xDataTable1.setDynamic(true);
        xDataTable1.setHandler("receivableHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setName("receivable");
        xDataTable1.setShowRowHeader(true);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder5 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder5.setTitle("Credits");
        xDataTable3.setBorder(xTitledBorder5);
        xDataTable3.setDepends(new String[] {"application", "receivable"});
        xDataTable3.setDynamic(true);
        xDataTable3.setHandler("creditHandler");
        xDataTable3.setImmediate(true);
        xDataTable3.setName("payment");
        xDataTable3.setShowRowHeader(true);

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .add(xDataTable1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xDataTable3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(xDataTable3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .add(xDataTable1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addContainerGap())
        );
        jTabbedPane2.addTab("Ledger Details", jPanel4);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder6 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder6.setTitle("");
        jPanel3.setBorder(xTitledBorder6);
        com.rameses.rcp.control.border.XLineBorder xLineBorder2 = new com.rameses.rcp.control.border.XLineBorder();
        xLineBorder2.setLineColor(new java.awt.Color(204, 204, 204));
        xDataTable4.setBorder(xLineBorder2);
        xDataTable4.setDepends(new String[] {"application"});
        xDataTable4.setDynamic(true);
        xDataTable4.setHandler("paymentHandler");
        xDataTable4.setImmediate(true);
        xDataTable4.setName("payment");
        xDataTable4.setShowRowHeader(true);

        xButton1.setText("Capture Payment");
        xButton1.setName("capturePayment");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(xDataTable4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
                    .add(xButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel3Layout.createSequentialGroup()
                .add(xDataTable4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(xButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jTabbedPane2.addTab("Payments", jPanel3);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jTabbedPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, xDataTable2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(xDataTable2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTabbedPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, formPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(formPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDataTable xDataTable2;
    private com.rameses.rcp.control.XDataTable xDataTable3;
    private com.rameses.rcp.control.XDataTable xDataTable4;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    // End of variables declaration//GEN-END:variables
    
}
