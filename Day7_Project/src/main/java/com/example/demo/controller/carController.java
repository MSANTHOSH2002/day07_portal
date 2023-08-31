package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.car;
import com.example.demo.service.carService;

@RestController
public class carController {
@Autowired
carService cs;
@PostMapping("addCar")
public car add(@RequestBody car ca)
{
	return cs.addCar(ca);
}
@GetMapping("showCar")
public List<car> show()
{
	return cs.getInfo();
}
@GetMapping("showOwner/{owner}")
public List<car> owner(@PathVariable int owner)
{
	return cs.showOwner(owner);
}
@GetMapping("showAddress/{address}")
public List<car> address(@PathVariable String address)
{
	return cs.showAddress(address);
}
@GetMapping("showCarName/{carname}")
public List<car> carname(@PathVariable String carname)
{
	return cs.showCarName(carname);
}
@GetMapping("showDetails/{owners}/{car_type}")
public List<car> carDetail(@PathVariable int owners,@PathVariable String car_type)
{
	return cs.showOwnersAndCartype(owners, car_type);
}
}
