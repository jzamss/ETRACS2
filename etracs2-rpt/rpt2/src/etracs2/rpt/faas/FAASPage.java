/*
 * FAASPage.java
 *
 * Created on June 25, 2011, 10:56 AM
 */

package etracs2.rpt.faas;

import com.rameses.rcp.ui.annotations.StyleSheet;
import java.math.BigDecimal;

/**
 *
 * @author  jzamora
 */
@StyleSheet("etracs2/rpt/faas/FAASPage.style")
public class FAASPage extends javax.swing.JPanel {
    
    /** Creates new form FAASPage */
    public FAASPage() {
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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        formPanel1 = new com.rameses.rcp.util.FormPanel();
        xLabel1 = new com.rameses.rcp.control.XLabel();
        xLabel2 = new com.rameses.rcp.control.XLabel();
        xLabel9 = new com.rameses.rcp.control.XLabel();
        xLabel10 = new com.rameses.rcp.control.XLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xComboBox1 = new com.rameses.rcp.control.XComboBox();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xDateField1 = new com.rameses.rcp.control.XDateField();
        xDateField2 = new com.rameses.rcp.control.XDateField();
        xNumberField1 = new com.rameses.rcp.control.XNumberField();
        xComboBox2 = new com.rameses.rcp.control.XComboBox();
        xComboBox3 = new com.rameses.rcp.control.XComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        xNumberField4 = new com.rameses.rcp.control.XNumberField();
        jLabel21 = new javax.swing.JLabel();
        xTextField6 = new com.rameses.rcp.control.XTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        xTextField3 = new com.rameses.rcp.control.XTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        xTextField5 = new com.rameses.rcp.control.XTextField();
        xNumberField2 = new com.rameses.rcp.control.XNumberField();
        xNumberField3 = new com.rameses.rcp.control.XNumberField();
        xTextField4 = new com.rameses.rcp.control.XTextField();
        jLabel17 = new javax.swing.JLabel();
        xDateField3 = new com.rameses.rcp.control.XDateField();
        jLabel18 = new javax.swing.JLabel();
        xDateField4 = new com.rameses.rcp.control.XDateField();
        jLabel19 = new javax.swing.JLabel();
        xDateField5 = new com.rameses.rcp.control.XDateField();
        xActionTextField3 = new com.rameses.rcp.control.XActionTextField();
        xActionTextField4 = new com.rameses.rcp.control.XActionTextField();
        xActionTextField5 = new com.rameses.rcp.control.XActionTextField();
        jPanel7 = new javax.swing.JPanel();
        xActionTextField1 = new com.rameses.rcp.control.XActionTextField();
        xActionTextField2 = new com.rameses.rcp.control.XActionTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        xLabel3 = new com.rameses.rcp.control.XLabel();
        xLabel4 = new com.rameses.rcp.control.XLabel();
        jLabel24 = new javax.swing.JLabel();
        xTextField7 = new com.rameses.rcp.control.XTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        xTextField8 = new com.rameses.rcp.control.XTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        xTextField10 = new com.rameses.rcp.control.XTextField();
        xTextField11 = new com.rameses.rcp.control.XTextField();
        xTextField12 = new com.rameses.rcp.control.XTextField();
        xLabel11 = new com.rameses.rcp.control.XLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        xTextField13 = new com.rameses.rcp.control.XTextField();
        xTextField14 = new com.rameses.rcp.control.XTextField();
        xTextField15 = new com.rameses.rcp.control.XTextField();
        xTextField17 = new com.rameses.rcp.control.XTextField();
        xTextField16 = new com.rameses.rcp.control.XTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        xTextField18 = new com.rameses.rcp.control.XTextField();
        xTextField19 = new com.rameses.rcp.control.XTextField();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        xButton1 = new com.rameses.rcp.control.XButton();
        formPanel2 = new com.rameses.rcp.util.FormPanel();
        xLabel5 = new com.rameses.rcp.control.XLabel();
        xLabel6 = new com.rameses.rcp.control.XLabel();
        xLabel7 = new com.rameses.rcp.control.XLabel();
        xLabel8 = new com.rameses.rcp.control.XLabel();
        xCheckBox1 = new com.rameses.rcp.control.XCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(817, 574));
        xActionBar1.setBorder(new com.rameses.rcp.control.border.XUnderlineBorder());
        xActionBar1.setDepends(new String[] {"faas.docstate"});
        xActionBar1.setName("formActions");
        xActionBar1.setPadding(new java.awt.Insets(2, 2, 2, 2));
        add(xActionBar1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        formPanel1.setCellpadding(new java.awt.Insets(0, 0, 0, 10));
        formPanel1.setOrientation(com.rameses.rcp.constant.UIConstants.HORIZONTAL);
        xLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel1.setCaption("Transaction");
        xLabel1.setCaptionWidth(70);
        xLabel1.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel1.setName("faas.info.txntype");
        xLabel1.setPreferredSize(new java.awt.Dimension(50, 19));
        formPanel1.add(xLabel1);

        xLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel2.setForeground(new java.awt.Color(204, 0, 0));
        xLabel2.setCaption("State");
        xLabel2.setCaptionWidth(40);
        xLabel2.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel2.setName("faas.docstate");
        xLabel2.setPreferredSize(new java.awt.Dimension(150, 19));
        formPanel1.add(xLabel2);

        xLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel9.setForeground(new java.awt.Color(204, 0, 0));
        xLabel9.setCaption("Cancel Reason");
        xLabel9.setCaptionWidth(90);
        xLabel9.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel9.setName("faas.info.cancelreason");
        xLabel9.setPreferredSize(new java.awt.Dimension(50, 19));
        formPanel1.add(xLabel9);

        xLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        xLabel10.setForeground(new java.awt.Color(204, 0, 0));
        xLabel10.setCaption("Date Cancelled");
        xLabel10.setCaptionWidth(90);
        xLabel10.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel10.setName("faas.info.canceldate");
        xLabel10.setPreferredSize(new java.awt.Dimension(80, 19));
        formPanel1.add(xLabel10);

        jPanel1.add(formPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel3.setLayout(null);

        jPanel4.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("General Information");
        jPanel4.setBorder(xTitledBorder1);
        jPanel5.setLayout(null);

        jLabel1.setText("TD No. :");
        jLabel1.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel5.add(jLabel1);
        jLabel1.setBounds(0, 0, 74, 19);

        jLabel2.setText("Title Type :");
        jLabel2.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel5.add(jLabel2);
        jLabel2.setBounds(0, 19, 74, 19);

        jLabel3.setText("Title No. :");
        jLabel3.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel5.add(jLabel3);
        jLabel3.setBounds(0, 38, 74, 19);

        jLabel4.setText("Issue Date * :");
        jLabel4.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel5.add(jLabel4);
        jLabel4.setBounds(0, 57, 74, 19);

        jLabel5.setText("Effectivity * :");
        jLabel5.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel5.add(jLabel5);
        jLabel5.setBounds(0, 76, 74, 19);

        jLabel6.setText("Restriction :");
        jLabel6.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel5.add(jLabel6);
        jLabel6.setBounds(0, 95, 74, 19);

        xTextField1.setCaption("TD No.");
        xTextField1.setName("faas.info.tdno");
        jPanel5.add(xTextField1);
        xTextField1.setBounds(74, 0, 218, 19);

        xComboBox1.setImmediate(true);
        xComboBox1.setItems("titleTypes");
        xComboBox1.setName("faas.info.titletype");
        xComboBox1.setPreferredSize(new java.awt.Dimension(52, 19));
        jPanel5.add(xComboBox1);
        xComboBox1.setBounds(74, 19, 218, 20);

        xTextField2.setCaption("TD No.");
        xTextField2.setDepends(new String[] {"faas.info.titletype"});
        xTextField2.setName("faas.info.titleno");
        jPanel5.add(xTextField2);
        xTextField2.setBounds(74, 38, 88, 19);

        xDateField1.setDepends(new String[] {"faas.info.titletype"});
        xDateField1.setName("faas.info.titledate");
        jPanel5.add(xDateField1);
        xDateField1.setBounds(214, 38, 78, 19);

        xDateField2.setCaption("Issue Date");
        xDateField2.setName("faas.info.issuedate");
        xDateField2.setRequired(true);
        jPanel5.add(xDateField2);
        xDateField2.setBounds(74, 57, 218, 19);

        xNumberField1.setCaption("Effectivity Year");
        xNumberField1.setFieldType(Integer.class);
        xNumberField1.setName("faas.info.effectivityyear");
        xNumberField1.setRequired(true);
        jPanel5.add(xNumberField1);
        xNumberField1.setBounds(74, 76, 88, 19);

        xComboBox2.setCaption("Effectivity Qtr");
        xComboBox2.setItems("quarters");
        xComboBox2.setName("faas.info.effectivityqtr");
        xComboBox2.setRequired(true);
        jPanel5.add(xComboBox2);
        xComboBox2.setBounds(214, 76, 78, 20);

        xComboBox3.setItems("restrictions");
        xComboBox3.setName("faas.info.restriction");
        jPanel5.add(xComboBox3);
        xComboBox3.setBounds(74, 95, 218, 20);

        jLabel7.setText("  Date :");
        jLabel7.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel5.add(jLabel7);
        jLabel7.setBounds(162, 38, 52, 19);

        jLabel8.setText("  Qtr. :");
        jLabel8.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel5.add(jLabel8);
        jLabel8.setBounds(162, 76, 52, 19);

        jLabel20.setText("Back Tax Yrs :");
        jLabel20.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel5.add(jLabel20);
        jLabel20.setBounds(0, 114, 74, 19);

        xNumberField4.setDepends(new String[] {"faas.info.txntype"});
        xNumberField4.setFieldType(Integer.class);
        xNumberField4.setName("faas.info.backtaxyrs");
        jPanel5.add(xNumberField4);
        xNumberField4.setBounds(74, 114, 88, 19);

        jLabel21.setText("  Claim # :");
        jLabel21.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel5.add(jLabel21);
        jLabel21.setBounds(162, 114, 54, 19);

        xTextField6.setCaption("TD No.");
        xTextField6.setDepends(new String[] {"faas.info.titletype"});
        xTextField6.setName("faas.info.claimno");
        jPanel5.add(xTextField6);
        xTextField6.setBounds(216, 114, 76, 19);

        jPanel4.add(jPanel5);
        jPanel5.setBounds(8, 22, 298, 138);

        jPanel6.setLayout(null);

        jLabel9.setText("Previous TD No. :");
        jLabel9.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel9);
        jLabel9.setBounds(0, 0, 100, 19);

        jLabel10.setText("Previous MV :");
        jLabel10.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel10);
        jLabel10.setBounds(0, 38, 100, 19);

        jLabel11.setText("Previous Owner :");
        jLabel11.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel11);
        jLabel11.setBounds(0, 57, 100, 19);

        jLabel12.setText("Appraised By * :");
        jLabel12.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel12);
        jLabel12.setBounds(0, 76, 100, 19);

        jLabel13.setText("Recommended By :");
        jLabel13.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel13);
        jLabel13.setBounds(0, 95, 100, 19);

        jLabel14.setText("Approved By * :");
        jLabel14.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel14);
        jLabel14.setBounds(0, 114, 100, 19);

        xTextField3.setName("faas.info.prevtdno");
        jPanel6.add(xTextField3);
        xTextField3.setBounds(100, 0, 378, 19);

        jLabel15.setText("  Prev. AV :");
        jLabel15.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel15);
        jLabel15.setBounds(230, 38, 68, 19);

        jLabel16.setText("Previous PIN :");
        jLabel16.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel16);
        jLabel16.setBounds(0, 19, 100, 19);

        xTextField5.setName("faas.info.prevpin");
        jPanel6.add(xTextField5);
        xTextField5.setBounds(100, 19, 378, 19);

        xNumberField2.setFieldType(BigDecimal.class);
        xNumberField2.setName("faas.info.prevmv");
        jPanel6.add(xNumberField2);
        xNumberField2.setBounds(100, 38, 130, 19);

        xNumberField3.setFieldType(BigDecimal.class);
        xNumberField3.setName("faas.info.prevav");
        jPanel6.add(xNumberField3);
        xNumberField3.setBounds(298, 38, 180, 19);

        xTextField4.setName("faas.info.prevowner");
        jPanel6.add(xTextField4);
        xTextField4.setBounds(100, 57, 378, 19);

        jLabel17.setText("  Date :");
        jLabel17.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel17);
        jLabel17.setBounds(338, 76, 46, 19);

        xDateField3.setName("faas.info.dtappraised");
        jPanel6.add(xDateField3);
        xDateField3.setBounds(384, 76, 94, 19);

        jLabel18.setText("  Date :");
        jLabel18.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel18);
        jLabel18.setBounds(338, 95, 46, 19);

        xDateField4.setName("faas.info.dtrecommended");
        jPanel6.add(xDateField4);
        xDateField4.setBounds(384, 95, 94, 19);

        jLabel19.setText("  Date :");
        jLabel19.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel6.add(jLabel19);
        jLabel19.setBounds(338, 114, 46, 19);

        xDateField5.setName("faas.info.dtapproved");
        jPanel6.add(xDateField5);
        xDateField5.setBounds(384, 114, 94, 19);

        xActionTextField3.setActionName("lookupAppraiser");
        xActionTextField3.setCaption("Appraised By");
        xActionTextField3.setName("appraiser");
        xActionTextField3.setRequired(true);
        jPanel6.add(xActionTextField3);
        xActionTextField3.setBounds(100, 76, 238, 19);

        xActionTextField4.setActionName("lookupRecommender");
        xActionTextField4.setName("recommender");
        jPanel6.add(xActionTextField4);
        xActionTextField4.setBounds(100, 95, 238, 19);

        xActionTextField5.setActionName("lookupApprover");
        xActionTextField5.setCaption("Approved By");
        xActionTextField5.setName("approver");
        xActionTextField5.setRequired(true);
        jPanel6.add(xActionTextField5);
        xActionTextField5.setBounds(100, 114, 238, 19);

        jPanel4.add(jPanel6);
        jPanel6.setBounds(312, 22, 482, 138);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(8, 2, 802, 168);

        jPanel7.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setTitle("Ownership Information");
        jPanel7.setBorder(xTitledBorder2);
        xActionTextField1.setActionName("lookupTaxpayer");
        xActionTextField1.setCaption("Taxpayer");
        xActionTextField1.setName("taxpayername");
        xActionTextField1.setRequired(true);
        jPanel7.add(xActionTextField1);
        xActionTextField1.setBounds(90, 43, 362, 19);

        xActionTextField2.setActionName("lookupAdministrator");
        xActionTextField2.setName("administratorname");
        jPanel7.add(xActionTextField2);
        xActionTextField2.setBounds(90, 62, 362, 19);

        jLabel22.setText("Taxpayer * :");
        jLabel22.setPreferredSize(new java.awt.Dimension(40, 19));
        jPanel7.add(jLabel22);
        jLabel22.setBounds(10, 43, 80, 18);

        jLabel23.setText("Administrator :");
        jLabel23.setPreferredSize(new java.awt.Dimension(40, 19));
        jPanel7.add(jLabel23);
        jLabel23.setBounds(10, 62, 80, 18);

        xLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel3.setName("faas.info.taxpayeraddress");
        xLabel3.setPreferredSize(new java.awt.Dimension(42, 19));
        jPanel7.add(xLabel3);
        xLabel3.setBounds(520, 43, 274, 19);

        xLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel4.setName("faas.info.administratoraddress");
        xLabel4.setPreferredSize(new java.awt.Dimension(42, 19));
        jPanel7.add(xLabel4);
        xLabel4.setBounds(520, 62, 274, 19);

        jLabel24.setText("Owner * :");
        jLabel24.setPreferredSize(new java.awt.Dimension(40, 19));
        jPanel7.add(jLabel24);
        jLabel24.setBounds(10, 24, 80, 18);

        xTextField7.setCaption("Owner");
        xTextField7.setName("faas.info.ownername");
        xTextField7.setRequired(true);
        jPanel7.add(xTextField7);
        xTextField7.setBounds(90, 24, 362, 19);

        jLabel25.setText("Address :");
        jLabel25.setPreferredSize(new java.awt.Dimension(40, 19));
        jPanel7.add(jLabel25);
        jLabel25.setBounds(458, 43, 62, 18);

        jLabel26.setText("Address :");
        jLabel26.setPreferredSize(new java.awt.Dimension(40, 19));
        jPanel7.add(jLabel26);
        jLabel26.setBounds(458, 62, 62, 18);

        jLabel27.setText("Address * :");
        jLabel27.setPreferredSize(new java.awt.Dimension(40, 19));
        jPanel7.add(jLabel27);
        jLabel27.setBounds(458, 24, 62, 18);

        xTextField8.setCaption("Owner Address");
        xTextField8.setName("faas.info.owneraddress");
        xTextField8.setRequired(true);
        jPanel7.add(xTextField8);
        xTextField8.setBounds(520, 24, 274, 19);

        jPanel3.add(jPanel7);
        jPanel7.setBounds(8, 172, 802, 90);

        jPanel8.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Real Property Information");
        jPanel8.setBorder(xTitledBorder3);
        jPanel10.setLayout(null);

        jLabel32.setText("Block No. :");
        jLabel32.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel10.add(jLabel32);
        jLabel32.setBounds(2, 42, 70, 19);

        jLabel33.setText("Cadastral * :");
        jLabel33.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel10.add(jLabel33);
        jLabel33.setBounds(2, 22, 70, 19);

        jLabel34.setText("PIN No. * :");
        jLabel34.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel10.add(jLabel34);
        jLabel34.setBounds(2, 4, 70, 19);

        jLabel38.setText("Survey No. :");
        jLabel38.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel10.add(jLabel38);
        jLabel38.setBounds(134, 42, 66, 19);

        xTextField10.setCaption("Cadastral ");
        xTextField10.setName("faas.rp.cadastrallotno");
        xTextField10.setRequired(true);
        jPanel10.add(xTextField10);
        xTextField10.setBounds(72, 22, 254, 19);

        xTextField11.setName("faas.rp.blockno");
        jPanel10.add(xTextField11);
        xTextField11.setBounds(72, 40, 58, 19);

        xTextField12.setName("faas.rp.surveyno");
        jPanel10.add(xTextField12);
        xTextField12.setBounds(198, 40, 128, 19);

        xLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel11.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel11.setName("faas.rpu.fullpin");
        xLabel11.setPreferredSize(new java.awt.Dimension(99, 19));
        jPanel10.add(xLabel11);
        xLabel11.setBounds(72, 4, 254, 19);

        jPanel8.add(jPanel10);
        jPanel10.setBounds(6, 22, 330, 64);

        jPanel11.setLayout(null);

        jLabel35.setText("Purok/Zone :");
        jLabel35.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel11.add(jLabel35);
        jLabel35.setBounds(4, 42, 70, 19);

        jLabel36.setText("Street :");
        jLabel36.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel11.add(jLabel36);
        jLabel36.setBounds(4, 23, 70, 19);

        jLabel37.setText("House No. :");
        jLabel37.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel11.add(jLabel37);
        jLabel37.setBounds(4, 4, 70, 19);

        xTextField13.setName("faas.rp.houseno");
        jPanel11.add(xTextField13);
        xTextField13.setBounds(72, 4, 128, 19);

        xTextField14.setName("faas.rp.street");
        jPanel11.add(xTextField14);
        xTextField14.setBounds(72, 23, 128, 19);

        xTextField15.setName("faas.rp.purok");
        jPanel11.add(xTextField15);
        xTextField15.setBounds(72, 42, 128, 19);

        jPanel8.add(jPanel11);
        jPanel11.setBounds(336, 22, 206, 64);

        xTextField17.setCaption("South Boundary");
        xTextField17.setName("faas.rp.south");
        xTextField17.setRequired(true);
        jPanel8.add(xTextField17);
        xTextField17.setBounds(78, 108, 458, 19);

        xTextField16.setCaption("North Boundary");
        xTextField16.setName("faas.rp.north");
        xTextField16.setRequired(true);
        jPanel8.add(xTextField16);
        xTextField16.setBounds(78, 90, 458, 19);

        jLabel39.setText("North * :");
        jLabel39.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel8.add(jLabel39);
        jLabel39.setBounds(8, 90, 70, 19);

        jLabel40.setText("South * :");
        jLabel40.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel8.add(jLabel40);
        jLabel40.setBounds(8, 108, 70, 19);

        xTextField18.setCaption("West Boundary");
        xTextField18.setName("faas.rp.west");
        xTextField18.setRequired(true);
        jPanel8.add(xTextField18);
        xTextField18.setBounds(78, 144, 458, 19);

        xTextField19.setCaption("East Boundary");
        xTextField19.setName("faas.rp.east");
        xTextField19.setRequired(true);
        jPanel8.add(xTextField19);
        xTextField19.setBounds(78, 126, 458, 19);

        jLabel41.setText("East * :");
        jLabel41.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel8.add(jLabel41);
        jLabel41.setBounds(8, 126, 70, 19);

        jLabel42.setText("West *  :");
        jLabel42.setPreferredSize(new java.awt.Dimension(34, 19));
        jPanel8.add(jLabel42);
        jLabel42.setBounds(8, 144, 70, 19);

        jPanel3.add(jPanel8);
        jPanel8.setBounds(8, 264, 546, 174);

        jPanel9.setLayout(null);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder4 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder4.setTitle("Assessment Information");
        jPanel9.setBorder(xTitledBorder4);
        xButton1.setText("Assessment Detail");
        xButton1.setName("viewAssessment");
        jPanel9.add(xButton1);
        xButton1.setBounds(10, 22, 232, 26);

        formPanel2.setCaptionBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        formPanel2.setCellspacing(0);
        xLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel5.setCaption("Revision Year");
        xLabel5.setCaptionWidth(100);
        xLabel5.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel5.setName("faas.rpu.ry");
        xLabel5.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xLabel5);

        xLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel6.setCaption("Classification");
        xLabel6.setCaptionWidth(100);
        xLabel6.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel6.setName("faas.rpu.classcode");
        xLabel6.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xLabel6);

        xLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xLabel7.setCaption("Market Value");
        xLabel7.setCaptionWidth(100);
        xLabel7.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel7.setName("totalmv");
        xLabel7.setPadding(new java.awt.Insets(1, 3, 1, 3));
        xLabel7.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xLabel7);

        xLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        xLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        xLabel8.setCaption("Assessed Value");
        xLabel8.setCaptionWidth(100);
        xLabel8.setFont(new java.awt.Font("Arial", 1, 11));
        xLabel8.setName("totalav");
        xLabel8.setPadding(new java.awt.Insets(1, 3, 1, 3));
        xLabel8.setPreferredSize(new java.awt.Dimension(0, 19));
        formPanel2.add(xLabel8);

        xCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        xCheckBox1.setCaption("Taxable");
        xCheckBox1.setCaptionWidth(100);
        xCheckBox1.setEnabled(false);
        xCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        xCheckBox1.setName("faas.rpu.taxable");
        xCheckBox1.setOpaque(false);
        xCheckBox1.setPreferredSize(new java.awt.Dimension(13, 19));
        formPanel2.add(xCheckBox1);

        jPanel9.add(formPanel2);
        formPanel2.setBounds(6, 50, 238, 122);

        jPanel3.add(jPanel9);
        jPanel9.setBounds(560, 264, 250, 174);

        xTextArea1.setColumns(20);
        xTextArea1.setRows(5);
        xTextArea1.setHint("Memoranda");
        xTextArea1.setName("faas.info.memoranda");
        jScrollPane1.setViewportView(xTextArea1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(8, 440, 800, 70);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.util.FormPanel formPanel1;
    private com.rameses.rcp.util.FormPanel formPanel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private com.rameses.rcp.control.XActionBar xActionBar1;
    private com.rameses.rcp.control.XActionTextField xActionTextField1;
    private com.rameses.rcp.control.XActionTextField xActionTextField2;
    private com.rameses.rcp.control.XActionTextField xActionTextField3;
    private com.rameses.rcp.control.XActionTextField xActionTextField4;
    private com.rameses.rcp.control.XActionTextField xActionTextField5;
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XCheckBox xCheckBox1;
    private com.rameses.rcp.control.XComboBox xComboBox1;
    private com.rameses.rcp.control.XComboBox xComboBox2;
    private com.rameses.rcp.control.XComboBox xComboBox3;
    private com.rameses.rcp.control.XDateField xDateField1;
    private com.rameses.rcp.control.XDateField xDateField2;
    private com.rameses.rcp.control.XDateField xDateField3;
    private com.rameses.rcp.control.XDateField xDateField4;
    private com.rameses.rcp.control.XDateField xDateField5;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XLabel xLabel10;
    private com.rameses.rcp.control.XLabel xLabel11;
    private com.rameses.rcp.control.XLabel xLabel2;
    private com.rameses.rcp.control.XLabel xLabel3;
    private com.rameses.rcp.control.XLabel xLabel4;
    private com.rameses.rcp.control.XLabel xLabel5;
    private com.rameses.rcp.control.XLabel xLabel6;
    private com.rameses.rcp.control.XLabel xLabel7;
    private com.rameses.rcp.control.XLabel xLabel8;
    private com.rameses.rcp.control.XLabel xLabel9;
    private com.rameses.rcp.control.XNumberField xNumberField1;
    private com.rameses.rcp.control.XNumberField xNumberField2;
    private com.rameses.rcp.control.XNumberField xNumberField3;
    private com.rameses.rcp.control.XNumberField xNumberField4;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField10;
    private com.rameses.rcp.control.XTextField xTextField11;
    private com.rameses.rcp.control.XTextField xTextField12;
    private com.rameses.rcp.control.XTextField xTextField13;
    private com.rameses.rcp.control.XTextField xTextField14;
    private com.rameses.rcp.control.XTextField xTextField15;
    private com.rameses.rcp.control.XTextField xTextField16;
    private com.rameses.rcp.control.XTextField xTextField17;
    private com.rameses.rcp.control.XTextField xTextField18;
    private com.rameses.rcp.control.XTextField xTextField19;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    private com.rameses.rcp.control.XTextField xTextField4;
    private com.rameses.rcp.control.XTextField xTextField5;
    private com.rameses.rcp.control.XTextField xTextField6;
    private com.rameses.rcp.control.XTextField xTextField7;
    private com.rameses.rcp.control.XTextField xTextField8;
    // End of variables declaration//GEN-END:variables
    
}
