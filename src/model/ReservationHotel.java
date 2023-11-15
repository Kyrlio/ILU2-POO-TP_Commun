package model;

public class ReservationHotel extends Reservation {
    private int nombreLitSimple;
    private int nombreLitDouble;
    private int numeroChambre;

    public ReservationHotel(int jour, int mois, int nombreLitSimple, int nombreLitDouble, int numeroChambre) {
        super(jour, mois);
        this.nombreLitSimple = nombreLitSimple;
        this.nombreLitDouble = nombreLitDouble;
        this.numeroChambre = numeroChambre;
    }

}

