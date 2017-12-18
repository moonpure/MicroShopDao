package com.microshop.servicedao.controller;

import com.microshop.servicedao.core.MapperServiceImpl;
import com.microshop.servicedao.model.Mallbanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MallbannerController {
    @Autowired
    MapperServiceImpl mapperService;
    @GetMapping("/deletebyprimarykey/{id}")
   public int deleteByPrimaryKey(@PathVariable Integer id)
   {
       return mapperService.getMallbannerMapper().deleteByPrimaryKey(id);
   }
    @GetMapping("/insert")
    public int insert(@ModelAttribute  Mallbanner record)
    {

        return mapperService.getMallbannerMapper().insert(record);

    }
    @GetMapping("/insertselective")
    public int insertSelective(@ModelAttribute Mallbanner record)
    {

        return mapperService.getMallbannerMapper().insertSelective(record);
    }
    @GetMapping("/mallbanner/selectbyprimarykey/{id}")
    public Mallbanner selectByPrimaryKey( @PathVariable Integer id)
    {
        // /mallbanner/selectbyprimarykey/1
        return mapperService.getMallbannerMapper().selectByPrimaryKey(id);
    }
    @GetMapping("/updatebyprimarykeyselective")
    public int updateByPrimaryKeySelective(@ModelAttribute Mallbanner record)
    {
        return mapperService.getMallbannerMapper().updateByPrimaryKeySelective(record);
    }
    @GetMapping("/updatebyprimarykey")
    public int updateByPrimaryKey(@ModelAttribute Mallbanner record)
    {
        return mapperService.getMallbannerMapper().updateByPrimaryKey(record);
    }
}
