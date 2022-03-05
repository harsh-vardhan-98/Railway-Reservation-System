package com.example.demo.model.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="ticket-sequence")
public class TicketSequence {
	
	@Id
	private String id;
	public TicketSequence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TicketSequence(String id, long seq) {
		super();
		this.id = id;
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getSeq() {
		return seq;
	}
	public void setSeq(long seq) {
		this.seq = seq;
	}
	private long seq;

	
}
