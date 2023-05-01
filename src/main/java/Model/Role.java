package Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Role {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roleId;
	private String role;
	
	public Role() {}
	
	public Role(int roleId, String role) {
		this.roleId = roleId;
		this.role = role;
	}
	public Role( String role) {
		this.role = role;
	}



	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", role=" + role + "]";
	}
	
	

}
