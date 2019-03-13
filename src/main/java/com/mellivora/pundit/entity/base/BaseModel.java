package com.mellivora.pundit.entity.base;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: mellivora-pundit
 * @description:
 * @author: jin.rao@sunyard.com
 * @create: 2019-03-12 15:48
 **/
public class BaseModel implements Serializable {

    private static final long serialVersionUID = 7847954075354174098L;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("创建人ID")
    private String createId;
    @ApiModelProperty("最后更新时间")
    private Date updateTime;
    @ApiModelProperty("最后更新人")
    private String updateId;
    @ApiModelProperty("是否删除")
    private Boolean delFlag = false;
    @ApiModelProperty("状态")
    private Integer status;
    @ApiModelProperty("备注")
    private String remarke;
    @ApiModelProperty("token")
    private String token;
}
