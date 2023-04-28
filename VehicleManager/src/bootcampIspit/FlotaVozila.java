package bootcampIspit;

import java.util.HashMap;
import java.util.Map;


public class FlotaVozila  implements VehiclesInterface{

    private Map<String, Vozila> mapaVozila;
    public FlotaVozila(){
        this.mapaVozila = new HashMap<>();
    }

    public void unosAutomobila(Automobil automobil) {
        mapaVozila.put(automobil.getVin(), automobil);
    }

    public void unosKamiona(Kamion kamion) {
        mapaVozila.put(kamion.getVin(), kamion);
    }

    public void pretragaVin(String vin) {
        if (mapaVozila.containsKey(vin)) {
            Vozila vozila = mapaVozila.get(vin);
            System.out.println(vozila);
        } else {
            System.out.println("Vozilo nije pronadeno.");
        }
    }

    public void pretragaProizvodac(String proizvodac) {
        if (mapaVozila.containsValue(proizvodac)) {
            Vozila vozila = mapaVozila.get(proizvodac);
            System.out.println(vozila);
        } else {
            System.out.println("Vozilo nije pronadeno.");
        }
    }

    public void brisanjeVozila(String vin) {
        if (mapaVozila.containsKey(vin)) {
            mapaVozila.remove(vin);
            System.out.println("Vozilo izbrisano!");
        } else {
            System.out.println("Vozilo nije pronadeno.");
        }
    }

    public void ispisVozila() {
        System.out.println("Sva vozila:");
        for (Vozila vozila : mapaVozila.values()) {
            System.out.println(vozila.toString());
        }
    }
}
