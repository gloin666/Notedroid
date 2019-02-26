package ehb.be.notedroid.model;

import android.arch.persistence.room.TypeConverter;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Convertor {
    @TypeConverter
public static Date fromString(String input){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
try {
return simpleDateFormat.parse(input);
}catch (ParseException e){
    return null;
}
}@TypeConverter
        public static String stringFormatDate(Date input){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy",Locale.getDefault());
            return simpleDateFormat.format(input);
        }
}
