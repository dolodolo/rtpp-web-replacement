package com.safeway.app.rtpp.domain;

import java.math.BigDecimal;
import java.sql.Date;

public class WmAlwHedTable 
{
	private int resDivision;
	private int vendor;
	private int log;
	private int merchandiser;
	private String allowanceSource;
	private String vendorName;
	private String billingName;
	private String billingAddress1;
	private String billingAddress2;
	private String billingAddress3;
	private String vendorPhone;
	private String accRecNumber;
	private String accRecNumber2;
	private String vendorPhoneIn;
	private String groupIndicator;
	private Date orderFromDate;
	private Date orderToDate;
	private Date shipFromDate;
	private Date shipToDate;
	private Date arrivalFromDate;
	private Date arrivalToDate;
	private Date nextDealDate;
	private String offerNumber;
	private int specifiedOrders;
	private BigDecimal cashDiscntPctg;
	private int cashDiscntDays;
	private int netDays;
	private Date performFromDate;
	private Date performToDate;
	private Date countDate;
	private Date recountDate;
	private String investOverride;
	private int protectDays;
	private Date supportFromDate;
	private Date supportToDate;
	private Date creationDate;
	private String creationUserid;
	private Date lastFmDate;
	private String userid;
	private String orderFromFlag;
	private String orderToFlag;
	private String shipFromFlag;
	private String shipToFlag;
	private String arrivalFromFlag;
	private String arrivalToFlag;
	private Date doNotPrintDate;
	private Date billbackDate;
	private Date bbOverrideDate;
	private String tearSheet;
	private String percentCalc;
	private String autoContinue;
	private String bbOverride;
	private String mail;
	private String protectCode1;
	private String protectCode2;
	private String protectCode3;
	private String protectCode4;
	private String supportCode1;
	private String supportCode2;
	private String supportCode3;
	private String supportCode4;
	private String supportCode5;
	private String supportCode6;
	private String supportCode7;
	private String supportCode8;
	private String supportCode9;
	private String supportCode10;
	private BigDecimal flatAmount;
	private int flatOrderMin;
	private Date flatBillbackDate;
	private String flatAccRej;
	private String flatPerform1;
	private String flatPerform2;
	private String flatPerform3;
	private String flatPerform4;
	private BigDecimal fltSel;
	private BigDecimal fltSelAdvert;
	private BigDecimal fltSelStores;
	private BigDecimal fltInv;
	private BigDecimal fltInvAdvert;
	private BigDecimal fltInvStores;
	private BigDecimal fltInvLast;
	private Date fltInvLastDate;
	private BigDecimal totInv;
	private BigDecimal totInvAdvert;
	private BigDecimal totInvStores;
	private BigDecimal totInvLast;
	private Date totInvLastDate;
	private String accountingEntity;
	private int vendorSystem;
	private int costArea;
	private String corp;
	private String division;
	private String vendNum;
	private String vendSubAcnt;
	private String wimsSubVend;
	private String comments;
	private String invoiceComments;
	
	public int getResDivision() {
        return this.resDivision;
    }
    
    public void setResDivision(int resDivision) {
        this.resDivision = resDivision;
    }
    
    public int getVendor() {
        return this.vendor;
    }
    
    public void setVendor(int vendor) {
        this.vendor = vendor;
    }
    
    public int getLog() {
        return this.log;
    }
    
    public void setLog(int log) {
        this.log = log;
    }
    
    public int getMerchandiser() {
        return this.merchandiser;
    }
    
    public void setMerchandiser(int merchandiser) {
        this.merchandiser = merchandiser;
    }
    
    public String getAllowanceSource() {
        return this.allowanceSource;
    }
    
    public void setAllowanceSource(String allowanceSource) {
        this.allowanceSource = allowanceSource;
    }
    
    public String getVendorName() {
        return this.vendorName;
    }
    
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    
    public String getBillingName() {
        return this.billingName;
    }
    
    public void setBillingName(String billingName) {
        this.billingName = billingName;
    }
    
    public String getBillingAddress1() {
        return this.billingAddress1;
    }
    
    public void setBillingAddress1(String billingAddress1) {
        this.billingAddress1 = billingAddress1;
    }
    
    public String getBillingAddress2() {
        return this.billingAddress2;
    }
    
    public void setBillingAddress2(String billingAddress2) {
        this.billingAddress2 = billingAddress2;
    }
    
    public String getBillingAddress3() {
        return this.billingAddress3;
    }
    
    public void setBillingAddress3(String billingAddress3) {
        this.billingAddress3 = billingAddress3;
    }
    
    public String getVendorPhone() {
        return this.vendorPhone;
    }
    
    public void setVendorPhone(String vendorPhone) {
        this.vendorPhone = vendorPhone;
    }
    
    public String getAccRecNumber() {
        return this.accRecNumber;
    }
    
    public void setAccRecNumber(String accRecNumber) {
        this.accRecNumber = accRecNumber;
    }
    
    public String getAccRecNumber2() {
        return this.accRecNumber2;
    }
    
    public void setAccRecNumber2(String accRecNumber2) {
        this.accRecNumber2 = accRecNumber2;
    }
    
    public String getVendorPhoneIn() {
        return this.vendorPhoneIn;
    }
    
    public void setVendorPhoneIn(String vendorPhoneIn) {
        this.vendorPhoneIn = vendorPhoneIn;
    }
    
    public String getGroupIndicator() {
        return this.groupIndicator;
    }
    
    public void setGroupIndicator(String groupIndicator) {
        this.groupIndicator = groupIndicator;
    }
    
    public Date getOrderFromDate() {
        return this.orderFromDate;
    }
    
    public void setOrderFromDate(Date orderFromDate) {
        this.orderFromDate = orderFromDate;
    }
    
    public Date getOrderToDate() {
        return this.orderToDate;
    }
    
    public void setOrderToDate(Date orderToDate) {
        this.orderToDate = orderToDate;
    }
    
    public Date getShipFromDate() {
        return this.shipFromDate;
    }
    
    public void setShipFromDate(Date shipFromDate) {
        this.shipFromDate = shipFromDate;
    }
    
    public Date getShipToDate() {
        return this.shipToDate;
    }
    
    public void setShipToDate(Date shipToDate) {
        this.shipToDate = shipToDate;
    }
    
    public Date getArrivalFromDate() {
        return this.arrivalFromDate;
    }
    
    public void setArrivalFromDate(Date arrivalFromDate) {
        this.arrivalFromDate = arrivalFromDate;
    }
    
    public Date getArrivalToDate() {
        return this.arrivalToDate;
    }
    
    public void setArrivalToDate(Date arrivalToDate) {
        this.arrivalToDate = arrivalToDate;
    }
    
    public Date getNextDealDate() {
        return this.nextDealDate;
    }
    
    public void setNextDealDate(Date nextDealDate) {
        this.nextDealDate = nextDealDate;
    }
    
    public String getOfferNumber() {
        return this.offerNumber;
    }
    
    public void setOfferNumber(String offerNumber) {
        this.offerNumber = offerNumber;
    }
    
    public int getSpecifiedOrders() {
        return this.specifiedOrders;
    }
    
    public void setSpecifiedOrders(int specifiedOrders) {
        this.specifiedOrders = specifiedOrders;
    }
    
    public BigDecimal getCashDiscntPctg() {
        return this.cashDiscntPctg;
    }
    
    public void setCashDiscntPctg(BigDecimal cashDiscntPctg) {
        this.cashDiscntPctg = cashDiscntPctg;
    }
    
    public int getCashDiscntDays() {
        return this.cashDiscntDays;
    }
    
    public void setCashDiscntDays(int cashDiscntDays) {
        this.cashDiscntDays = cashDiscntDays;
    }
    
    public int getNetDays() {
        return this.netDays;
    }
    
    public void setNetDays(int netDays) {
        this.netDays = netDays;
    }
    
    public Date getPerformFromDate() {
        return this.performFromDate;
    }
    
    public void setPerformFromDate(Date performFromDate) {
        this.performFromDate = performFromDate;
    }
    
    public Date getPerformToDate() {
        return this.performToDate;
    }
    
    public void setPerformToDate(Date performToDate) {
        this.performToDate = performToDate;
    }
    
    public Date getCountDate() {
        return this.countDate;
    }
    
    public void setCountDate(Date countDate) {
        this.countDate = countDate;
    }
    
    public Date getRecountDate() {
        return this.recountDate;
    }
    
    public void setRecountDate(Date recountDate) {
        this.recountDate = recountDate;
    }
    
    public String getInvestOverride() {
        return this.investOverride;
    }
    
    public void setInvestOverride(String investOverride) {
        this.investOverride = investOverride;
    }
    
    public int getProtectDays() {
        return this.protectDays;
    }
    
    public void setProtectDays(int protectDays) {
        this.protectDays = protectDays;
    }
    
    public Date getSupportFromDate() {
        return this.supportFromDate;
    }
    
    public void setSupportFromDate(Date supportFromDate) {
        this.supportFromDate = supportFromDate;
    }
    
    public Date getSupportToDate() {
        return this.supportToDate;
    }
    
    public void setSupportToDate(Date supportToDate) {
        this.supportToDate = supportToDate;
    }
    
    public Date getCreationDate() {
        return this.creationDate;
    }
    
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
    
    public String getCreationUserid() {
        return this.creationUserid;
    }
    
    public void setCreationUserid(String creationUserid) {
        this.creationUserid = creationUserid;
    }
    
    public Date getLastFmDate() {
        return this.lastFmDate;
    }
    
    public void setLastFmDate(Date lastFmDate) {
        this.lastFmDate = lastFmDate;
    }
    
    public String getUserid() {
        return this.userid;
    }
    
    public void setUserid(String userid) {
        this.userid = userid;
    }
    
    public String getOrderFromFlag() {
        return this.orderFromFlag;
    }
    
    public void setOrderFromFlag(String orderFromFlag) {
        this.orderFromFlag = orderFromFlag;
    }
    
    public String getOrderToFlag() {
        return this.orderToFlag;
    }
    
    public void setOrderToFlag(String orderToFlag) {
        this.orderToFlag = orderToFlag;
    }
    
    public String getShipFromFlag() {
        return this.shipFromFlag;
    }
    
    public void setShipFromFlag(String shipFromFlag) {
        this.shipFromFlag = shipFromFlag;
    }
    
    public String getShipToFlag() {
        return this.shipToFlag;
    }
    
    public void setShipToFlag(String shipToFlag) {
        this.shipToFlag = shipToFlag;
    }
    
    public String getArrivalFromFlag() {
        return this.arrivalFromFlag;
    }
    
    public void setArrivalFromFlag(String arrivalFromFlag) {
        this.arrivalFromFlag = arrivalFromFlag;
    }
    
    public String getArrivalToFlag() {
        return this.arrivalToFlag;
    }
    
    public void setArrivalToFlag(String arrivalToFlag) {
        this.arrivalToFlag = arrivalToFlag;
    }
    
    public Date getDoNotPrintDate() {
        return this.doNotPrintDate;
    }
    
    public void setDoNotPrintDate(Date doNotPrintDate) {
        this.doNotPrintDate = doNotPrintDate;
    }
    
    public Date getBillbackDate() {
        return this.billbackDate;
    }
    
    public void setBillbackDate(Date billbackDate) {
        this.billbackDate = billbackDate;
    }
    
    public Date getBbOverrideDate() {
        return this.bbOverrideDate;
    }
    
    public void setBbOverrideDate(Date bbOverrideDate) {
        this.bbOverrideDate = bbOverrideDate;
    }
    
    public String getTearSheet() {
        return this.tearSheet;
    }
    
    public void setTearSheet(String tearSheet) {
        this.tearSheet = tearSheet;
    }
    
    public String getPercentCalc() {
        return this.percentCalc;
    }
    
    public void setPercentCalc(String percentCalc) {
        this.percentCalc = percentCalc;
    }
    
    public String getAutoContinue() {
        return this.autoContinue;
    }
    
    public void setAutoContinue(String autoContinue) {
        this.autoContinue = autoContinue;
    }
    
    public String getBbOverride() {
        return this.bbOverride;
    }
    
    public void setBbOverride(String bbOverride) {
        this.bbOverride = bbOverride;
    }
    
    public String getMail() {
        return this.mail;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    
    public String getProtectCode1() {
        return this.protectCode1;
    }
    
    public void setProtectCode1(String protectCode1) {
        this.protectCode1 = protectCode1;
    }
    
    public String getProtectCode2() {
        return this.protectCode2;
    }
    
    public void setProtectCode2(String protectCode2) {
        this.protectCode2 = protectCode2;
    }
    
    public String getProtectCode3() {
        return this.protectCode3;
    }
    
    public void setProtectCode3(String protectCode3) {
        this.protectCode3 = protectCode3;
    }
    
    public String getProtectCode4() {
        return this.protectCode4;
    }
    
    public void setProtectCode4(String protectCode4) {
        this.protectCode4 = protectCode4;
    }
    
    public String getSupportCode1() {
        return this.supportCode1;
    }
    
    public void setSupportCode1(String supportCode1) {
        this.supportCode1 = supportCode1;
    }
    
    public String getSupportCode2() {
        return this.supportCode2;
    }
    
    public void setSupportCode2(String supportCode2) {
        this.supportCode2 = supportCode2;
    }
    
    public String getSupportCode3() {
        return this.supportCode3;
    }
    
    public void setSupportCode3(String supportCode3) {
        this.supportCode3 = supportCode3;
    }
    
    public String getSupportCode4() {
        return this.supportCode4;
    }
    
    public void setSupportCode4(String supportCode4) {
        this.supportCode4 = supportCode4;
    }
    
    public String getSupportCode5() {
        return this.supportCode5;
    }
    
    public void setSupportCode5(String supportCode5) {
        this.supportCode5 = supportCode5;
    }
    
    public String getSupportCode6() {
        return this.supportCode6;
    }
    
    public void setSupportCode6(String supportCode6) {
        this.supportCode6 = supportCode6;
    }
    
    public String getSupportCode7() {
        return this.supportCode7;
    }
    
    public void setSupportCode7(String supportCode7) {
        this.supportCode7 = supportCode7;
    }
    
    public String getSupportCode8() {
        return this.supportCode8;
    }
    
    public void setSupportCode8(String supportCode8) {
        this.supportCode8 = supportCode8;
    }
    
    public String getSupportCode9() {
        return this.supportCode9;
    }
    
    public void setSupportCode9(String supportCode9) {
        this.supportCode9 = supportCode9;
    }
    
    public String getSupportCode10() {
        return this.supportCode10;
    }
    
    public void setSupportCode10(String supportCode10) {
        this.supportCode10 = supportCode10;
    }
    
    public BigDecimal getFlatAmount() {
        return this.flatAmount;
    }
    
    public void setFlatAmount(BigDecimal flatAmount) {
        this.flatAmount = flatAmount;
    }
    
    public int getFlatOrderMin() {
        return this.flatOrderMin;
    }
    
    public void setFlatOrderMin(int flatOrderMin) {
        this.flatOrderMin = flatOrderMin;
    }
    
    public Date getFlatBillbackDate() {
        return this.flatBillbackDate;
    }
    
    public void setFlatBillbackDate(Date flatBillbackDate) {
        this.flatBillbackDate = flatBillbackDate;
    }
    
    public String getFlatAccRej() {
        return this.flatAccRej;
    }
    
    public void setFlatAccRej(String flatAccRej) {
        this.flatAccRej = flatAccRej;
    }
    
    public String getFlatPerform1() {
        return this.flatPerform1;
    }
    
    public void setFlatPerform1(String flatPerform1) {
        this.flatPerform1 = flatPerform1;
    }
    
    public String getFlatPerform2() {
        return this.flatPerform2;
    }
    
    public void setFlatPerform2(String flatPerform2) {
        this.flatPerform2 = flatPerform2;
    }
    
    public String getFlatPerform3() {
        return this.flatPerform3;
    }
    
    public void setFlatPerform3(String flatPerform3) {
        this.flatPerform3 = flatPerform3;
    }
    
    public String getFlatPerform4() {
        return this.flatPerform4;
    }
    
    public void setFlatPerform4(String flatPerform4) {
        this.flatPerform4 = flatPerform4;
    }
    
    public BigDecimal getFltSel() {
        return this.fltSel;
    }
    
    public void setFltSel(BigDecimal fltSel) {
        this.fltSel = fltSel;
    }
    
    public BigDecimal getFltSelAdvert() {
        return this.fltSelAdvert;
    }
    
    public void setFltSelAdvert(BigDecimal fltSelAdvert) {
        this.fltSelAdvert = fltSelAdvert;
    }
    
    public BigDecimal getFltSelStores() {
        return this.fltSelStores;
    }
    
    public void setFltSelStores(BigDecimal fltSelStores) {
        this.fltSelStores = fltSelStores;
    }
    
    public BigDecimal getFltInv() {
        return this.fltInv;
    }
    
    public void setFltInv(BigDecimal fltInv) {
        this.fltInv = fltInv;
    }
    
    public BigDecimal getFltInvAdvert() {
        return this.fltInvAdvert;
    }
    
    public void setFltInvAdvert(BigDecimal fltInvAdvert) {
        this.fltInvAdvert = fltInvAdvert;
    }
    
    public BigDecimal getFltInvStores() {
        return this.fltInvStores;
    }
    
    public void setFltInvStores(BigDecimal fltInvStores) {
        this.fltInvStores = fltInvStores;
    }
    
    public BigDecimal getFltInvLast() {
        return this.fltInvLast;
    }
    
    public void setFltInvLast(BigDecimal fltInvLast) {
        this.fltInvLast = fltInvLast;
    }
    
    public Date getFltInvLastDate() {
        return this.fltInvLastDate;
    }
    
    public void setFltInvLastDate(Date fltInvLastDate) {
        this.fltInvLastDate = fltInvLastDate;
    }
    
    public BigDecimal getTotInv() {
        return this.totInv;
    }
    
    public void setTotInv(BigDecimal totInv) {
        this.totInv = totInv;
    }
    
    public BigDecimal getTotInvAdvert() {
        return this.totInvAdvert;
    }
    
    public void setTotInvAdvert(BigDecimal totInvAdvert) {
        this.totInvAdvert = totInvAdvert;
    }
    
    public BigDecimal getTotInvStores() {
        return this.totInvStores;
    }
    
    public void setTotInvStores(BigDecimal totInvStores) {
        this.totInvStores = totInvStores;
    }
    
    public BigDecimal getTotInvLast() {
        return this.totInvLast;
    }
    
    public void setTotInvLast(BigDecimal totInvLast) {
        this.totInvLast = totInvLast;
    }
    
    public Date getTotInvLastDate() {
        return this.totInvLastDate;
    }
    
    public void setTotInvLastDate(Date totInvLastDate) {
        this.totInvLastDate = totInvLastDate;
    }
    
    public String getAccountingEntity() {
        return this.accountingEntity;
    }
    
    public void setAccountingEntity(String accountingEntity) {
        this.accountingEntity = accountingEntity;
    }
    
    public int getVendorSystem() {
        return this.vendorSystem;
    }
    
    public void setVendorSystem(int vendorSystem) {
        this.vendorSystem = vendorSystem;
    }
    
    public int getCostArea() {
        return this.costArea;
    }
    
    public void setCostArea(int costArea) {
        this.costArea = costArea;
    }
    
    public String getCorp() {
        return this.corp;
    }
    
    public void setCorp(String corp) {
        this.corp = corp;
    }
    
    public String getDivision() {
        return this.division;
    }
    
    public void setDivision(String division) {
        this.division = division;
    }
    
    public String getVendNum() {
        return this.vendNum;
    }
    
    public void setVendNum(String vendNum) {
        this.vendNum = vendNum;
    }
    
    public String getVendSubAcnt() {
        return this.vendSubAcnt;
    }
    
    public void setVendSubAcnt(String vendSubAcnt) {
        this.vendSubAcnt = vendSubAcnt;
    }
    
    public String getWimsSubVend() {
        return this.wimsSubVend;
    }
    
    public void setWimsSubVend(String wimsSubVend) {
        this.wimsSubVend = wimsSubVend;
    }
    
    public String getComments() {
        return this.comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
    
    public String getInvoiceComments() {
        return this.invoiceComments;
    }
    
    public void setInvoiceComments(String invoiceComments) {
        this.invoiceComments = invoiceComments;
    }
}
