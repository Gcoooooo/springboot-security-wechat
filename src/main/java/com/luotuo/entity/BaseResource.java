package com.luotuo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 资源基类，如果想让系统某个entity成为资源，必须具有下列属性
 */

@Data
@MappedSuperclass
public class BaseResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    /**
     * 编号
     */
    protected String code;
    /**
     * 名称
     */
    protected String name;
    /**
     * 类型
     */
    @Column(columnDefinition = "not null default ''")
    protected String type;
}