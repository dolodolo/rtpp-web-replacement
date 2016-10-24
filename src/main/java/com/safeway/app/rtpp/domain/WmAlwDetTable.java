package com.safeway.app.rtpp.domain;

import java.math.BigDecimal;
import java.sql.Date;

public class WmAlwDetTable {

	private int resDivision;
	private int vendor;
	private int log;
	private int whse;
	private int item;
	private String pack;
	private String packSize;
	private BigDecimal upc;
	private String alternateFlag;
	private int alternateWhse;
	private int alternateItem;
	private Date nextDealDate;
	private String activeFlag;
	private String itemDescription;
	private String centsOff;
	private int freeDistr;
	private int maximumCases;
	private int performInterval;
	private Date creationDate;
	private String creationUserid;
	private Date lastFmDate;
	private String userid;
	private int displayCases;
	private BigDecimal displayDays;
	private BigDecimal reductionDays;
	private int storeDistCases;
	private int totalDistCases;
	private BigDecimal fltSel;
	private BigDecimal mscSel;
	private BigDecimal fltMscSelAdvert;
	private BigDecimal fltMscSelStores;
	private String bbOverride;
	private BigDecimal fltMscInv;
	private BigDecimal fltMscInvAdvert;
	private BigDecimal fltMscInvStores;
	private BigDecimal fltMscInvLast;
	private Date fltMscInvDate;
	private BigDecimal recInv;
	private BigDecimal recInvAdvert;
	private BigDecimal recInvStores;
	private BigDecimal recInvLast;
	private Date recInvLastDate;
	private int estimatedSales;
	private Date buyPlanEnterDte;
	private String accountingEntity;
	private int vendorSystem;
	private int costArea;
	private int itemSystem;
	private int itemSuffix;
	private String ogNbr;
	private String corp;
	private String division;
	private String facility;
	private BigDecimal corpItemCd;
	private String vendNum;
	private String vendSubAcnt;
	private String wimsSubVend;
	private int spOrderUsed;
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
    
    public int getWhse() {
        return this.whse;
    }
    
    public void setWhse(int whse) {
        this.whse = whse;
    }
    
    public int getItem() {
        return this.item;
    }
    
    public void setItem(int item) {
        this.item = item;
    }
    
    public String getPack() {
        return this.pack;
    }
    
    public void setPack(String pack) {
        this.pack = pack;
    }
    
    public String getPackSize() {
        return this.packSize;
    }
    
    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }
    
    public BigDecimal getUpc() {
        return this.upc;
    }
    
    public void setUpc(BigDecimal upc) {
        this.upc = upc;
    }
    
    public String getAlternateFlag() {
        return this.alternateFlag;
    }
    
    public void setAlternateFlag(String alternateFlag) {
        this.alternateFlag = alternateFlag;
    }
    
    public int getAlternateWhse() {
        return this.alternateWhse;
    }
    
    public void setAlternateWhse(int alternateWhse) {
        this.alternateWhse = alternateWhse;
    }
    
    public int getAlternateItem() {
        return this.alternateItem;
    }
    
    public void setAlternateItem(int alternateItem) {
        this.alternateItem = alternateItem;
    }
    
    public Date getNextDealDate() {
        return this.nextDealDate;
    }
    
    public void setNextDealDate(Date nextDealDate) {
        this.nextDealDate = nextDealDate;
    }
    
    public String getActiveFlag() {
        return this.activeFlag;
    }
    
    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }
    
    public String getItemDescription() {
        return this.itemDescription;
    }
    
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    
    public String getCentsOff() {
        return this.centsOff;
    }
    
    public void setCentsOff(String centsOff) {
        this.centsOff = centsOff;
    }
    
    public int getFreeDistr() {
        return this.freeDistr;
    }
    
    public void setFreeDistr(int freeDistr) {
        this.freeDistr = freeDistr;
    }
    
    public int getMaximumCases() {
        return this.maximumCases;
    }
    
    public void setMaximumCases(int maximumCases) {
        this.maximumCases = maximumCases;
    }
    
    public int getPerformInterval() {
        return this.performInterval;
    }
    
    public void setPerformInterval(int performInterval) {
        this.performInterval = performInterval;
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
    
    public int getDisplayCases() {
        return this.displayCases;
    }
    
    public void setDisplayCases(int displayCases) {
        this.displayCases = displayCases;
    }
    
    public BigDecimal getDisplayDays() {
        return this.displayDays;
    }
    
    public void setDisplayDays(BigDecimal displayDays) {
        this.displayDays = displayDays;
    }
    
    public BigDecimal getReductionDays() {
        return this.reductionDays;
    }
    
    public void setReductionDays(BigDecimal reductionDays) {
        this.reductionDays = reductionDays;
    }
    
    public int getStoreDistCases() {
        return this.storeDistCases;
    }
    
    public void setStoreDistCases(int storeDistCases) {
        this.storeDistCases = storeDistCases;
    }
    
    public int getTotalDistCases() {
        return this.totalDistCases;
    }
    
    public void setTotalDistCases(int totalDistCases) {
        this.totalDistCases = totalDistCases;
    }
    
    public BigDecimal getFltSel() {
        return this.fltSel;
    }
    
    public void setFltSel(BigDecimal fltSel) {
        this.fltSel = fltSel;
    }
    
    public BigDecimal getMscSel() {
        return this.mscSel;
    }
    
    public void setMscSel(BigDecimal mscSel) {
        this.mscSel = mscSel;
    }
    
    public BigDecimal getFltMscSelAdvert() {
        return this.fltMscSelAdvert;
    }
    
    public void setFltMscSelAdvert(BigDecimal fltMscSelAdvert) {
        this.fltMscSelAdvert = fltMscSelAdvert;
    }
    
    public BigDecimal getFltMscSelStores() {
        return this.fltMscSelStores;
    }
    
    public void setFltMscSelStores(BigDecimal fltMscSelStores) {
        this.fltMscSelStores = fltMscSelStores;
    }
    
    public String getBbOverride() {
        return this.bbOverride;
    }
    
    public void setBbOverride(String bbOverride) {
        this.bbOverride = bbOverride;
    }
    
    public BigDecimal getFltMscInv() {
        return this.fltMscInv;
    }
    
    public void setFltMscInv(BigDecimal fltMscInv) {
        this.fltMscInv = fltMscInv;
    }
    
    public BigDecimal getFltMscInvAdvert() {
        return this.fltMscInvAdvert;
    }
    
    public void setFltMscInvAdvert(BigDecimal fltMscInvAdvert) {
        this.fltMscInvAdvert = fltMscInvAdvert;
    }
    
    public BigDecimal getFltMscInvStores() {
        return this.fltMscInvStores;
    }
    
    public void setFltMscInvStores(BigDecimal fltMscInvStores) {
        this.fltMscInvStores = fltMscInvStores;
    }
    
    public BigDecimal getFltMscInvLast() {
        return this.fltMscInvLast;
    }
    
    public void setFltMscInvLast(BigDecimal fltMscInvLast) {
        this.fltMscInvLast = fltMscInvLast;
    }
    
    public Date getFltMscInvDate() {
        return this.fltMscInvDate;
    }
    
    public void setFltMscInvDate(Date fltMscInvDate) {
        this.fltMscInvDate = fltMscInvDate;
    }
    
    public BigDecimal getRecInv() {
        return this.recInv;
    }
    
    public void setRecInv(BigDecimal recInv) {
        this.recInv = recInv;
    }
    
    public BigDecimal getRecInvAdvert() {
        return this.recInvAdvert;
    }
    
    public void setRecInvAdvert(BigDecimal recInvAdvert) {
        this.recInvAdvert = recInvAdvert;
    }
    
    public BigDecimal getRecInvStores() {
        return this.recInvStores;
    }
    
    public void setRecInvStores(BigDecimal recInvStores) {
        this.recInvStores = recInvStores;
    }
    
    public BigDecimal getRecInvLast() {
        return this.recInvLast;
    }
    
    public void setRecInvLast(BigDecimal recInvLast) {
        this.recInvLast = recInvLast;
    }
    
    public Date getRecInvLastDate() {
        return this.recInvLastDate;
    }
    
    public void setRecInvLastDate(Date recInvLastDate) {
        this.recInvLastDate = recInvLastDate;
    }
    
    public int getEstimatedSales() {
        return this.estimatedSales;
    }
    
    public void setEstimatedSales(int estimatedSales) {
        this.estimatedSales = estimatedSales;
    }
    
    public Date getBuyPlanEnterDte() {
        return this.buyPlanEnterDte;
    }
    
    public void setBuyPlanEnterDte(Date buyPlanEnterDte) {
        this.buyPlanEnterDte = buyPlanEnterDte;
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
    
    public int getItemSystem() {
        return this.itemSystem;
    }
    
    public void setItemSystem(int itemSystem) {
        this.itemSystem = itemSystem;
    }
    
    public int getItemSuffix() {
        return this.itemSuffix;
    }
    
    public void setItemSuffix(int itemSuffix) {
        this.itemSuffix = itemSuffix;
    }
    
    public String getOgNbr() {
        return this.ogNbr;
    }
    
    public void setOgNbr(String ogNbr) {
        this.ogNbr = ogNbr;
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
    
    public String getFacility() {
        return this.facility;
    }
    
    public void setFacility(String facility) {
        this.facility = facility;
    }
    
    public BigDecimal getCorpItemCd() {
        return this.corpItemCd;
    }
    
    public void setCorpItemCd(BigDecimal corpItemCd) {
        this.corpItemCd = corpItemCd;
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
    
    public int getSpOrderUsed() {
        return this.spOrderUsed;
    }
    
    public void setSpOrderUsed(int spOrderUsed) {
        this.spOrderUsed = spOrderUsed;
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
