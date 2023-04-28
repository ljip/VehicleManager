package bootcampIspit;

public class Vozila implements VehiclesInterface{


    public String proizvodac, model, boja, oznaka, tipGoriva;
    public int godinaProizvodnje, brojVrata;
    private String vin;

    public Vozila(String proizvodac, String model, String boja,
                  String oznaka, String tipGoriva, int godinaProizvodnje,
                  int brojVrata, String vin)
    {
        this.proizvodac = proizvodac;
        this.model = model;
        this.boja = boja;
        this.oznaka = oznaka;
        this.tipGoriva = tipGoriva;
        this.godinaProizvodnje = godinaProizvodnje;
        this.brojVrata = brojVrata;
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "bootcampIspit.Vozila{" +
                "proizvodac='" + proizvodac + '\'' +
                ", model='" + model + '\'' +
                ", boja='" + boja + '\'' +
                ", oznaka='" + oznaka + '\'' +
                ", tipGoriva='" + tipGoriva + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                ", brojVrata=" + brojVrata +
                ", vin='" + vin + '\'' +
                '}';
    }
}

