package com.cg.repo;

import java.util.List;

import com.cg.entity.Theatre;

public interface TheatreRepo {

	List<Theatre> getTheatresByCity(String city);

}
