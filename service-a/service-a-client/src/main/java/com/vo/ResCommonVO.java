package com.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: ods-root
 * @description: 通用vo
 * @author: zhumf
 * @create: 20190915
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ResCommonVO {

    @ApiModelProperty(example ="28",value="id")
    private String id;

    @ApiModelProperty(example ="28",value="显示值")
    private String name;

    @ApiModelProperty(example ="28",value="实际值")
    private String code;
}
