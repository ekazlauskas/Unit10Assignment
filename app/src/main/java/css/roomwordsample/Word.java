package css.roomwordsample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "word_table") //defines the enitity of the table
public class Word {

    //helps autogenerate unique keys for each primary key
    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull //states that no parameters, fields or values can be numm
    private String word;

    @ColumnInfo(name = "word") //specifies the name of the column of the table
    private String mWord;

    public Word(String word) {this.mWord = word;}

    public String getWord(){return this.mWord;}
}
