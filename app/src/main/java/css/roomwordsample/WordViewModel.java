package css.roomwordsample;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    //Private member variable to hold reference of repository
    private WordRepository mRepository;

    //Caches the list of words
    private LiveData<List<Word>> mAllWords;

    //Constructor to get reference to repository and list of words from repository
    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    //Getter Method for all words
    LiveData<List<Word>> getAllWords() { return mAllWords; }

    //Wrapper for the insert method, calls repository method
    public void insert(Word word) { mRepository.insert(word); }

}
