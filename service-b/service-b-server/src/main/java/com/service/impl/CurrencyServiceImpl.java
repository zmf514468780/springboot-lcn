package com.service.impl;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.dao.CurrencyMapper;
import com.entity.Currency;
import com.feign.CurrentAService;
import com.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import vo.ResponseResult;

/**
 * @package: com.zjbdos.ods.settingconfig.server.service.impl
 * @description:
 * @author: zhumingfu
 * @date: 2019-10-09 11:34
 **/
@Service
public class CurrencyServiceImpl implements CurrencyService {
    @Autowired
    private CurrencyMapper currencyMapper;
@Autowired
private CurrentAService currentAService;



    @Override
    public ResponseResult getCurrencyList() {
        Example example = new Example(Currency.class);
        example.createCriteria().andEqualTo("deleted","0").andEqualTo("organizationEntityId", "1");
        example.orderBy("sort").asc();
        return ResponseResult.success(
              currencyMapper.selectByExample(example) );
    }

    @Override
    @LcnTransaction
    @Transactional
    public ResponseResult insert() {
        Currency currency = new Currency();
        currency.setName("service-b");
        currency.setCurrencySymbol("1");
        currency.setEnglishAbbreviation("1");
        currency.setAppId("ods");
        currency.setId("11");
        currency.setOrganizationEntityId("service-b");
        currency.setDeleted(0);
        currency.setStatus(1);
        currencyMapper.insert(currency);
        ResponseResult insert = currentAService.insert();
        int i = 1/0;
        return ResponseResult.success();
    }


}
