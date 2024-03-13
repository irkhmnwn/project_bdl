/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presistt;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Irkhamnawan
 */
@Entity
@Table(name = "penyewaan")
@NamedQueries({
    @NamedQuery(name = "Penyewaan.findAll", query = "SELECT p FROM Penyewaan p"),
    @NamedQuery(name = "Penyewaan.findByIdPenyewaan", query = "SELECT p FROM Penyewaan p WHERE p.idPenyewaan = :idPenyewaan"),
    @NamedQuery(name = "Penyewaan.findByTotalBiaya", query = "SELECT p FROM Penyewaan p WHERE p.totalBiaya = :totalBiaya"),
    @NamedQuery(name = "Penyewaan.findByTanggalPenyewaan", query = "SELECT p FROM Penyewaan p WHERE p.tanggalPenyewaan = :tanggalPenyewaan"),
    @NamedQuery(name = "Penyewaan.findByTanggalKembali", query = "SELECT p FROM Penyewaan p WHERE p.tanggalKembali = :tanggalKembali"),
    @NamedQuery(name = "Penyewaan.findByJumlahHari", query = "SELECT p FROM Penyewaan p WHERE p.jumlahHari = :jumlahHari")})
public class Penyewaan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_penyewaan")
    private String idPenyewaan;
    @Basic(optional = false)
    @Column(name = "total_biaya")
    private double totalBiaya;
    @Basic(optional = false)
    @Column(name = "tanggal_penyewaan")
    @Temporal(TemporalType.DATE)
    private Date tanggalPenyewaan;
    @Basic(optional = false)
    @Column(name = "tanggal_kembali")
    @Temporal(TemporalType.DATE)
    private Date tanggalKembali;
    @Basic(optional = false)
    @Column(name = "jumlah_hari")
    private String jumlahHari;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "penyewaan")
    private Collection<DetailPenyewaan> detailPenyewaanCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPenyewaan")
    private Collection<Pembayaran> pembayaranCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPenyewaan")
    private Collection<Pengembalian> pengembalianCollection;
    @JoinColumn(name = "id_pegawai", referencedColumnName = "id_pegawai")
    @ManyToOne(optional = false)
    private Pegawai idPegawai;
    @JoinColumn(name = "id_pelanggan", referencedColumnName = "id_pelanggan")
    @ManyToOne(optional = false)
    private Pelanggan idPelanggan;

    public Penyewaan() {
    }

    public Penyewaan(String idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    public Penyewaan(String idPenyewaan, double totalBiaya, Date tanggalPenyewaan, Date tanggalKembali, String jumlahHari) {
        this.idPenyewaan = idPenyewaan;
        this.totalBiaya = totalBiaya;
        this.tanggalPenyewaan = tanggalPenyewaan;
        this.tanggalKembali = tanggalKembali;
        this.jumlahHari = jumlahHari;
    }

    public String getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(String idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }

    public void setTotalBiaya(double totalBiaya) {
        this.totalBiaya = totalBiaya;
    }

    public Date getTanggalPenyewaan() {
        return tanggalPenyewaan;
    }

    public void setTanggalPenyewaan(Date tanggalPenyewaan) {
        this.tanggalPenyewaan = tanggalPenyewaan;
    }

    public Date getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(Date tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public String getJumlahHari() {
        return jumlahHari;
    }

    public void setJumlahHari(String jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public Collection<DetailPenyewaan> getDetailPenyewaanCollection() {
        return detailPenyewaanCollection;
    }

    public void setDetailPenyewaanCollection(Collection<DetailPenyewaan> detailPenyewaanCollection) {
        this.detailPenyewaanCollection = detailPenyewaanCollection;
    }

    public Collection<Pembayaran> getPembayaranCollection() {
        return pembayaranCollection;
    }

    public void setPembayaranCollection(Collection<Pembayaran> pembayaranCollection) {
        this.pembayaranCollection = pembayaranCollection;
    }

    public Collection<Pengembalian> getPengembalianCollection() {
        return pengembalianCollection;
    }

    public void setPengembalianCollection(Collection<Pengembalian> pengembalianCollection) {
        this.pengembalianCollection = pengembalianCollection;
    }

    public Pegawai getIdPegawai() {
        return idPegawai;
    }

    public void setIdPegawai(Pegawai idPegawai) {
        this.idPegawai = idPegawai;
    }

    public Pelanggan getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(Pelanggan idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPenyewaan != null ? idPenyewaan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Penyewaan)) {
            return false;
        }
        Penyewaan other = (Penyewaan) object;
        if ((this.idPenyewaan == null && other.idPenyewaan != null) || (this.idPenyewaan != null && !this.idPenyewaan.equals(other.idPenyewaan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.Penyewaan[ idPenyewaan=" + idPenyewaan + " ]";
    }
    
}
