/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakdavong.tangotoulouse.net.json;


/**
 *
 * @author jcs
 */

/*
public class ObtenirBalServlet extends HttpServlet {
 
    @EJB
    private saldavong.tangotoulousenet.sessionbeans.BalFacade balFacade;
    
    @EJB
    private saldavong.tangotoulousenet.sessionbeans.AssociationFacade associationFacade;
    
    private static final long serialVersionUID = 1L;
    private SurveillanceRequetes surveillance=null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config); 
    
        // Ajout de l'objet de surveillance s'il n'est pas présent
        if (config.getServletContext().getAttribute("surveillance")==null)
            config.getServletContext().setAttribute("surveillance", new SurveillanceRequetes());
        surveillance = (SurveillanceRequetes)config.getServletContext().getAttribute("surveillance");
    }
 
    
 
    /***************************************************
     * URL: /jsonservlet
     * doPost(): receives JSON data, parse it, map it and send back as JSON
     ***************************************************
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        response.setContentType("application/json"); 
        Gson gson = new Gson();
 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream()));
        String json = "";
        if(br != null){
            json = br.readLine();
        }
 
        // Conversion du bloc JSON
        
        RequeteBals requete = gson.fromJson(json, RequeteBals.class); 
        
        // Vérification de la validité du bloc
        boolean blocOK = true;
        
        if (requete.getNb()>60)
        {
            requete.setNb(60);
        }
        
        if (!surveillance.codeSecretValide(requete.getCodeSecret()))
            blocOK = false;
        
        // Traitement
        
        if (blocOK)
        {
            List<Bal> liste = balFacade.findRange(requete.getDebut(), requete.getNb());

            // Emballage et envoi réponse

            PaquetBals reponse = new PaquetBals(liste);
            response.getOutputStream().print(gson.toJson(reponse));
        }
        
        response.getOutputStream().flush();
        
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        
        response.setContentType("text/html"); 
        
        response.getWriter().println("<HTML><BODY><H1>SURVEILLANCE</H1><P>Début: "+surveillance.getDebutSurveillance().toString()+"<BR/>List: "+surveillance.getNbVisualisationPageListe()+"<BR/>Agenda: "+surveillance.getNbVisualisationPageAgenda()+"<BR/>JSon: "+surveillance.getNbAppelJSon()+"</P></BODY></HTML>");
        response.flushBuffer();
    }
}*/