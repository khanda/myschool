package star.share.dto;

public class UserDTO {

    private Long id;
    private String username;
    private String password;
    private String type;
    private boolean isadmin;
    private int status;
    private boolean isonline;

    public UserDTO() {

    }

    public UserDTO(Long id) {
        super();
        this.id = id;
    }

    public UserDTO(Long id, String username, String password, String type, boolean isadmin, int status,
                   boolean isonline) {
        super();
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
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
