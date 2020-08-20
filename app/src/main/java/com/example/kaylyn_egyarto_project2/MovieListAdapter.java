package com.example.kaylyn_egyarto_project2;

import android.app.Person;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;

import java.util.ArrayList;


public class MovieListAdapter extends ArrayAdapter<Movie> {
    private Context contextt;
    int resourcee;

    public MovieListAdapter(Context context, int resource, ArrayList<Movie> objects) {
        super(context, resource,objects);
        contextt = context;
        resourcee = resource;
    }
    @NonNull
    @Override
    public View getView(int position, View change, ViewGroup parent){
        String title = getItem(position).getTitle();
        String year = getItem(position).getYear();
        Integer picture = getItem(position).getPicture();
        Movie movie = new Movie(title,year,picture);
       // View view = change;

        if (change== null) {
            //System.out.println("THIS WAS USED");

            LayoutInflater inflater = LayoutInflater.from(contextt);
            change = inflater.inflate(resourcee, parent, false);

        }
        TextView tvtitle = (TextView) change.findViewById(R.id.Title);
        TextView tvYear = (TextView) change.findViewById(R.id.Year);
        ImageView tvPicture = (ImageView) change.findViewById(R.id.Picture);
        tvtitle.setText(title);
        tvYear.setText(year);
        tvPicture.setImageResource(picture);
        //System.out.println("NOT USED");
        return change;

    }
}
