package ehb.be.notedroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Date;
import java.util.zip.DataFormatException;

import ehb.be.notedroid.model.Note;

public class activity_detail extends AppCompatActivity {
    private TextView tv_titleD,tv_contentD, tv_dateD;
    private Note selectedNote;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tv_dateD = findViewById(R.id.tv_detail_date);
        tv_titleD = findViewById(R.id.tv_detail_title);
        tv_contentD = findViewById(R.id.tv_detail_content);

        selectedNote = (Note) getIntent().getSerializableExtra("note");
        tv_dateD.setText(selectedNote.getDateNote().toString());
        tv_titleD.setText(selectedNote.getTitelNote());
        tv_contentD.setText(selectedNote.getContentNote());
    }
}
