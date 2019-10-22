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
 * @date: 2019-10-09 11:30
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ResBusinessNameVo {
    @ApiModelProperty(example ="编号",value="编号")
    private String id ;
    @ApiModelProperty(example ="产品",value="名称")
    private String name;

    @ApiModelProperty(example ="商品",value="真实值")
    private String value ;
}
