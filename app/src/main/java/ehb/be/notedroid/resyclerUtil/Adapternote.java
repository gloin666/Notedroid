package ehb.be.notedroid.resyclerUtil;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ehb.be.notedroid.R;
import ehb.be.notedroid.model.Note;

public class Adapternote extends RecyclerView.Adapter<Adapternote.NoteViewHolder> {
    public class NoteViewHolder extends RecyclerView.ViewHolder {
      public final TextView tf_datum;
      public final TextView tf_note;
      public final TextView tf_title;


      public NoteViewHolder (@NonNull View itemView){
          super(itemView);
          itemView.setTag(this);
          tf_datum = itemView.findViewById(R.id.tf_datum);
          tf_note = itemView.findViewById(R.id.tf_note);
          tf_title = itemView.findViewById(R.id.tf_title);

      }
    }

    //welke data gaan we bijhouden
    private List<Note> items;
    private Context context;
public Adapternote (List<Note> items)
{
    this.items = items;
}
    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        View noteRowView = LayoutInflater.from(context).inflate(R.layout.notemap, viewGroup,false);

        return new NoteViewHolder(noteRowView);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder noteViewHolder, int i) {
    Note noteinscherm = items.get(i);
    noteViewHolder.tf_datum.setText( noteinscherm.getDateNote().toString());
    noteViewHolder.tf_title.setText( noteinscherm.getTitelNote());
    noteViewHolder.tf_note.setText(  noteinscherm.getContentNote());


    }

    @Override
    public int getItemCount() {
        return items.size();
    }





}
