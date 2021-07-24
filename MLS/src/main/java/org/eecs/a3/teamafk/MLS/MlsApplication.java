package org.eecs.a3.teamafk.MLS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.sql.*;
import java.util.UUID;


/**
 * WEB API controller
 * @author Ken Ren
 * @version 1.0
 */
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

	/**
	 * Start SpringBoot and Test Connection
	 */
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

	/**
	 * A helloword tester
	 * @param name a name for input
	 */
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

	/**
	 * Display the inside building search result
	 * @param id the id for searching building
	 */
	@RequestMapping(value = "/building/display", method = RequestMethod.GET)
	public @ResponseBody
	String buildingdisplay(@RequestParam(value = "id", required = true) int id) {
		if (buildingLookup(id)==null){
			return "No Result Found";
		}
		return buildingLookup(id).Display();
	}

	/**
	 * The actual method for searching building
	 * @param id the id for searching building
	 */
	public Building buildingLookup(int id) {
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
			rs.next();
			if(rs==null){
				return null;
			}
				String type = rs.getString("type");
				int size = rs.getInt("size");
				String address = rs.getString("address");
				String country = rs.getString("country");
				String schooldistrict = rs.getString("schooldistrict");
				int bedrooms = rs.getInt("bedrooms");
				int livingroom = rs.getInt("livingrooms");
				int totalrooms = rs.getInt("totalrooms");
				String expenses = rs.getString("expenses");
				String builtdate ="NOT AVAILABLE";
				if(rs.getDate("builtdate")!=null){
					builtdate = rs.getDate("builtdate").toString();
				}
				int floorlevel = rs.getInt("floorlevel");;
				boolean pool = rs.getBoolean("pool");
				boolean cableready = rs.getBoolean("cableready");
				boolean furnished = rs.getBoolean("furnished");
				boolean hassecurity = rs.getBoolean("hassecurity");
				boolean hasgarden = rs.getBoolean("hasgarden");
				int gardensize = rs.getInt("gardensize");
				String description = rs.getString("description");
				switch (type) {
					case "Condo":
						BuildCondo condo = new Building.BuildingBuilder().type(type).size(size).address(address).country(country).schooldistrict(schooldistrict).bedrooms(bedrooms).livingroom(livingroom).totalrooms(totalrooms).expenses(expenses).builtdate(builtdate).floorlevel(floorlevel).pool(pool).cableready(cableready).furnished(furnished).hassecurity(hassecurity).hasgarden(hasgarden).gardensize(gardensize).description(description).buildcondo();
						return condo;
				}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

	/**
	 * Display the inside owner search result
	 * @param id the id for searching owner
	 */
	@RequestMapping(value = "/owner/display", method = RequestMethod.GET)
	public @ResponseBody
	String ownerdisplay(@RequestParam(value = "id", required = true) int id) {
		if (ownerLookup(id)==null){
			return "No Result Found";
		}
		return ownerLookup(id).Display();
	}

	/**
	 * The actual method for searching owner
	 * @param id the id for searching owner
	 */
	public Owner ownerLookup(int id) {
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
			sql = "SELECT * FROM owner WHERE id="+id;
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			if(rs==null){
				return null;
			}
				String firstname = rs.getString("firstname");
				String lastname = rs.getString("lastname");
				String phone = rs.getString("phone");
				String email = rs.getString("email");
				Owner owner = new Owner.Builder().firstnameOfOwner(firstname).lastnameOfOwner(lastname).phoneNumber(phone).emailAddress(email).build();
				return owner;
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

	/**
	 * Display the inside parking search result
	 * @param id the id for searching parking
	 */
	@RequestMapping(value = "/parking/display", method = RequestMethod.GET)
	public @ResponseBody
	String parkingdisplay(@RequestParam(value = "id", required = true) int id) {
		if (parkingLookup(id)==null){
			return "No Result Found";
		}
		return parkingLookup(id).Display();
	}

	/**
	 * The actual method for searching parking
	 * @param id the id for searching parking
	 */
	public Parking parkingLookup(int id) {
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
			sql = "SELECT * FROM parking WHERE id="+id;
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			if(rs==null){
				return null;
			}
				String type = rs.getString("type");
				int size = rs.getInt("size");
				Boolean rvok = rs.getBoolean("rvok");
				Parking parking = new Parking.Builder().typeofParking(type).sizeofParking(size).RVofParking(rvok).build();
				return parking;
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

	/**
	 * Display the inside parking search result
	 * @param id the id for searching mls
	 */
	@RequestMapping(value = "/mls/display", method = RequestMethod.GET)
	public @ResponseBody
	String mlsdisplay(@RequestParam(value = "id", required = true) UUID id) {
		if (mlsLookup(id)==null){
			return "No Result Found";
		}
		return mlsLookup(id).Display();
	}

	/**
	 * The actual method for searching owner
	 * @param id the id for searching owner
	 */
	public MLS mlsLookup(UUID id) {
		if (SingletonCache.getInstance().getByID(id) != null){
			return SingletonCache.getInstance().getByID(id);
		}
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
			sql = "SELECT * FROM mls WHERE uuid=\'"+id+"\'";
			ResultSet rs = stmt.executeQuery(sql);
			rs.next();
			if(rs==null){
				return null;
			}
				int ownerid = rs.getInt("ownerid");
				int buildingid = rs.getInt("buildingid");
				int parkingid = rs.getInt("parkingid");
				String mlsname = rs.getString("mlsname");
				String listtype = rs.getString("listtype");
				int price = rs.getInt("price");
				String listdate ="NOT AVAILABLE";
				if(rs.getDate("listdate")!=null){
					listdate = rs.getDate("listdate").toString();
				}
				String enddate = null;
				if(rs.getDate("enddate")!=null){
					enddate = rs.getDate("enddate").toString();
				}
				boolean sold = rs.getBoolean("sold");
				String brokerage = rs.getString("brokerage");
				String listingurl = rs.getString("listingurl");
				MLS mls = new MLS.Builder(id).Owneris1(ownerLookup(ownerid)).Buildingis2(buildingLookup(buildingid)).Parkingis3(parkingLookup(parkingid)).Listingnameis4(mlsname).Listtypeis5(listtype).Priceis6(price).Listdateis7(listdate).enddateis7a(enddate).soldis7b(sold).Brokerageis8(brokerage).listingurlis9(listingurl).build();
				SingletonCache.getInstance().putValue(id,mls);
				return mls;
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return null;
	}

}

