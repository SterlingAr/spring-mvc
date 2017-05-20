package com.bookstore.domain.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookstore.domain.repository.Author;
import com.bookstore.domain.repository.AuthorRepository;

@Repository
public class InMemoryAuthorRepository implements AuthorRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Author> getAllAuthors() {
		String QUERY_AUTHORS = "SELECT * FROM AUTHORS";
		Map<String,Object> params = new HashMap<String,Object>();
		List<Author> authors = jdbcTemplate.query(QUERY_AUTHORS, params, new AuthorMapper());	
		return authors;
	}

	private static final class AuthorMapper implements RowMapper<Author> {

		@Override
		public Author mapRow(ResultSet rs, int rowNum) throws SQLException {
			Author author = new Author();
			author.setAuthorId(UUID.fromString(rs.getString("author_id")));
			author.setFirstName(rs.getString("firstName"));
			author.setLastName(rs.getString("lastName"));
			author.setAge(rs.getInt("age"));
			author.setBiography(rs.getString("biography"));
			
			
			return author;

		}

	}

}
