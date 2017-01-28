package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        // Find the View that shows the RECENTS Navigation button
        TextView recents = (TextView) findViewById(R.id.recents_activity);
        // Set a click listener on RECENTS Navigation Button
        recents.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                Intent recentsIntent = new Intent(PlaylistActivity.this, MainActivity.class);
                startActivity(recentsIntent);
            }
        });

        // Find the View that shows the ARTISTS Navigation button
        TextView artists = (TextView) findViewById(R.id.artists_activity);
        // Set a click listener on ARTISTS Navigation Button
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(PlaylistActivity.this, ArtistActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the ALBUMS Navigation button
        TextView albums = (TextView) findViewById(R.id.albums_activity);
        // Set a click listener on ALBUMS Navigation Button
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(PlaylistActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the SEARCH Navigation button
        TextView search = (TextView) findViewById(R.id.search_activity);
        // Set a click listener on SEARCH Navigation Button
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(PlaylistActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });



    }
}
