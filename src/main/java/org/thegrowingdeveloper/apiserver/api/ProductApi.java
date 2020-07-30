package org.thegrowingdeveloper.apiserver.api;

import java.util.List;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("product")
public class ProductApi {

	@GetMapping(value = "/a")
	public ResponseEntity<String> getProducts() {
		System.out.println("Get Products called");
		List a = new ArrayList();
		{
			
			@Override
			public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet(long index, int count) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getBaseTypeName() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getBaseType() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getArray(long index, int count, Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray(long index, int count) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray(Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void free() throws SQLException {
				// TODO Auto-generated method stub
				
			}
		};
		return new  ResponseEntity<String>("Get Products Called",HttpStatus.OK);
	}
	
}
