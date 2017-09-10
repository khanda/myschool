package star.share.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "TYPE")
	private String type;
	@Column(name = "ISADMIN")
	private boolean isadmin;
	@Column(name = "STATUS")
	private int status;
	@Column(name = "ISONLINE")
	private boolean isonline;

	public User() {
	}

	public User(Long id) {
		this.id = id;
	}

	public User(Long id, String username, String password, String type, boolean isadmin, int status, boolean isonline) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.type = type;
		this.isadmin = isadmin;
		this.status = status;
		this.isonline = isonline;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean getIsadmin() {
		return isadmin;
	}

	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public boolean getIsonline() {
		return isonline;
	}

	public void setIsonline(boolean isonline) {
		this.isonline = isonline;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof User)) {
			return false;
		}
		User other = (User) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "controller.Users[ id=" + id + " ]";
	}

}
