import java.util.List;

import com.dao.DeptOracleDAO;
import com.dto.Dept;
import com.service.DeptService;

/*
 * 
 * mybatis framework
 * 1. sql mapper ==> sql과 자바와 mapping 역할
 * 	내부적으로는 jdbc 기반으로 동작됨
 * 
 * 2. 실행방법
 * 
 * 	가. 2개의 외부 jar 필요 ==> build path
 * 		- oracle 드라이버(ojdbc6_g.jar)
 * 		- mybatis에서 제공하는 mybatis.jar
 * 		http://mybatis.org
 *  
 *  나. 2개의 xml 필요  ==> src에 저장( 패키지 형태로 저장 가능 )
 *  
 *  	a. 전체 mybatis 설정정보를 관리하는 xml  ==> mybatis-config.xml
 *  	b. sql문을 저장하는 xml ==> 테이블명Mapper.xml, 테이블당 한개씩
 *  
 *  다. MySqlSessionFactory.java ==> mybatis-config.xml 읽어서 설정 정보 파악
 *  	=> SqlSessionFactory 얻어서 SqlSession 사용
 *  
 *  라. DB연동 아키텍처
 *  
 *  Main <---> Service <----> DAO <----> DB
 * 							  DTO(Data Transfer Object):테이블의 하나의 행 데이터 저장용
 * 								  
 */
public class MyBatisTest {

	public static void main(String[] args) {

		DeptService service = new DeptService();
		service.setDao(new DeptOracleDAO());
		
		//1. 99삭제
		int num = service.delete(99);
		System.out.println("1. 삭제된 갯수:" + num);
		
		//2. 추가
		int num2 = service.insert(new Dept(77,"개발","서울"));
		System.out.println("2. 추가된 갯수:" + num2);
		
		//3. 수정
		int num3 = service.update(new Dept(77,"개발2","서울2"));
		System.out.println("3. 수정된 갯수:" + num3);
		
		//4. 특정 행 검색
		Dept dept = service.selectByDeptno(77);
		System.out.println("4.특정행 검색 :" + dept);
		
		List<Dept> list = service.selectAll();
		for(Dept xx: list) {
			System.out.println(xx);
		}
		
		
		
		
	}

}