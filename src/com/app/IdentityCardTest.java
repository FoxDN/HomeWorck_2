package com.app;

public class IdentityCardTest {
    public static void main(String[] args) {
        IdentityCard firstIdentityCard = new IdentityCard();
        firstIdentityCard.name = "Dmitriy";
        firstIdentityCard.surname = "FoxDn";
        firstIdentityCard.sex = "M";
        firstIdentityCard.age = 37;

        IdentityCard secondIdentityCard = new IdentityCard();
        secondIdentityCard.name = "Karina";
        secondIdentityCard.surname = "FoxDn";
        secondIdentityCard.sex = "F";
        secondIdentityCard.age = 35;

        IdentityCard thirdIdentityCard = new IdentityCard();
        thirdIdentityCard.name = "Mitchel";
        thirdIdentityCard.surname = "FoxDn";
        thirdIdentityCard.sex = "M";
        thirdIdentityCard.age = 1;

        System.out.printf("firstIdentityCard: name=%s, surname=%s, sex=%s, age=%d, \n",firstIdentityCard.name, firstIdentityCard.surname, firstIdentityCard.sex, firstIdentityCard.age);
        System.out.printf("secondIdentityCard: name=%s, surname=%s, sex=%s, age=%d, \n",secondIdentityCard.name, secondIdentityCard.surname, secondIdentityCard.sex, secondIdentityCard.age);
        System.out.printf("firstIdentityCard: name=%s, surname=%s, sex=%s, age=%d, \n",thirdIdentityCard.name, thirdIdentityCard.surname, thirdIdentityCard.sex, thirdIdentityCard.age);


    }
}
