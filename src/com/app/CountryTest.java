package com.app;

public class CountryTest {
    public static void main(String[] args) {
        Country firstCountry = new Country();
        firstCountry.theNameOfTheCountry = "USA";
        firstCountry.capital = "Washington";
        firstCountry.countryCode = 1;

        Country secondCountry = new Country();
        secondCountry.theNameOfTheCountry = "UA";
        secondCountry.capital = "Kyiv";
        secondCountry.countryCode = 38;

        Country thirdCountry = new Country();
        thirdCountry.theNameOfTheCountry = "Brasillia";
        thirdCountry.capital = "Brasillia";
        thirdCountry.countryCode = 55;

        System.out.printf("firstCountry: theNameOfTheCountry=%s, capital=%s, countryCode=%d, \n",firstCountry.theNameOfTheCountry, firstCountry.capital, firstCountry.countryCode);
        System.out.printf("secondCountry: theNameOfTheCountry=%s, capital=%s, countryCode=%d, \n",secondCountry.theNameOfTheCountry, secondCountry.capital, secondCountry.countryCode);
        System.out.printf("thirdCountry: theNameOfTheCountry=%s, capital=%s, countryCode=%d, \n",thirdCountry.theNameOfTheCountry, thirdCountry.capital, thirdCountry.countryCode);
    }
}
