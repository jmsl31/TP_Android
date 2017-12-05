/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sakdavong.tangotoulousenet;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe décrivant une photo d'association
 *
 */
//@Entity
public class Photo implements Serializable {
    private static final long serialVersionUID = 1L;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    
    //@ManyToOne(fetch = FetchType.EAGER)
    private Association association;
    
    //@Lob @Basic(fetch = FetchType.EAGER)
    private byte[] data;
    
    private String nomFichier, extension;
    
    //@Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;

    public Photo(Association association, byte[] data, String nomFichier, String extension, Date dateCreation) {
        this.association = association;
        this.data = data;
        this.nomFichier = nomFichier;
        this.extension = extension;
        this.dateCreation = dateCreation;
    }

    public Photo() {
    }

    
    
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Association getAssociation() {
        return association;
    }

    public void setAssociation(Association association) {
        this.association = association;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getNomFichier() {
        return nomFichier;
    }

    public void setNomFichier(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
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
        if (!(object instanceof Photo)) {
            return false;
        }
        Photo other = (Photo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sakdavong.tangotoulousenet.Photo[ id=" + id + " ]";
    }
    
}
