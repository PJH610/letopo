package com.letopo.plugin.core.manager;

import com.letopo.plugin.core.inter.AbstractPlugin;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * 全自动插件安装，通过数据库来判断是否初始化，来判断插件是否安装。
 * 全自动安装主要分为三步
 * 1.通过相对路径给 app、admin 添加页面
 * 2.通过JSON解析，差量写入来写入路由信息
 * 3.执行sql脚本创建表与初始数据
 * @author jh
 * @version 1.0
 * @date 2020-04-27 16:10
 */
@Component
public class PluginsManager {

    private Map<Class, List> pluginsMap = new HashMap<Class, List>();

    public void registerPlugin(AbstractPlugin plugin) {
        Class<?>[] interfaces = plugin.getClass().getInterfaces();
        for (Class clazz : interfaces) {
            String name = clazz.getName();
            if (name.startsWith("com.letopo.plugin.core.inter"))  {
                List<AbstractPlugin> list = pluginsMap.get(clazz);
                if (list == null) {
                    list = new LinkedList();
                }
                pluginsMap.put(clazz, list);
                list.add(plugin);
            }
        }
    }

    public <T> List<T> getPlugins(Class<T> clazz) {
        return pluginsMap.get(clazz);
    }

}
