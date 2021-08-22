package com.lanqiao.videoVIP.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanqiao.videoVIP.entity.SpGklsb;
import com.lanqiao.videoVIP.service.SpGklsbService;

@Controller
@RequestMapping("SpGklsbController")
public class SpGklsbController {

	@Autowired
	private SpGklsbService spGklsbService;
	
	@RequestMapping("selectById.do")
	@ResponseBody
	public List<SpGklsb> selectById(String yhzh) {
		return spGklsbService.selectById(yhzh);
	}
	
	@RequestMapping("list.do")
	@ResponseBody
	public List<SpGklsb> list() {
		return spGklsbService.list();
	}
}
