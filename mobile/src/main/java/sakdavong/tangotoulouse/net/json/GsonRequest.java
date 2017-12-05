package sakdavong.tangotoulouse.net.json;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.UnsupportedEncodingException;
import java.util.Map;

// Cette classe permet de récupérer un objet de la classe T à partir d'un envoi à une url retournant un T
// Doc: http://icetea09.com/blog/2014/11/02/android-parse-json-request-using-volley-gson/
//
// Exemple d'appel en bas


public class GsonRequest<TypeEnvoye, TypeRecu> extends Request<TypeRecu> {
    private final Gson gson = new Gson();
    private final Class<TypeRecu> clazz;
    private final Class<TypeEnvoye> clazzMessage;
    private final Map<String, String> headers;
    private final Response.Listener<TypeRecu> listener;
    private final String mRequestBody;


    /** Default charset for JSON request. */
    protected static final String PROTOCOL_CHARSET = "utf-8";

    /** Content type for request. */
    private static final String PROTOCOL_CONTENT_TYPE =
            String.format("application/json; charset=%s", PROTOCOL_CHARSET);

    // Méthode pour recevoir sans rien envoyer dans le body
    public GsonRequest(String url, Class<TypeRecu> classeRecue, Map<String, String> headers,
                       Response.Listener<TypeRecu> listener, Response.ErrorListener errorListener) {
        super(Method.GET, url, errorListener);
        this.clazz = classeRecue;
        this.headers = headers;
        this.listener = listener;
        this.mRequestBody = null;
        this.clazzMessage = null;
    }

    // Méthode pour envoyer le body et recevoir un résultat
    public GsonRequest(String url, TypeEnvoye ObjetGsonEnvoye, Class<TypeEnvoye> classeObjetGsonEnvoye, Class<TypeRecu> classeObjetGsonRecu, Map<String, String> headers,
                       Response.Listener<TypeRecu> listener, Response.ErrorListener errorListener) {
        super(Method.POST, url, errorListener);
        this.clazz = classeObjetGsonRecu;
        this.headers = headers;
        this.listener = listener;
        this.clazzMessage = classeObjetGsonEnvoye;
        this.mRequestBody = gson.toJson(ObjetGsonEnvoye, classeObjetGsonEnvoye);
    }


    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        return headers != null ? headers : super.getHeaders();
    }

    @Override
    protected Response<TypeRecu> parseNetworkResponse(NetworkResponse response) {
        try {
            String json = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            return Response.success(gson.fromJson(json, clazz),
                    HttpHeaderParser.parseCacheHeaders(response));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return Response.error(new ParseError(e));
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            return Response.error(new ParseError(e));
        }
    }

    @Override
    protected void deliverResponse(TypeRecu response) {
        listener.onResponse(response);
    }

    @Override
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override
    public byte[] getBody() {
        try {
            return mRequestBody == null ? null : mRequestBody.getBytes(PROTOCOL_CHARSET);
        } catch (UnsupportedEncodingException uee) {
            VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s",
                    mRequestBody, PROTOCOL_CHARSET);
            uee.printStackTrace();
            return null;
        }
    }
}

/*              EXEMPLE D'UTILISATION DE CETTE CLASSE
// Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(c);

final PaquetTraces paquet = new PaquetTraces(idUtilisateur, traces);

        final GsonRequest requete = new GsonRequest<PaquetTraces>(url,
                                            PaquetTraces.class,
                                            null,
                                            new Response.Listener<PaquetTraces>()
                                            {
                                                @Override
                                                public void onResponse(PaquetTraces response)
                                                {
                                                    // ICI REPONSE OK !
                                                }
                                            },
                                            new Response.ErrorListener() {
                                                @Override
                                                public void onErrorResponse(VolleyError error) {
                                                    // ICI REPONSE PAS OK !
                                                }
                                            }
                                    );





        // Add the request to the RequestQueue.
        queue.add(requete);


 */