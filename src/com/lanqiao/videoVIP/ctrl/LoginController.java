package com.lanqiao.videoVIP.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanqiao.videoVIP.entity.Yhb;
import com.lanqiao.videoVIP.service.YhbService;

@Controller
@RequestMapping("LoginController")
public class LoginController {
	@Autowired
	private YhbService yhbService;

	/** 通过对象查询用户 */
	@RequestMapping("doLogin.do")
	@ResponseBody
	public Yhb doLogin(Yhb yhb) {
		return yhbService.selectByObj(yhb);
	}
}
