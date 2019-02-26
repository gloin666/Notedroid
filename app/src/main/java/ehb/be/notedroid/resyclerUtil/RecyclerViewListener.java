package ehb.be.notedroid.resyclerUtil;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class RecyclerViewListener implements RecyclerView.OnItemTouchListener {
    public interface ClickListner{
        void onClick(View view, int position);
    }
private ClickListner clickListner;
private GestureDetector gestureDetector;
public RecyclerViewListener(Context context, ClickListner clickListner){
this.clickListner =clickListner;
this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener());
}


    @Override
    public boolean onInterceptTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
        View rij = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
        if(rij != null && motionEvent.getAction() == MotionEvent.ACTION_DOWN ) {
            clickListner.onClick(rij, recyclerView.getChildAdapterPosition(rij));
        }
        return false;
    }

    @Override
    public void onTouchEvent(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean b) {



    }
}
