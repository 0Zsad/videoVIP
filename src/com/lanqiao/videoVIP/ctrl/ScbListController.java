package com.lanqiao.videoVIP.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanqiao.videoVIP.entity.ScbList;
import com.lanqiao.videoVIP.service.ScbListService;

@Controller
@RequestMapping("ScbListController")
public class ScbListController {
	
	@Autowired
	private ScbListService scbListService;
	
	/** 查询表 1*/
	@RequestMapping("list.do")
	@ResponseBody
	public List<ScbList> list(String yhzh){
		return scbListService.list(yhzh);
	}
	
	/** 查询表2 */
	/*查询之后分类*/
	@RequestMapping("list2.do")
	@ResponseBody
	public List<ScbList> list2(ScbList scbList){
		return scbListService.list2(scbList);
	}
}
