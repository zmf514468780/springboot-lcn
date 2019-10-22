package com.service.impl;
import com.dao.CurrencyMapper;
import com.entity.Currency;
import com.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import vo.ResponseResult;

import java.util.List;

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




    @Override
    public ResponseResult getCurrencyList() {
        Example example = new Example(Currency.class);
        example.createCriteria().andEqualTo("deleted","0").andEqualTo("organizationEntityId", "1");
        example.orderBy("sort").asc();
        return ResponseResult.success(
              currencyMapper.selectByExample(example) );
    }



}
