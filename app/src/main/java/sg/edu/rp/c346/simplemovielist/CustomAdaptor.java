package sg.edu.rp.c346.simplemovielist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16046491 on 18/7/2018.
 */

public class CustomAdaptor extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<MovieItem> movieList;

    public CustomAdaptor(@NonNull Context context, int resource, @NonNull ArrayList<MovieItem> objects){
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);
        TextView tvName = rowView.findViewById(R.id.textView);
        TextView tvDate = rowView.findViewById(R.id.textView2);
        TextView tvRating = rowView.findViewById(R.id.textView3);
        MovieItem currentItem = movieList.get(position);
        tvName.setText(currentItem.getMovieName());
        tvDate.setText(currentItem.getReleaseDate());
        tvRating.setText(currentItem.getMovieRatings());
        return rowView;
    }

}
