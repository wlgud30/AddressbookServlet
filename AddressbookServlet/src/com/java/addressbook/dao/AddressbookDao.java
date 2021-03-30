package com.java.addressbook.dao;

import java.util.List;
import com.java.addressbook.vo.AddressbookVO;

public interface AddressbookDao {
	public List<AddressbookVO> getList();
	//phone_book의 리스트를 가져옴
	
	public List<AddressbookVO> search(String key);
	//phone_book 등록된 전화번호부에 key 라는 글자가 포함되어있는 이름의 유저들 정보 출력
	
	public boolean insert(AddressbookVO vo);
	//phone_book 새로운 전화번호를 추가
	
	public boolean delete(Long id);
	//phone_book 아이디정보를 통해 row 삭제
}
