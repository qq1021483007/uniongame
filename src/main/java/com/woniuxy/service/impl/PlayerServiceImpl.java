package com.woniuxy.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.PlayeraccMapper;
import com.woniuxy.domin.Playeracc;
import com.woniuxy.service.IPlayerService;

@Service
@Transactional
public class PlayerServiceImpl implements IPlayerService {
	@Autowired
	private PlayeraccMapper playeraccountmapper;

	
	@Override
	public void save(Playeracc player) {
		playeraccountmapper.insertSelective(player);
	}


	@Override
	public void load(Playeracc p) {
		System.out.println(p.getPaccount());
		System.out.println(p.getPpassword());
	}


	

}
