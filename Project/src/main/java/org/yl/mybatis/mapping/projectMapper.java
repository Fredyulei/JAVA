package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.Project;

public interface projectMapper {
	 int deleteByPrimaryKey(Integer id);

	    int insert(Project record);

	    int insertSelective(Project record);

	    Project selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(Project record);

	    int updateByPrimaryKey(Project record);
}
