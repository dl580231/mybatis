package entity;

public class Users {

	/*CREATE TABLE `users` (
		`id` int(11) NOT NULL AUTO_INCREMENT,
	    `name` varchar(255) NOT NULL,
		`age` int(11) NOT NULL,
		 PRIMARY KEY (`id`)
	)*/
	
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
