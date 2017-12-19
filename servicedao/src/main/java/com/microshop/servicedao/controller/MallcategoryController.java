package com.microshop.servicedao.controller;

import com.microshop.servicedao.core.MapperServiceImpl;
import com.microshop.servicedao.model.Mallbanner;
import com.microshop.servicedao.model.Mallcategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categor")
public class MallcategoryController {
    @Autowired
    MapperServiceImpl mapperService;

    @RequestMapping("/deletebyprimarykey/{id}")
    public int deleteByPrimaryKey(@PathVariable Integer id)
    {
        return mapperService.getMallcategoryMapper().deleteByPrimaryKey(id);
    }
    @RequestMapping("/insert")
    public int insert(@ModelAttribute Mallcategory record)
    {
        return mapperService.getMallcategoryMapper().insert(record);

    }
    @RequestMapping("/insertselective")
    public int insertSelective(@ModelAttribute Mallcategory record)
    {

        return mapperService.getMallcategoryMapper().insertSelective(record);
    }
    @RequestMapping("/selectbyprimarykey/{id}")
    public Mallcategory selectByPrimaryKey( @PathVariable Integer id)
    {
        return mapperService.getMallcategoryMapper().selectByPrimaryKey(id);
    }
    @RequestMapping("/updatebyprimarykeyselective")
    public int updateByPrimaryKeySelective(@ModelAttribute Mallcategory record)
    {
        return mapperService.getMallcategoryMapper().updateByPrimaryKeySelective(record);
    }
    @RequestMapping("/updatebyprimarykey")
    public int updateByPrimaryKey(@ModelAttribute Mallcategory record)
    {
        return mapperService.getMallcategoryMapper().updateByPrimaryKey(record);
    }
}
