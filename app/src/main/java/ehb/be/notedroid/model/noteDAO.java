package ehb.be.notedroid.model;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;


@Dao
public interface noteDAO {
    @Insert
void insertNote(Note mnote);
@Query("SELECT * FROM Note ")

    List<Note> selectAllNotes();
@Query("SELECT * FROM Note WHERE id = :id")

    Note selectNoteID(long id);


}
