package xujun.violet.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity	// 表示为实体类
@Table(name="lover")		//标注表名
public class Lover {

	@Id
	@Column(name="id")
	@GeneratedValue
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private String age;
	
	@Column(name="balance")
	private String balance;
	
	public Lover() {}
	
	public Lover(Integer id, String name, String age, String balance) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}
	
	
}
