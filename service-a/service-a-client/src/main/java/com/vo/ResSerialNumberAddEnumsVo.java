package com.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: ods-root
 * @description: 序列号设置时的枚举
 * @author: zhumf
 * @create: 20190915
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ResSerialNumberAddEnumsVo {
    @ApiModelProperty(example ="编号",value="时间格式")
    private List<ResCommonVO> dateFormat;

    @ApiModelProperty(example ="编号",value="0位数")
    private List<ResCommonVO> zeroDigit;
}
