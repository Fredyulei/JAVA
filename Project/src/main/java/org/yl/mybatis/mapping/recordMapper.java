package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.Record;

public interface recordMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    Record selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);
}
