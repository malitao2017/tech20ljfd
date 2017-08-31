package j4password.utils;


import java.io.Serializable;

import com.techstar.modules.core.springframework.data.jpa.domain.IdEntity;

public class BaseUser extends IdEntity implements Serializable {

	private String loginName;
	private String password;
	private String salt;
	private String plainPassword;
	private String name;
	
	public BaseUser() {
		
	}

	public BaseUser(String id) {
		setId(id);
	}

	public BaseUser(String id, String loginName, String password, String name) {
		setId(id);
		this.loginName = loginName;
		this.password = password;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPlainPassword() {
		return plainPassword;
	}

	public void setPlainPassword(String plainPassword) {
		this.plainPassword = plainPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
