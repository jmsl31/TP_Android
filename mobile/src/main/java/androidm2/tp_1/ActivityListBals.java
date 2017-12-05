package androidm2.tp_1;

import android.app.Activity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import sakdavong.tangotoulouse.net.json.CommunicationServeur;
import sakdavong.tangotoulouse.net.json.RecepteurListeBal;
import sakdavong.tangotoulousenet.Bal;

public class ActivityListBals extends Activity implements RecepteurListeBal{

    public List<Bal> Bals;
    ListeBalsAdapter balsAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_bals);
        Bals = new ArrayList<>();
        balsAdapter = new ListeBalsAdapter(Bals,this.getApplicationContext());

        new CommunicationServeur().recevoirListe(this, new Date(), 50, this);
        //View
        recyclerView = (RecyclerView) findViewById(R.id.ListesBals);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(balsAdapter);

        SimpleItemCallBack simplecallback = new SimpleItemCallBack(recyclerView);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(simplecallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);

    }
     @Override
    public void newList( List<Bal> liste){
                Bals.clear();
                Bals.addAll(liste);
                balsAdapter.notifyDataSetChanged();
     }


};

