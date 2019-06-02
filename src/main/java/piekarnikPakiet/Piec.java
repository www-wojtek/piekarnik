package piekarnikPakiet;
// dodać gety z których pobieram do wydruku efektu.

import java.util.Scanner;

public class Piec {

    private Scanner scanner = new Scanner(System.in);
    private int wyborUzytkownika;
    private int temperatura;
    private int czas;
    private String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    Danie danie = new Danie();


    public void menuPiekarnika() throws InterruptedException {

        do {
            System.out.println("\nMenu piekarnika:\n0 - wyświetl podpowiedż jakie potrawy piec w jakiej temperaturze," +
                    "\n1 - upiecz kurczaka, \n2 - upiecz wieprzowinę, \n3 - upiecz cukinię, \n4 - wyjdź z menu\n");

            wyborUzytkownika = scanner.nextInt();

            switch (wyborUzytkownika) {
                case 0: {
                    wyswietlPodpowiedz();
                }
                break;
                case 1: {
                    pieczenieKurczaka();
                }
                break;
                case 2: {
                    pieczenieWieprzowiny();
                }
                break;
                case 3: {
                    pieczenieCukini();
                }
                break;
            }
        } while (wyborUzytkownika != 4);

        przejscieWstandby();
        danie = null;
    }

    private void wyswietlPodpowiedz() {
        System.out.println(
                "Witaj Użytkowniku nie masz głowy do przepisów ale nie mart się, nie umrzesz z głodu!\n" +
                        "Aby upiec kurczaka ustaw czas na 30 minut a temperaturę na 120 stopni \n" +
                        "Aby upiec wieprzowinę ustaw czas na 60 minut a temperaturę na 180 stopni \n" +
                        "Aby upiec cukinię ustaw czas na 20 minut a temperaturę na 160 stopni\n");
        try {
            menuPiekarnika();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Danie pieczenieKurczaka() {
        System.out.println("Wybrałeś pieczenie kurczaka\n");
        do {
            System.out.println("Ustaw czas pieczenia \n :");
            czas = scanner.nextInt();
        } while (czas != 30);
        do {
            System.out.println("Ustaw temperaturę \n :");
            temperatura = scanner.nextInt();
        } while (temperatura != 120);
        nazwa = "kurczak";

        Danie kurczak = new Danie(nazwa, czas, temperatura);
        odliczanie();
        System.out.println(kurczak.toString());
        return kurczak;
    }

    private Danie pieczenieWieprzowiny() {
        System.out.println("Wybrałeś pieczenie wieprzowiny\n");
        do {
            System.out.println("Ustaw czas pieczenia \n :");
            czas = scanner.nextInt();
        } while (czas != 60);
        do {
            System.out.println("Ustaw temperaturę \n :");
            temperatura = scanner.nextInt();
        } while (temperatura != 180);
        nazwa = "wieprzowina";

        Danie wieprzowina = new Danie(nazwa, czas, temperatura);
        odliczanie();
        System.out.println(wieprzowina.toString());
        return wieprzowina;
    }

    private Danie pieczenieCukini() {
        System.out.println("Wybrałeś pieczenie cukini\n");
        do {
            System.out.println("Ustaw czas pieczenia \n :");
            czas = scanner.nextInt();
        } while (czas != 20);
        do {
            System.out.println("Ustaw temperaturę \n :");
            temperatura = scanner.nextInt();
        } while (temperatura != 160);
        nazwa = "cukinia";

        Danie cukinia = new Danie(nazwa, czas, temperatura);
        odliczanie();
        System.out.println(cukinia.toString());
        return cukinia;
    }

    public void odliczanie() {
        for (int i = czas; i > 0; i--) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public void przejscieWstandby() {
        System.out.println("Dziękuję zapraszam ponownie. \nPiec przechodzi w tryb oszczędzania energii.\n");
    }

}
