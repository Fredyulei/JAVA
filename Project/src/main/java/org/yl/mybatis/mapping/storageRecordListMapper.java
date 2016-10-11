package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.StorageRecordList;

public interface storageRecordListMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(StorageRecordList record);

    int insertSelective(StorageRecordList record);

    StorageRecordList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StorageRecordList record);

    int updateByPrimaryKey(StorageRecordList record);
}
