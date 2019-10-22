package com.dao;

import com.entity.Currency;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


/**
 * @package: com.zjbdos.ods.settingconfig.server.dao
 * @description:
 * @author: zhumingfu
 * @date: 2019-10-09 11:30
 **/
@Repository
@org.apache.ibatis.annotations.Mapper
public interface CurrencyMapper extends Mapper<Currency> {
}