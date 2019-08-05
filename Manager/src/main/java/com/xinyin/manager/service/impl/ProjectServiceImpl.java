package com.xinyin.manager.service.impl;

import com.xinyin.manager.entity.Project;
import com.xinyin.manager.http.request.RequestBodyForPageable;
import com.xinyin.manager.http.response.Response;
import com.xinyin.manager.http.response.ResponseBodyForPageableEntity;
import com.xinyin.manager.http.response.ResponseBodyForSingleEntity;
import com.xinyin.manager.http.response.entity.ResponseBodyForProject;
import com.xinyin.manager.mapper.ProjectMapper;
import com.xinyin.manager.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: zhangdeen
 * @date: 2019/8/2 10:37
 * @version: v1.0
 */
@Component
public class ProjectServiceImpl extends BaseServiceImpl<Project> implements ProjectService {

    @Autowired
    private ProjectMapper projectMapper;

    /**
     * 获取项目列表并分页
     *
     * @param pageable
     * @param name
     * @return
     */
    @Override
    public ResponseBodyForPageableEntity<Project> getProjectList(RequestBodyForPageable pageable, String name, Long userId) {
        int offet = pageable.getOffset();
        int pageSize = pageable.getPageSize();
        List<Project> projects = projectMapper.getProjectList(offet, pageSize, name, userId);
        int recordCount = projectMapper.getProjectCount(name, userId);
        int pageCount = pageable.getPages(recordCount);
        return Response.getPageableEntityResponse(projects, recordCount, pageCount);
    }

    /**
     * 获取项目详情
     *
     * @param id
     * @return
     */
    @Override
    public ResponseBodyForSingleEntity<ResponseBodyForProject> getProjectDetail(Long id) {
        ResponseBodyForSingleEntity<ResponseBodyForProject> response = new ResponseBodyForSingleEntity<>();
        response.setEntity(projectMapper.getProjectDetail(id));
        response.setCode(Response.CODE_SUCCESS);
        response.setInfo(Response.MSG_SUCCESS);
        return response;
    }
}
