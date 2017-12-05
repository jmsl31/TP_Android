package sakdavong.tangotoulouse.net.json;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;

import java.util.Date;

/**
 * Classe permettant de charger la liste des bals à partir du serveur Web
 * Communique grâce à JSon
 */
public class CommunicationServeur {

    private final String motDePasse="bacara";
    private final String url = "http://vps222183.ovh.net:8080/tangotoulousenet/obtenirbals";

    /*
     * Méthode qui retourne la liste des bals à partir:
     * - du contexte
     * - d'une date de début
     * - d'un nombre de bals demandés
     * - d'une référence à un objet qui sera prévenu et recevra les bals lorsqu'ils seront chargés
     *
     * Le récepteur devra implanter une méthode newList(List<Bal>) afin de recevoir les bals
     */
    public void recevoirListe(Context c, Date debutRecherche, int nbBals, final RecepteurListeBal recepteur) {
        // Instancie la file de requetes
        RequestQueue queue = Volley.newRequestQueue(c);

        // Création automatique de l'objet JSON avec la bibliothèque GSON de Google
        // RequeteBals est la classe qui décrit la requete (défini côté serveur)
        final RequeteBals requete = new RequeteBals("bacara", debutRecherche.getTime(), nbBals);

        ////////// Lancement de la requete
        // PaquetBals est la classe qui décrit le paquet qui recevra la liste des bals (défini côté serveur)
        final GsonRequest gsonRequete = new GsonRequest<RequeteBals, PaquetBals>(url,
                requete,
                RequeteBals.class,
                PaquetBals.class,
                null,
                new Response.Listener<PaquetBals>() {
                    @Override
                    public void onResponse(PaquetBals reponse) {
                        recepteur.newList(reponse.getBals());
                        System.err.println("On a recu " + reponse.getBals().size() + " bals");
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // ICI REPONSE PAS OK !
                        System.err.println("On a recu l'erreur" + error.toString());
                    }
                }
        );


        // Add the request to the RequestQueue.
        queue.add(gsonRequete);
    }


}
