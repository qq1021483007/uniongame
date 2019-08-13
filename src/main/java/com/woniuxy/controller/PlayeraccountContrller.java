package com.woniuxy.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.woniuxy.domin.Playeracc;
import com.woniuxy.service.IPlayerService;
import com.woniuxy.tools.MD5;
import com.woniuxy.tools.UUIDUtil;


@Controller
@RequestMapping("admin/player")
public class PlayeraccountContrller {

	@Resource
	IPlayerService iPlayerServiceImpl;

	@RequestMapping("signin") 
	public String singin(Playeracc p) { 
		
		p.setPid(UUIDUtil.getUUID());
		p.setPpassword(MD5.getMD5(p.getPaccount()));
		iPlayerServiceImpl.save(p);
		return "admin/player/load";
	}
	
	@RequestMapping("singup")
	public String singup(Playeracc p,HttpSession session) {
		iPlayerServiceImpl.load(p);
		return "ssss";
		
	}
}
