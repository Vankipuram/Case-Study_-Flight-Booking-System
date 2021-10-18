package com.checkin.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.checkin.entity.CheckIn;

@Repository
public interface CheckInRepository extends MongoRepository<CheckIn, Integer>{

}
