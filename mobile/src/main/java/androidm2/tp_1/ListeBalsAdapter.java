package androidm2.tp_1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import sakdavong.tangotoulousenet.Bal;

/**
 * Created by johann.meissl on 29/11/2017.
 */

public class ListeBalsAdapter extends RecyclerView.Adapter{

    private List<Bal> bals;
    Intent i;
    public ListeBalsAdapter(List<Bal> bals, Context context)
    {
        this.bals = bals;
        i = new Intent(Intent.ACTION_VIEW);

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.details_bal, parent,false);
        return new BalViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final Bal b = bals.get(position);

        SimpleDateFormat date = new SimpleDateFormat("EEE d MMM yyyy");
        SimpleDateFormat heure = new SimpleDateFormat("HH:mm:ss");
        BalViewHolder balHolder = (BalViewHolder) holder;
        balHolder.titre.setText(b.getTitre());

        balHolder.lieu.setText("Lieux : "+ b.getLieuNom());
        balHolder.association.setText("Association : "+ b.getAssociation().getNom());
        balHolder.adresse1.setText("Adresse : " +b.getLieuAdresse1());
        balHolder.adresse2.setText(b.getLieuAdresse2());
        balHolder.description.setText("Description : "+b.getDescriptif4Lignes());
        balHolder.villeCP.setText("Ville :" +b.getLieuVilleCP());
        balHolder.dj.setText("Dj:" +b.getDj());
        balHolder.orchestre.setText(b.getOrchestre());
        balHolder.PAF1.setText("Prix : "+ b.getPaf1());
        balHolder.PAF2.setText(b.getPaf2());
        balHolder.heuredebut.setText("Heure debut : "+heure.format( b.getDateBal()));
        balHolder.heurefin.setText("Durée : "+heure.format( b.getHoraireFin()));
        balHolder.date.setText("Date : " +date.format(b.getDateBal()));

        balHolder.butSite.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){

                i.setData(Uri.parse(b.getLien()));
                v.getContext().startActivity(i);
            }
        });

      balHolder.butMaps.setOnClickListener(new View.OnClickListener(){
          @Override

          public void onClick(View v){
              String[] map = b.getLieuMaps().split(",");
             /* Intent intentGoogleMaps = new Intent(v.getContext(),MapsActivity.class);
              intentGoogleMaps.putExtra("Lat",Double.parseDouble( map[0].split("Lat:")[1]));
              intentGoogleMaps.putExtra("Lng",Double.parseDouble(map[1].split(" Lng:")[1]));
              intentGoogleMaps.putExtra("name",b.getLieuNom());
              v.getContext().startActivity(intentGoogleMaps);
*/
              double lat = Double.parseDouble( map[0].split("Lat:")[1]);
              double lg = Double.parseDouble(map[1].split(" Lng:")[1]);

              Uri gmmIntentUri = Uri.parse("geo:"+lat+","+ lg+"");
              Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
              mapIntent.setPackage("com.google.android.apps.maps");
              v.getContext().startActivity(mapIntent);
          }

      });
    }

    void remove(int pos){

        bals.remove(pos);
        this.notifyItemRangeRemoved(pos,pos);
        if (pos==0)
            this.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return bals.size();
    }

}
