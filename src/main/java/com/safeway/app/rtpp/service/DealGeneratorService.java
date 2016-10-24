package com.safeway.app.rtpp.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.safeway.app.rtpp.domain.EmedAlHdTable;
import com.safeway.app.rtpp.domain.EmedTablesRepository;
import com.safeway.app.rtpp.domain.WmAlwHedTable;

@Component
public class DealGeneratorService {

	private final static Logger log = LoggerFactory.getLogger(DealGeneratorService.class);

	protected final String insSql = "INSERT INTO DEVSQL1.WMALWHED_TABLE (RES_DIVISION,VENDOR,LOG,"
			+ "MERCHANDISER,ALLOWANCE_SOURCE,VENDOR_NAME,BILLING_NAME,BILLING_ADDRESS_1,"
			+ "BILLING_ADDRESS_2,BILLING_ADDRESS_3,VENDOR_PHONE,ACC_REC_NUMBER,ACC_REC_NUMBER2,"
			+ "VENDOR_PHONE_IN,GROUP_INDICATOR,ORDER_FROM_DATE,ORDER_TO_DATE,SHIP_FROM_DATE,"
			+ "SHIP_TO_DATE,ARRIVAL_FROM_DATE,ARRIVAL_TO_DATE,NEXT_DEAL_DATE,OFFER_NUMBER,"
			+ "SPECIFIED_ORDERS,CASH_DISCNT_PCTG,CASH_DISCNT_DAYS,NET_DAYS,PERFORM_FROM_DATE,"
			+ "PERFORM_TO_DATE,COUNT_DATE,RECOUNT_DATE,INVEST_OVERRIDE,PROTECT_DAYS,SUPPORT_FROM_DATE,"
			+ "SUPPORT_TO_DATE,CREATION_DATE,CREATION_USERID,LAST_FM_DATE,USERID,ORDER_FROM_FLAG,"
			+ "ORDER_TO_FLAG,SHIP_FROM_FLAG,SHIP_TO_FLAG,ARRIVAL_FROM_FLAG,ARRIVAL_TO_FLAG,"
			+ "DO_NOT_PRINT_DATE,BILLBACK_DATE,BB_OVERRIDE_DATE,TEAR_SHEET,PERCENT_CALC,AUTO_CONTINUE,"
			+ "BB_OVERRIDE,MAIL,PROTECT_CODE_1,PROTECT_CODE_2,PROTECT_CODE_3,PROTECT_CODE_4,"
			+ "SUPPORT_CODE_1,SUPPORT_CODE_2,SUPPORT_CODE_3,SUPPORT_CODE_4,SUPPORT_CODE_5,SUPPORT_CODE_6,"
			+ "SUPPORT_CODE_7,SUPPORT_CODE_8,SUPPORT_CODE_9,SUPPORT_CODE_1?,FLAT_AMOUNT,FLAT_ORDER_MIN,"
			+ "FLAT_BILLBACK_DATE,FLAT_ACC_REJ,FLAT_PERFORM_1,FLAT_PERFORM_2,FLAT_PERFORM_3,FLAT_PERFORM_4,"
			+ "FLT_SEL,FLT_SEL_ADVERT,FLT_SEL_STORES,FLT_INV,FLT_INV_ADVERT,FLT_INV_STORES,FLT_INV_LAST,"
			+ "FLT_INV_LAST_DATE,TOT_INV,TOT_INV_ADVERT,TOT_INV_STORES,TOT_INV_LAST,TOT_INV_LAST_DATE,"
			+ "ACCOUNTING_ENTITY,VENDOR_SYSTEM,COST_AREA,CORP,DIVISION,VEND_NUM,VEND_SUB_ACNT,WIMS_SUB_VEND,"
			+ "COMMENTS,INVOICE_COMMENTS) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
			+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,"
			+ "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	@Autowired
    protected JdbcTemplate jdbcTemplate;
    
    @Autowired
    protected EmedTablesRepository emedTablesRepo;
    
    @Transactional
    public void insertToWims(String offerNum, WmAlwHedTable wmAlwHedData)
    {
    	List<EmedAlHdTable> emedAlHds = emedTablesRepo.getEmedAlHdByOffer(offerNum);
    	
    	for (EmedAlHdTable emedAlHd : emedAlHds) 
        {
            log.info("Inserting offer: " + offerNum + " in EMEDALHD_TABLE to WMALWHED_TABLE...");            	
            jdbcTemplate.update(insSql, wmAlwHedData.getResDivision(),wmAlwHedData.getVendor(),wmAlwHedData.getLog(),
            		wmAlwHedData.getMerchandiser(),wmAlwHedData.getAllowanceSource(),wmAlwHedData.getVendorName(),
            		wmAlwHedData.getBillingName(),wmAlwHedData.getBillingAddress1(),wmAlwHedData.getBillingAddress2(),
            		wmAlwHedData.getBillingAddress3(),wmAlwHedData.getVendorPhone(),wmAlwHedData.getAccRecNumber(),
            		wmAlwHedData.getAccRecNumber2(),wmAlwHedData.getVendorPhoneIn(),wmAlwHedData.getGroupIndicator(),
            		wmAlwHedData.getOrderFromDate(),wmAlwHedData.getOrderToDate(),wmAlwHedData.getShipFromDate(),
            		wmAlwHedData.getShipToDate(),wmAlwHedData.getArrivalFromDate(),wmAlwHedData.getArrivalToDate(),
            		wmAlwHedData.getNextDealDate(),wmAlwHedData.getOfferNumber(),wmAlwHedData.getSpecifiedOrders(),
            		wmAlwHedData.getCashDiscntPctg(),wmAlwHedData.getCashDiscntDays(),wmAlwHedData.getNetDays(),
            		wmAlwHedData.getPerformFromDate(),wmAlwHedData.getPerformToDate(),wmAlwHedData.getCountDate(),
            		wmAlwHedData.getRecountDate(),wmAlwHedData.getInvestOverride(),wmAlwHedData.getProtectDays(),
            		wmAlwHedData.getSupportFromDate(),wmAlwHedData.getSupportToDate(),wmAlwHedData.getCreationDate(),
            		wmAlwHedData.getCreationUserid(),wmAlwHedData.getLastFmDate(),wmAlwHedData.getUserid(),
            		wmAlwHedData.getOrderFromFlag(),wmAlwHedData.getOrderToFlag(),wmAlwHedData.getShipFromFlag(),
            		wmAlwHedData.getShipToFlag(),wmAlwHedData.getArrivalFromFlag(),wmAlwHedData.getArrivalToFlag(),
            		wmAlwHedData.getDoNotPrintDate(),wmAlwHedData.getBillbackDate(),wmAlwHedData.getBbOverrideDate(),
            		wmAlwHedData.getTearSheet(),wmAlwHedData.getPercentCalc(),wmAlwHedData.getAutoContinue(),
            		wmAlwHedData.getBbOverride(),wmAlwHedData.getMail(),wmAlwHedData.getProtectCode1(),
            		wmAlwHedData.getProtectCode2(),wmAlwHedData.getProtectCode3(),wmAlwHedData.getProtectCode4(),
            		wmAlwHedData.getSupportCode1(),wmAlwHedData.getSupportCode2(),wmAlwHedData.getSupportCode3(),
            		wmAlwHedData.getSupportCode4(),wmAlwHedData.getSupportCode5(),wmAlwHedData.getSupportCode6(),
            		wmAlwHedData.getSupportCode7(),wmAlwHedData.getSupportCode8(),wmAlwHedData.getSupportCode9(),
            		wmAlwHedData.getSupportCode10(),wmAlwHedData.getFlatAmount(),wmAlwHedData.getFlatOrderMin(),
            		wmAlwHedData.getFlatBillbackDate(),wmAlwHedData.getFlatAccRej(),wmAlwHedData.getFlatPerform1(),
            		wmAlwHedData.getFlatPerform2(),wmAlwHedData.getFlatPerform3(),wmAlwHedData.getFlatPerform4(),
            		wmAlwHedData.getFltSel(),wmAlwHedData.getFltSelAdvert(),wmAlwHedData.getFltSelStores(),
            		wmAlwHedData.getFltInv(),wmAlwHedData.getFltInvAdvert(),wmAlwHedData.getFltInvStores(),
            		wmAlwHedData.getFltInvLast(),wmAlwHedData.getFltInvLastDate(),wmAlwHedData.getTotInv(),
            		wmAlwHedData.getTotInvAdvert(),wmAlwHedData.getTotInvStores(),wmAlwHedData.getTotInvLast(),
            		wmAlwHedData.getTotInvLastDate(),wmAlwHedData.getAccountingEntity(),wmAlwHedData.getVendorSystem(),
            		wmAlwHedData.getCostArea(),wmAlwHedData.getCorp(),wmAlwHedData.getDivision(),wmAlwHedData.getVendNum(),
            		wmAlwHedData.getVendSubAcnt(),wmAlwHedData.getWimsSubVend(),wmAlwHedData.getComments(),
            		wmAlwHedData.getInvoiceComments());            
        }
    }
}
