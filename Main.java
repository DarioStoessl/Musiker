package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        Guitar GuitarBand1 = new Guitar("Klaus", 40, "Guitar","Bumm Bumm");
        Drums DrumsBand1 = new Drums("Sven", 29,"Drums", "Tock Tick");
        Bass BassBand1 = new Bass("Klara", 35,"Bass", "Boom Booooom");
        Singer SingerBand1 = new Singer("Dirk",38,"Singer","YeahYeahYEAH");

        Guitar GuitarBand2 = new Guitar("Hans", 40, "Guitar","Bemm Bamm");
        Drums DrumsBand2 = new Drums("Claudia", 29,"Drums", "TockTock Tock");
        Bass BassBand2 = new Bass("Igor", 35,"Bass", "Boom Boom");
        Singer SingerBand2 = new Singer("Alfred",38,"Singer","Aha Jo");

        Guitar GuitarBand3 = new Guitar("Daniela", 40, "Guitar","Didndau");
        Drums DrumsBand3 = new Drums("Otto", 29,"Drums", "Tff schick");
        Bass BassBand3 = new Bass("Peter", 35,"Bass", "Boom Boooooooom");
        Singer SingerBand3 = new Singer("Alex",38,"Singer","UUUUhuUUU");

        Band kiss = new Band(SingerBand1,GuitarBand1,DrumsBand1,BassBand1);
        Band aha = new Band(SingerBand2,GuitarBand2,DrumsBand2,BassBand2);
        Band JBO = new Band(SingerBand3,GuitarBand3,DrumsBand3,BassBand3);


        boolean tournament = true;


        while (tournament == true) {
            kiss.Jamming();
            System.out.println("Bewerte: 1-10");
            Scanner scanner = new Scanner(System.in);
            int Input = scanner.nextInt();

            aha.Jamming();
            System.out.println("Bewerte: 1-10");
            int Input1 = scanner.nextInt();

            JBO.Jamming();
            System.out.println("Bewerte:1-10");
            int Input2 = scanner.nextInt();

            if (Input > Input1 && Input > Input2) {

                System.out.println("Der Sieger ist Kiss");
                tournament = false;
            }
            else if (Input1 > Input && Input1 > Input2){
                System.out.println("Der Sieger ist Aha");
                tournament = false;

            }

            else if (Input2 > Input && Input2 > Input1) {

                System.out.println("Der Sieger ist JBO");
                tournament = false;
            }

            else if (Input > 10 || Input1 > 10 || Input2 > 10) {
                System.out.println("Zahl zwischen 0 - 10 eingeben");

            }

            else if (Input == Input1 && Input1 == Input2){

                System.out.println("Gleichstand");
                tournament = false;
            }

            }


    }



}