package models;

import jakarta.persistence.*;

@Entity // Bu sınıfın veritabanı tablosu olduğunu belirtir.
@Table(name = "users") // Tablonun adı 'users' olacak.
public class User {

    @Id // Birincil anahtar (Primary Key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID otomatik artacak.
    private int id;

    @Column(unique = true, nullable = false) // Kullanıcı adı benzersiz ve boş olamaz.
    private String username;

    @Column(nullable = false) // Şifre boş olamaz.
    private String password;

    @Column(nullable = false) // Rol belirlenmeli (USER veya ADMIN).
    private String role;

    // Getter ve Setter Metotları
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
