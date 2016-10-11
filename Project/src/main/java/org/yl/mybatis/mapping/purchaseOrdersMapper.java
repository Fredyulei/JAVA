package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.purchaseOrders;

public interface purchaseOrdersMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(purchaseOrders record);

    int insertSelective(purchaseOrders record);

    purchaseOrders selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(purchaseOrders record);

    int updateByPrimaryKey(purchaseOrders record);
}
