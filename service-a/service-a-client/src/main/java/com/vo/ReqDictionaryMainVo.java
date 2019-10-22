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
 * @date: 2019-10-09 11:26
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ReqDictionaryMainVo {
    @ApiModelProperty(example ="编号",value="编号")
    private String id;

    @ApiModelProperty(example ="编码",value="编码")
    private String code;

    @ApiModelProperty(example ="字典名",value="字典名")
    private String name;
    
}
