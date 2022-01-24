package jp.ac.ccmc._2x.kimatsu2021;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;



import lombok.Data;

@Data
@Entity
public class Account {
	@Id
	@GeneratedValue
	private Long id;

	@Size(min=3,max=50)
	@NotNull 
	private String name;

	@Size(min=2,max=2)
	@NotNull 
	private String className;

	@NotNull 
	
	@Size(min=11,max=13)
	private String tel;

	@NotNull 
	@Size(min=2,max=100)
	private String address;

	public Account() {
		super();
	}

	public Account(String name, String className, String tel, String address) {
		super();
		this.name = name;
        this.className = className;
		this.tel = tel;
		this.address = address;
	}
}