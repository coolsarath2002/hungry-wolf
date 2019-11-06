package com.hungrywolf.base.db.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class WolfOrderRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

}
