package androidm2.tp_1;

import android.content.Intent;
import android.icu.text.DateFormat;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by johann.meissl on 29/11/2017.
 */

public class BalViewHolder extends RecyclerView.ViewHolder {

    TextView titre,lieu,association,date,heuredebut,heurefin,adresse1,adresse2,villeCP,description,dj,orchestre,PAF1,PAF2;
    Button butSite,butMaps ;
    public BalViewHolder(final View ItemView){
        super(ItemView);

        butSite = (Button) itemView.findViewById(R.id.ButSite);
        butMaps =(Button) itemView.findViewById(R.id.ButMaps);
        titre = (TextView) itemView.findViewById(R.id.titre);
        association = (TextView) itemView.findViewById(R.id.association);
        date = (TextView) itemView.findViewById(R.id.date);
        heuredebut = (TextView)  itemView.findViewById(R.id.heuredebut);
        heurefin = (TextView)  itemView.findViewById(R.id.heurefin);
        adresse1 =(TextView)  itemView.findViewById(R.id.adresse1);
        adresse2 =(TextView)  itemView.findViewById(R.id.adresse2);
        villeCP =(TextView)  itemView.findViewById(R.id.villeCP);
        description =(TextView)  itemView.findViewById(R.id.description);
        dj =(TextView)  itemView.findViewById(R.id.dj);
        orchestre = (TextView)  itemView.findViewById(R.id.orchestre);
        PAF1 =(TextView)  itemView.findViewById(R.id.PAF1);
        PAF2=(TextView)  itemView.findViewById(R.id.PAF2);
        lieu = (TextView) itemView.findViewById(R.id.Lieu);
    }
}
