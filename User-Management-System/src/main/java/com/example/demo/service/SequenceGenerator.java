package com.example.demo.service;


import java.util.Objects;

import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.example.demo.model.user.TicketSequence;
import com.example.demo.model.user.UserSequence;


@Service
public class SequenceGenerator {
	
	FindAndModifyOptions findAndModifyOptions = new FindAndModifyOptions();
	
	@Autowired
	private MongoTemplate mongoTemplate;

	public Long getUserSequenceNumber(String sequenceName) {
		Query query = new Query(Criteria.where("id").is(sequenceName));
		Update update = new Update().inc("seq", 1);
		UserSequence counter = mongoTemplate.findAndModify(query, update, findAndModifyOptions.returnNew(true).upsert(true), UserSequence.class);
		return !Objects.isNull(counter) ? counter.getSeq() : 10001;
	}
	

	public Long getTicketSequenceNumber(String sequenceName) {
		Query query = new Query(Criteria.where("id").is(sequenceName));
		Update update = new Update().inc("seq", 1);
		TicketSequence counter = mongoTemplate.findAndModify(query, update, findAndModifyOptions.returnNew(true), TicketSequence.class);
		return !Objects.isNull(counter)? counter.getSeq():10001;
	}
 

}
