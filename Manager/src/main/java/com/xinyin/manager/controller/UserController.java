package com.xinyin.manager.controller;

import com.google.gson.JsonSyntaxException;
import com.xinyin.manager.entity.Project;
import com.xinyin.manager.entity.User;
import com.xinyin.manager.http.request.RequestBodyForPageable;
import com.xinyin.manager.http.response.Response;
import com.xinyin.manager.http.response.ResponseBodyCommon;
import com.xinyin.manager.http.response.ResponseBodyForPageableEntity;
import com.xinyin.manager.http.response.ResponseBodyForSingleEntity;
import com.xinyin.manager.service.UserService;
import com.xinyin.manager.util.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户控制类
 *
 * @author: hushanshan
 * @date: 2019/8/2 10:40
 * @version: v1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*
      分页查询用户列表
      @return：ok/fail
     */
    @RequestMapping("/findUsers")
    @ResponseBody
    public Object findUsers(@RequestBody String body) {
        RequestBodyForPageable pageable = JSONUtils.gson().fromJson(body, RequestBodyForPageable.class);
        try {
            if (pageable.isPageRight()) {
                return userService.findUsers(pageable);
            } else {
                return Response.getErrorPageResponse();
            }
        } catch (Exception e) {
            return Response.getErrorResponse();
        }
    }


    /**
     * 用户详情
     */
    @RequestMapping("/findById")
    @ResponseBody
    public ResponseBodyForSingleEntity<User> findById(Long id) {
        ResponseBodyForSingleEntity<User> responseBodyForSingleEntity = null;
        try {
            responseBodyForSingleEntity = new ResponseBodyForSingleEntity<>();
            responseBodyForSingleEntity.setEntity(userService.research(id));
            responseBodyForSingleEntity.setCode(Response.CODE_SUCCESS);
            responseBodyForSingleEntity.setInfo(Response.MSG_SUCCESS);
        } catch (Exception e) {
            e.printStackTrace();
            responseBodyForSingleEntity.setCode(Response.CODE_ERROR);
            responseBodyForSingleEntity.setInfo(Response.MSG_ERROR_SERVER);
        }
        return responseBodyForSingleEntity;

        /**
         *新建用户
         * */
    }
}



