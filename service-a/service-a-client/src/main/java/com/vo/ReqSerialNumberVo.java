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
 * @date: 2019-10-09 11:29
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ReqSerialNumberVo {
    @ApiModelProperty(example ="编号",value="编号")
    private String id;

    @ApiModelProperty(example ="yyyyMMdd",value="dateFormat")
    private String dateFormat;

    @ApiModelProperty(example ="ZJWB",value="名称，用户自定义的开头")
    private String prefixName;
    @ApiModelProperty(example ="备注",value="备注")
    private String note;

    @ApiModelProperty(example ="1",value="类型，1订单编号2产品编号3客户编号")
    private Integer type;


    @ApiModelProperty(example ="1",value="是否自动生成")
    private Integer auto;
    @ApiModelProperty(example ="zeroDigit",value="zeroDigit")
    private String zeroDigit;
}
