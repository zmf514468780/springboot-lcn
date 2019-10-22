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
public class ReqDictionaryDetailsVo {
    @ApiModelProperty(example ="编号",value="编号")
    private String id;

    @ApiModelProperty(example ="编码",value="父级编码")
    private String code;

    @ApiModelProperty(example ="字典名",value="字典名")
    private String name;
    @ApiModelProperty(example ="备注",value="备注")
    private String note;

    @ApiModelProperty(example ="1",value="排序")
    private Integer sort;

    @ApiModelProperty(example ="1",value="是否启用")
    private Integer used;
    @ApiModelProperty(example ="1",value="实际编码")
    private String detailCode;
    @ApiModelProperty(example ="1",value="类型，1不能删除，编辑")
    private Integer type;
}
