package com.xinyin.manager.service.impl;

import com.xinyin.manager.entity.User;
import com.xinyin.manager.http.request.RequestBodyForPageable;
import com.xinyin.manager.http.response.Response;
import com.xinyin.manager.http.response.ResponseBodyForPageableEntity;
import com.xinyin.manager.mapper.UserMapper;
import com.xinyin.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: zhangdeen
 * @date: 2019/8/1 16:28
 * @version: v1.0
 */
@Component
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     *  获取项目列表并分页
     *
     * @param pageable
     * @param
     * @return
     */
   @Override
    public ResponseBodyForPageableEntity<User> findUsers(RequestBodyForPageable pageable) {
        int offet = pageable.getOffset();
        int pageSize = pageable.getPageSize();
        List<User> users = userMapper.findUsers(offet, pageSize);
        int recordCount = userMapper.findUsersCount();
        int pageCount = pageable.getPages(recordCount);
        return Response.getPageableEntityResponse(users,recordCount,pageCount);
    }

    @Override
    public User research(Long id) {
        return null;
    }

    /**
     * 用户详情
     */


}
