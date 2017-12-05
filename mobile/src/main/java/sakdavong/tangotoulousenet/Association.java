/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sakdavong.tangotoulousenet;


import java.io.Serializable;


/*
 * Classe décrivant une association
 *
 */

//@Entity
public class Association implements Serializable {
    private static final long serialVersionUID = 1L;
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom, adresse1, adresse2, villeCP, tel1, tel2, commentVenir, contact, email, maps, permanence, login, password, derniereConnexion, derniereIP;
    
    //@Lob @Basic(fetch = FetchType.EAGER)
    private String description;
    
    //@OneToOne
    private Photo photo1, photo2;
    
    private String preferences; // A definir plus tard

    public Association(String nom, String adresse1, String adresse2, String villeCP, String tel1, String tel2, String commentVenir, String email, String maps, String permanence, String login, String password, String description, Photo photo1, Photo photo2, String preferences) {
        this.nom = nom;
        this.adresse1 = adresse1;
        this.adresse2 = adresse2;
        this.villeCP = villeCP;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.commentVenir = commentVenir;
        this.email = email;
        this.maps = maps;
        this.permanence = permanence;
        this.login = login;
        this.password = password;
        this.description = description;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.preferences = preferences;
    }

    public Association() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse1() {
        return adresse1;
    }

    public void setAdresse1(String adresse1) {
        this.adresse1 = adresse1;
    }

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getVilleCP() {
        return villeCP;
    }

    public void setVilleCP(String villeCP) {
        this.villeCP = villeCP;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getCommentVenir() {
        return commentVenir;
    }

    public void setCommentVenir(String commentVenir) {
        this.commentVenir = commentVenir;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaps() {
        return maps;
    }

    public void setMaps(String maps) {
        this.maps = maps;
    }

    public String getPermanence() {
        return permanence;
    }

    public void setPermanence(String permanence) {
        this.permanence = permanence;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDerniereConnexion() {
        return derniereConnexion;
    }

    public void setDerniereConnexion(String derniereConnexion) {
        this.derniereConnexion = derniereConnexion;
    }

    public String getDerniereIP() {
        return derniereIP;
    }

    public void setDerniereIP(String derniereIP) {
        this.derniereIP = derniereIP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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



    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
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
        if (!(object instanceof Association)) {
            return false;
        }
        Association other = (Association) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sakdavong.tangotoulousenet.Association[ id=" + id + " ]";
    }
    
}
