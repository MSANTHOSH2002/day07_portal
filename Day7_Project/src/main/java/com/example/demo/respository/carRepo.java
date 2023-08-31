package com.example.demo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.car;

@Repository
public interface carRepo extends JpaRepository<car, Integer>{
	@Query(value = "select * from car_table where owners = :o",nativeQuery = true)
	public List<car> getCarOwners(@Param("o") int owners);
	
	@Query(value = "select * from car_table where address = :a", nativeQuery = true)
	public List<car> getCarAddress(@Param("a") String address);
	
	@Query(value = "select * from car_table where car_name = :cn", nativeQuery = true)
	public List<car> getCarName(@Param("cn") String carname);
	
	@Query(value = "select * from car_table where owners = :o and car_type = :ct", nativeQuery = true)
	public List<car> getCarOwnerAndCartype(@Param("o") int owners, @Param("ct") String cartype);
}
