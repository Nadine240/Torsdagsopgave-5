public class Customer {
    //1.a
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter = 0;
   //1.b
    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.id = ++counter; //1.c


    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getUserName() {
        return userName;
    }
    public int getId() {
        return id;
    }
    public String toString(){
        return "Customer{id=" + id + ",firstName'" + firstName + "', lastName'" + lastName + "', username '" + userName + "'}";
    }
}

