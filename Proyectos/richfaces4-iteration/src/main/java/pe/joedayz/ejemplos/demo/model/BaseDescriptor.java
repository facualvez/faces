package pe.joedayz.ejemplos.demo.model;

import java.io.Serializable;


public class BaseDescriptor implements Serializable{

	private Integer id;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

}