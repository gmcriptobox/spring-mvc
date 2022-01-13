package web.model;

public class Car {

    private String number;
    private String model;
    private int series;

    Car(){}

    public Car(String number, String model, int series) {
        this.number = number;
        this.model = model;
        this.series = series;
    }


    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }
}
