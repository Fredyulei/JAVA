package org.yl.mybatis.mapping;

import java.util.List;

import org.yl.mybatis.pojo.User;

public interface userMapper {
	int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    List<User> getAllUsers();
}
