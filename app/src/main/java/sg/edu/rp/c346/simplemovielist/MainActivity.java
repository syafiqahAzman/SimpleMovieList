package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MovieItem> alMovieList;
    CustomAdaptor caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.ListViewMovie);

        alMovieList = new ArrayList<>();
        MovieItem item1 = new MovieItem("Avengers Inifinity War", "Release Date: 2018.04","PG13");
        MovieItem item2 = new MovieItem("Justice League", "Release Date: 2017.11","G");
        MovieItem item3 = new MovieItem("Syafiqah Bte Azman", "Release Date: 1995.06" ,"R21");

        alMovieList.add(item1);
        alMovieList.add(item2);
        alMovieList.add(item3);

        caMovie = new CustomAdaptor(this, R.layout.movie_item, alMovieList);

        lvMovie.setAdapter(caMovie);





    }
}
