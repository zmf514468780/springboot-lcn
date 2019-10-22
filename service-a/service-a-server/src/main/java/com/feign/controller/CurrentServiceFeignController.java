package com.feign.controller;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.codingapi.txlcn.tc.annotation.TxcTransaction;
import com.dao.CurrencyMapper;
import com.entity.Currency;
import com.feign.CurrentAService;
import com.vo.ReqInitVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import vo.ResponseResult;

/**
 * @program: transaction
 * @description:
 * @author: zhumf
 * @create: 20191021
 **/
@RestController
public class CurrentServiceFeignController implements CurrentAService {
    @Autowired
    private CurrencyMapper currencyMapper;

    @Override
    public ResponseResult init(ReqInitVO reqInitVO) {
        return null;
    }

    @Override
    @LcnTransaction
    @Transactional
    public ResponseResult insert() {
        Currency currency = new Currency();
        currency.setName("service-a");
        currency.setCurrencySymbol("1");
        currency.setEnglishAbbreviation("1");
        currency.setAppId("ods");
        currency.setId("2222");
        currency.setOrganizationEntityId("service-a");
        currency.setDeleted(0);
        currency.setStatus(1);
        currencyMapper.insert(currency);
        return ResponseResult.success();
    }
}
