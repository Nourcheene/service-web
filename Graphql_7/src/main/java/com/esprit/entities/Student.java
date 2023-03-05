package com.esprit.entities;

public class Student {
    private String cin;
    private String nompre;
    private String email;

    public Student(String cin, String nompre, String email) {
        this.cin = cin;
        this.nompre = nompre;
        this.email = email;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNompre() {
        return nompre;
    }

    public void setNompre(String nompre) {
        this.nompre = nompre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
