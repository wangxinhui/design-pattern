package com.singleton.loadBalance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Author: by Administrator on 2018/3/8.
 */
public class LoadBalancer {

    private static LoadBalancer loadBalancer =null;

    private List serverList = null;

    private LoadBalancer(){
        serverList = new ArrayList();
    }
    //公有静态成员方法，返回唯一实例
    public static LoadBalancer getInstance(){
        if (loadBalancer == null){
            loadBalancer = new LoadBalancer();
        }
        return loadBalancer;
    }

    //增加服务器
    public void addServer(String server){
        serverList.add(server);
    }
    //删除服务器
    public void removeServer(String server){
        serverList.remove(server);
    }
    //使用Random类随机获取服务器
    public String getServer(){
        Random random = new Random();
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }
}
