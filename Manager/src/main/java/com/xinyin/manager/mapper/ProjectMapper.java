package com.xinyin.manager.mapper;

import com.xinyin.manager.entity.Project;
import com.xinyin.manager.http.response.ResponseBodyForSingleEntity;
import com.xinyin.manager.http.response.entity.ResponseBodyForProject;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectMapper extends BaseMapper<Project> {

    /**
     * 获取项目列表
     */
    List<Project> getProjectList(@Param("offset") int offset, @Param("pageSize") int pageSize, @Param("name") String name, @Param("userId") Long userId);

    /**
     * 获取项目总数
     */
    int getProjectCount(@Param("name") String name, @Param("userId") Long userId);

    /**
     * 获取项目及用料详情
     */
    ResponseBodyForProject getProjectDetail(@Param("id") Long id);
}