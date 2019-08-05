package com.xinyin.manager.service;

import org.springframework.stereotype.Service;

/**
 * 抽象公共Service接口
 *
 * @author: zhangdeen
 * @date: 2019/8/1 14:58
 * @version: v1.0
 */
@Service
public interface BaseService<T> {

    /**
     * 插入实体
     *
     * @param entity
     * @return 返回这个实体
     */
    void create(T entity);

    /**
     * 通过主键批量删除
     *
     * @param ids
     */
    void delete(Long[] ids);

    /**
     * 更新实体
     *
     * @param entity
     * @return 返回更新后的实体
     */
    void update(T entity);

    /**
     * 根据主键ID查询实体
     */
    T research(Long id);
}
