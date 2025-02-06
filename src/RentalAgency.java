import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Car> cars;
    private List<Customer> customers;

    public RentalAgency() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(Customer customer, String registrationNumber) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(registrationNumber) && car.isAvailable()) {
                car.rentCar();
                System.out.println(customer.getName() + " successfully rented " + car.getModel());
                return;
            }
        }
        System.out.println("Car not available for rent.");
    }

    public void returnCar(String registrationNumber) {
        for (Car car : cars) {
            if (car.getRegistrationNumber().equals(registrationNumber) && !car.isAvailable()) {
                car.returnCar();
                System.out.println("Car successfully returned.");
                return;
            }
        }
        System.out.println("Invalid return request.");
    }
                                   }
