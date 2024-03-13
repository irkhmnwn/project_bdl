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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Irkhamnawan
 */
@Entity
@Table(name = "pelanggan")
@NamedQueries({
    @NamedQuery(name = "Pelanggan.findAll", query = "SELECT p FROM Pelanggan p"),
    @NamedQuery(name = "Pelanggan.findByIdPelanggan", query = "SELECT p FROM Pelanggan p WHERE p.idPelanggan = :idPelanggan"),
    @NamedQuery(name = "Pelanggan.findByNamaPelanggan", query = "SELECT p FROM Pelanggan p WHERE p.namaPelanggan = :namaPelanggan"),
    @NamedQuery(name = "Pelanggan.findByAlamatPelanggan", query = "SELECT p FROM Pelanggan p WHERE p.alamatPelanggan = :alamatPelanggan"),
    @NamedQuery(name = "Pelanggan.findByTelpPelanggan", query = "SELECT p FROM Pelanggan p WHERE p.telpPelanggan = :telpPelanggan")})
public class Pelanggan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pelanggan")
    private String idPelanggan;
    @Basic(optional = false)
    @Column(name = "nama_pelanggan")
    private String namaPelanggan;
    @Basic(optional = false)
    @Column(name = "alamat_pelanggan")
    private String alamatPelanggan;
    @Basic(optional = false)
    @Column(name = "telp_pelanggan")
    private String telpPelanggan;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPelanggan")
    private Collection<Penyewaan> penyewaanCollection;

    public Pelanggan() {
    }

    public Pelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public Pelanggan(String idPelanggan, String namaPelanggan, String alamatPelanggan, String telpPelanggan) {
        this.idPelanggan = idPelanggan;
        this.namaPelanggan = namaPelanggan;
        this.alamatPelanggan = alamatPelanggan;
        this.telpPelanggan = telpPelanggan;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getAlamatPelanggan() {
        return alamatPelanggan;
    }

    public void setAlamatPelanggan(String alamatPelanggan) {
        this.alamatPelanggan = alamatPelanggan;
    }

    public String getTelpPelanggan() {
        return telpPelanggan;
    }

    public void setTelpPelanggan(String telpPelanggan) {
        this.telpPelanggan = telpPelanggan;
    }

    public Collection<Penyewaan> getPenyewaanCollection() {
        return penyewaanCollection;
    }

    public void setPenyewaanCollection(Collection<Penyewaan> penyewaanCollection) {
        this.penyewaanCollection = penyewaanCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPelanggan != null ? idPelanggan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pelanggan)) {
            return false;
        }
        Pelanggan other = (Pelanggan) object;
        if ((this.idPelanggan == null && other.idPelanggan != null) || (this.idPelanggan != null && !this.idPelanggan.equals(other.idPelanggan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.Pelanggan[ idPelanggan=" + idPelanggan + " ]";
    }
    
}
