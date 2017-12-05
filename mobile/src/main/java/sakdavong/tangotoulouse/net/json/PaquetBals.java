/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakdavong.tangotoulouse.net.json;

import java.util.List;
import sakdavong.tangotoulousenet.Bal;

/*
 * La classe décrivant le paquet contenant la liste des bals
 *
 */
public class PaquetBals {
    // L'attribut contenant la liste
    private List<Bal> bals;

    public List<Bal> getBals() {
        return bals;
    }

    public void setBals(List<Bal> bals) {
        this.bals = bals;
    }

    public PaquetBals() {
    }

    public PaquetBals(List<Bal> bals) {
        this.bals = bals;
    }
}
