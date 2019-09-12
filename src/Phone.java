import java.nio.channels.NonReadableChannelException;
import java.util.Arrays;

public class Phone {

    private String model;
    private int cost;
    private String number;
    private boolean isRegistered;
    private Network network;


    Phone(String model, int cost, String number) {
        this.model = model;
        this.cost = cost;
        this.number = number;
        this.isRegistered = false;

    }


    public void register(Network network) {
        setNetwork(network);
        network.addPhone(getNumber());
        isRegistered = true;
    }



    public String call(String number) {
        if (isRegistered) {
            if (Arrays.asList(network.getPhones()).contains(number)) {
                return "You call to " + number;
            } else {
                return "You cant call";
            }
        } else {
            return "You cant call";
        }
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Network getNetwork() {
        return network;
    }

    public String getNumber() {
        return number;
    }

    public int getCost() {
        return cost;
    }

    public String getModel() {
        return model;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
