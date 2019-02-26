package ehb.be.notedroid.model;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.Context;

@Database(version = 1,entities = {Note.class},exportSchema = false)
@TypeConverters({Convertor.class})

public abstract class NoteDataBase extends RoomDatabase {
private static NoteDataBase instance;


public static NoteDataBase getInstance(Context context) {
if (instance == null){
instance = createDatebase(context);
}
return instance;
}
private static NoteDataBase createDatebase(Context context){
return Room.databaseBuilder(context,NoteDataBase.class, "note.db").allowMainThreadQueries().build();
}
public abstract noteDAO getnoteDAO();
}
