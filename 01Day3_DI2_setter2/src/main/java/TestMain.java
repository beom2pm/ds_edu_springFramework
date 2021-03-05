import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DBService;


public class TestMain {

	public static void main(String[] args) {

		
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("com/config/test.xml");
		
		DBService service = ctx.getBean("dbService",DBService.class);
		List<String> list = service.list();
		System.out.println(list);
		
		

	}

}
