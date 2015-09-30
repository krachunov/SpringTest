
package contact;
import org.springframework.context.ApplicationContext;
import org.springframework.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ContactDemo {

	public static void main(String[] args) {

//		Contact contact = new Contact();
//		contact.setEmail("ivan@iva.com");
//		Person ivan = new Person(contact);
//		ivan.setName("Ivan");
//		ivan.setAge(33);
//
//		System.out.println(ivan.getName());
//		System.out.println(ivan.getMail());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Person ivan =  context.getBean("person",Person.class);
	}
}
