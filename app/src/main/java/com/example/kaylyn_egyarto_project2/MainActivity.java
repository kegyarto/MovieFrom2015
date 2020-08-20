package com.example.kaylyn_egyarto_project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView movieList = findViewById(R.id.movieListView);
        Movie movie1 = new Movie("Inside Out", "2015",R.drawable.image7);
        Movie movie2 = new Movie("Suicide Squad", "2016",R.drawable.image8);
        Movie movie3 = new Movie("Wonder Woman", "2017",R.drawable.image9);
        Movie movie4 = new Movie("Aquaman", "2018",R.drawable.image10);
        Movie movie5 = new Movie("Frozen 2", "2019",R.drawable.image11);
        Movie movie6 = new Movie("Sonic The HedgeHog", "2020",R.drawable.image12);
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);
        movies.add(movie5);
        movies.add(movie6);

        MovieListAdapter adapter = new MovieListAdapter(this, R.layout.text_main_layout,movies);
        movieList.setAdapter(adapter);
        registerForContextMenu(movieList);
        movieList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent kintent = new Intent(view.getContext(),BigImage.class);
                if(position == 0){

                    kintent.putExtra("row0",position);
                    startActivityForResult(kintent, 0);
                }
                if(position == 1){
                    kintent.putExtra("row1",position);
                    startActivityForResult(kintent, 1);
                }
                if(position == 2){
                    kintent.putExtra("row2",position);
                    startActivityForResult(kintent, 2);
                }
                if(position == 3){
                    kintent.putExtra("row3",position);
                    startActivityForResult(kintent, 3);
                }
                if(position == 4){
                    kintent.putExtra("row4",position);
                    startActivityForResult(kintent, 4);
                }
                if(position == 5){
                    kintent.putExtra("row5",position);
                    startActivityForResult(kintent, 5);
                }
            }
        });
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Pick A Movie Option");


        getMenuInflater().inflate(R.menu.context,menu);
    }
    public boolean onContextItemSelected(MenuItem menuItem) {
        AdapterView.AdapterContextMenuInfo inform = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
        int pos = inform.position;
        Intent lintent = new Intent(MainActivity.this,Information.class);
        Intent trailer = new Intent(MainActivity.this,Trailer.class);
        Intent wiki = new Intent(MainActivity.this,Wiki.class);
        Intent imdb = new Intent(MainActivity.this,Contextimdb.class);
        switch (menuItem.getItemId()) {
            case R.id.opt1:
                if(pos == 0){

                    lintent.putExtra("row0",pos);
                    startActivityForResult(lintent, 0);
                }
                if(pos == 1){
                    lintent.putExtra("row1",pos);
                    startActivityForResult(lintent, 1);
                }
                if(pos == 2){
                    lintent.putExtra("row2",pos);
                    startActivityForResult(lintent, 2);
                }
                if(pos == 3){
                    lintent.putExtra("row3",pos);
                    startActivityForResult(lintent, 3);
                }
                if(pos == 4){
                    lintent.putExtra("row4",pos);
                    startActivityForResult(lintent, 4);
                }
                if(pos == 5){
                    lintent.putExtra("row5",pos);
                    startActivityForResult(lintent, 5);
                }
                return true;
            case R.id.opt2:
                if(pos == 0){
                    System.out.println("Trailer 0");
                    trailer.putExtra("row0",pos);
                    startActivityForResult(trailer, 0);
                }
                if(pos == 1){
                    trailer.putExtra("row1",pos);
                    startActivityForResult(trailer, 1);
                }
                if(pos == 2){
                    trailer.putExtra("row2",pos);
                    startActivityForResult(trailer, 2);
                }
                if(pos == 3){
                    trailer.putExtra("row3",pos);
                    startActivityForResult(trailer, 3);
                }
                if(pos == 4){
                    trailer.putExtra("row4",pos);
                    startActivityForResult(trailer, 4);
                }
                if(pos == 5){
                    trailer.putExtra("row5",pos);
                    startActivityForResult(trailer, 5);
                }
                return true;
            case R.id.opt3:
                if(pos == 0){

                    wiki.putExtra("row0",pos);
                    startActivityForResult(wiki, 0);
                }
                if(pos == 1){
                    wiki.putExtra("row1",pos);
                    startActivityForResult(wiki, 1);
                }
                if(pos == 2){
                    wiki.putExtra("row2",pos);
                    startActivityForResult(wiki, 2);
                }
                if(pos == 3){
                    wiki.putExtra("row3",pos);
                    startActivityForResult(wiki, 3);
                }
                if(pos == 4){
                    wiki.putExtra("row4",pos);
                    startActivityForResult(wiki, 4);
                }
                if(pos == 5){
                    wiki.putExtra("row5",pos);
                    startActivityForResult(wiki, 5);
                }
                return true;
            case R.id.opt4:
                if(pos == 0){
                    System.out.println("IMDB 0");
                    imdb.putExtra("row0",pos);
                    startActivityForResult(imdb, 0);
                }
                if(pos == 1){
                    imdb.putExtra("row1",pos);
                    startActivityForResult(imdb, 1);
                }
                if(pos == 2){
                    imdb.putExtra("row2",pos);
                    startActivityForResult(imdb, 2);
                }
                if(pos == 3){
                    imdb.putExtra("row3",pos);
                    startActivityForResult(imdb, 3);
                }
                if(pos == 4){
                    imdb.putExtra("row4",pos);
                    startActivityForResult(imdb, 4);
                }
                if(pos == 5){
                    imdb.putExtra("row5",pos);
                    startActivityForResult(imdb, 5);
                }
                return true;
            default:
                return super.onContextItemSelected(menuItem);
        }

    }


}
