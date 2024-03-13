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
import javax.persistence.ManyToMany;
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
@Table(name = "perawatan")
@NamedQueries({
    @NamedQuery(name = "Perawatan.findAll", query = "SELECT p FROM Perawatan p"),
    @NamedQuery(name = "Perawatan.findByIdPerawatan", query = "SELECT p FROM Perawatan p WHERE p.idPerawatan = :idPerawatan"),
    @NamedQuery(name = "Perawatan.findByTanggalPerawatan", query = "SELECT p FROM Perawatan p WHERE p.tanggalPerawatan = :tanggalPerawatan"),
    @NamedQuery(name = "Perawatan.findByDeskripsiPerawatan", query = "SELECT p FROM Perawatan p WHERE p.deskripsiPerawatan = :deskripsiPerawatan"),
    @NamedQuery(name = "Perawatan.findByBiayaPerawatan", query = "SELECT p FROM Perawatan p WHERE p.biayaPerawatan = :biayaPerawatan")})
public class Perawatan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_perawatan")
    private String idPerawatan;
    @Column(name = "tanggal_perawatan")
    @Temporal(TemporalType.DATE)
    private Date tanggalPerawatan;
    @Column(name = "deskripsi_perawatan")
    private String deskripsiPerawatan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "biaya_perawatan")
    private Double biayaPerawatan;
    @ManyToMany(mappedBy = "perawatanCollection")
    private Collection<Kendaraan> kendaraanCollection;

    public Perawatan() {
    }

    public Perawatan(String idPerawatan) {
        this.idPerawatan = idPerawatan;
    }

    public String getIdPerawatan() {
        return idPerawatan;
    }

    public void setIdPerawatan(String idPerawatan) {
        this.idPerawatan = idPerawatan;
    }

    public Date getTanggalPerawatan() {
        return tanggalPerawatan;
    }

    public void setTanggalPerawatan(Date tanggalPerawatan) {
        this.tanggalPerawatan = tanggalPerawatan;
    }

    public String getDeskripsiPerawatan() {
        return deskripsiPerawatan;
    }

    public void setDeskripsiPerawatan(String deskripsiPerawatan) {
        this.deskripsiPerawatan = deskripsiPerawatan;
    }

    public Double getBiayaPerawatan() {
        return biayaPerawatan;
    }

    public void setBiayaPerawatan(Double biayaPerawatan) {
        this.biayaPerawatan = biayaPerawatan;
    }

    public Collection<Kendaraan> getKendaraanCollection() {
        return kendaraanCollection;
    }

    public void setKendaraanCollection(Collection<Kendaraan> kendaraanCollection) {
        this.kendaraanCollection = kendaraanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPerawatan != null ? idPerawatan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perawatan)) {
            return false;
        }
        Perawatan other = (Perawatan) object;
        if ((this.idPerawatan == null && other.idPerawatan != null) || (this.idPerawatan != null && !this.idPerawatan.equals(other.idPerawatan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.Perawatan[ idPerawatan=" + idPerawatan + " ]";
    }
    
}
