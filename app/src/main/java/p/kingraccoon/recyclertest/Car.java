package p.kingraccoon.recyclertest;

import android.support.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kerem on 26.11.2017.
 */

public class Car implements Comparable<Car>{
    private int modelYear;
    private String carName;
    private String carImageURL;

    public Car() {

    }

    public Car(int modelYear, String carName, String carImageURL) {
        this.modelYear = modelYear;
        this.carName = carName;
        this.carImageURL = carImageURL;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarImageURL() {
        return carImageURL;
    }

    @Override
    public int compareTo( Car car) {
        return 0;
    }
}
