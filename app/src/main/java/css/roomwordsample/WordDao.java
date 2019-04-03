package css.roomwordsample;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Insert;
import java.util.List;

@Dao //provides queries for getting all of the words throughout the application
public interface WordDao {

    @Insert //Inserts a row of data within the application
    void insert(Word word);

    @Query("DELETE FROM word_table") //deletes a row of data from the application
    void deleteAll();

    @Query("SELECT * from word_table ORDER BY word ASC") //updates a row from the application
    LiveData<List<Word>> getAllWords();
}
