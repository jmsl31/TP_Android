/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sakdavong.tangotoulousenet;

import java.io.Serializable;
import java.util.Date;


/**
 * Classe décrivant un bal
 *
 */
//@Entity
public class Bal implements Serializable {
    private static final long serialVersionUID = 1L;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //@ManyToOne // Il faudra une méthode dans la facade pour chercher les bals d'une association, etc...
    private Association association;
    
    private String titre, type, lieuNom, lieuAdresse1, lieuAdresse2, lieuVilleCP, lieuMaps, descriptif4Lignes,  lien, paf1, paf2, dj, orchestre; 
    
    //@Lob @Basic(fetch = FetchType.EAGER)
    private String descriptifLong;
    
    
    private Photo photo1, photo2;
 
    //@Temporal(TemporalType.TIMESTAMP)
    Date dateBal;
    
    //@Temporal(TemporalType.TIME)
    Date horaireFin;

    
    
    
    public Bal() {
    }

    public Bal(Association association, String titre, String type, String lieuNom, String lieuAdresse1, String lieuAdresse2, String lieuVilleCP, String lieuMaps, String descriptif4Lignes, String lien, String paf1, String paf2, String dj, String orchestre, String descriptifLong, Photo photo1, Photo photo2, Date dateBal, Date horaireFin) {
        this.association = association;
        this.titre = titre;
        this.type = type;
        this.lieuNom = lieuNom;
        this.lieuAdresse1 = lieuAdresse1;
        this.lieuAdresse2 = lieuAdresse2;
        this.lieuVilleCP = lieuVilleCP;
        this.lieuMaps = lieuMaps;
        this.descriptif4Lignes = descriptif4Lignes;
        this.lien = lien;
        this.paf1 = paf1;
        this.paf2 = paf2;
        this.dj = dj;
        this.orchestre = orchestre;
        this.descriptifLong = descriptifLong;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.dateBal = dateBal;
        
        this.horaireFin = horaireFin;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLieuNom() {
        return lieuNom;
    }

    public void setLieuNom(String lieuNom) {
        this.lieuNom = lieuNom;
    }

    public String getLieuAdresse1() {
        return lieuAdresse1;
    }

    public void setLieuAdresse1(String lieuAdresse1) {
        this.lieuAdresse1 = lieuAdresse1;
    }

    public String getLieuAdresse2() {
        return lieuAdresse2;
    }

    public void setLieuAdresse2(String lieuAdresse2) {
        this.lieuAdresse2 = lieuAdresse2;
    }

    public String getLieuVilleCP() {
        return lieuVilleCP;
    }

    public void setLieuVilleCP(String lieuVilleCP) {
        this.lieuVilleCP = lieuVilleCP;
    }

    public String getLieuMaps() {
        return lieuMaps;
    }

    public void setLieuMaps(String lieuMaps) {
        this.lieuMaps = lieuMaps;
    }

    public String getDescriptif4Lignes() {
        return descriptif4Lignes;
    }

    public void setDescriptif4Lignes(String descriptif4Lignes) {
        this.descriptif4Lignes = descriptif4Lignes;
    }

    public String getLien() {
        return lien;
    }

    public void setLien(String lien) {
        this.lien = lien;
    }

    public String getPaf1() {
        return paf1;
    }

    public void setPaf1(String paf1) {
        this.paf1 = paf1;
    }

    public String getPaf2() {
        return paf2;
    }

    public void setPaf2(String paf2) {
        this.paf2 = paf2;
    }

    public String getDj() {
        return dj;
    }

    public void setDj(String dj) {
        this.dj = dj;
    }

    public String getOrchestre() {
        return orchestre;
    }

    public void setOrchestre(String orchestre) {
        this.orchestre = orchestre;
    }

    public String getDescriptifLong() {
        return descriptifLong;
    }

    public void setDescriptifLong(String descriptifLong) {
        this.descriptifLong = descriptifLong;
    }

    public Photo getPhoto1() {
        return photo1;
    }

    public void setPhoto1(Photo photo1) {
        this.photo1 = photo1;
    }

    public Photo getPhoto2() {
        return photo2;
    }

    public void setPhoto2(Photo photo2) {
        this.photo2 = photo2;
    }

   

    public Date getDateBal() {
        return dateBal;
    }

    public void setDateBal(Date dateBal) {
        this.dateBal = dateBal;
    }

 

    public Date getHoraireFin() {
        return horaireFin;
    }

    public void setHoraireFin(Date horaireFin) {
        this.horaireFin = horaireFin;
    }

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bal)) {
            return false;
        }
        Bal other = (Bal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sakdavong.tangotoulousenet.Bal[ id=" + id + " ]";
    }
    
}
