package entity;

public class Teacher {

	/*CREATE TABLE `teacher` (
			  `t_id` int(11) NOT NULL AUTO_INCREMENT,
			  `t_name` varchar(20) DEFAULT NULL,
			  PRIMARY KEY (`t_id`)
			) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;*/
	
	private Integer id;
	private String name;
	
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
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
