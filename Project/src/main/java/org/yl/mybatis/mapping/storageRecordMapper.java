package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.StorageRecord;

public interface storageRecordMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(StorageRecord record);

    int insertSelective(StorageRecord record);

    StorageRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StorageRecord record);

    int updateByPrimaryKey(StorageRecord record);
}
