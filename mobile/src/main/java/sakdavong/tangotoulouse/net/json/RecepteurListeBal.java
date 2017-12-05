package sakdavong.tangotoulouse.net.json;

import java.util.List;

import sakdavong.tangotoulousenet.Bal;

/**
 * L'interface permettant d'être prévenu de la réception des bals
 * Elle sera implantée ici par l'objet ActivityListeBals
 */

public interface RecepteurListeBal {
    void newList(List<Bal> liste); // Méthode appelée lorsque les bals ont été chargés
}
