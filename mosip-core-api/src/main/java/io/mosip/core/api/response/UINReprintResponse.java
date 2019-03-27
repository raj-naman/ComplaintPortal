package io.mosip.core.api.response;

import java.util.Date;

public class UINReprintResponse {
	private long uin;
	private String status;
	private String message;
	private String timestamp;
	
	public UINReprintResponse() {
		
	}

	public UINReprintResponse(long uin, String status, String message, String timestamp) {
		super();
		this.uin = uin;
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
	}
	
	
	public long getUin() {
		return uin;
	}

	public void setUin(long uin) {
		this.uin = uin;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "UINReprintResponse [uin=" + uin + ", status=" + status + ", message=" + message + ", timestamp="
				+ timestamp + "]";
	}

	
	
}
