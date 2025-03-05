package models;

import jakarta.persistence.*;

@Entity
@Table(name = "vehicles") // Tablonun adı 'vehicles' olacak.
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false) // Plaka numarası benzersiz olmalı.
    private String licensePlate;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) // Aracı kullanıcıyla ilişkilendir.
    private User user;

    // Getter ve Setter Metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
