package com.example.gojekstudio;

public class Item {
    String name;
    String absen;
    int image;

    public Item(String name, String absen, int image) {
        this.name = name;
        this.absen = absen;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbsen() {

        return absen;
    }

    public void setAbsen(String absen) {
        this.absen = absen;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
