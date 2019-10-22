package com.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: ods-root
 * @description: 序列号是否自动vo;
 * @author: zhumf
 * @create: 20190918
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ResAutoVO {

    @ApiModelProperty(example ="1",value="订单编号是否自动")
    private Integer orderAuto;

    @ApiModelProperty(example ="1",value="产品编号是否自动")
    private Integer productAuto;

    @ApiModelProperty(example ="1",value="客户编号是否自动")
    private Integer customerAuto;
}
