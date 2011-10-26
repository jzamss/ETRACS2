[getList]
SELECT * FROM remittancelist 
ORDER BY txndate DESC, txnno DESC

[getRemittanceByTxnNo]
SELECT * 
FROM remittancelist 
WHERE txnno = $P{txnno} 
ORDER BY txndate DESC, txnno DESC 

[getRemittanceByCollector]
SELECT * FROM remittancelist 
WHERE collectorname LIKE CONCAT($P{collectorname}, '%') 
ORDER BY txndate DESC, txnno DESC

[getListByCollectorid]
SELECT * FROM remittancelist 
WHERE collectorid = $P{collectorid} 
ORDER BY txndate DESC, txnno DESC

[getRemittanceByTxnNoByCollectorid]
SELECT * 
FROM remittancelist 
WHERE txnno = $P{txnno} 
AND collectorid = $P{collectorid} 
ORDER BY txndate DESC, txnno DESC

[getLiquidatingOfficer]
SELECT lq.* FROM etracsuser lq WHERE lq.objid IN (	
	select c.lqofficerid from etracsuser c WHERE c.objid = $P{collectorid}
)




[getReceiptsByRemittance]
SELECT * FROM receiptlist 
WHERE remittanceid = $P{remittanceid} 
ORDER BY afid, serialno DESC, txndate DESC

[getOtherPaymentsByRemittance]
SELECT pi.* FROM paymentitem pi, receiptlist rl 
WHERE rl.objid = pi.receiptid 
AND rl.voided = 0 
AND NOT pi.paytype = 'CASH' 
AND rl.objid = $P{remittanceid} 

[getRemittedFormsByRemittance]
SELECT * FROM remittedform 
WHERE remittanceid = $P{remittanceid} 
ORDER BY afid, stubno

[getSerialRemittedFormsByRemittance]
SELECT * FROM remittedform 
WHERE remittanceid = $P{remittanceid} 
	AND aftype = 'serial' 
ORDER BY afid, stubno

[getNonSerialRemittedFormsByRemittance]
SELECT 
	CASE WHEN rf.receivedqty >= 0 THEN rf.receivedqty * af.denomination ELSE 0.0 END AS receivedamt, 
	CASE WHEN rf.beginqty >= 0 THEN rf.beginqty * af.denomination ELSE 0.0 END AS beginamt, 
	CASE WHEN rf.issuedqty >= 0 THEN rf.issuedqty * af.denomination ELSE 0.0 END AS issuedamt, 
	CASE WHEN rf.endingqty >= 0 THEN rf.endingqty * af.denomination ELSE 0.0 END AS endingamt, 
	rf.* 
FROM remittedform rf 
	INNER JOIN af af ON rf.afid = af.objid 
WHERE rf.remittanceid = $P{remittanceid} 
	AND rf.aftype = 'nonserial' 
ORDER BY rf.afid, rf.stubno


[getUnremittedReceipts]
SELECT * FROM receiptlist 
WHERE remittanceid IS NULL 
AND docstate = 'OPEN' 
AND collectorid = $P{collectorid} 
ORDER BY serialno DESC, txndate DESC

[getOtherPayments]
SELECT pi.* FROM paymentitem pi, receiptlist rl 
WHERE rl.objid = pi.receiptid 
AND NOT pi.paytype = 'CASH' 
AND rl.collectorid = $P{collectorid} 
AND rl.voided = 0 
AND rl.docstate = 'OPEN'

[getRemittanceInfo]
SELECT 
	SUM( amount ) AS totalamount, 
	SUM( cash ) AS totalcash, 
	SUM( otherpayment ) AS totalotherpayment 
FROM receiptlist rl 
WHERE remittanceid IS NULL 
AND docstate = 'OPEN' 
AND voided = 0 
AND collectorid = $P{collectorid} 

[getAfControls]
SELECT * FROM afcontrol 
WHERE docstate = 'APPROVED' 
AND collectorid = $P{collectorid} 
ORDER BY afid, stubno

[getReceiptsByRemittanceAllCollectionType]
SELECT 
	afid, 
	serialno, 
	txndate, paidby, 
	CASE WHEN voided = 0 THEN collectiontype ELSE '***VOIDED***' END AS collectiontype, 
	CASE WHEN voided = 0 THEN amount ELSE 0.0 END AS amount 
FROM receiptlist 
WHERE remittanceid = $P{remittanceid} 
ORDER BY afid, serialno 

[getReceiptsByRemittanceCollectionType]
SELECT 
	afid, 
	serialno, 
	txndate, paidby, 
	CASE WHEN voided = 0 THEN collectiontype ELSE '***VOIDED***' END AS collectiontype, 
	CASE WHEN voided = 0 THEN amount ELSE 0.0 END AS amount 
FROM receiptlist 
WHERE remittanceid = $P{remittanceid} 
	AND collectiontypeid = $P{collectiontypeid} 
ORDER BY afid, serialno 

[getReceiptDetailsByAllFund]
SELECT 
	rl.afid AS afid, 
	rl.serialno AS serialno, 
	rl.txndate AS txndate, 
	ri.fundname AS fundname, 
	CASE WHEN rl.voided = 0 THEN rl.paidby ELSE '***VOIDED***' END AS payer, 
	CASE WHEN rl.voided = 0 THEN ri.accttitle ELSE '***VOIDED***' END AS particulars, 
	CASE WHEN rl.voided = 0 THEN ri.amount ELSE 0.0 END AS amount 
FROM receiptlist rl, receiptitem ri 
WHERE rl.objid = ri.receiptid 
	AND rl.remittanceid = $P{remittanceid} 
ORDER BY rl.afid, rl.serialno

[getReceiptDetailsByFund]
SELECT 
	rl.afid AS afid, 
	rl.serialno AS serialno, 
	rl.txndate AS txndate, 
	ri.fundname AS fundname, 
	CASE WHEN rl.voided = 0 THEN rl.paidby ELSE '***VOIDED***' END AS payer, 
	CASE WHEN rl.voided = 0 THEN ri.accttitle ELSE '***VOIDED***' END AS particulars, 
	CASE WHEN rl.voided = 0 THEN ri.amount ELSE 0.0 END AS amount 
FROM receiptlist rl, receiptitem ri 
WHERE rl.objid = ri.receiptid 
	AND rl.remittanceid = $P{remittanceid} 
	AND ri.fundid LIKE $P{fundid} 
ORDER BY  rl.afid, rl.serialno, rl.paidby, ri.accttitle 
	
[getIncomeAccuntSummaryByAllFund] 
SELECT 
	ri.fundname, 
	ri.acctid AS acctid, 
	ri.accttitle AS acctname, 
	SUM( ri.amount ) AS amount 
FROM receiptlist rl, receiptitem ri 
WHERE rl.objid = ri.receiptid 
	AND rl.remittanceid = $P{remittanceid} 
	AND rl.voided = 0 
GROUP BY ri.acctid, ri.accttitle 
ORDER BY ri.fundname, ri.accttitle 

[getIncomeAccuntSummaryByFund]
SELECT 
	ri.fundname,
	ri.acctid AS acctid, 
	ri.accttitle AS acctname, 
	SUM( ri.amount ) AS amount 
FROM receiptlist rl, receiptitem ri 
WHERE rl.objid = ri.receiptid 
  AND rl.remittanceid = $P{remittanceid} 
  AND ri.fundid LIKE $P{fundid} 
  AND rl.voided = 0 
GROUP BY ri.fundname, ri.acctid, ri.accttitle 
ORDER BY ri.fundname, ri.accttitle

[getSerialReceiptDetailsByAllFund]
SELECT 
	rl.afid AS afid, 
	rl.serialno AS serialno, 
	rl.txndate AS txndate, 
	rl.paidby AS payer, 
	ri.fundname AS fundname, 
	ri.accttitle AS particulars, 
	CASE WHEN rl.voided = 0 THEN ri.amount ELSE 0.0 END AS amount 
FROM receiptlist rl, receiptitem ri, af af 
WHERE rl.objid = ri.receiptid 
	AND rl.remittanceid = $P{remittanceid} 
	AND rl.afid = af.objid 
	AND af.aftype = 'serial' 
ORDER BY rl.afid, rl.serialno, ri.accttitle

[getSerialReceiptDetailsByFund]
SELECT 
	rl.afid AS afid, 
	rl.serialno AS serialno, 
	rl.txndate AS txndate, 
	rl.paidby AS payer, 
	ri.fundname AS fundname, 
	ri.accttitle AS particulars, 
	CASE WHEN rl.voided = 0 THEN ri.amount ELSE 0.0 END AS amount 
FROM receiptlist rl, receiptitem ri, af af 
WHERE rl.objid = ri.receiptid 
	AND rl.remittanceid = $P{remittanceid} 
	AND ri.fundid = $P{fundid} 
	AND rl.afid = af.objid 
	AND af.aftype = 'serial' 
ORDER BY rl.afid, rl.serialno, ri.accttitle

[getNonSerialReceiptDetailsByAllFund]
SELECT 
	rl.afid AS afid, 
	rl.serialno AS serialno, 
	rl.txndate AS txndate, 
	rl.paidby AS payer, 
	ri.fundname AS fundname, 
	ri.accttitle AS particulars, 
	ri.amount AS amount 
FROM receiptlist rl, receiptitem ri, af af 
WHERE rl.objid = ri.receiptid 
	AND rl.remittanceid = $P{remittanceid} 
	AND rl.afid = af.objid 
	AND af.aftype = 'serial' 
ORDER BY rl.afid, rl.serialno, ri.accttitle

[getNonSerialReceiptDetailsByFund]
SELECT 
	rl.afid AS afid, 
	rl.serialno AS serialno, 
	rl.txndate AS txndate, 
	rl.paidby AS payer, 
	ri.fundname AS fundname, 
	ri.accttitle AS particulars, 
	ri.amount AS amount 
FROM receiptlist rl, receiptitem ri, af af 
WHERE rl.objid = ri.receiptid 
	AND rl.remittanceid = $P{remittanceid} 
	AND ri.fundid = $P{fundid} 
	AND rl.afid = af.objid 
	AND af.aftype = 'serial' 
ORDER BY rl.afid, rl.serialno, ri.accttitle


 

[updateAfControlForRemittance]
UPDATE afcontrol SET 
	beginseries = currentseries, 
	beginqty = balance, 
	qtyissued = 0, 
	issuedfrom = 0, 
	issuedto = 0 
WHERE collectorid = $P{collectorid}

[updateAFInventoryCreditInfo]
UPDATE afinventorycredit c, afcontrol af SET 
    c.qtyissued = c.qtyissued + $P{qtyissued}, 
	c.balance = c.balance - $P{qtyissued},
	c.docstate = CASE WHEN c.balance - $P{qtyissued} = 0 THEN 'CLOSED' ELSE 'OPEN' end 
WHERE c.objid = af.afinventorycreditid 
  AND af.objid = $P{afcontrolid} 
 

[closeAfControl]
UPDATE afcontrol SET 
	docstate = 'CLOSED' 
WHERE balance = 0 
  AND docstate = 'APPROVED' 
  AND collectorid = $P{collectorid} 

[closeReceiptForRemittance]
UPDATE receipt SET 
	docstate = 'CLOSED', 
	remittanceid = $P{remittanceid}, 
	remittanceno = $P{remittanceno}, 
	remittancedate = $P{remittancedate} 
WHERE collectorid = $P{collectorid} 
  AND docstate = 'OPEN' 
  
[closeReceiptListForRemittance]
UPDATE receiptlist SET 
	docstate = 'CLOSED', 
	remittanceid = $P{remittanceid}, 
	remittanceno = $P{remittanceno}, 
	remittancedate = $P{remittancedate}
WHERE collectorid = $P{collectorid} 
  AND docstate = 'OPEN' 
 

[getCollectionType] 
SELECT 
	afid, stubno, 
	MIN(serialno) AS fromserialno, 
	MAX(serialno) AS toserialno, 
	SUM(CASE WHEN voided =0 THEN amount ELSE 0 END ) AS amount 
FROM receiptlist 
WHERE remittanceid = $P{remittanceid} 
GROUP BY afid, stubno 

[fetchOtherPayments]
SELECT  
 rl.objid, rl.remittanceid, 
 i.receiptid, i.paytype, i.particulars, i.amount 
FROM receiptlist rl 
INNER JOIN paymentitem i ON i.receiptid = rl.objid 
WHERE rl.remittanceid = $P{objid} 
 AND rl.voided = 0 
 AND paytype = 'CHECK' 
 
 
