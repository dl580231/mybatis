package test_P_User;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import utils.MybatisUtils;

public class TestByXMLMapper {

private SqlSession session=MybatisUtils.getSession(true);
	
	@Test
	public void procedure() {
		String statement="mapping.p_userMapper.getCountBySex";
		Map<String,Integer> map=new HashMap<String, Integer>();
		//0≈Æ£¨∑Ò‘Úƒ–
		map.put("sex", 1);
		/*map.put("count", -1);*/
		session.selectOne(statement, map);
		System.out.println(map.get("count"));
	}
}
