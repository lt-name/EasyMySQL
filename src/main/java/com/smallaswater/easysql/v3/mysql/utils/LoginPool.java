package com.smallaswater.easysql.v3.mysql.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.smallaswater.easysql.v3.mysql.manager.SqlManager;

/**
 * @author SmallasWater
 * Create on 2021/7/4 9:08
 * Package com.smallaswater.easysql
 */
public class LoginPool {

    public DruidDataSource dataSource = new DruidDataSource();
    private final String user;

    private final String ip;

    private final String database;

    private SqlManager manager;

    public LoginPool(String ip, String user, String database) {
        this.ip = ip;
        this.user = user;
        this.database = database;
    }

    public void setManager(SqlManager manager) {
        this.manager = manager;
    }

    public SqlManager getManager() {
        return manager;
    }

    @Override
    public boolean equals(Object pool) {
        if (pool instanceof LoginPool) {
            return ((LoginPool) pool).database.equalsIgnoreCase(database) &&
                    ((LoginPool) pool).user.equalsIgnoreCase(user) &&
                    ((LoginPool) pool).ip.equalsIgnoreCase(ip);
        }
        return false;
    }


}
