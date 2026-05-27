package hospitalrecords;

public class Nurses {
    private String firstName;
    private String lastName;
    private String otherName;
    private String email;
    private int age;
    private String nationality;

    public Nurses(String firstName,String lastName,String otherName,String email,int age,String nationality){
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
        this.email = email;
        this.age = age;
        this.nationality = nationality;
    }

    public String getFullName(){
        return firstName + " " + lastName + " " + otherName;
    }

    public String getEmail(){
        return email;
    }

    public int getAge(){
        return age;
    }

    public String getNationality(){
        return nationality;
    }
}
