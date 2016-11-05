package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

/**
 * Created by user on 02/11/2016.
 */

public class hotel implements Serializable {
    public static String foto;
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;

    public hotel(String judul, String deskripsi, String foto, String detail, String lokasi) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        hotel.foto = foto;

    }
}
