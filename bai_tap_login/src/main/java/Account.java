public class Account {
    public String fullname;
    public  String user;
    public String password;

    public Account(String fullname, String user, String password) {
        this.fullname = fullname;
        this.user = user;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
