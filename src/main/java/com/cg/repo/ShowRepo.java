package com.cg.repo;

import java.util.List;

import com.cg.entity.Show;

public interface ShowRepo {

	List<Show> findActiveShows();

}
