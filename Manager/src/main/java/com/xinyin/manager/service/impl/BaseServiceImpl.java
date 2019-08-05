package com.xinyin.manager.service.impl;
import com.xinyin.manager.mapper.BaseMapper;
import com.xinyin.manager.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 抽象公共的Service实现类
 *
 * @author: zhangdeen
 * @date: 2019/8/1 14:58
 * @version: v1.0
 */
@Component
public class BaseServiceImpl<T> implements BaseService<T> {

    @Autowired
    private BaseMapper<T> baseMapper;
    @Override
    public void create(T entity) {
        baseMapper.insert(entity);
    }

    @Override
    public void delete(Long[] ids) {
        baseMapper.deleteByPrimaryKey(ids);
    }

    @Override
    public void update(T entity) {
        baseMapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public T research(Long id) {
        return baseMapper.selectByPrimaryKey(id);
    }
}
