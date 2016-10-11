package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.DeliveryRecordList;

public interface deliveryRecordListMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(DeliveryRecordList record);

    int insertSelective(DeliveryRecordList record);

    DeliveryRecordList selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeliveryRecordList record);

    int updateByPrimaryKey(DeliveryRecordList record);
}
