package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.Purchase;

public interface purchaseMapper {
	 int deleteByPrimaryKey(Integer id);

	    int insert(Purchase record);

	    int insertSelective(Purchase record);

	    Purchase selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(Purchase record);

	    int updateByPrimaryKey(Purchase record);
}
