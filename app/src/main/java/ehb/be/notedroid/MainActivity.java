package ehb.be.notedroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

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


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menufile, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mi_add :
                Intent intent = new Intent(getApplicationContext(),AddNoteActivety.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
