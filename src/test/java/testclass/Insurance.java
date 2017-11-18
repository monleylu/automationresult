package testclass;

/**
 * Created by lujian on 2017/11/8.
 */
public class Insurance {
    private String name;
    private int price;

    public Insurance(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
