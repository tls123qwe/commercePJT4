package commerce;

public class Customer {
    private String customerName;
    private String email;
    private String grade;

    public Customer(String customerName, String email, String grade) {
        this.customerName = customerName;
        this.email = email;
        this.grade = grade;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }
}
