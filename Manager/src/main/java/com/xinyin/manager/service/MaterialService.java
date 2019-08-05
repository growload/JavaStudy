package com.xinyin.manager.service;
import com.xinyin.manager.entity.Material;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *  @author:    wanglin
 *  @Date:       2019/8/2 11:04
 *  @Description:
 */
@Service
public interface MaterialService {
    List<Material> selectAll();
    Material selectByPrimaryKey(Long id);
     void updateByPrimaryKeySelective(Material material);
    void insertSelective(Material material);
}
