package com.sangyang.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sangyang.mapper.FilghtMapper;
import com.sangyang.vo.Filght;
@Repository("dao")
public class FilghtImplDao  implements FilghtDao{
	
	@Autowired
	private FilghtMapper mapper;
	@Override
	public List<Filght> queryFilght() {
		List<Filght> queryFilght =mapper.queryFilght();
		
		return queryFilght;
		
	}

	@Override
	public void addFilght(Filght filght) {
		mapper.addFilght(filght);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Filght queryupd(Integer hid) {
		Filght queryupd = mapper.queryupd(hid);
		return queryupd;
	}

	@Override
	public void queryupda(Filght filght) {
		mapper.queryupda(filght);
		
	}

}
