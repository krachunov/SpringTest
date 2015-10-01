package contact;

public class Person extends Human{
	private String name;
	private int age;
	private Contact contactInfo;

	public Person(Contact info) {
		setContactInfo(info);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Contact getContactInfo() {
		return contactInfo;
	}

	public void setContactInfo(Contact contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getMail(){
		return contactInfo.getEmail();
	}

}
