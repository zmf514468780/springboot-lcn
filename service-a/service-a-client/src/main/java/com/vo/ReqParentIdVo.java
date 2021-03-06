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
 * @date: 2019-10-09 11:28
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ReqParentIdVo {
    @ApiModelProperty(example ="28",value="上级编号id")
    private String parentId;
}
