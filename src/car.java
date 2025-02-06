public class Car {
    private String registrationNumber;
    private String model;
    private boolean isAvailable;

    public Car(String registrationNumber, String model) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.isAvailable = true;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rentCar() {
        isAvailable = false;
    }

    public void returnCar() {
        isAvailable = true;
    }
  }
