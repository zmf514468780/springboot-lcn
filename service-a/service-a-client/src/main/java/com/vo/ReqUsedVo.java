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
public class ReqUsedVo {

    @ApiModelProperty(example ="ccccc",value="编号")
    private String id;

    @ApiModelProperty(example ="1",value="启用状态")
    private Integer used;
}
