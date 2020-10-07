package pers.jay.equality.pojo;

import java.io.Serializable;

public class Actor implements Serializable {
	private static final long serialVersionUID = 1L;
	private int actorId;
	private String firstName;
	private String lastName;
	
	private String remark;
	// public Actor() {
	// }

	public Actor(int actorId, String firstName, String lastName) {
		this.actorId = actorId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//jay 
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	

}
