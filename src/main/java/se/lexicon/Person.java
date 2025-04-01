package se.lexicon;

public class Person {

    //fields
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    //constructor
    public Person(int id, String firstName, String lastName, String email){
    this.id = id;
    setFirstName(firstName);
    setLastName(lastName);
    setEmail(email);
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        if(firstName == null || firstName.trim().isEmpty()){
            throw new IllegalArgumentException("firstname can't be null or empty");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.trim().isEmpty()){
            throw new IllegalArgumentException("lastname can't be null or empty");
        }
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        if(email == null || email.trim().isEmpty()){
            throw new IllegalArgumentException("email can't be null or empty");
        }
        this.email = email;
    }

    //other methods
    public String getSummary(){
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(id).append(", Name: ")
                .append(firstName).append(" ").append(lastName)
                .append(", email: ").append(email);

        return sb.toString();
    }

}
