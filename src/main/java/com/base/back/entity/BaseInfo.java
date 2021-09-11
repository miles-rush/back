package com.base.back.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import static com.baomidou.mybatisplus.annotation.FieldFill.INSERT;
import static com.baomidou.mybatisplus.annotation.FieldFill.INSERT_UPDATE;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("baseinfo")
public class BaseInfo implements Serializable {
    private Long id;

    private String name;

    private String sex;

    private Integer age;

    private String culture;

    private String work;

    private String live;

    private String marriage;

    @TableField(fill = INSERT)
    private Date createTime;

    @TableField(fill = INSERT_UPDATE)
    private Date lastUpdateTime;
}
