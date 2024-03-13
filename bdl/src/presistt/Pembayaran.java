/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presistt;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Irkhamnawan
 */
@Entity
@Table(name = "pembayaran")
@NamedQueries({
    @NamedQuery(name = "Pembayaran.findAll", query = "SELECT p FROM Pembayaran p"),
    @NamedQuery(name = "Pembayaran.findByNoNota", query = "SELECT p FROM Pembayaran p WHERE p.noNota = :noNota"),
    @NamedQuery(name = "Pembayaran.findByTanggalPembayaran", query = "SELECT p FROM Pembayaran p WHERE p.tanggalPembayaran = :tanggalPembayaran"),
    @NamedQuery(name = "Pembayaran.findByTotalPembayaran", query = "SELECT p FROM Pembayaran p WHERE p.totalPembayaran = :totalPembayaran"),
    @NamedQuery(name = "Pembayaran.findByStatusPembayaran", query = "SELECT p FROM Pembayaran p WHERE p.statusPembayaran = :statusPembayaran"),
    @NamedQuery(name = "Pembayaran.findBySisaBayar", query = "SELECT p FROM Pembayaran p WHERE p.sisaBayar = :sisaBayar")})
public class Pembayaran implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "no_nota")
    private String noNota;
    @Basic(optional = false)
    @Column(name = "tanggal_pembayaran")
    @Temporal(TemporalType.DATE)
    private Date tanggalPembayaran;
    @Basic(optional = false)
    @Column(name = "total_pembayaran")
    private double totalPembayaran;
    @Basic(optional = false)
    @Column(name = "status_pembayaran")
    private String statusPembayaran;
    @Basic(optional = false)
    @Column(name = "sisa_bayar")
    private double sisaBayar;
    @JoinColumn(name = "id_penyewaan", referencedColumnName = "id_penyewaan")
    @ManyToOne(optional = false)
    private Penyewaan idPenyewaan;

    public Pembayaran() {
    }

    public Pembayaran(String noNota) {
        this.noNota = noNota;
    }

    public Pembayaran(String noNota, Date tanggalPembayaran, double totalPembayaran, String statusPembayaran, double sisaBayar) {
        this.noNota = noNota;
        this.tanggalPembayaran = tanggalPembayaran;
        this.totalPembayaran = totalPembayaran;
        this.statusPembayaran = statusPembayaran;
        this.sisaBayar = sisaBayar;
    }

    public String getNoNota() {
        return noNota;
    }

    public void setNoNota(String noNota) {
        this.noNota = noNota;
    }

    public Date getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public void setTanggalPembayaran(Date tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public double getTotalPembayaran() {
        return totalPembayaran;
    }

    public void setTotalPembayaran(double totalPembayaran) {
        this.totalPembayaran = totalPembayaran;
    }

    public String getStatusPembayaran() {
        return statusPembayaran;
    }

    public void setStatusPembayaran(String statusPembayaran) {
        this.statusPembayaran = statusPembayaran;
    }

    public double getSisaBayar() {
        return sisaBayar;
    }

    public void setSisaBayar(double sisaBayar) {
        this.sisaBayar = sisaBayar;
    }

    public Penyewaan getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(Penyewaan idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (noNota != null ? noNota.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pembayaran)) {
            return false;
        }
        Pembayaran other = (Pembayaran) object;
        if ((this.noNota == null && other.noNota != null) || (this.noNota != null && !this.noNota.equals(other.noNota))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.Pembayaran[ noNota=" + noNota + " ]";
    }
    
}
