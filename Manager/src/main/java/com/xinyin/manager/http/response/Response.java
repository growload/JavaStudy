package com.xinyin.manager.http.response;

import java.util.List;

/**
 * 响应状态码以及响应信息
 *
 * @author: zhangdeen
 * @date: 2019/8/1 15:32
 * @version: v1.0
 */
public class Response {

    //===========================================< 响应码 >==========================================

    /**
     * 成功
     */
    public static final Integer CODE_SUCCESS = 200;

    /**
     * 服务器异常
     */
    public static final Integer CODE_ERROR = 500;

    /**
     * 参数错误
     */
    public static final Integer CODE_ERROE_PARAM = 501;


    //===========================================< 响应消息 >==========================================

    public static final String MSG_SUCCESS = "请求成功";

    public static final String MSG_ERROR_SERVER = "服务器异常";

    public static final String MSG_ERROE_PAGE = "页码异常，转换失败";

    //===========================================< 封装消息体 >==========================================

    /**
     * 获取响应成功消息体
     *
     * @return
     */
    public static ResponseBodyCommon getSuccessResponse() {
        ResponseBodyCommon response = new ResponseBodyCommon();
        response.setCode(Response.CODE_SUCCESS);
        response.setInfo(Response.MSG_SUCCESS);
        return response;
    }

    /**
     * 获取服务器异常消息体
     *
     * @return
     */
    public static ResponseBodyCommon getErrorResponse() {
        ResponseBodyCommon response = new ResponseBodyCommon();
        response.setCode(Response.CODE_ERROR);
        response.setInfo(Response.MSG_ERROR_SERVER);
        return response;
    }

    /**
     * 获取页码异常消息体
     *
     * @return
     */
    public static ResponseBodyCommon getErrorPageResponse() {
        ResponseBodyCommon response = new ResponseBodyCommon();
        response.setCode(Response.CODE_ERROE_PARAM);
        response.setInfo(Response.MSG_ERROE_PAGE);
        return response;
    }

    /**
     * 返回带有实体的消息体
     *
     * @param element
     * @param <E>     实体类泛型
     * @return
     */
    public static <E> ResponseBodyForSingleEntity<E> getSingleEntityResponse(E element) {
        ResponseBodyForSingleEntity<E> response = new ResponseBodyForSingleEntity<>();
        response.setCode(Response.CODE_SUCCESS);
        response.setInfo(Response.MSG_SUCCESS);
        response.setEntity(element);
        return response;
    }

    /**
     * 返回带有实体列表的消息体
     *
     * @param <E>
     * @param list
     * @param recordCount
     * @param pageCount
     * @return
     */
    public static <E> ResponseBodyForPageableEntity<E> getPageableEntityResponse(List<E> list, int recordCount, int pageCount) {
        ResponseBodyForPageableEntity<E> response = new ResponseBodyForPageableEntity<>();
        response.setCode(Response.CODE_SUCCESS);
        response.setInfo(Response.MSG_SUCCESS);
        response.setRecordCount(recordCount);   // 总记录数
        response.setPageCount(pageCount);    // 总页数
        response.setList(list);
        return response;
    }
}
