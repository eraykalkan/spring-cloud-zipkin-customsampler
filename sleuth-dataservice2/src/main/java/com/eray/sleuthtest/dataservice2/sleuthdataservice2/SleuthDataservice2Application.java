package com.eray.sleuthtest.dataservice2.sleuthdataservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Hashtable;

@SpringBootApplication
@RestController
public class SleuthDataservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(SleuthDataservice2Application.class, args);
	}


	@RequestMapping(value="/customer/{cid}/vehicledetails", method= RequestMethod.GET)
	public @ResponseBody
	String getCustomerVehicleDetails(@PathVariable Integer cid) throws InterruptedException{

		Hashtable<Integer, String> vehicles = new Hashtable<Integer, String>();
		vehicles.put(100, "Lincoln Continental; Plate SNUG30");
		vehicles.put(101, "Chevrolet Camaro; Plate R7TYR43");
		vehicles.put(102, "Volkswagen Beetle; Plate 6CVI3E2");

		String result = vehicles.get(cid);

		return result;
	}
}
