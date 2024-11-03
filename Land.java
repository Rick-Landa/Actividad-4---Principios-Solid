public class Land extends Vehicle implements IWheeledVehicle {
    private short type;
    private City city;

    public Land(int power, int year, String brand, short type, City city) {
        super(power, year, brand);
        this.type = type;
        this.city = city;
    }

    @Override
    public void moveWheels() {
        System.out.println("Vehiculo de tierra moviendose con llantas");
    }

    @Override
    public String description() {
        return "Land Vehicle - Power: " + power +
                ", Year: " + year +
                ", Brand: " + brand +
                ", Type: " + type +
                ", " + city.cityInfo();
    }
}