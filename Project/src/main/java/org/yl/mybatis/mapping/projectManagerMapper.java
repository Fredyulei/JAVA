package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.ProjectManager;

public interface projectManagerMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(ProjectManager record);

    int insertSelective(ProjectManager record);

    ProjectManager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProjectManager record);

    int updateByPrimaryKey(ProjectManager record);
}
