package com.xinyin.manager.controller;
import com.xinyin.manager.entity.Material;
import com.xinyin.manager.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *  @author:    wanglin
 *  @Date:       2019/8/2 11:04
 *  @Description:
 */
@Controller
@RequestMapping("/material")
public class MaterialController {
    @Autowired
     MaterialService materialService;
    //在项目详情页面为该项目添加用料
    @RequestMapping("/createMaterialForProject")
    @ResponseBody
    public Map<String,Object> createMaterialForProject(@RequestParam(name="id") Long id){
        Map<String,Object> modelMap = new HashMap<String,Object>();
        Material material = new Material();
        material.setId(System.currentTimeMillis());
        material.setName("模板");
        material.setType("装修");
        material.setCount("300平方米");
        material.setPrice(9000.00);
        material.setProjectId(id);
        materialService.insertSelective(material);
        modelMap.put("success",true);
        modelMap.put("material",material);
        return modelMap;
    }
    //查询所有用料统计信息列表
    @RequestMapping("/findAllMaterial")
    @ResponseBody
    public Map<String,Object> findAllMaterial(){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        List<Material> listMaterial = materialService.selectAll();
        modelMap.put("success",true);
        modelMap.put("materialList",listMaterial);
        System.out.println(listMaterial);
        return modelMap;
    }

    //根据当前ID查询当前对象信息，用于编辑该项信息时显示到View。
    @RequestMapping("/findMaterialById")
    @ResponseBody
    public Map<String,Object> findMaterialById(Long id){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        Material material = materialService.selectByPrimaryKey(id);
        modelMap.put("success",true);
        modelMap.put("material",material);
        return  modelMap;
    }

    //根据前端传递过来的ID更新该项数据(全局/局部更新)
    @RequestMapping("/updateMaterialById")
    @ResponseBody
    public Map<String,Object> updateMaterialById(Long id){
        Map<String,Object> modelMap = new HashMap<String, Object>();
        id = 100123666L;
        Material material = materialService.selectByPrimaryKey(id);
        material.setName("中兴交换机");
        materialService.updateByPrimaryKeySelective(material);
        modelMap.put("success",true);
        modelMap.put("material",material);
        return modelMap;
    }
}