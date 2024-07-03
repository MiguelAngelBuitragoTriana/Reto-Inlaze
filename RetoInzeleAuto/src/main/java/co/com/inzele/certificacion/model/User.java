package co.com.inzele.certificacion.model;

public class User {
    private String fullName;
    private String email;
    public User(String fullName, String email){
        this.fullName=fullName;
        this.email=email;
    }


    public String getEmail() {
        return email;
    }

    public String getFullName() {
        return fullName;
    }
}
