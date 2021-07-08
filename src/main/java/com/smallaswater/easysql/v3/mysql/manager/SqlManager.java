package com.smallaswater.easysql.v3.mysql.manager;


import cn.nukkit.plugin.Plugin;
import com.smallaswater.easysql.v3.exceptions.MySqlLoginException;
import com.smallaswater.easysql.v3.mysql.BaseMySql;
import com.smallaswater.easysql.v3.mysql.utils.UserData;
import org.jetbrains.annotations.NotNull;


/**
 * BaseMySql的实现类
 *
 * @author SmallasWater
 */
public class SqlManager extends BaseMySql {

    private boolean isEnable = false;

    public SqlManager(@NotNull Plugin plugin, @NotNull UserData data) throws MySqlLoginException {
        super(plugin, data);
        if (this.connect()) {
            this.isEnable = true;
        }
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void disable() {
        PluginManager.getList().remove(this);
        this.shutdown();
        this.isEnable = false;
    }

}
