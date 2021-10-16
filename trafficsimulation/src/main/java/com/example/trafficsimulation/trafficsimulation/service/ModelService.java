package com.example.trafficsimulation.trafficsimulation.service;

import java.util.List;

import com.example.trafficsimulation.trafficsimulation.entity.Model;


public interface ModelService {
	
	public void addModel(Model model);
	public void deleteModel(Model model);
	public List<Model> getAllModel();
	public Model updateModel(Model model);
	public Model getModelById(Integer id);
}
                                                