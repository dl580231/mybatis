package entity;

//ʵ�����������������ݿ���Ӧ�����ֲ�һ��
public class Order {
	/*CREATE TABLE orders(
		    order_id INT PRIMARY KEY AUTO_INCREMENT,
		    order_no VARCHAR(20), 
		    order_price FLOAT
		);*/
	
	private Integer id;
	private String orderNo;
	private Float orderPrice;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public Float getorderPrice() {
		return orderPrice;
	}
	public void setorderPrice(Float orderPrice) {
		this.orderPrice = orderPrice;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNo=" + orderNo + ", orderPrice=" + orderPrice + "]";
	}
	
	
}
