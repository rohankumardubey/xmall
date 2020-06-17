package com.timing.seata.service;

public interface BusinessService {

    /**
     * 用户订购商品
     * @param userId          用户id
     * @param commodityCode   商品编号
     * @param orderCount      订购数量
     */
    void purchase(String userId, String commodityCode, int orderCount);
}
