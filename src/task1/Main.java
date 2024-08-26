package task1;

public class Main {
    public static void main(String[] args) {
        Worker.Address address1 = new Worker.Address("USA", "California", "Los Angeles", "1234", "56");
        Worker.Contacts contacts1 = new Worker.Contacts("john.doe@example.com", "+123456789");
        Worker worker1 = new Worker(1, "Doe", "John", 30, Worker.Gender.MALE, address1, contacts1);

        Worker.Address address2 = new Worker.Address("Canada", "Ontario", "Toronto", "5678", "12");
        Worker.Contacts contacts2 =  new Worker.Contacts("jane.smith@example.com", "+987654321");
        Worker worker2 = new Worker(2, "Smith", "Jane", 28, Worker.Gender.FEMALE, address2, contacts2);

        System.out.println(worker1);
        System.out.println(worker2);
    }
}
