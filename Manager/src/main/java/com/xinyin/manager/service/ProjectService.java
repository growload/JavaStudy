package com.xinyin.manager.service;

import com.xinyin.manager.entity.Project;
import com.xinyin.manager.http.request.RequestBodyForPageable;
import com.xinyin.manager.http.response.ResponseBodyForSingleEntity;
import com.xinyin.manager.http.response.entity.ResponseBodyForProject;
import org.springframework.stereotype.Service;

/**
 * 项目服务类
 *
 * @author: zhangdeen
 * @date: 2019/8/2 10:34
 * @version: v1.0
 */
@Service
public interface ProjectService extends BaseService<Project> {

    /**
     * 获取项目列表并分页
     */
    Object getProjectList(RequestBodyForPageable pageable, String name, Long userId);

    /**
     * 获取项目详情
     */
    ResponseBodyForSingleEntity<ResponseBodyForProject> getProjectDetail(Long id);
}
