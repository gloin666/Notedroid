package ehb.be.notedroid.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.Serializable;
import java.util.Date;
@Entity
public class Note implements Serializable {
    private String titelNote;
    private String contentNote;
    private Date dateNote;
    @PrimaryKey
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Note() {
    }

    public Note(String titelNote, String contentNote, Date dateNote) {
        this.titelNote = titelNote;
        this.contentNote = contentNote;
        this.dateNote = dateNote;
    }

    public String getTitelNote() {
        return titelNote;
    }

    public void setTitelNote(String titelNote) {
        this.titelNote = titelNote;
    }

    public String getContentNote() {
        return contentNote;
    }

    public void setContentNote(String contentNote) {
        this.contentNote = contentNote;
    }

    public Date getDateNote() {
        return dateNote;
    }

    public void setDateNote(Date dateNote) {
        this.dateNote = dateNote;
    }
}
