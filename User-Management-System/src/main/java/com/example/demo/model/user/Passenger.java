package com.example.demo.model.user;

public class Passenger {
	    
	    private String passenger_name;
	    private int age;
	    private String contact_no;
	    private String sex;
	    public Passenger() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Passenger( String passenger_name, int age, String contact_no, String sex, String quota,
				String class_name) {
			super();
			
			this.passenger_name = passenger_name;
			this.age = age;
			this.contact_no = contact_no;
			this.sex = sex;
			this.quota = quota;
			this.class_name = class_name;
		}
		
		public String getPassenger_name() {
			return passenger_name;
		}
		public void setPassenger_name(String passenger_name) {
			this.passenger_name = passenger_name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getContact_no() {
			return contact_no;
		}
		public void setContact_no(String contact_no) {
			this.contact_no = contact_no;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getQuota() {
			return quota;
		}
		public void setQuota(String quota) {
			this.quota = quota;
		}
		public String getClass_name() {
			return class_name;
		}
		public void setClass_name(String class_name) {
			this.class_name = class_name;
		}
		private String quota;
	    private String class_name;
	}
	

