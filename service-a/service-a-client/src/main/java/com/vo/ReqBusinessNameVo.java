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
public class ReqBusinessNameVo {
    @ApiModelProperty(example ="id",value="id")
    private String id;

    @ApiModelProperty(example ="产品",value="名称")
    private String name;

    @ApiModelProperty(example ="商品",value="真实值")
    private String value ;
}
