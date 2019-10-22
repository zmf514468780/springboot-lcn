package com.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package: com.zjbdos.ods.settingconfig.client.vo
 * @description:
 * @author: zhumingfu
 * @date: 2019-10-09 11:22
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ReqAndRespAddCurrencyVo {

    @ApiModelProperty(example ="编号",value="编号")
    private String id;

    @ApiModelProperty(example ="编码",value="编码")
    private String code;

    @ApiModelProperty(example ="币种名",value="币种名")
    private String name;

    @ApiModelProperty(example ="英文缩写",value="英文缩写")
    private String englishAbbreviation;

    @ApiModelProperty(example ="货币符号",value="货币符号")
    private String currencySymbol;

    @ApiModelProperty(example ="备注",value="备注")
    private String note;

    @ApiModelProperty(example ="1",value="排序")
    private Integer sort;

    @ApiModelProperty(example ="1",value="是否启用")
    private Integer used;
    @ApiModelProperty(example ="1",value="是否默认")
    private Integer defaulted;
    @ApiModelProperty(example ="1",value="类型，是否可以删除")
    private Integer type;
}
