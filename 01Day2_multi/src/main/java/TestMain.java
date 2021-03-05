import org.springframework.context.support.GenericXmlApplicationContext;

import com.service.DBService;
import com.service.DBService2;

public class TestMain {

	public static void main(String[] args) {
		// IoC Container
		
		/*GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("com/config/test.xml",
						"com/config/test2.xml");*/
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("com/config/*.xml");
		
		DBService s1 = ctx.getBean("aaa",DBService.class);
		System.out.println(s1.getInfo());
		DBService2 s2= ctx.getBean("bbb",DBService2.class);
		System.out.println(s2.getInfo()
				);
		

	}

}
