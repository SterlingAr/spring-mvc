package com.packt.webstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	@Override
	public List<Customer> getAllCustomers() {
		
		Map<String,Object> params = new HashMap<String,Object>();
		List<Customer> customers = jdbcTemplate.query("SELECT * FROM CUSTOMERS", params, new ProductMapper());
		
		return customers;
	}
	
	private static final class ProductMapper implements RowMapper<Customer>{

		
		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer customer = new Customer();
			
			customer.setCustomerId(rs.getString("CUSTOMER_ID"));
			customer.setName(rs.getString("NAME"));
			customer.setAdress(rs.getString("ADRESS"));
			customer.setNoOfOrdersMade(rs.getLong("NO_ORDERS_MADE"));

			return customer;
		}
		
		
		
	}

	@Override
	public void addCustomer(Customer cus) {
		
		String SQL = "INSERT INTO CUSTOMERS (CUSTOMER_ID,"
				+ "NAME,"
				+ "ADRESS,"
				+ "NO_ORDERS_MADE)"
				+ " VALUES ("
				+ ":customerid,"
				+ ":name,"
				+ ":adress,"
				+ ":ordersMade"
				+ ")";
		
		Map<String,Object> params = new HashMap<String,Object>();
		
		params.put("customerid", cus.getCustomerId());
		params.put("name", cus.getName());
		params.put("adress", cus.getAdress());
		params.put("ordersMade", cus.getNoOfOrdersMade());
		
		jdbcTemplate.update(SQL, params);
	}

}
