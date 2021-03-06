/*
 * CollectionSummaryPage.java
 *
 * Created on May 17, 2011, 10:06 AM
 */

package etracs2.tc.treasury;

import java.math.BigDecimal;

/**
 *
 * @author  jzamora
 */
public class FundSummaryPage extends javax.swing.JPanel {
    
    /** Creates new form CollectionSummaryPage */
    public FundSummaryPage() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        xDataTable2 = new com.rameses.rcp.control.XDataTable();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        jPanel4 = new javax.swing.JPanel();
        xDataTable1 = new com.rameses.rcp.control.XDataTable();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(704, 444));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel2.setLayout(new java.awt.BorderLayout());

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Summary By Fund");
        jPanel2.setBorder(xTitledBorder1);
        jPanel5.setLayout(new java.awt.BorderLayout());

        xDataTable2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        xDataTable2.setHandler("fundListHandler");
        xDataTable2.setImmediate(true);
        xDataTable2.setName("selectedSummary");
        xDataTable2.setPreferredSize(new java.awt.Dimension(370, 80));
        jPanel5.add(xDataTable2, java.awt.BorderLayout.WEST);

        formPanel1.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        formPanel1.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);
        formPanel1.setPadding(new java.awt.Insets(5, 10, 10, 5));
        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel1.setCaption("Liquidation No.");
        xLabel1.setCaptionWidth(110);
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel1.setName("liquidation.info.txnno");
        xLabel1.setPreferredSize(new java.awt.Dimension(250, 20));
        formPanel1.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel2.setCaption("Liquidation Date");
        xLabel2.setCaptionWidth(110);
        xLabel2.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel2.setName("liquidation.info.txndate");
        xLabel2.setPreferredSize(new java.awt.Dimension(250, 20));
        formPanel1.add(xLabel2);

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel3.setCaption("Liquidating Officer");
        xLabel3.setCaptionWidth(110);
        xLabel3.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel3.setName("liquidation.info.liquidatingofficername");
        xLabel3.setPreferredSize(new java.awt.Dimension(250, 20));
        formPanel1.add(xLabel3);

        jPanel5.add(formPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 0, 5));
        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Collection Detail");
        xDataTable1.setBorder(xTitledBorder2);
        xDataTable1.setDepends(new String[] {"selectedFund"});
        xDataTable1.setDynamic(true);
        xDataTable1.setHandler("receiptListHandler");
        xDataTable1.setImmediate(true);
        xDataTable1.setPreferredSize(new java.awt.Dimension(200, 150));
        jPanel4.add(xDataTable1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private com.rameses.rcp.control.XDataTable xDataTable1;
    private com.rameses.rcp.control.XDataTable xDataTable2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    // End of variables declaration//GEN-END:variables
    
}
