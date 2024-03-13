/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presistt;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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
@Table(name = "pengembalian")
@NamedQueries({
    @NamedQuery(name = "Pengembalian.findAll", query = "SELECT p FROM Pengembalian p"),
    @NamedQuery(name = "Pengembalian.findByIdPengembalian", query = "SELECT p FROM Pengembalian p WHERE p.idPengembalian = :idPengembalian"),
    @NamedQuery(name = "Pengembalian.findByTanggalPengembalian", query = "SELECT p FROM Pengembalian p WHERE p.tanggalPengembalian = :tanggalPengembalian"),
    @NamedQuery(name = "Pengembalian.findByTotalDenda", query = "SELECT p FROM Pengembalian p WHERE p.totalDenda = :totalDenda")})
public class Pengembalian implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pengembalian")
    private String idPengembalian;
    @Basic(optional = false)
    @Column(name = "tanggal_pengembalian")
    @Temporal(TemporalType.DATE)
    private Date tanggalPengembalian;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "total_denda")
    private Double totalDenda;
    @ManyToMany(mappedBy = "pengembalianCollection")
    private Collection<BiayaDenda> biayaDendaCollection;
    @JoinColumn(name = "id_penyewaan", referencedColumnName = "id_penyewaan")
    @ManyToOne(optional = false)
    private Penyewaan idPenyewaan;

    public Pengembalian() {
    }

    public Pengembalian(String idPengembalian) {
        this.idPengembalian = idPengembalian;
    }

    public Pengembalian(String idPengembalian, Date tanggalPengembalian) {
        this.idPengembalian = idPengembalian;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public String getIdPengembalian() {
        return idPengembalian;
    }

    public void setIdPengembalian(String idPengembalian) {
        this.idPengembalian = idPengembalian;
    }

    public Date getTanggalPengembalian() {
        return tanggalPengembalian;
    }

    public void setTanggalPengembalian(Date tanggalPengembalian) {
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public Double getTotalDenda() {
        return totalDenda;
    }

    public void setTotalDenda(Double totalDenda) {
        this.totalDenda = totalDenda;
    }

    public Collection<BiayaDenda> getBiayaDendaCollection() {
        return biayaDendaCollection;
    }

    public void setBiayaDendaCollection(Collection<BiayaDenda> biayaDendaCollection) {
        this.biayaDendaCollection = biayaDendaCollection;
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
        hash += (idPengembalian != null ? idPengembalian.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pengembalian)) {
            return false;
        }
        Pengembalian other = (Pengembalian) object;
        if ((this.idPengembalian == null && other.idPengembalian != null) || (this.idPengembalian != null && !this.idPengembalian.equals(other.idPengembalian))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.Pengembalian[ idPengembalian=" + idPengembalian + " ]";
    }
    
}
