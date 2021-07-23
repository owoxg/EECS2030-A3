package org.eecs.a3.teamafk.MLS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.sql.*;

@Controller
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MlsApplication {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://mrleavesbbs.com:3306/mls";
	static final String USER = "";
	static final String PASS = "";

	public static void main(String[] args) {
		SpringApplication.run(MlsApplication.class, args);
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("连接数据库...");
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("连接成功！");
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
}


