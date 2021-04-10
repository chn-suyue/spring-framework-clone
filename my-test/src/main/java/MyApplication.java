/**
 * @description:
 * @author: suyue
 * @time: 2021/4/7 11:51
 */

import bean.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {
		//aware接口作用：通过spring中的bean对象获取容器中的相关属性值，比如environment，比如classname等。
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello hello = (Hello)ac.getBean("hello");
		hello.sayHello();
	}

}
