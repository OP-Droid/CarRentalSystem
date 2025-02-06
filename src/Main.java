public class Main {
    public static void main(String[] args) {
        RentalAgency agency = new RentalAgency();

        Car car1 = new Car("KDZ123F", "Toyota Corolla");
        Car car2 = new Car("KDB789Z", "Honda Civic");
        agency.addCar(car1);
        agency.addCar(car2);

        Customer customer1 = new Customer("Ian Opicho", "DL45678");
        agency.registerCustomer(customer1);

        agency.rentCar(customer1, "KDZ123F");
        agency.returnCar("KDZ123F");
    }
}
