package ehb.be.notedroid;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Date;

import ehb.be.notedroid.model.Note;
import ehb.be.notedroid.model.NoteDataBase;

public class AddNoteActivety extends AppCompatActivity {

    private EditText etNoteText;
    private EditText etTitleNote;
    private TextView nDate;
    private FloatingActionButton fabsave;


    private View.OnClickListener fabListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Note nNote = new Note(etTitleNote.getText().toString(),etNoteText.getText().toString(), new Date());

            NoteDataBase.getInstance(getApplicationContext()).getnoteDAO().insertNote(nNote);

            Intent mintent = new Intent(getApplicationContext(),MainActivity.class);
            mintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(mintent);

        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note_activety);
        etTitleNote = findViewById(R.id.add_title);
        nDate = findViewById(R.id.add_date);


        etNoteText = findViewById(R.id.note_text_add);
        fabsave = findViewById(R.id.save_activ_note);
        fabsave.setOnClickListener(fabListener);
    }
}
