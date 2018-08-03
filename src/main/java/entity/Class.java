package entity;

import java.util.List;

//“ª∂‘“ª”≥…‰
public class Class {

	
	/*CREATE TABLE `class` (
			  `c_id` int(11) NOT NULL AUTO_INCREMENT,
			  `c_name` varchar(20) DEFAULT NULL,
			  `teacher_id` int(11) DEFAULT NULL,
			  PRIMARY KEY (`c_id`),
			  KEY `t_c` (`teacher_id`),
			  CONSTRAINT `t_c` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`t_id`)
			) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;*/

	
	private Integer id;
	private String name;
	private Teacher teacher;
	private List<Student> students;
	
	
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
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	@Override
	public String toString() {
		return "Class [id=" + id + ", name=" + name + ", teacher=" + teacher + ", students=" + students + "]";
	}
}
