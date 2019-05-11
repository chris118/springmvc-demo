package Model;

public class User {
    private String username;
    private String password;
    private String address;
    private Boolean isReceivePaper;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getIsReceivePaper() {
        return isReceivePaper;
    }

    public void setIsReceivePaper(Boolean isReceivePaper) {
        this.isReceivePaper = isReceivePaper;
    }
}
