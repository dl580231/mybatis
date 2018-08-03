package entity;

public class Student {

	
	/*CREATE TABLE `student` (
			  `s_id` int(11) NOT NULL AUTO_INCREMENT,
			  `s_name` varchar(20) DEFAULT NULL,
			  `class_id` int(11) DEFAULT NULL,
			  PRIMARY KEY (`s_id`),
			  KEY `class_id` (`class_id`),
			  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `class` (`c_id`)
			)*/
	
	
	private Integer id;
	private String name;
	/*private Class class1;*/
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	/*public Class getClass1() {
		return class1;
	}
	public void setClass1(Class class1) {
		this.class1 = class1;
	}*/
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	/*@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", class1=" + class1 + "]";
	}*/
}
