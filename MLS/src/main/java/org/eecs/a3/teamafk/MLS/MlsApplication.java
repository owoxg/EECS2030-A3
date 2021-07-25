package org.eecs.a3.teamafk.MLS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



/**
 * WEB API controller
 * @author Ken Ren
 * @version 1.0
 */
@Controller
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class MlsApplication {


	/**
	 * Start SpringBoot
	 */
	public static void main(String[] args) {
		SpringApplication.run(MlsApplication.class, args);
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

}

