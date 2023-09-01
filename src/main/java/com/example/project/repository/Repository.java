package com.example.project.repository;


	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

	import org.springframework.data.jpa.repository.Query;
	import org.springframework.data.repository.query.Param;

import com.example.project.model.Model;


	

	public interface Repository extends JpaRepository<Model, Integer> {

		@Query(value = "select * from Bikeinfo where year=:ns",nativeQuery = true)
		public List<Model> getBikeinfoyear(@Param("ns") int year);
		@Query(value = "select * from Bikeinfo where year=:ns or bikename=:s",nativeQuery = true)
		public List<Model> getBikeinfo(@Param("ns") int year,@Param("s") String bikename);
		@Query(value = "select * from Bikeinfo where bikename=:s",nativeQuery = true)
		public List<Model> getBikename(@Param("s") String bikename);
		
	}


