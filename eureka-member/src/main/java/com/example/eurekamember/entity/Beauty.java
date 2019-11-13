package com.example.eurekamember.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Getter
@Setter
public class Beauty implements Serializable {

    @ApiModelProperty("美女编号")
    private String id;
    @ApiModelProperty("创建时间")
    private Date createAt;
    @ApiModelProperty("描述")
    private String desc;
    @ApiModelProperty("发布时间")
    private Date publishAt;
    @ApiModelProperty("图片资源来源")
    private String source;
    @ApiModelProperty("图片来源类型")
    private String type;
    @ApiModelProperty("是否已经使用过")
    private int used;
    @ApiModelProperty("作者")
    private String who;
    @ApiModelProperty("图片的链接地址")
    private String url;
    @ApiModelProperty("图片的宽度，单位像素")
    private int width;
    @ApiModelProperty("图片的高度，单位像素")
    private int height;
}
