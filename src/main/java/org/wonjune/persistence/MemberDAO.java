package org.wonjune.persistence;

import org.wonjune.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);
}
