package domain;


public class Address {
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getStreetInfo() {
        return streetInfo;
    }

    public void setStreetInfo(String streetInfo) {
        this.streetInfo = streetInfo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    private String cep;
    private String streetInfo;
    private String city;
    private String state;
    private String complement;

    @Override
    public String toString() {
        return "Address{" +
                "cep='" + cep + '\'' +
                ", streetInfo='" + streetInfo + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", complement='" + complement + '\'' +
                '}';
    }

    public static final class AddressBuilder {
        private String cep;
        private String streetInfo;
        private String city;
        private String state;
        private String complement;

        private AddressBuilder() {
        }

        public static AddressBuilder anAddress() {
            return new AddressBuilder();
        }

        public AddressBuilder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public AddressBuilder streetInfo(String streetInfo) {
            this.streetInfo = streetInfo;
            return this;
        }

        public AddressBuilder city(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder state(String state) {
            this.state = state;
            return this;
        }

        public AddressBuilder complement(String complement) {
            this.complement = complement;
            return this;
        }

        public Address build() {
            Address address = new Address();
            address.setCep(cep);
            address.setStreetInfo(streetInfo);
            address.setCity(city);
            address.setState(state);
            address.setComplement(complement);
            return address;
        }
    }
}
