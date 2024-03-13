/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presistt;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Irkhamnawan
 */
@Entity
@Table(name = "kendaraan")
@NamedQueries({
    @NamedQuery(name = "Kendaraan.findAll", query = "SELECT k FROM Kendaraan k"),
    @NamedQuery(name = "Kendaraan.findByIdKendaraan", query = "SELECT k FROM Kendaraan k WHERE k.idKendaraan = :idKendaraan"),
    @NamedQuery(name = "Kendaraan.findByJenisKendaraan", query = "SELECT k FROM Kendaraan k WHERE k.jenisKendaraan = :jenisKendaraan"),
    @NamedQuery(name = "Kendaraan.findByTipeKendaraan", query = "SELECT k FROM Kendaraan k WHERE k.tipeKendaraan = :tipeKendaraan"),
    @NamedQuery(name = "Kendaraan.findByNoPlat", query = "SELECT k FROM Kendaraan k WHERE k.noPlat = :noPlat"),
    @NamedQuery(name = "Kendaraan.findByBiayaHarian", query = "SELECT k FROM Kendaraan k WHERE k.biayaHarian = :biayaHarian"),
    @NamedQuery(name = "Kendaraan.findByStatus", query = "SELECT k FROM Kendaraan k WHERE k.status = :status")})
public class Kendaraan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_kendaraan")
    private String idKendaraan;
    @Basic(optional = false)
    @Column(name = "jenis_kendaraan")
    private String jenisKendaraan;
    @Basic(optional = false)
    @Column(name = "tipe_kendaraan")
    private String tipeKendaraan;
    @Basic(optional = false)
    @Column(name = "no_plat")
    private String noPlat;
    @Basic(optional = false)
    @Column(name = "biaya_harian")
    private double biayaHarian;
    @Column(name = "status")
    private String status;
    @JoinTable(name = "detail_perawatan", joinColumns = {
        @JoinColumn(name = "id_kendaraan", referencedColumnName = "id_kendaraan")}, inverseJoinColumns = {
        @JoinColumn(name = "id_perawatan", referencedColumnName = "id_perawatan")})
    @ManyToMany
    private Collection<Perawatan> perawatanCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "kendaraan")
    private Collection<DetailPenyewaan> detailPenyewaanCollection;

    public Kendaraan() {
    }

    public Kendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public Kendaraan(String idKendaraan, String jenisKendaraan, String tipeKendaraan, String noPlat, double biayaHarian) {
        this.idKendaraan = idKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tipeKendaraan = tipeKendaraan;
        this.noPlat = noPlat;
        this.biayaHarian = biayaHarian;
    }

    public String getIdKendaraan() {
        return idKendaraan;
    }

    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public String getNoPlat() {
        return noPlat;
    }

    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public double getBiayaHarian() {
        return biayaHarian;
    }

    public void setBiayaHarian(double biayaHarian) {
        this.biayaHarian = biayaHarian;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Collection<Perawatan> getPerawatanCollection() {
        return perawatanCollection;
    }

    public void setPerawatanCollection(Collection<Perawatan> perawatanCollection) {
        this.perawatanCollection = perawatanCollection;
    }

    public Collection<DetailPenyewaan> getDetailPenyewaanCollection() {
        return detailPenyewaanCollection;
    }

    public void setDetailPenyewaanCollection(Collection<DetailPenyewaan> detailPenyewaanCollection) {
        this.detailPenyewaanCollection = detailPenyewaanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idKendaraan != null ? idKendaraan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Kendaraan)) {
            return false;
        }
        Kendaraan other = (Kendaraan) object;
        if ((this.idKendaraan == null && other.idKendaraan != null) || (this.idKendaraan != null && !this.idKendaraan.equals(other.idKendaraan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.Kendaraan[ idKendaraan=" + idKendaraan + " ]";
    }
    
}
