/*
 * FormulaEditorPage.java
 *
 * Created on June 6, 2011, 10:55 AM
 */

package etracs2.bp.rule.action;

/**
 *
 * @author  jzamora
 */
public class FormulaEditorPage extends javax.swing.JPanel {
    
    /** Creates new form FormulaEditorPage */
    public FormulaEditorPage() {
        initComponents();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        xTextArea1 = new com.rameses.rcp.control.XTextArea();
        xTextArea2 = new com.rameses.rcp.control.XTextArea();
        jSplitPane2 = new javax.swing.JSplitPane();
        jSplitPane3 = new javax.swing.JSplitPane();
        xDataTable2 = new com.rameses.rcp.control.XDataTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        xList1 = new com.rameses.rcp.control.XList();
        xLabel1 = new com.rameses.rcp.control.XLabel();

        jSplitPane1.setDividerLocation(150);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jScrollPane1.setName("expr");
        xTextArea1.setColumns(20);
        xTextArea1.setRows(5);
        xTextArea1.setName("expr");
        xTextArea1.setTextCase(com.rameses.rcp.constant.TextCase.UPPER);
        jScrollPane1.setViewportView(xTextArea1);

        jSplitPane1.setLeftComponent(jScrollPane1);

        setLayout(new java.awt.BorderLayout());

        setPreferredSize(new java.awt.Dimension(517, 360));
        xTextArea2.setColumns(20);
        xTextArea2.setRows(5);
        xTextArea2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        xTextArea2.setFont(new java.awt.Font("Tahoma", 1, 14));
        xTextArea2.setName("expr");
        xTextArea2.setTextCase(com.rameses.rcp.constant.TextCase.UPPER);
        add(xTextArea2, java.awt.BorderLayout.NORTH);

        jSplitPane2.setDividerLocation(150);
        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane3.setDividerLocation(150);
        jSplitPane3.setPreferredSize(new java.awt.Dimension(179, 150));
        xDataTable2.setDepends(new String[] {"selectedDefinitionType"});
        xDataTable2.setDynamic(true);
        xDataTable2.setHandler("definitionListHandler");
        xDataTable2.setImmediate(true);
        xDataTable2.setName("selectedDefinition");
        xDataTable2.setOddBackground(new java.awt.Color(255, 255, 255));
        xDataTable2.setPreferredSize(new java.awt.Dimension(200, 150));
        jSplitPane3.setRightComponent(xDataTable2);

        xList1.setExpression("#{definitiontype}");
        xList1.setItems("definitionTypes");
        xList1.setName("selectedDefinitionType");
        xList1.setPreferredSize(new java.awt.Dimension(120, 150));
        jScrollPane2.setViewportView(xList1);

        jSplitPane3.setLeftComponent(jScrollPane2);

        jSplitPane2.setTopComponent(jSplitPane3);

        xLabel1.setDepends(new String[] {"selectedDefinition"});
        xLabel1.setName("htmlInfo");
        jSplitPane2.setRightComponent(xLabel1);

        add(jSplitPane2, java.awt.BorderLayout.CENTER);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private com.rameses.rcp.control.XDataTable xDataTable2;
    private com.rameses.rcp.control.XLabel xLabel1;
    private com.rameses.rcp.control.XList xList1;
    private com.rameses.rcp.control.XTextArea xTextArea1;
    private com.rameses.rcp.control.XTextArea xTextArea2;
    // End of variables declaration//GEN-END:variables
    
}