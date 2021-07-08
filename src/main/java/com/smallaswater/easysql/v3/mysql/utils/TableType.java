package com.smallaswater.easysql.v3.mysql.utils;

import lombok.Getter;

/**
 * 创建数据表传入的参数.
 * name 为自定义名称
 * type Mysql创建表参数
 *
 * @author SmallasWater
 */
public class TableType {

    @Getter
    private final String name;
    @Getter
    private final Types type;

    public TableType(String name, Types type) {
        this.name = name;
        this.type = type;
    }

    public String toTable() {
        return name + " " + type.toString();
    }
}
