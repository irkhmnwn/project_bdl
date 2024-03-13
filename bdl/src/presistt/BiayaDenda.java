/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presistt;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Irkhamnawan
 */
@Entity
@Table(name = "biaya_denda")
@NamedQueries({
    @NamedQuery(name = "BiayaDenda.findAll", query = "SELECT b FROM BiayaDenda b"),
    @NamedQuery(name = "BiayaDenda.findByIdDenda", query = "SELECT b FROM BiayaDenda b WHERE b.idDenda = :idDenda"),
    @NamedQuery(name = "BiayaDenda.findByDeskripsiDenda", query = "SELECT b FROM BiayaDenda b WHERE b.deskripsiDenda = :deskripsiDenda"),
    @NamedQuery(name = "BiayaDenda.findByTagihanDenda", query = "SELECT b FROM BiayaDenda b WHERE b.tagihanDenda = :tagihanDenda")})
public class BiayaDenda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_denda")
    private String idDenda;
    @Basic(optional = false)
    @Column(name = "deskripsi_denda")
    private String deskripsiDenda;
    @Basic(optional = false)
    @Column(name = "tagihan_denda")
    private int tagihanDenda;
    @JoinTable(name = "detail_denda", joinColumns = {
        @JoinColumn(name = "id_denda", referencedColumnName = "id_denda")}, inverseJoinColumns = {
        @JoinColumn(name = "id_pengembalian", referencedColumnName = "id_pengembalian")})
    @ManyToMany
    private Collection<Pengembalian> pengembalianCollection;

    public BiayaDenda() {
    }

    public BiayaDenda(String idDenda) {
        this.idDenda = idDenda;
    }

    public BiayaDenda(String idDenda, String deskripsiDenda, int tagihanDenda) {
        this.idDenda = idDenda;
        this.deskripsiDenda = deskripsiDenda;
        this.tagihanDenda = tagihanDenda;
    }

    public String getIdDenda() {
        return idDenda;
    }

    public void setIdDenda(String idDenda) {
        this.idDenda = idDenda;
    }

    public String getDeskripsiDenda() {
        return deskripsiDenda;
    }

    public void setDeskripsiDenda(String deskripsiDenda) {
        this.deskripsiDenda = deskripsiDenda;
    }

    public int getTagihanDenda() {
        return tagihanDenda;
    }

    public void setTagihanDenda(int tagihanDenda) {
        this.tagihanDenda = tagihanDenda;
    }

    public Collection<Pengembalian> getPengembalianCollection() {
        return pengembalianCollection;
    }

    public void setPengembalianCollection(Collection<Pengembalian> pengembalianCollection) {
        this.pengembalianCollection = pengembalianCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDenda != null ? idDenda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BiayaDenda)) {
            return false;
        }
        BiayaDenda other = (BiayaDenda) object;
        if ((this.idDenda == null && other.idDenda != null) || (this.idDenda != null && !this.idDenda.equals(other.idDenda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presistt.BiayaDenda[ idDenda=" + idDenda + " ]";
    }
    
}
