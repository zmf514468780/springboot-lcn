package com.entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @package: com.zjbdos.springcloud.common.server.entity
 * @description: 建表基础对象
 * @author: zzy
 * @date: 2019-10-09 11:59
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class BaseEntity {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    @ApiModelProperty("编号")
    private String id;
    @Column(name = "`app_id`")
    @ApiModelProperty("服务编号")
    private String appId;
    @ApiModelProperty("类型")
    @Column(name = "`type`")
    private Integer type;
    @ApiModelProperty("编码")
    @Column(name = "`code`")
    private String code;
    @ApiModelProperty("名称")
    @Column(name = "`name`")
    private String name;
    @ApiModelProperty("备注")
    @Column(name = "`note`")
    private String note;
    @ApiModelProperty("创建时间")
    @Column(name = "`create_time`")
    private Long createTime;
    @ApiModelProperty("创建者姓名")
    @Column(name = "`create_name`")
    private String createName;
    @ApiModelProperty("创建者编号")
    @Column(name = "`createby`")
    private String createby;
    @ApiModelProperty("修改时间")
    @Column(name = "`modify_time`")
    private Long modifyTime;
    @ApiModelProperty("修改者姓名")
    @Column(name = "`modify_name`")
    private String modifyName;
    @ApiModelProperty("修改者编号")
    @Column(name = "`modifyby`")
    private String modifyby;
    @ApiModelProperty("数据状态，1：生效待审核；2：已生效；-1：删除待审核；-2：已删除")
    @Column(name = "`deleted`")
    private Integer deleted;
    @ApiModelProperty("排序")
    @Column(name = "`sort`")
    private Integer sort;
    @ApiModelProperty("所属组织实体id")
    @Column(name = "`organization_entity_id`")
    private String organizationEntityId;
    @ApiModelProperty("业务状态")
    @Column(name = "`status`")
    private Integer status;


}