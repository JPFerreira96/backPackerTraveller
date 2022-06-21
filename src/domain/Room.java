package domain;

public class Room {
    private int num;
    private Type type;

    private Floor floor;

    private Customer[] customers;

    private double amountToBePaid = 0;

    public int getNum() {
        return num;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Floor getFloor() {
        return floor;
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public double getAmountToBePaid() {
        return amountToBePaid;
    }

    public void setAmountToBePaid(double amountToBePaid) {
        this.amountToBePaid += amountToBePaid;
    }



    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Room{" +
                "num=" + num +
                ", type=" + type +
                ", floor=" + floor +
                '}';
    }


    public static final class RoomBuilder {
        private int num;
        private Type type;
        private Floor floor;
        private Customer[] customers;
        private double amountToBePaid = 0;

        private RoomBuilder() {
        }

        public static RoomBuilder aRoom() {
            return new RoomBuilder();
        }

        public RoomBuilder num(int num) {
            this.num = num;
            return this;
        }

        public RoomBuilder type(Type type) {
            this.type = type;
            return this;
        }

        public RoomBuilder floor(Floor floor) {
            this.floor = floor;
            return this;
        }

        public RoomBuilder customers(Customer[] customers) {
            this.customers = customers;
            return this;
        }

        public RoomBuilder amountToBePaid(double amountToBePaid) {
            this.amountToBePaid = amountToBePaid;
            return this;
        }

        public Room build() {
            Room room = new Room();
            room.setNum(num);
            room.setType(type);
            room.setFloor(floor);
            room.setCustomers(customers);
            room.setAmountToBePaid(amountToBePaid);
            return room;
        }
    }
}


