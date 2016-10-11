package org.yl.mybatis.mapping;

import org.yl.mybatis.pojo.DeliveryRecord;

public interface deliveryRecordMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(DeliveryRecord record);

    int insertSelective(DeliveryRecord record);

    DeliveryRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DeliveryRecord record);

    int updateByPrimaryKey(DeliveryRecord record);
}
