package contact;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ContactDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Contact contact = new Contact();
		// contact.setEmail("ivan@iva.com");
		// Person ivan = new Person(contact);
		// ivan.setName("Ivan");
		// ivan.setAge(33);
		//
		// System.out.println(ivan.getName());
		// System.out.println(ivan.getMail());

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"Beans.xml");
		Person ivan = context.getBean("adult", Person.class);
		Person pesho = context.getBean("child", Person.class); // The human class is abstract
		System.out.println(ivan.getName());
		System.out.println(ivan.getMail());
		System.out.println(ivan.getGander());
		System.out.println();
		System.out.println(pesho.getName());
		System.out.println(pesho.getMail());
		System.out.println(pesho.getGander());
		
	}
}
