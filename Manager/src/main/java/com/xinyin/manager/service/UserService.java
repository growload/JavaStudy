package com.xinyin.manager.service;

import com.xinyin.manager.entity.User;
import com.xinyin.manager.http.request.RequestBodyForPageable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author: hushanshan
 * @date: 2019/8/2 12:26
 * @version: v1.0
 */
@Service
public interface UserService extends BaseService<User> {

    /*分页查询
    /
     */
      Object findUsers(RequestBodyForPageable pageable);






}
