package com.xinyin.manager.http.request;

import lombok.Data;

@Data
public class RequestBodyForPageable {

    private Integer currentPage;     // 当前页

    private Integer pageSize;        // 每页的数据量

    private RequestBodyForPageable() {

    }

    /**
     * 页码传输是否有误
     *
     * @return
     */
    public boolean isPageRight() {
        if (this.currentPage != null && this.pageSize != null){
            return true;
        } else {
            return false;
        }
    }

    /**
     * 获取偏移量
     *
     * @return
     */
    public int getOffset() {
        return (currentPage - 1) * pageSize;
    }

    /**
     * 获取页码数
     *
     * @param recordCount
     * @return
     */
    public int getPages(int recordCount){
        return (int)Math.ceil(recordCount / (pageSize * 1.0F));
    }

}
