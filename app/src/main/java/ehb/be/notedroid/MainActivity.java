package ehb.be.notedroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.List;
import ehb.be.notedroid.model.Note;
import ehb.be.notedroid.model.NoteDataBase;
import ehb.be.notedroid.resyclerUtil.Adapternote;
import ehb.be.notedroid.resyclerUtil.RecyclerViewListener;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvNote = findViewById(R.id.rv_note);
        //DATABASE CLASS
        List<Note> items  = NoteDataBase.getInstance(getApplicationContext()).getnoteDAO().selectAllNotes();
        Adapternote adapternote =new Adapternote(items);
        RecyclerView.LayoutManager LeManager = new LinearLayoutManager(this);

        rvNote.setAdapter(adapternote);
        rvNote.setLayoutManager(LeManager);

       // rvNote.addOnItemTouchListener(new RecyclerViewListener(this, clickListener));
    }
}
