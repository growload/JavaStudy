package com.xinyin.manager.service.impl;

import com.xinyin.manager.entity.Material;
import com.xinyin.manager.mapper.MaterialMapper;
import com.xinyin.manager.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MaterialServiceImpl implements MaterialService {
    @Autowired
    MaterialMapper materialMapper;
    @Override
    public List<Material> selectAll() {
        return materialMapper.selectAll();
    }

    @Override
    public Material selectByPrimaryKey(Long id) {
        return materialMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(Material material) {
        materialMapper.updateByPrimaryKeySelective(material);
    }

    @Override
    public void insertSelective(Material material) {
        materialMapper.insertSelective(material);
    }
}
