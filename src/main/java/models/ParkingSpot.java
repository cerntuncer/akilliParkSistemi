package models;

import jakarta.persistence.*;

@Entity
@Table(name = "parking_spots") // Tablonun adı parking_spots
public class ParkingSpot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID otomatik artacak.
    private int id;

    @Column(unique = true, nullable = false) // Park alanı adı benzersiz olmalı (Örn: A1, B2).
    private String spotName;

    @Column(nullable = false)
    private boolean isOccupied = false; // Varsayılan olarak boş (false).

    // Getter ve Setter Metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
