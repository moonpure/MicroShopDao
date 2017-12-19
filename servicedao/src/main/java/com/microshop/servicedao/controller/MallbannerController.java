package com.microshop.servicedao.controller;

import com.microshop.servicedao.core.MapperServiceImpl;
import com.microshop.servicedao.model.Mallbanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("banner")
public class MallbannerController {
    @Autowired
    MapperServiceImpl mapperService;
    @RequestMapping("/deletebyprimarykey/{id}")
   public int deleteByPrimaryKey(@PathVariable Integer id)
   {
       return mapperService.getMallbannerMapper().deleteByPrimaryKey(id);
   }
    @RequestMapping("/insert")
    public int insert(@ModelAttribute  Mallbanner record)
    {

        return mapperService.getMallbannerMapper().insert(record);

    }
    @RequestMapping("/insertselective")
    public int insertSelective(@ModelAttribute Mallbanner record)
    {

        return mapperService.getMallbannerMapper().insertSelective(record);
    }
    @RequestMapping("/selectbyprimarykey/{id}")
    public Mallbanner selectByPrimaryKey( @PathVariable Integer id)
    {
        return mapperService.getMallbannerMapper().selectByPrimaryKey(id);
    }
    @RequestMapping("/updatebyprimarykeyselective")
    public int updateByPrimaryKeySelective(@ModelAttribute Mallbanner record)
    {
        return mapperService.getMallbannerMapper().updateByPrimaryKeySelective(record);
    }
    @RequestMapping("/updatebyprimarykey")
    public int updateByPrimaryKey(@ModelAttribute Mallbanner record)
    {
        return mapperService.getMallbannerMapper().updateByPrimaryKey(record);
    }
}
