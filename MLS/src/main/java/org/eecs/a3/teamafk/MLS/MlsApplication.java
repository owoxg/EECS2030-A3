package org.eecs.a3.teamafk.MLS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.sql.*;
import java.util.Date;

@Controller
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MlsApplication {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://mrleavesbbs.com:3306/mls";
	static final String USER = "mls";
	static final String PASS = "mls123456";

	Connection conn = null;
	Statement stmt = null;
	String sql;

	public static void main(String[] args) {
		SpringApplication.run(MlsApplication.class, args);
		Connection conn = null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Succeeded！");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody
	String sayHello(@RequestParam(value = "name", required = false, defaultValue = "Stranger") String name)
	{
		return "Hello " + name + "!";
	}
	//http://localhost:9000/hello?name=TeamAFK

	/*@RequestMapping(value = "/mlslookup", method = RequestMethod.GET)
	public @ResponseBody
	String mlsLookup(@RequestParam(value = "uuid", required = true) UUID uuid) {

		return "1";
	}
	*/

	@RequestMapping(value = "/building", method = RequestMethod.GET)
	public @ResponseBody
	String mlsLookup(@RequestParam(value = "id", required = true) int id) {
		try {
			try {
				Class.forName(JDBC_DRIVER);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("Connecting...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Succeeded！");
			stmt = conn.createStatement();
			sql = "SELECT * FROM building WHERE id="+id;
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String type = rs.getString("type");
				int size = rs.getInt("size");
				String address = rs.getString("address");
				String country = rs.getString("country");
				String schooldistrict = rs.getString("schooldistrict");
				int bedrooms = rs.getInt("bedrooms");
				int livingroom = rs.getInt("livingrooms");
				int totalrooms = rs.getInt("totalrooms");
				String expenses = rs.getString("expenses");
				String builtdate = rs.getDate("builtdate").toString();
				int floorlevel = rs.getInt("floorlevel");;
				boolean pool = rs.getBoolean("pool");
				boolean cableready = rs.getBoolean("cableready");
				boolean furnished = rs.getBoolean("furnished");
				boolean hassecurity = rs.getBoolean("hassecurity");
				boolean hasgarden = rs.getBoolean("hasgarden");
				int gardensize = rs.getInt("gardensize");
				String description = rs.getString("description");
				switch (type){
					case "Condo":
						BuildCondo condo = new Building.BuildingBuilder().type(type).size(size).address(address).country(country).schooldistrict(schooldistrict).bedrooms(bedrooms).livingroom(livingroom).totalrooms(totalrooms).expenses(expenses).builtdate(builtdate).floorlevel(floorlevel).pool(pool).cableready(cableready).furnished(furnished).hassecurity(hassecurity).hasgarden(hasgarden).gardensize(gardensize).description(description).buildcondo();
						return condo.Display();
				}
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return "Probably, this is a Bug";
	}

}


