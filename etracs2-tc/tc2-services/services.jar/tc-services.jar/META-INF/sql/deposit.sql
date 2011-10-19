[getList]
SELECT objid, docstate, txnno, txndate, depositedbyname, depositedbytitle, cash, noncash, amount 
FROM deposit 
ORDER BY txnno  

[getListByTxnno]
SELECT objid, docstate, txnno, txndate, depositedbyname, depositedbytitle, cash, noncash, amount 
FROM deposit 
WHERE txnno = $P{txnno} 
ORDER BY txnno  

[getListByDepositor]
SELECT objid, docstate, txnno, txndate, depositedbyname, depositedbytitle, cash, noncash, amount 
FROM deposit 
WHERE depositedbyname LIKE $P{depositedbyname}  
ORDER BY txnno  

[getState]
SELECT docstate FROM deposit WHERE objid = $P{objid} 

[getOpenLiquidations] 
SELECT 
	objid, txnno, txndate, amount, 
	liquidatingofficerid, liquidatingofficername, liquidatingofficertitle 
FROM liquidationlist 
WHERE docstate = 'OPEN'  

[getOpenFundSummaries]
SELECT 
	ri.fundid, ri.fundname, 
	ba.objid AS bankacctid, 
	ba.acctno AS bankacctno,
	ba.bankcode, bankacctname, 
	ba.bankname, 
	ba.branchname, 
	ba.accttype,
	SUM( ri.amount ) AS cash,  
	0.0 AS noncash, 
	SUM( ri.amount ) AS amount 
FROM liquidationlist lq, remittancelist rem, receiptlist r, receiptitem ri, bankaccount ba, fund f 
WHERE lq.objid = rem.liquidationid 
  AND rem.objid = r.remittanceid  
  AND r.objid = ri.receiptid  
  AND ri.fundid = ba.fundid  
  AND ri.fundid = f.objid  
  AND lq.docstate = 'OPEN' 
  AND r.voided = 0 
GROUP BY ri.fundid, ba.objid, ba.bankcode, ba.bankname, ba.branchname 

[getOpenFundTotals]
SELECT 
	ri.fundid, 
	ri.fundname, 
	SUM( ri.amount ) AS amount,  
	0.0 AS amtdeposited 
FROM liquidationlist lq, remittancelist rem, receiptlist r, receiptitem ri 
WHERE lq.objid = rem.liquidationid 
  AND rem.objid = r.remittanceid  
  AND r.objid = ri.receiptid  
  AND lq.docstate = 'OPEN' 
  AND r.voided = 0 
GROUP BY ri.fundid, ri.fundname 


[getOpenNonCashPayments]
SELECT 
	p.objid AS paymentitemid, 
	p.paytype, 
	p.particulars, 
	p.amount, 
	'SYSTEM' AS source, 
	p.extended 
FROM liquidationlist l, remittancelist rem, receipt r, paymentitem p 
WHERE l.objid = rem.liquidationid 
  AND rem.objid = r.remittanceid  
  AND r.objid = p.receiptid  
  AND l.docstate = 'OPEN'  
  AND p.paytype <> 'CASH'  
  AND r.voided = 0 
ORDER BY paytype, particulars  

[depositOpenLiquidation]
UPDATE liquidation SET 
	docstate  = 'CLOSED', 
	depositid = $P{depositid},
	dtdeposited = $P{dtdeposited}  
WHERE docstate = 'OPEN'	 

[depositOpenLiquidationList]
UPDATE liquidationlist SET 
	docstate  = 'CLOSED', 
	depositid = $P{depositid}, 
	dtdeposited = $P{dtdeposited} 
WHERE docstate = 'OPEN'	 


[getBankAccountList]
SELECT * FROM bankaccount WHERE fundid = $P{fundid} ORDER BY fund, acctno 

[getCollectionSummaryByAFAndFund]
SELECT 
	CASE WHEN af.aftype = 'serial' 
		THEN CONCAT( 'AF#', rct.afid, ': ', af.description, ' - ', ri.fundname)  
		ELSE CONCAT( rct.afid, ': ', af.description, ' - ', ri.fundname )  
	END AS particulars,  
	SUM( ri.amount ) AS  amount   
FROM deposit d  
	INNER JOIN liquidationlist lq on d.objid = lq.depositid  
	INNER JOIN remittancelist rem on lq.objid = rem.liquidationid   
	INNER JOIN receiptlist rct on rem.objid = rct.remittanceid   
	INNER JOIN af af ON rct.afid = af.objid  	 
	INNER JOIN receiptitem ri  on rct.objid = ri.receiptid   
	INNER JOIN fund f on ri.fundid = f.objid  
WHERE d.objid = $P{depositid} 
  AND rct.voided = 0    
  AND f.fund LIKE $P{fund} 
GROUP BY rct.afid, ri.fundname   





[getFundList] 
SELECT distinct fund FROM fund o  