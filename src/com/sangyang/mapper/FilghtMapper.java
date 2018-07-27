package com.sangyang.mapper;

import java.util.List;


import com.sangyang.vo.Filght;


public interface FilghtMapper {

	public List<Filght> queryFilght();
	public void  addFilght( Filght filght);
	
	public Filght queryupd(Integer hid) ;
	public void queryupda(Filght filght) ;
}
