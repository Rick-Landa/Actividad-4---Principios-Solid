public class Amphibian extends Vehicle implements IWheeledVehicle, IJetPropelledVehicle, IWaterVehicle {
    private String type;

    public Amphibian(int power, int year, String brand, String type) {
        super(power, year, brand);
        this.type = type;
    }

    @Override
    public void moveWheels() {
        System.out.println("Vehiculo anfibio moviendose con llantas");
    }

    @Override
    public void moveJetPropulsion() {
        System.out.println("Vehículo anfibio moviendose con propulsión a chorro");
    }

    @Override
    public void pathProgramming() {
        System.out.println("Ruta de programación para vehículos anfibios");
    }

    @Override
    public String description() {
        return "Amphibian Vehicle - Power: " + power +
                ", Year: " + year +
                ", Brand: " + brand +
                ", Type: " + type;
    }
}