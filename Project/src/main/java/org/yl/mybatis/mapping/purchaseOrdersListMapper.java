package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.purchaseOrdersList;

public interface purchaseOrdersListMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(purchaseOrdersList record);

    int insertSelective(purchaseOrdersList record);

    purchaseOrdersList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(purchaseOrdersList record);

    int updateByPrimaryKey(purchaseOrdersList record);
}
