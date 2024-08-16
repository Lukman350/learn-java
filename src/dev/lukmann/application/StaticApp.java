package dev.lukmann.application;

import static dev.lukmann.data.Constant.*;

import dev.lukmann.data.Constant;
import dev.lukmann.data.Country;
import dev.lukmann.data.StaticBlock;
import dev.lukmann.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        // Static Keyword

        // static import
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        // non static import
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(MathUtil.sum(1,2,3,4,5,6,7,8,9));

        Country country = new Country();
        country.setName("Indonesia");

        Country.City city = new Country.City();
        city.setName("Jakarta");
        city.setZipCode(13220);

        System.out.println(city.getCountry(country));
        System.out.println(city.getName());
        System.out.println(city.getZipCode());

        // Static block
        System.out.println(StaticBlock.PROCESSOR);
    }
}
