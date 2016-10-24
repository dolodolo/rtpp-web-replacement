package com.safeway.app.rtpp.domain;

import java.math.BigDecimal;
import java.sql.Date;

public class EmedAlCmTable {
	
    private int edealsHeaderId;
    private int edealsDetailId;
    private int edealsCompId;
    private BigDecimal alwAmt;
    private String alwTypDsc;
    private String alwPindCd;
    private String alwPmtInd;
    private Date alwTypStartDt;
    private Date alwTypEndDt;
    private String limitTypeCd;
    private String prfrmCd;
    private String prfrmDsc;
    private String alwBasisDsc;
    private String altPrfrm1Cd;
    private String altPrfrmDsc;
    
    public int getEdealsHeaderId() {
        return this.edealsHeaderId;
    }
    
    public void setEdealsHeaderId(int edealsHeaderId) {
        this.edealsHeaderId = edealsHeaderId;
    }
    
    public int getEdealsCompId() {
        return this.edealsCompId;
    }
    
    public void setEdealsCompId(int edealsCompId) {
        this.edealsCompId = edealsCompId;
    }
    
    public BigDecimal getAlwAmt() {
        return this.alwAmt;
    }
    
    public void setAlwAmt(BigDecimal alwAmt) {
        this.alwAmt = alwAmt;
    }
    
    public String getAlwTypDsc() {
        return this.alwTypDsc;
    }
    
    public void setAlwTypDsc(String alwTypDsc) {
        this.alwTypDsc = alwTypDsc;
    }
    
    public String getAlwPindCd() {
        return this.alwPindCd;
    }
    
    public void setAlwPindCd(String alwPindCd) {
        this.alwPindCd = alwPindCd;
    }
    
    public String getAlwPmtInd() {
        return this.alwPmtInd;
    }
    
    public void setAlwPmtInd(String alwPmtInd) {
        this.alwPmtInd = alwPmtInd;
    }
    
    public Date getAlwTypStartDt() {
        return this.alwTypStartDt;
    }
    
    public void setAlwTypStartDt(Date alwTypStartDt) {
        this.alwTypStartDt = alwTypStartDt;
    }
    
    public Date getAlwTypEndDt() {
        return this.alwTypEndDt;
    }
    
    public void setAlwTypEndDt(Date alwTypEndDt) {
        this.alwTypEndDt = alwTypEndDt;
    }
    
    public String getLimitTypeCd() {
        return this.limitTypeCd;
    }
    
    public void setLimitTypeCd(String limitTypeCd) {
        this.limitTypeCd = limitTypeCd;
    }
    
    public String getPrfrmCd() {
        return this.prfrmCd;
    }
    
    public void setPrfrmCd(String prfrmCd) {
        this.prfrmCd = prfrmCd;
    }
    
    public String getPrfrmDsc() {
        return this.prfrmDsc;
    }
    
    public void setPrfrmDsc(String prfrmDsc) {
        this.prfrmDsc = prfrmDsc;
    }
    
    public String getAlwBasisDsc() {
        return this.alwBasisDsc;
    }
    
    public void setAlwBasisDsc(String alwBasisDsc) {
        this.alwBasisDsc = alwBasisDsc;
    }
    
    public String getAltPrfrm1Cd() {
        return this.altPrfrm1Cd;
    }
    
    public void setAltPrfrm1Cd(String altPrfrm1Cd) {
        this.altPrfrm1Cd = altPrfrm1Cd;
    }
    
    public String getAltPrfrmDsc() {
        return this.altPrfrmDsc;
    }
    
    public void setAltPrfrmDsc(String altPrfrmDsc) {
        this.altPrfrmDsc = altPrfrmDsc;
    }
    
    public int getEdealsDetailId() {
        return this.edealsDetailId;
    }
    
    public void setEdealsDetailId(int edealsDetailId) {
        this.edealsDetailId = edealsDetailId;
    }
    
    @Override
    public String toString() {
        return String.format("EmedAlCm[eDealsHeaderId=%d, eDealsDetailId=%d, eDealsCompId=%d]", 
        		this.getEdealsHeaderId(), this.getEdealsDetailId(), this.getEdealsCompId());
    }
}
