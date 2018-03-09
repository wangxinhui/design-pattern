package com.singleton.loadBalance;

/**
 * @Author: by Administrator on 2018/3/8.
 */
public class Client {

    public static void main(String[] args) {
        LoadBalancer loadBalancer1 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer2 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer3 = LoadBalancer.getInstance();
        LoadBalancer loadBalancer4 = LoadBalancer.getInstance();

        if (loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 && loadBalancer3 == loadBalancer4){
            System.out.println("服务器负载均衡器具有唯一性！");
        }

        loadBalancer1.addServer("server 1");
        loadBalancer2.addServer("server 2");
        loadBalancer3.addServer("server 3");
        loadBalancer4.addServer("server 4");
        loadBalancer4.addServer("server 5");

        for (int i = 0; i < 10; i++) {
            String server = loadBalancer1.getServer();
            System.out.println("分发请求至服务器： " + server);
        }
    }
}
