package com.entity;
 
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @package: com.zjbdos.ods.settingconfig.server.entity
 * @description: 
 * @author: zhumingfu
 * @date: 2019-10-09 11:41
 **/
@Data
@Table(name = "`t_run_currency`")
public class Currency extends BaseEntity {


    /**
     * 英文缩写
     */
    @Column(name = "`english_abbreviation`")
    private String englishAbbreviation;

    /**
     * 币种符号
     */
    @Column(name = "`currency_symbol`")
    private String currencySymbol;

    @Column(name = "`used`")
    private Integer used;
    @Column(name = "`defaulted`")
    private Integer defaulted;
 
    
}