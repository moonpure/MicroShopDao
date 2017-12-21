/** 
 * 项目名称:servicedao 
 * 文件名称:MallorderController.java 
 * 包名:com.microshop.servicedao.controller 
 * 创建日期:2017年12月19日下午7:48:53 
 * Copyright (c) 2017, 1611674711@qq.comAll Rights Reserved.</pre> 
 */
package com.microshop.servicedao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microshop.servicedao.core.MapperServiceImpl;
import com.microshop.servicedao.model.Mallorder;
import com.microshop.servicedao.model.MallorderKey;

/**
 * 项目名称：servicedao 类名称：MallorderController 类描述： 创建人：ZhangKai 953054933@qq.com
 * 创建时间：2017年12月19日 下午7:48:53 修改人：ZhangKai 953054933@qq.com 修改时间：2017年12月19日
 * 下午7:48:53 修改备注：
 * 
 * @version
 */
@RestController
@RequestMapping("order")
public class MallorderController {
	@Autowired
	MapperServiceImpl mapperService;

	@RequestMapping("/selectbyprimarykey")
	public Mallorder selectByPrimaryKey(@RequestBody MallorderKey mallorderKey) {
		return mapperService.getMallorderMapper().selectByPrimaryKey(mallorderKey);
	}
}
