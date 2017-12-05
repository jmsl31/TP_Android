/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakdavong.tangotoulouse.net.json;



/**
 *
 * La classe permettant de décrire une demande de liste de bals auprès du serveur
 */

public class RequeteBals 
{
    private String codeSecret; // Clé d'accès au serveur
    private Long debut;        // Date de début de recherche
    private int nb;            // Nombre de bals demandés

    public Long getDebut() {
        return debut;
    }

    public void setDebut(Long debut) {
        this.debut = debut;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public String getCodeSecret() {
        return codeSecret;
    }

    public void setCodeSecret(String codeSecret) {
        this.codeSecret = codeSecret;
    }

    public RequeteBals() {
    }

    public RequeteBals(String codeSecret, Long debut, int nb) {
        this.codeSecret = codeSecret;
        this.debut = debut;
        this.nb = nb;
    }
}
