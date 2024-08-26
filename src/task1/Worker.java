package task1;

public class Worker {
    private int id;
    private String surname;
    private String name;
    private int age;
    private int gender;
    private Address address;
    private Contacts contacts;

    public Worker(int id, String surname, String name, int age, int gender, Address address, Contacts contacts) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.age = age;
        setGender(gender);
        this.address = address;
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        String genderText = switch (gender){
            case Gender.MALE -> "Male";
            case Gender.FEMALE -> "Female";
            default -> "Not Specified";
        };
        return "Worker{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + genderText +
                ", address=" + address +
                ", contacts=" + contacts +
                '}';
    }

    public static class Gender {
        public static final int NOT_SPECIFIED = 0;
        public static final int MALE = 1;
        public static final int FEMALE = 2;
        public static final int MIN = NOT_SPECIFIED;
        public static final int MAX = FEMALE;

    }

    public void setGender(int gender) {
        if(gender < Gender.MIN || gender > Gender.MAX)
            this.gender = Gender.NOT_SPECIFIED;
        else
            this.gender = gender;
    }

    public static class Address {
        private String country;
        private String region;
        private String town;
        private String house;
        private String apartment;

        public Address() {
        }

        public Address(String country, String region, String town, String house, String apartment) {
            this.country = country;
            this.region = region;
            this.town = town;
            this.house = house;
            this.apartment = apartment;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getTown() {
            return town;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getHouse() {
            return house;
        }

        public void setHouse(String house) {
            this.house = house;
        }

        public String getApartment() {
            return apartment;
        }

        public void setApartment(String apartment) {
            this.apartment = apartment;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", region='" + region + '\'' +
                    ", town='" + town + '\'' +
                    ", house='" + house + '\'' +
                    ", apartment='" + apartment + '\'' +
                    '}';
        }
    }

    public static class Contacts {
        private String mail;
        private String phone;

        public Contacts() {
        }

        public Contacts(String mail, String phone) {
            this.mail = mail;
            this.phone = phone;
        }

        public String getMail() {
            return mail;
        }

        public void setMail(String mail) {
            this.mail = mail;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Contacts{" +
                    "mail='" + mail + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }
}
