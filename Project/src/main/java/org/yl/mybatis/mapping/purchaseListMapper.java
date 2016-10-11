package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.purchaseList;

public interface purchaseListMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(purchaseList record);

    int insertSelective(purchaseList record);

    purchaseList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(purchaseList record);

    int updateByPrimaryKey(purchaseList record);
}
