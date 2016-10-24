package com.safeway.app.rtpp.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.init.ScriptUtils;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

@Repository
public class EmedTablesRepository {

	protected final static Logger log = LoggerFactory.getLogger(EmedTablesRepository.class);

    @Autowired
    protected JdbcTemplate jdbc;

    public List<EmedAlHdTable> getEmedAlHdByOffer(String offerNum) 
    {
        return jdbc.query("SELECT * FROM SQLDATA.EMEDALHD_TABLE WHERE OFFER_NBR=" + offerNum, emedAlHdMapper);
    }
    
    public List<EmedAlHdTable> getEdealByScript()
    {
    	try 
		{
			//read a .sql script from file
			BufferedReader br = new BufferedReader(new FileReader("script.sql"));
			LineNumberReader fileReader = new LineNumberReader(br);
			String query = ScriptUtils.readScript(fileReader,"--",";");
			return jdbc.query(query, emedAlHdMapper);
		} 
		catch (FileNotFoundException fnfe) 
		{
			fnfe.printStackTrace();
			return null;
		} 
		catch (IOException ioe) 
		{
			ioe.printStackTrace();
			return null;
		}
    }

    private static final RowMapper<EmedAlHdTable> emedAlHdMapper = new RowMapper<EmedAlHdTable>() {
        public EmedAlHdTable mapRow(ResultSet rs, int rowNum) throws SQLException {
            
        	ResultSetMetaData rsmd = rs.getMetaData();
        	int columnCount = rsmd.getColumnCount();
        	
            for(int i = 1 ; i <= columnCount ; i++)
            {
                rsmd.getColumnName(i);
                rsmd.getColumnTypeName(i);
            }
        	
            EmedAlHdTable emedAlHd = new EmedAlHdTable();
            emedAlHd.setEdealsHeaderId(rs.getInt("EDEALS_HEADER_ID"));
            emedAlHd.setOfferNbr(rs.getString("OFFER_NBR"));
            emedAlHd.setDealLocId(rs.getString("DEAL_LOC_ID"));
            emedAlHd.setVendNbr(rs.getString("VEND_NBR"));
            emedAlHd.setVendArNbr(rs.getString("VEND_AR_NBR"));
            emedAlHd.setVendAddrLine1Txt(rs.getString("VEND_ADDR_LINE1_TXT"));
            emedAlHd.setVendAddrLine2Txt(rs.getString("VEND_ADDR_LINE2_TXT"));
            emedAlHd.setVendApNbr(rs.getString("VEND_AP_NBR"));
            emedAlHd.setVendCityNm(rs.getString("VEND_CITY_NM"));
            emedAlHd.setVendCntryNm(rs.getString("VEND_CNTRY_NM"));
            emedAlHd.setVendNm(rs.getString("VEND_NM"));
            emedAlHd.setVendStateNm(rs.getString("VEND_STATE_NM"));
            emedAlHd.setVendZipCd(rs.getString("VEND_ZIP_CD"));
            emedAlHd.setVendFaxNbr(rs.getString("VEND_FAX_NBR"));
            emedAlHd.setVendPhnNbr(rs.getString("VEND_PHN_NBR"));
            emedAlHd.setVendTrackingNbr(rs.getString("VEND_TRACKING_NBR"));
            emedAlHd.setCtgryMgrEmailId(rs.getString("CTGRY_MGR_EMAIL_ID"));
            emedAlHd.setCtgryMgrNbr(rs.getString("CTGRY_MGR_NBR"));
            emedAlHd.setCtgryMgrNm(rs.getString("CTGRY_MGR_NM"));
            emedAlHd.setManufNm(rs.getString("MANUF_NM"));
            emedAlHd.setManufCityNm(rs.getString("MANUF_CITY_NM"));
            emedAlHd.setManufCntryNm(rs.getString("MANUF_CNTRY_NM"));
            emedAlHd.setManufFaxNbr(rs.getString("MANUF_FAX_NBR"));
            emedAlHd.setManufStateNm(rs.getString("MANUF_STATE_NM"));
            emedAlHd.setManufZipCd(rs.getString("MANUF_ZIP_CD"));
            emedAlHd.setManufPhnNbr(rs.getString("MANUF_PHN_NBR"));
            emedAlHd.setManufAddrL1Txt(rs.getString("MANUF_ADDR_L1_TXT"));
            emedAlHd.setManufAddrL2Txt(rs.getString("MANUF_ADDR_L2_TXT"));
            emedAlHd.setProdCtgryCd(rs.getString("PROD_CTGRY_CD"));
            emedAlHd.setProdCtgryMgr(rs.getString("PROD_CTGRY_MGR"));
            emedAlHd.setRepEmailId(rs.getString("REP_EMAIL_ID"));
            emedAlHd.setRepNm(rs.getString("REP_NM"));
            emedAlHd.setBillToCd(rs.getString("BILL_TO_CD"));
            emedAlHd.setFlatAlwAmt(rs.getBigDecimal("FLAT_ALW_AMT"));
            emedAlHd.setFltAlwPindCd(rs.getString("FLT_ALW_PIND_CD"));
            emedAlHd.setExtTrmsDiscDys(rs.getInt("EXT_TRMS_DISC_DYS"));
            emedAlHd.setExtTrmsDiscPct(rs.getBigDecimal("EXT_TRMS_DISC_PCT"));
            emedAlHd.setExtTrmsNetDys(rs.getInt("EXT_TRMS_NET_DYS"));
            emedAlHd.setMstDealId(rs.getInt("MST_DEAL_ID"));
            emedAlHd.setMstVendNm(rs.getString("MST_VEND_NM"));
            emedAlHd.setPrfrmNm(rs.getString("PRFRM_NM"));
            emedAlHd.setSpfcOrdNbr(rs.getInt("SPFC_ORD_NBR"));
            emedAlHd.setDealDsc(rs.getString("DEAL_DSC"));
            emedAlHd.setWhomNbr(rs.getString("WHOM_NBR"));
            emedAlHd.setDealStatCd(rs.getString("DEAL_STAT_CD"));
            emedAlHd.setExportActInd(rs.getString("EXPORT_ACT_IND"));
            emedAlHd.setOverlapCalcInd(rs.getString("OVERLAP_CALC_IND"));
            emedAlHd.setOrdEdOvrdInd(rs.getString("ORD_ED_OVRD_IND"));
            emedAlHd.setOrdStOvrdInd(rs.getString("ORD_ST_OVRD_IND"));
            emedAlHd.setShpEdOvrdInd(rs.getString("SHP_ED_OVRD_IND"));
            emedAlHd.setShpStOvrdInd(rs.getString("SHP_ST_OVRD_IND"));
            emedAlHd.setArvStOvrdInd(rs.getString("ARV_ST_OVRD_IND"));
            emedAlHd.setArvEdOvrdInd(rs.getString("ARV_ED_OVRD_IND"));
            emedAlHd.setShipEndDt(rs.getDate("SHIP_END_DT"));
            emedAlHd.setShipStartDt(rs.getDate("SHIP_START_DT"));
            emedAlHd.setArrivalEndDt(rs.getDate("ARRIVAL_END_DT"));
            emedAlHd.setArrivalStartDt(rs.getDate("ARRIVAL_START_DT"));
            emedAlHd.setOrderEndDt(rs.getDate("ORDER_END_DT"));
            emedAlHd.setOrderStartDt(rs.getDate("ORDER_START_DT"));
            emedAlHd.setDealStatDt(rs.getTimestamp("DEAL_STAT_DT"));
            emedAlHd.setProccessTs(rs.getTimestamp("PROCCESS_TS"));
            emedAlHd.setCancelTs(rs.getTimestamp("CANCEL_TS"));
            emedAlHd.setLastSubmitTs(rs.getTimestamp("LAST_SUBMIT_TS"));
            emedAlHd.setLastAcceptTs(rs.getTimestamp("LAST_ACCEPT_TS"));
            emedAlHd.setPrfrmEndDt(rs.getDate("PRFRM_END_DT"));
            emedAlHd.setPrfrmStartDt(rs.getDate("PRFRM_START_DT"));
            emedAlHd.setLoadDt(rs.getDate("LOAD_DT"));
            emedAlHd.setRecentCmmtTxt(rs.getString("RECENT_CMMT_TXT"));
            emedAlHd.setDealCmmtTxt(rs.getString("DEAL_CMMT_TXT"));
            emedAlHd.setCurrentOfferInd(rs.getString("CURRENT_OFFER_IND"));
            
            log.info("EMEDALHD " + emedAlHd.toString() + " are selected in EMEDALHD_TABLE...");  
            return emedAlHd;
        }
    };
    
    private static final RowMapper<EmedAlDtTable> emedAlDtMapper = new RowMapper<EmedAlDtTable>() {
        public EmedAlDtTable mapRow(ResultSet rs, int rowNum) throws SQLException {
            
        	EmedAlDtTable emedAlDt = new EmedAlDtTable();
        	emedAlDt.setEdealsHeaderId(rs.getInt("EDEALS_HEADER_ID"));
        	emedAlDt.setEdealsDetailId(rs.getInt("EDEALS_DETAIL_ID"));
        	emedAlDt.setWhse(rs.getString("WHSE"));
        	emedAlDt.setRtlItmNbr(rs.getBigDecimal("RTL_ITM_NBR"));
        	emedAlDt.setConsumerUpcId(rs.getBigDecimal("CONSUMER_UPC_ID"));
        	emedAlDt.setCaseUpcId(rs.getBigDecimal("CASE_UPC_ID"));
        	emedAlDt.setItemDesc(rs.getString("ITEM_DESC"));
        	emedAlDt.setItemGroupCd(rs.getInt("ITEM_GROUP_CD"));
        	emedAlDt.setFrcstUnitQty(rs.getInt("FRCST_UNIT_QTY"));
        	emedAlDt.setVendReqAdCd(rs.getString("VEND_REQ_AD_CD"));
        	emedAlDt.setVendReqDspCd(rs.getString("VEND_REQ_DSP_CD"));
        	emedAlDt.setMatchDsc(rs.getString("MATCH_DSC"));
        	emedAlDt.setPackWhse(rs.getBigDecimal("PACK_WHSE"));
        	emedAlDt.setRtlRegPrc(rs.getBigDecimal("RTL_REG_PRC"));
        	emedAlDt.setRtlUnitCst(rs.getBigDecimal("RTL_UNIT_CST"));
        	emedAlDt.setSize(rs.getBigDecimal("SIZE"));
        	emedAlDt.setSizeUomCd(rs.getString("SIZE_UOM_CD"));
        	emedAlDt.setUnitCst(rs.getBigDecimal("UNIT_CST"));
        	emedAlDt.setPromoPrc(rs.getBigDecimal("PROMO_PRC"));
        	emedAlDt.setNonPromoPrc(rs.getBigDecimal("NON_PROMO_PRC"));
        	emedAlDt.setPrcTypCd(rs.getInt("PRC_TYP_CD"));
        	emedAlDt.setItmValue1Prc(rs.getBigDecimal("ITM_VALUE1_PRC"));
        	emedAlDt.setItmValue2Prc(rs.getBigDecimal("ITM_VALUE2_PRC"));
        	emedAlDt.setPoVendNbr(rs.getString("PO_VEND_NBR"));
        	emedAlDt.setBaseDealNbr(rs.getBigDecimal("BASE_DEAL_NBR"));
        	emedAlDt.setDsdInd(rs.getString("DSD_IND"));
        	emedAlDt.setLogNbr(rs.getInt("LOG_NBR"));
        	emedAlDt.setOthrAlwAmt(rs.getBigDecimal("OTHR_ALW_AMT"));
        	emedAlDt.setUsrDefLogic1Ind(rs.getString("USR_DEF_LOGIC1_IND"));
        	emedAlDt.setUsrDefLogic2Ind(rs.getString("USR_DEF_LOGIC2_IND"));
        	emedAlDt.setUsrDefLogic3Ind(rs.getString("USR_DEF_LOGIC3_IND"));
        	emedAlDt.setUsrDef1Txt(rs.getString("USR_DEF_1_TXT"));
        	emedAlDt.setUsrDef2Txt(rs.getString("USR_DEF_2_TXT"));
        	emedAlDt.setUsrDef3Txt(rs.getString("USR_DEF_3_TXT"));
            
            log.info("EMEDALDT " + emedAlDt.toString() + " are selected in EMEDALDT_TABLE...");  
            return emedAlDt;
        }
    };
    
    private static final RowMapper<EmedAlCmTable> emedAlCmMapper = new RowMapper<EmedAlCmTable>() {
        public EmedAlCmTable mapRow(ResultSet rs, int rowNum) throws SQLException {
            
        	EmedAlCmTable emedAlCm = new EmedAlCmTable();
        	emedAlCm.setEdealsHeaderId(rs.getInt("EDEALS_HEADER_ID"));
        	emedAlCm.setEdealsDetailId(rs.getInt("EDEALS_DETAIL_ID"));
        	emedAlCm.setEdealsCompId(rs.getInt("EDEALS_COMP_ID"));
        	emedAlCm.setAlwAmt(rs.getBigDecimal("ALW_AMT"));
        	emedAlCm.setAlwTypDsc(rs.getString("ALW_TYP_DSC"));
        	emedAlCm.setAlwPindCd(rs.getString("ALW_PIND_CD"));
        	emedAlCm.setAlwPmtInd(rs.getString("ALW_PMT_IND"));
        	emedAlCm.setAlwTypStartDt(rs.getDate("ALW_TYP_START_DT"));
        	emedAlCm.setAlwTypEndDt(rs.getDate("ALW_TYP_END_DT"));
        	emedAlCm.setLimitTypeCd(rs.getString("LIMIT_TYPE_CD"));
        	emedAlCm.setPrfrmCd(rs.getString("PRFRM_CD"));
        	emedAlCm.setPrfrmDsc(rs.getString("PRFRM_DSC"));
        	emedAlCm.setAlwBasisDsc(rs.getString("ALW_BASIS_DSC"));
        	emedAlCm.setAltPrfrm1Cd(rs.getString("ALT_PRFRM1_CD"));
        	emedAlCm.setAltPrfrmDsc(rs.getString("ALT_PRFRM_DSC"));
            
            log.info("EMEDALCM " + emedAlCm.toString() + " are selected in EMEDALCM_TABLE...");  
            return emedAlCm;
        }
    };
    
    private static final RowMapper<EmedAlHdTable> dtoMapper = new RowMapper<EmedAlHdTable>() {
        public EmedAlHdTable mapRow(ResultSet rs, int rowNum) throws SQLException {
            
        	ResultSetMetaData rsmd = rs.getMetaData();
        	int columnCount = rsmd.getColumnCount();
        	
        	EmedAlHdTable emedAlHd = new EmedAlHdTable();
        	
            for(int i = 1 ; i <= columnCount ; i++)
            {
                //rsmd.getColumnName(i);
                switch (rsmd.getColumnName(i))
                {
                	case "EDEALS_HEADER_ID":
                		emedAlHd.setEdealsHeaderId(rs.getInt("EDEALS_HEADER_ID"));
                		break;
                	case "OFFER_NBR":
	                	emedAlHd.setOfferNbr(rs.getString("OFFER_NBR"));
	                	break;
                	case "DEAL_LOC_ID":
	                	emedAlHd.setDealLocId(rs.getString("DEAL_LOC_ID"));
	                	break;
                	case "VEND_NBR":
	                	emedAlHd.setVendNbr(rs.getString("VEND_NBR"));
	                	break;
                	case "VEND_AR_NBR":
	                	emedAlHd.setVendArNbr(rs.getString("VEND_AR_NBR"));
	                	break;
                	case "VEND_ADDR_LINE1_TXT":
	                	emedAlHd.setVendAddrLine1Txt(rs.getString("VEND_ADDR_LINE1_TXT"));
	                	break;
                	case "VEND_ADDR_LINE2_TXT":
	                	emedAlHd.setVendAddrLine2Txt(rs.getString("VEND_ADDR_LINE2_TXT"));
	                	break;
                	case "VEND_AP_NBR":
	                	emedAlHd.setVendApNbr(rs.getString("VEND_AP_NBR"));
	                	break;
                	case "VEND_CITY_NM":
	                	emedAlHd.setVendCityNm(rs.getString("VEND_CITY_NM"));
	                	break;
                	case "VEND_CNTRY_NM":
	                	emedAlHd.setVendCntryNm(rs.getString("VEND_CNTRY_NM"));
	                	break;
                	case "VEND_NM":
	                	emedAlHd.setVendNm(rs.getString("VEND_NM"));
	                	break;
                	case "VEND_STATE_NM":
	                	emedAlHd.setVendStateNm(rs.getString("VEND_STATE_NM"));
	                	break;
                	case "VEND_ZIP_CD":
	                	emedAlHd.setVendZipCd(rs.getString("VEND_ZIP_CD"));
	                	break;
                	case "VEND_FAX_NBR":
	                	emedAlHd.setVendFaxNbr(rs.getString("VEND_FAX_NBR"));
	                	break;
                	case "VEND_PHN_NBR":
	                	emedAlHd.setVendPhnNbr(rs.getString("VEND_PHN_NBR"));
	                	break;
                	case "VEND_TRACKING_NBR":
	                	emedAlHd.setVendTrackingNbr(rs.getString("VEND_TRACKING_NBR"));
	                	break;
                	case "CTGRY_MGR_EMAIL_ID":
	                	emedAlHd.setCtgryMgrEmailId(rs.getString("CTGRY_MGR_EMAIL_ID"));
	                	break;
                	case "CTGRY_MGR_NBR":
	                	emedAlHd.setCtgryMgrNbr(rs.getString("CTGRY_MGR_NBR"));
	                	break;
                	case "CTGRY_MGR_NM":
	                	emedAlHd.setCtgryMgrNm(rs.getString("CTGRY_MGR_NM"));
	                	break;
                	case "MANUF_NM":
	                	emedAlHd.setManufNm(rs.getString("MANUF_NM"));
	                	break;
                	case "MANUF_CITY_NM":
	                	emedAlHd.setManufCityNm(rs.getString("MANUF_CITY_NM"));
	                	break;
                	case "MANUF_CNTRY_NM":
	                	emedAlHd.setManufCntryNm(rs.getString("MANUF_CNTRY_NM"));
	                	break;
                	case "MANUF_FAX_NBR":
	                	emedAlHd.setManufFaxNbr(rs.getString("MANUF_FAX_NBR"));
	                	break;
                	case "MANUF_STATE_NM":
	                	emedAlHd.setManufStateNm(rs.getString("MANUF_STATE_NM"));
	                	break;
                	case "MANUF_ZIP_CD":
	                	emedAlHd.setManufZipCd(rs.getString("MANUF_ZIP_CD"));
	                	break;
                	case "MANUF_PHN_NBR":
	                	emedAlHd.setManufPhnNbr(rs.getString("MANUF_PHN_NBR"));
	                	break;
                	case "MANUF_ADDR_L1_TXT":
	                	emedAlHd.setManufAddrL1Txt(rs.getString("MANUF_ADDR_L1_TXT"));
	                	break;
                	case "MANUF_ADDR_L2_TXT":
	                	emedAlHd.setManufAddrL2Txt(rs.getString("MANUF_ADDR_L2_TXT"));
	                	break;
                	case "PROD_CTGRY_CD":
	                	emedAlHd.setProdCtgryCd(rs.getString("PROD_CTGRY_CD"));
	                	break;
                	case "PROD_CTGRY_MGR":
	                	emedAlHd.setProdCtgryMgr(rs.getString("PROD_CTGRY_MGR"));
	                	break;
                	case "REP_EMAIL_ID":
	                	emedAlHd.setRepEmailId(rs.getString("REP_EMAIL_ID"));
	                	break;
                	case "REP_NM":
	                	emedAlHd.setRepNm(rs.getString("REP_NM"));
	                	break;
                	case "BILL_TO_CD":
	                	emedAlHd.setBillToCd(rs.getString("BILL_TO_CD"));
	                	break;
                	case "FLAT_ALW_AMT":
	                	emedAlHd.setFlatAlwAmt(rs.getBigDecimal("FLAT_ALW_AMT"));
	                	break;
                	case "FLT_ALW_PIND_CD":
	                	emedAlHd.setFltAlwPindCd(rs.getString("FLT_ALW_PIND_CD"));
	                	break;
                	case "EXT_TRMS_DISC_DYS":
	                	emedAlHd.setExtTrmsDiscDys(rs.getInt("EXT_TRMS_DISC_DYS"));
	                	break;
                	case "EXT_TRMS_DISC_PCT":
	                	emedAlHd.setExtTrmsDiscPct(rs.getBigDecimal("EXT_TRMS_DISC_PCT"));
	                	break;
                	case "EXT_TRMS_NET_DYS":
	                	emedAlHd.setExtTrmsNetDys(rs.getInt("EXT_TRMS_NET_DYS"));
	                	break;
                	case "MST_DEAL_ID":
	                	emedAlHd.setMstDealId(rs.getInt("MST_DEAL_ID"));
	                	break;
                	case "MST_VEND_NM":
	                	emedAlHd.setMstVendNm(rs.getString("MST_VEND_NM"));
	                	break;
                	case "PRFRM_NM":
	                	emedAlHd.setPrfrmNm(rs.getString("PRFRM_NM"));
	                	break;
                	case "SPFC_ORD_NBR":
	                	emedAlHd.setSpfcOrdNbr(rs.getInt("SPFC_ORD_NBR"));
	                	break;
                	case "DEAL_DSC":
	                	emedAlHd.setDealDsc(rs.getString("DEAL_DSC"));
	                	break;
                	case "WHOM_NBR":
	                	emedAlHd.setWhomNbr(rs.getString("WHOM_NBR"));
	                	break;
                	case "DEAL_STAT_CD":
	                	emedAlHd.setDealStatCd(rs.getString("DEAL_STAT_CD"));
	                	break;
                	case "EXPORT_ACT_IND":
	                	emedAlHd.setExportActInd(rs.getString("EXPORT_ACT_IND"));
	                	break;
                	case "OVERLAP_CALC_IND":
	                	emedAlHd.setOverlapCalcInd(rs.getString("OVERLAP_CALC_IND"));
	                	break;
                	case "ORD_ED_OVRD_IND":
	                	emedAlHd.setOrdEdOvrdInd(rs.getString("ORD_ED_OVRD_IND"));
	                	break;
                	case "ORD_ST_OVRD_IND":
	                	emedAlHd.setOrdStOvrdInd(rs.getString("ORD_ST_OVRD_IND"));
	                	break;
                	case "SHP_ED_OVRD_IND":
	                	emedAlHd.setShpEdOvrdInd(rs.getString("SHP_ED_OVRD_IND"));
	                	break;
                	case "SHP_ST_OVRD_IND":
	                	emedAlHd.setShpStOvrdInd(rs.getString("SHP_ST_OVRD_IND"));
	                	break;
                	case "ARV_ST_OVRD_IND":
	                	emedAlHd.setArvStOvrdInd(rs.getString("ARV_ST_OVRD_IND"));
	                	break;
                	case "ARV_ED_OVRD_IND":
	                	emedAlHd.setArvEdOvrdInd(rs.getString("ARV_ED_OVRD_IND"));
	                	break;
                	case "SHIP_END_DT":
	                	emedAlHd.setShipEndDt(rs.getDate("SHIP_END_DT"));
	                	break;
                	case "SHIP_START_DT":
	                	emedAlHd.setShipStartDt(rs.getDate("SHIP_START_DT"));
	                	break;
                	case "ARRIVAL_END_DT":
	                	emedAlHd.setArrivalEndDt(rs.getDate("ARRIVAL_END_DT"));
	                	break;
                	case "ARRIVAL_START_DT":
	                	emedAlHd.setArrivalStartDt(rs.getDate("ARRIVAL_START_DT"));
	                	break;
                	case "ORDER_END_DT":
	                	emedAlHd.setOrderEndDt(rs.getDate("ORDER_END_DT"));
	                	break;
                	case "ORDER_START_DT":
	                	emedAlHd.setOrderStartDt(rs.getDate("ORDER_START_DT"));
	                	break;
                	case "DEAL_STAT_DT":
	                	emedAlHd.setDealStatDt(rs.getTimestamp("DEAL_STAT_DT"));
	                	break;
                	case "PROCCESS_TS":
	                	emedAlHd.setProccessTs(rs.getTimestamp("PROCCESS_TS"));
	                	break;
                	case "CANCEL_TS":
	                	emedAlHd.setCancelTs(rs.getTimestamp("CANCEL_TS"));
	                	break;
                	case "LAST_SUBMIT_TS":
	                	emedAlHd.setLastSubmitTs(rs.getTimestamp("LAST_SUBMIT_TS"));
	                	break;
                	case "LAST_ACCEPT_TS":
	                	emedAlHd.setLastAcceptTs(rs.getTimestamp("LAST_ACCEPT_TS"));
	                	break;
                	case "PRFRM_END_DT":
	                	emedAlHd.setPrfrmEndDt(rs.getDate("PRFRM_END_DT"));
	                	break;
                	case "PRFRM_START_DT":
	                	emedAlHd.setPrfrmStartDt(rs.getDate("PRFRM_START_DT"));
	                	break;
                	case "LOAD_DT":
	                	emedAlHd.setLoadDt(rs.getDate("LOAD_DT"));
	                	break;
                	case "RECENT_CMMT_TXT":
	                	emedAlHd.setRecentCmmtTxt(rs.getString("RECENT_CMMT_TXT"));
	                	break;
                	case "DEAL_CMMT_TXT":
	                	emedAlHd.setDealCmmtTxt(rs.getString("DEAL_CMMT_TXT"));
	                	break;
                	case "CURRENT_OFFER_IND":
	                	emedAlHd.setCurrentOfferInd(rs.getString("CURRENT_OFFER_IND"));
	                	break;
                }
            }           
                        
            log.info("EmedAlHd " + emedAlHd.toString() + " are selected in EMEDALHD_TABLE...");  
            return emedAlHd;
        }
    };
}
