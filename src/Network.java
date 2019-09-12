import java.util.Arrays;

public class Network {
    private String name;
    private String[] phones;

    private int[] temp;

    Network(String name) {
        this.name = name;
        this.phones = new String[0];
    }


    public void addPhone(String phone) {
        int newSize = phones.length + 1;
        String[] newPhonesArray = new String[newSize];
        System.arraycopy(phones, 0, newPhonesArray, 0, phones.length);
        phones = newPhonesArray;
        phones[newSize - 1] = phone;
    }

    public String[] getPhones() {
        return phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
