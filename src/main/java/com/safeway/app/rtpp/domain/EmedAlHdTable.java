package com.safeway.app.rtpp.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class EmedAlHdTable {
	
    private int edealsHeaderId;
    private String offerNbr;
    private String dealLocId;
    private String vendNbr;
    private String vendArNbr;
    private String vendAddrLine1Txt;
    private String vendAddrLine2Txt;
    private String vendApNbr;
    private String vendCityNm;
    private String vendCntryNm;
    private String vendNm;
    private String vendStateNm;
    private String vendZipCd;
    private String vendFaxNbr;
    private String vendPhnNbr;
    private String vendTrackingNbr;
    private String ctgryMgrEmailId;
    private String ctgryMgrNbr;
    private String ctgryMgrNm;
    private String manufNm;
    private String manufCityNm;
    private String manufCntryNm;
    private String manufFaxNbr;
    private String manufStateNm;
    private String manufZipCd;
    private String manufPhnNbr;
    private String manufAddrL1Txt;
    private String manufAddrL2Txt;
    private String prodCtgryCd;
    private String prodCtgryMgr;
    private String repEmailId;
    private String repNm;
    private String billToCd;
    private BigDecimal flatAlwAmt;
    private String fltAlwPindCd;
    private int extTrmsDiscDys;
    private BigDecimal extTrmsDiscPct;
    private int extTrmsNetDys;
    private int mstDealId;
    private String mstVendNm;
    private String prfrmNm;
    private int spfcOrdNbr;
    private String dealDsc;
    private String whomNbr;
    private String dealStatCd;
    private String exportActInd;
    private String overlapCalcInd;
    private String ordEdOvrdInd;
    private String ordStOvrdInd;
    private String shpEdOvrdInd;
    private String shpStOvrdInd;
    private String arvStOvrdInd;
    private String arvEdOvrdInd;
    private Date shipEndDt;
    private Date shipStartDt;
    private Date arrivalEndDt;
    private Date arrivalStartDt;
    private Date orderEndDt;
    private Date orderStartDt;
    private Timestamp dealStatDt;
    private Timestamp proccessTs;
    private Timestamp cancelTs;
    private Timestamp lastSubmitTs;
    private Timestamp lastAcceptTs;
    private Date prfrmEndDt;
    private Date prfrmStartDt;
    private Date loadDt;
    private String recentCmmtTxt;
    private String dealCmmtTxt;
    private String currentOfferInd;
    
    public int getEdealsHeaderId() {
        return this.edealsHeaderId;
    }
    
    public void setEdealsHeaderId(int edealsHeaderId) {
        this.edealsHeaderId = edealsHeaderId;
    }
    
    public String getOfferNbr() {
        return this.offerNbr;
    }
    
    public void setOfferNbr(String offerNbr) {
        this.offerNbr = offerNbr;
    }
    
    public String getDealLocId() {
        return this.dealLocId;
    }
    
    public void setDealLocId(String dealLocId) {
        this.dealLocId = dealLocId;
    }
    
    public String getVendNbr() {
        return this.vendNbr;
    }
    
    public void setVendNbr(String vendNbr) {
        this.vendNbr = vendNbr;
    }
    
    public String getVendArNbr() {
        return this.vendArNbr;
    }
    
    public void setVendArNbr(String vendArNbr) {
        this.vendArNbr = vendArNbr;
    }
    
    public String getVendAddrLine1Txt() {
        return this.vendAddrLine1Txt;
    }
    
    public void setVendAddrLine1Txt(String vendAddrLine1Txt) {
        this.vendAddrLine1Txt = vendAddrLine1Txt;
    }
    
    public String getVendAddrLine2Txt() {
        return this.vendAddrLine2Txt;
    }
    
    public void setVendAddrLine2Txt(String vendAddrLine2Txt) {
        this.vendAddrLine2Txt = vendAddrLine2Txt;
    }
    
    public String getVendApNbr() {
        return this.vendApNbr;
    }
    
    public void setVendApNbr(String vendApNbr) {
        this.vendApNbr = vendApNbr;
    }
    
    public String getVendCityNm() {
        return this.vendCityNm;
    }
    
    public void setVendCityNm(String vendCityNm) {
        this.vendCityNm = vendCityNm;
    }
    
    public String getVendCntryNm() {
        return this.vendCntryNm;
    }
    
    public void setVendCntryNm(String vendCntryNm) {
        this.vendCntryNm = vendCntryNm;
    }
    
    public String getVendNm() {
        return this.vendNm;
    }
    
    public void setVendNm(String vendNm) {
        this.vendNm = vendNm;
    }
    
    public String getVendStateNm() {
        return this.vendStateNm;
    }
    
    public void setVendStateNm(String vendStateNm) {
        this.vendStateNm = vendStateNm;
    }
    
    public String getVendZipCd() {
        return this.vendZipCd;
    }
    
    public void setVendZipCd(String vendZipCd) {
        this.vendZipCd = vendZipCd;
    }
    
    public String getVendFaxNbr() {
        return this.vendFaxNbr;
    }
    
    public void setVendFaxNbr(String vendFaxNbr) {
        this.vendFaxNbr = vendFaxNbr;
    }
    
    public String getVendPhnNbr() {
        return this.vendPhnNbr;
    }
    
    public void setVendPhnNbr(String vendPhnNbr) {
        this.vendPhnNbr = vendPhnNbr;
    }
    
    public String getVendTrackingNbr() {
        return this.vendTrackingNbr;
    }
    
    public void setVendTrackingNbr(String vendTrackingNbr) {
        this.vendTrackingNbr = vendTrackingNbr;
    }
    
    public String getCtgryMgrEmailId() {
        return this.ctgryMgrEmailId;
    }
    
    public void setCtgryMgrEmailId(String ctgryMgrEmailId) {
        this.ctgryMgrEmailId = ctgryMgrEmailId;
    }
    
    public String getCtgryMgrNbr() {
        return this.ctgryMgrNbr;
    }
    
    public void setCtgryMgrNbr(String ctgryMgrNbr) {
        this.ctgryMgrNbr = ctgryMgrNbr;
    }
    
    public String getCtgryMgrNm() {
        return this.ctgryMgrNm;
    }
    
    public void setCtgryMgrNm(String ctgryMgrNm) {
        this.ctgryMgrNm = ctgryMgrNm;
    }
    
    public String getManufNm() {
        return this.manufNm;
    }
    
    public void setManufNm(String manufNm) {
        this.manufNm = manufNm;
    }
    
    public String getManufCityNm() {
        return this.manufCityNm;
    }
    
    public void setManufCityNm(String manufCityNm) {
        this.manufCityNm = manufCityNm;
    }
    
    public String getManufCntryNm() {
        return this.manufCntryNm;
    }
    
    public void setManufCntryNm(String manufCntryNm) {
        this.manufCntryNm = manufCntryNm;
    }
    
    public String getManufFaxNbr() {
        return this.manufFaxNbr;
    }
    
    public void setManufFaxNbr(String manufFaxNbr) {
        this.manufFaxNbr = manufFaxNbr;
    }
    
    public String getManufStateNm() {
        return this.manufStateNm;
    }
    
    public void setManufStateNm(String manufStateNm) {
        this.manufStateNm = manufStateNm;
    }
    
    public String getManufZipCd() {
        return this.manufZipCd;
    }
    
    public void setManufZipCd(String manufZipCd) {
        this.manufZipCd = manufZipCd;
    }
    
    public String getManufPhnNbr() {
        return this.manufPhnNbr;
    }
    
    public void setManufPhnNbr(String manufPhnNbr) {
        this.manufPhnNbr = manufPhnNbr;
    }
    
    public String getManufAddrL1Txt() {
        return this.manufAddrL1Txt;
    }
    
    public void setManufAddrL1Txt(String manufAddrL1Txt) {
        this.manufAddrL1Txt = manufAddrL1Txt;
    }
    
    public String getManufAddrL2Txt() {
        return this.manufAddrL2Txt;
    }
    
    public void setManufAddrL2Txt(String manufAddrL2Txt) {
        this.manufAddrL2Txt = manufAddrL2Txt;
    }
    
    public String getProdCtgryCd() {
        return this.prodCtgryCd;
    }
    
    public void setProdCtgryCd(String prodCtgryCd) {
        this.prodCtgryCd = prodCtgryCd;
    }
    
    public String getProdCtgryMgr() {
        return this.prodCtgryMgr;
    }
    
    public void setProdCtgryMgr(String prodCtgryMgr) {
        this.prodCtgryMgr = prodCtgryMgr;
    }
    
    public String getRepEmailId() {
        return this.repEmailId;
    }
    
    public void setRepEmailId(String repEmailId) {
        this.repEmailId = repEmailId;
    }
    
    public String getRepNm() {
        return this.repNm;
    }
    
    public void setRepNm(String repNm) {
        this.repNm = repNm;
    }
    
    public String getBillToCd() {
        return this.billToCd;
    }
    
    public void setBillToCd(String billToCd) {
        this.billToCd = billToCd;
    }
    
    public BigDecimal getFlatAlwAmt() {
        return this.flatAlwAmt;
    }
    
    public void setFlatAlwAmt(BigDecimal flatAlwAmt) {
        this.flatAlwAmt = flatAlwAmt;
    }
    
    public String getFltAlwPindCd() {
        return this.fltAlwPindCd;
    }
    
    public void setFltAlwPindCd(String fltAlwPindCd) {
        this.fltAlwPindCd = fltAlwPindCd;
    }
    
    public int getExtTrmsDiscDys() {
        return this.extTrmsDiscDys;
    }
    
    public void setExtTrmsDiscDys(int extTrmsDiscDys) {
        this.extTrmsDiscDys = extTrmsDiscDys;
    }
    
    public BigDecimal getExtTrmsDiscPct() {
        return this.extTrmsDiscPct;
    }
    
    public void setExtTrmsDiscPct(BigDecimal extTrmsDiscPct) {
        this.extTrmsDiscPct = extTrmsDiscPct;
    }
    
    public int getExtTrmsNetDys() {
        return this.extTrmsNetDys;
    }
    
    public void setExtTrmsNetDys(int extTrmsNetDys) {
        this.extTrmsNetDys = extTrmsNetDys;
    }
    
    public int getMstDealId() {
        return this.mstDealId;
    }
    
    public void setMstDealId(int mstDealId) {
        this.mstDealId = mstDealId;
    }
    
    public String getMstVendNm() {
        return this.mstVendNm;
    }
    
    public void setMstVendNm(String mstVendNm) {
        this.mstVendNm = mstVendNm;
    }
    
    public String getPrfrmNm() {
        return this.prfrmNm;
    }
    
    public void setPrfrmNm(String prfrmNm) {
        this.prfrmNm = prfrmNm;
    }
    
    public int getSpfcOrdNbr() {
        return this.spfcOrdNbr;
    }
    
    public void setSpfcOrdNbr(int spfcOrdNbr) {
        this.spfcOrdNbr = spfcOrdNbr;
    }
    
    public String getDealDsc() {
        return this.dealDsc;
    }
    
    public void setDealDsc(String dealDsc) {
        this.dealDsc = dealDsc;
    }
    
    public String getWhomNbr() {
        return this.whomNbr;
    }
    
    public void setWhomNbr(String whomNbr) {
        this.whomNbr = whomNbr;
    }
    
    public String getDealStatCd() {
        return this.dealStatCd;
    }
    
    public void setDealStatCd(String dealStatCd) {
        this.dealStatCd = dealStatCd;
    }
    
    public String getExportActInd() {
        return this.exportActInd;
    }
    
    public void setExportActInd(String exportActInd) {
        this.exportActInd = exportActInd;
    }
    
    public String getOverlapCalcInd() {
        return this.overlapCalcInd;
    }
    
    public void setOverlapCalcInd(String overlapCalcInd) {
        this.overlapCalcInd = overlapCalcInd;
    }
    
    public String getOrdEdOvrdInd() {
        return this.ordEdOvrdInd;
    }
    
    public void setOrdEdOvrdInd(String ordEdOvrdInd) {
        this.ordEdOvrdInd = ordEdOvrdInd;
    }
    
    public String getOrdStOvrdInd() {
        return this.ordStOvrdInd;
    }
    
    public void setOrdStOvrdInd(String ordStOvrdInd) {
        this.ordStOvrdInd = ordStOvrdInd;
    }
    
    public String getShpEdOvrdInd() {
        return this.shpEdOvrdInd;
    }
    
    public void setShpEdOvrdInd(String shpEdOvrdInd) {
        this.shpEdOvrdInd = shpEdOvrdInd;
    }
    
    public String getShpStOvrdInd() {
        return this.shpStOvrdInd;
    }
    
    public void setShpStOvrdInd(String shpStOvrdInd) {
        this.shpStOvrdInd = shpStOvrdInd;
    }
    
    public String getArvStOvrdInd() {
        return this.arvStOvrdInd;
    }
    
    public void setArvStOvrdInd(String arvStOvrdInd) {
        this.arvStOvrdInd = arvStOvrdInd;
    }
    
    public String getArvEdOvrdInd() {
        return this.arvEdOvrdInd;
    }
    
    public void setArvEdOvrdInd(String arvEdOvrdInd) {
        this.arvEdOvrdInd = arvEdOvrdInd;
    }
    
    public Date getShipEndDt() {
        return this.shipEndDt;
    }
    
    public void setShipEndDt(Date shipEndDt) {
        this.shipEndDt = shipEndDt;
    }
    
    public Date getShipStartDt() {
        return this.shipStartDt;
    }
    
    public void setShipStartDt(Date shipStartDt) {
        this.shipStartDt = shipStartDt;
    }
    
    public Date getArrivalEndDt() {
        return this.arrivalEndDt;
    }
    
    public void setArrivalEndDt(Date arrivalEndDt) {
        this.arrivalEndDt = arrivalEndDt;
    }
    
    public Date getArrivalStartDt() {
        return this.arrivalStartDt;
    }
    
    public void setArrivalStartDt(Date arrivalStartDt) {
        this.arrivalStartDt = arrivalStartDt;
    }
    
    public Date getOrderEndDt() {
        return this.orderEndDt;
    }
    
    public void setOrderEndDt(Date orderEndDt) {
        this.orderEndDt = orderEndDt;
    }
    
    public Date getOrderStartDt() {
        return this.orderStartDt;
    }
    
    public void setOrderStartDt(Date orderStartDt) {
        this.orderStartDt = orderStartDt;
    }
    
    public Timestamp getDealStatDt() {
        return this.dealStatDt;
    }
    
    public void setDealStatDt(Timestamp dealStatDt) {
        this.dealStatDt = dealStatDt;
    }
    
    public Timestamp getProccessTs() {
        return this.proccessTs;
    }
    
    public void setProccessTs(Timestamp proccessTs) {
        this.proccessTs = proccessTs;
    }
    
    public Timestamp getCancelTs() {
        return this.cancelTs;
    }
    
    public void setCancelTs(Timestamp cancelTs) {
        this.cancelTs = cancelTs;
    }
    
    public Timestamp getLastSubmitTs() {
        return this.lastSubmitTs;
    }
    
    public void setLastSubmitTs(Timestamp lastSubmitTs) {
        this.lastSubmitTs = lastSubmitTs;
    }
    
    public Timestamp getLastAcceptTs() {
        return this.lastAcceptTs;
    }
    
    public void setLastAcceptTs(Timestamp lastAcceptTs) {
        this.lastAcceptTs = lastAcceptTs;
    }
    
    public Date getPrfrmEndDt() {
        return this.prfrmEndDt;
    }
    
    public void setPrfrmEndDt(Date prfrmEndDt) {
        this.prfrmEndDt = prfrmEndDt;
    }
    
    public Date getPrfrmStartDt() {
        return this.prfrmStartDt;
    }
    
    public void setPrfrmStartDt(Date prfrmStartDt) {
        this.prfrmStartDt = prfrmStartDt;
    }
    
    public Date getLoadDt() {
        return this.loadDt;
    }
    
    public void setLoadDt(Date loadDt) {
        this.loadDt = loadDt;
    }
    
    public String getRecentCmmtTxt() {
        return this.recentCmmtTxt;
    }
    
    public void setRecentCmmtTxt(String recentCmmtTxt) {
        this.recentCmmtTxt = recentCmmtTxt;
    }
    
    public String getDealCmmtTxt() {
        return this.dealCmmtTxt;
    }
    
    public void setDealCmmtTxt(String dealCmmtTxt) {
        this.dealCmmtTxt = dealCmmtTxt;
    }
    
    public String getCurrentOfferInd() {
        return this.currentOfferInd;
    }
    
    public void setCurrentOfferInd(String currentOfferInd) {
        this.currentOfferInd = currentOfferInd;
    }
    
    @Override
    public String toString() {
        return String.format("EmedAlHd[eDealsHeaderId=%d]", this.getEdealsHeaderId());
    }
}
