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
public class ResDistrictVo {

    @ApiModelProperty(example ="28",value="id")
    private String id;

    @ApiModelProperty(example ="义乌市",value="城市名称")
    private String name;

    @ApiModelProperty(example ="义乌市",value="是否下级")
    private Integer hasChild;
}
