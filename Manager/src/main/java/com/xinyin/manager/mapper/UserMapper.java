package com.xinyin.manager.mapper;

import com.xinyin.manager.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

    /**
     * 获取用户列表
     */
    List<User> findUsers(int offet, int pageSize);

     int findUsersCount();
   /**
   *用户数
    */


}