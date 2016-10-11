package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.UseList;

public interface useListMapper {
	 int deleteByPrimaryKey(Integer id);

	    int insert(UseList record);

	    int insertSelective(UseList record);

	    UseList selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(UseList record);

	    int updateByPrimaryKey(UseList record);
}
