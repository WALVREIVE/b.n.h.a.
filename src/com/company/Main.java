package com.company;

public class Main {

    public static void main(String[] args) {
        Printable[] printables = {createAnObject("Deku"), createAnObject("Head Hunters"), createAnObject("Asta")};
        for (Printable print:printables)
             print.print();





    }
    public static Printable createAnObject(String className){
        switch (className) {
            case "Deku":
              Deku deku = new Deku(100,"WARRIORS");
              return deku;
            case "Head Hunters":
              HeadHunters headHunters = new HeadHunters("Slowly and with unbelievable pain",2);
              return headHunters;
            case "Asta":
              Asta asta = new Asta("City - ~ALPHA~",18);
              return asta;
        }
        return null;

    }


}
