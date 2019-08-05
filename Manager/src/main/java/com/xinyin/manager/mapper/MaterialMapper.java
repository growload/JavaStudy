package com.xinyin.manager.mapper;
import com.xinyin.manager.entity.Material;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *  @author:    wanglin
 *  @Date:       2019/8/2 11:04
 *  @Description:
 */
@Repository
public interface MaterialMapper {
    List<Material> selectAll();
    Material selectByPrimaryKey(Long id);
    void updateByPrimaryKeySelective(Material material);
    void insertSelective(Material material);
}