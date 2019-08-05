package com.xinyin.manager.mapper;

import org.springframework.stereotype.Repository;

/**
 * 抽象公共的Mapper接口
 *
 * @author: zhangdeen
 * @date: 2019/8/1 15:07
 * @version: v1.0
 */
@Repository
public interface BaseMapper<T> {

    int deleteByPrimaryKey(Long[] ids);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

}
