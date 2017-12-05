package androidm2.tp_1;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by johann.meissl on 29/11/2017.
 */

public class SimpleItemCallBack  extends ItemTouchHelper.SimpleCallback{


    RecyclerView recycler;
    public RecyclerView getRecycler() {
        return recycler;
    }

    public void setRecycler(RecyclerView recycler) {

        this.recycler = recycler;
    }


    public SimpleItemCallBack(RecyclerView recycler){
        super(0,ItemTouchHelper.RIGHT);
        setRecycler(recycler);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

        int SwipedPosition = viewHolder.getAdapterPosition();
        ListeBalsAdapter adapterListesBals = (ListeBalsAdapter)  this.getRecycler().getAdapter();
        adapterListesBals.remove(SwipedPosition);
      
    }

}
