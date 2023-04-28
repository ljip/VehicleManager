package bootcampIspit;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Izbornik implements VehiclesInterface{

    private final Scanner scanner;
    private final FlotaVozila flotaVozila;
    public Izbornik() {
        scanner = new Scanner(System.in);
        flotaVozila = new FlotaVozila();
    }

    public void pokreniAplikaciju() {
        while (true) {
            System.out.println("""
                    Molimo izaberite opciju:
                    1. Unos vozila
                    2. Pretraga vozila prema proizvodacu ili modelu
                    3. Prikazi sva vozila u sustavu
                    4. Izbrisi vozilo iz sustava
                    5. Izadi iz programa
                    """);
            int korisnikovUnos = getKorisnikovUnosBroja();

            switch (korisnikovUnos) {
                case 1:
                    unosVozila();
                    break;
                case 2:
                    pretragaVozilaPremaProizvodacuIliModelu();
                    break;
                case 3:
                    ispisVozila();
                    break;
                case 4:
                    brisanjeVozila();
                    break;
                case 5:
                    izlazIzPrograma();
                    return;
                default:
                    printOpcijaNePostoji();
                    break;
            }
        }
    }


    private int getKorisnikovUnosBroja() {
        int korisnikovUnos = 0;
        while (korisnikovUnos <= 0) {
            try {
                korisnikovUnos = scanner.nextInt();
            } catch (InputMismatchException exception) {

                System.out.println("""
                        Niste upisali broj!
                        Molimo pokušajte ponovno.
                        """);
                scanner.next();
            }
        }
        return korisnikovUnos;
    }

    private static void printOpcijaNePostoji() {
        System.out.println("Opcija ne postoji. Izaberite jednu s izbornika.");
    }


    private void pretragaVozilaPremaProizvodacuIliModelu() {
        System.out.println("""
                Odaberite jednu od opcija za pretragu vozila:
                1. vin
                2. proizvodac
                """);
        int korisnikovUnos = getKorisnikovUnosBroja();
        switch (korisnikovUnos) {
            case 1:
                vinPretraga();
                break;
            case 2:
                pretragaProizvodac();
                break;
            default:
                printOpcijaNePostoji();
                break;
        }
    }

    private void unosVozila() {
        System.out.println("""
                Odaberite vozilo koje zelite unijeti:
                1. auto
                2. kamion
                """);
        int korisnikovUnos = getKorisnikovUnosBroja();
        switch (korisnikovUnos) {
            case 1:
                unosAutomobila();
                break;
            case 2:
                unosKamiona();
                break;
            default:
                printOpcijaNePostoji();
                break;
        }
    }

    private void unosAutomobila() {
        System.out.println("Unesi proizvodaca: ");
        String proizvodac = scanner.next();

        System.out.println("Unesi model: ");
        String model = scanner.next();

        System.out.println("Unesi boju: ");
        String boja = scanner.next();

        System.out.println("Unesi oznaku: ");
        String oznaka = scanner.next();

        System.out.println("Unesi tip goriva: ");
        String tipGoriva = scanner.next();

        System.out.println("Unesi godinu proizvodnje: ");
        int godinaProizvodnje = getKorisnikovUnosBroja();

        System.out.println("Unesi broj vrata: ");
        int brojVrata = getKorisnikovUnosBroja();

        System.out.println("Unesi vin: ");
        String vin = scanner.next();

        System.out.println("Unesi karoseriju: ");
        String karoserija = scanner.next();

        Automobil automobil = new Automobil(proizvodac, model, boja, oznaka, tipGoriva, godinaProizvodnje, brojVrata, vin, karoserija);

        flotaVozila.unosAutomobila(automobil);
    }

    private void unosKamiona() {
        System.out.println("Unesi proizvodaca: ");
        String proizvodac = scanner.next();

        System.out.println("Unesi model: ");
        String model = scanner.next();

        System.out.println("Unesi boju: ");
        String boja = scanner.next();

        System.out.println("Unesi oznaku: ");
        String oznaka = scanner.next();

        System.out.println("Unesi tip goriva: ");
        String tipGoriva = scanner.next();

        System.out.println("Unesi godinu proizvodnje: ");
        int godinaProizvodnje = getKorisnikovUnosBroja();

        System.out.println("Unesi broj vrata: ");
        int brojVrata = getKorisnikovUnosBroja();

        System.out.println("Unesi vin: ");
        String vin = scanner.next();

        System.out.println("Unesi kapacitet tereta: ");
        int kapacitetTereta = getKorisnikovUnosBroja();

        Kamion kamion = new Kamion(proizvodac, model, boja, oznaka, tipGoriva, godinaProizvodnje, brojVrata, vin, kapacitetTereta);

        flotaVozila.unosKamiona(kamion);
    }

    private String getKorisnikovUnosString(String pitanje) {
        System.out.println(pitanje);
        return scanner.next();
    }

    public void vinPretraga() {
        String vin = getKorisnikovUnosString("Unesi broj vin-a za pretragu vozila:");
        flotaVozila.pretragaVin(vin);
    }


    private void pretragaProizvodac() {
    String proizvodac = getKorisnikovUnosString("Unesi proizvodaca za pretragu vozila:");
        flotaVozila.pretragaProizvodac(proizvodac);
    }

    private void ispisVozila() {
        flotaVozila.ispisVozila();
    }

    private void brisanjeVozila() {
        String vinPretraga = getKorisnikovUnosString("Unesi broj vin-a za brisanje vozila iz sustava:");
        flotaVozila.brisanjeVozila(vinPretraga);
    }

    private void izlazIzPrograma() {
        System.out.println("Hvala sto ste koristili program!");
    }
}
