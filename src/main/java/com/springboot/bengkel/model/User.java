package com.springboot.bengkel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user") // Mengubah nama tabel ke "user"
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id; // Mengganti atribut "id" menjadi "user_id"

    private String username;
    private String password;
    private String nama_lengkap; // Mengganti atribut "firstName" menjadi "nama_lengkap"
    private String email;
    private String peran;

    public User() {
    }

    public User(int user_id, String username, String password, String nama_lengkap, String email, String peran) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.nama_lengkap = nama_lengkap;
        this.email = email;
        this.peran = peran;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }
}
