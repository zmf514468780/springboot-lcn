package com.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: ods-root
 * @description: 序列号是否自动生成的vo
 * @author: zhumf
 * @create: 20190915
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class ReqNumberIsAutoVO {
    @ApiModelProperty(example ="123456",value="商家号id")
    private String organizationEntityId;
    @ApiModelProperty(example ="1",value="序列号类型")
    private Integer type;
}
