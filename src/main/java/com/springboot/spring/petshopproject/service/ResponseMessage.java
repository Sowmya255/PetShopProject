package com.springboot.spring.petshopproject.service;

import java.time.LocalDateTime;

public class ResponseMessage {

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public LocalDateTime getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(LocalDateTime timestamp) {
			this.timestamp = timestamp;
		}

		private LocalDateTime timestamp;
		private String message;
	    
		
	    public ResponseMessage(String message) {
	        this.timestamp = LocalDateTime.now(); 
	        this.message = message;
	    }
	}

