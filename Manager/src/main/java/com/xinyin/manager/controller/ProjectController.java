package com.xinyin.manager.controller;

import com.google.gson.JsonSyntaxException;
import com.xinyin.manager.entity.Project;
import com.xinyin.manager.http.request.RequestBodyForIds;
import com.xinyin.manager.http.request.RequestBodyForPageable;
import com.xinyin.manager.http.response.Response;
import com.xinyin.manager.http.response.ResponseBodyCommon;
import com.xinyin.manager.http.response.ResponseBodyForSingleEntity;
import com.xinyin.manager.http.response.entity.ResponseBodyForProject;
import com.xinyin.manager.service.ProjectService;
import com.xinyin.manager.util.JSONUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 项目管理控制类
 *
 * @author: zhangdeen
 * @date: 2019/8/2 9:43
 * @version: v1.0
 */
@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    /**
     * 获取项目列表并分页
     *
     * @param: body  分页请求体
     * @param； name  项目名称
     * @return:
     * @autoor：zhangdeen
     * @time: 2019/8/2 9:47
     */
    @RequestMapping("list")
    @ResponseBody
    public Object list(@RequestBody String body, String name, @RequestParam("userId") Long userId) {
        RequestBodyForPageable pageable = JSONUtils.gson().fromJson(body, RequestBodyForPageable.class);
        try {
            if (pageable.isPageRight()) {
                return projectService.getProjectList(pageable, name, userId);
            } else {
                return Response.getErrorPageResponse();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Response.getErrorResponse();
        }
    }

    /**
     * 获取项目详情以及用料详情
     *
     * @param: id  项目ID
     * @return:
     * @autor： zhangdeen
     * @time: 2019/8/2 14:52
     */
    @RequestMapping("detail")
    @ResponseBody
    public ResponseBodyForSingleEntity<ResponseBodyForProject> getDetail(Long id) {

        return projectService.getProjectDetail(id);
    }

    /**
     * 添加项目
     *
     * @param: body  项目请求体
     * @return:
     * @autor： zhangdeen
     * @time: 2019/8/2 15:41
     */
    @RequestMapping("add")
    @ResponseBody
    public ResponseBodyCommon add(@RequestBody String body) {
        ResponseBodyCommon response = new ResponseBodyCommon();
        try {
            Project project = JSONUtils.gson().fromJson(body, Project.class);
            project.setId(System.currentTimeMillis());
            projectService.create(project);
            return Response.getSuccessResponse();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            return Response.getErrorResponse();
        }

    }

    /**
     * 编辑项目
     *
     * @param: body  项目请求体
     * @return:
     * @autor： zhangdeen
     * @time: 2019/8/2 15:41
     */
    @RequestMapping("modify")
    @ResponseBody
    public ResponseBodyCommon modify(@RequestBody String body) {
        ResponseBodyCommon response = new ResponseBodyCommon();
        try {
            Project project = JSONUtils.gson().fromJson(body, Project.class);
            projectService.update(project);
            return Response.getSuccessResponse();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            return Response.getErrorResponse();
        }

    }

    /**
     * 删除项目
     *
     * @param: body  项目ID
     * @return:
     * @autor： zhangdeen
     * @time: 2019/8/2 15:41
     */
    @RequestMapping("delete")
    @ResponseBody
    public ResponseBodyCommon delete(@RequestBody String body) {
        try {
            RequestBodyForIds requestBodyForIds = JSONUtils.gson().fromJson(body, RequestBodyForIds.class);
            ResponseBodyCommon response = new ResponseBodyCommon();
            Long[] ids = requestBodyForIds.getIds();
            projectService.delete(ids);
            return Response.getSuccessResponse();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            return Response.getErrorResponse();
        }

    }
}
