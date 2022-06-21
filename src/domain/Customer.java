package domain;

public class Customer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphoneNumber() {
        return cellphoneNumber;
    }

    public void setCellphoneNumber(String cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", email='" + email + '\'' +
                ", cellphoneNumber='" + cellphoneNumber + '\'' +
                ", room=" + room +
                '}';
    }

    private String name;
    private Gender gender;
    private Address address;
    private String email;
    private String cellphoneNumber;

    private Room room;


    public static final class CustomerBuilder {
        private String name;
        private Gender gender;
        private Address address;
        private String email;
        private String cellphoneNumber;
        private Room room;

        private CustomerBuilder() {
        }

        public static CustomerBuilder aCustomer() {
            return new CustomerBuilder();
        }

        public CustomerBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CustomerBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public CustomerBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public CustomerBuilder email(String email) {
            this.email = email;
            return this;
        }

        public CustomerBuilder cellphoneNumber(String cellphoneNumber) {
            this.cellphoneNumber = cellphoneNumber;
            return this;
        }

        public CustomerBuilder room(Room room) {
            this.room = room;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer();
            customer.setName(name);
            customer.setGender(gender);
            customer.setAddress(address);
            customer.setEmail(email);
            customer.setCellphoneNumber(cellphoneNumber);
            customer.setRoom(room);
            return customer;
        }
    }
}
