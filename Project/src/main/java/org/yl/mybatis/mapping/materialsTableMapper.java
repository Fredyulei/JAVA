package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.MaterialsTable;

public interface materialsTableMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(MaterialsTable record);

    int insertSelective(MaterialsTable record);

    MaterialsTable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MaterialsTable record);

    int updateByPrimaryKey(MaterialsTable record);
}
