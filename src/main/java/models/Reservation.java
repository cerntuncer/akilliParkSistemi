package models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "reservations") // Tablonun adı 'reservations' olacak.
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne // Bir kullanıcı birden fazla rezervasyon yapabilir.
    @JoinColumn(name = "user_id", nullable = false) // Kullanıcıyla ilişkilendir.
    private User user;

    @ManyToOne // Bir park alanı birden fazla rezervasyona sahip olabilir.
    @JoinColumn(name = "parking_spot_id", nullable = false) // Park alanıyla ilişkilendir.
    private ParkingSpot parkingSpot;

    @Column(nullable = false)
    private LocalDateTime startTime;

    private LocalDateTime endTime; // Kullanıcı çıkış yaptığında güncellenecek.

    public Reservation() {
        this.startTime = LocalDateTime.now(); // Varsayılan olarak şu anki zaman.
    }

    // Getter ve Setter Metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
