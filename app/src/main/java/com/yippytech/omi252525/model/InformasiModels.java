package com.yippytech.omi252525.model;

/**
 * Created by ryanbaskara on 30/12/16.
 */
import com.google.gson.annotations.SerializedName;

public class InformasiModels {
    @SerializedName("id_informasi")
    private String idInformasi;
    @SerializedName("gambar_informasi")
    private String gambarInformasi;
    @SerializedName("judul_informasi")
    private String judulInformasi;
    @SerializedName("subjek_informasi")
    private String subjekInformasi;
    @SerializedName("isipanjang_informasi")
    private String isipanjangInformasi;
    @SerializedName("isipendek_informasi")
    private String isipendekInformasi;
    @SerializedName("date_informasi")
    private String dateInformasi;

    public InformasiModels(String idInformasi, String gambarInformasi, String judulInformasi, String subjekInformasi, String isipanjangInformasi, String isipendekInformasi, String dateInformasi) {
        this.idInformasi = idInformasi;
        this.gambarInformasi = gambarInformasi;
        this.judulInformasi = judulInformasi;
        this.subjekInformasi = subjekInformasi;
        this.isipanjangInformasi = isipanjangInformasi;
        this.isipendekInformasi = isipendekInformasi;
        this.dateInformasi = dateInformasi;
    }

    public String getIdInformasi() {
        return idInformasi;
    }

    public void setIdInformasi(String idInformasi) {
        this.idInformasi = idInformasi;
    }

    public String getGambarInformasi() {
        return gambarInformasi;
    }

    public void setGambarInformasi(String gambarInformasi) {
        this.gambarInformasi = gambarInformasi;
    }

    public String getJudulInformasi() {
        return judulInformasi;
    }

    public void setJudulInformasi(String judulInformasi) {
        this.judulInformasi = judulInformasi;
    }

    public String getSubjekInformasi() {
        return subjekInformasi;
    }

    public void setSubjekInformasi(String subjekInformasi) {
        this.subjekInformasi = subjekInformasi;
    }

    public String getIsipanjangInformasi() {
        return isipanjangInformasi;
    }

    public void setIsipanjangInformasi(String isipanjangInformasi) {
        this.isipanjangInformasi = isipanjangInformasi;
    }

    public String getIsipendekInformasi() {
        return isipendekInformasi;
    }

    public void setIsipendekInformasi(String isipendekInformasi) {
        this.isipendekInformasi = isipendekInformasi;
    }

    public String getDateInformasi() {
        return dateInformasi;
    }

    public void setDateInformasi(String dateInformasi) {
        this.dateInformasi = dateInformasi;
    }
}
