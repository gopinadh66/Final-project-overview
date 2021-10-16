package com.example.trafficsimulation.trafficsimulation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Model {
	
	@Id
	private Integer modelId;
	
	@Column(length = 15)
	private String modelName;

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	

	
	

	

	
	
	
}
