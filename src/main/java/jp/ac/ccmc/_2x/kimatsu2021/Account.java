package jp.ac.ccmc._2x.kimatsu2021;

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

	@NotNull 
	private String name;


	@NotNull 
	private String className;

	@NotNull 
	private String tel;

	@NotNull 
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