import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.dto.Dept;
import com.service.DBService;

public class TestMain {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("com/config/test.xml");
		
		DBService service = ctx.getBean("myService",DBService.class);
		//1.저장
		//int num = service.insert(new Dept(87,"개발","서울"));
		
		//2.수정
		//service.update(new Dept(87,"개발2","서울2"));
		
		//3.삭제
		//service.deleteByDeptno(87);
		
		List<Dept> list = service.list();
		for(Dept dept:list) {
			System.out.println(dept);
		}
	}

}
