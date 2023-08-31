package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.car;
import com.example.demo.respository.carRepo;

@Service
public class carService {
@Autowired
carRepo cr;
public car addCar(car ca)
{
	return cr.save(ca);
}
public List<car> getInfo()
{
	return cr.findAll();
}
public List<car> showOwner(int owners)
{
	return cr.getCarOwners(owners);
}
public List<car> showAddress(String address)
{
	return cr.getCarAddress(address);
}
public List<car> showCarName(String carname)
{
	return cr.getCarName(carname);
}
public List<car> showOwnersAndCartype(int owners,String cartype)
{
	return cr.getCarOwnerAndCartype(owners, cartype);
}
}
