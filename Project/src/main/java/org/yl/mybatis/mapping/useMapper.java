package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.Use;

public interface useMapper {
	 int deleteByPrimaryKey(Integer id);

	    int insert(Use record);

	    int insertSelective(Use record);

	    Use selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(Use record);

	    int updateByPrimaryKey(Use record);
}
