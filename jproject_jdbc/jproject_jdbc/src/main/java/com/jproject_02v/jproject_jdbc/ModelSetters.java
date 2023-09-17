package com.jproject_02v.jproject_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ModelSetters {

	private long id;
	private String price;
	private String model;

	public long getId() {

		return id;
	}

	public void setId(long id) {

		this.id = id;
	}

	public String getPrice() {

		return price;
	}

	public void setPrice(String price) {

		this.price = price;
	}

	public String getModel() {

		return model;
	}

	public void setModel(String model) {

		this.model = model;
	}

	private final String url = "jdbc:postgresql://localhost/springproject";
	private final String user = "postgres";
	private final String password = "root";

	public Connection connect() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected");

			Statement st = conn.createStatement();
			String quary = "INSERT INTO testdb (id, name, price) VALUES (id, price, model)";
			int inserting = st.executeUpdate(quary);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return conn;

	}

}
