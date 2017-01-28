package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        // Find the View that shows the RECENTS Navigation button
        TextView recents = (TextView) findViewById(R.id.recents_activity);
        // Set a click listener on RECENTS Navigation Button
        recents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentsIntent = new Intent(ArtistActivity.this, MainActivity.class);
                startActivity(recentsIntent);
            }
        });

        // Find the View that shows the PLAYLISTS Navigation button
        TextView playlists = (TextView) findViewById(R.id.playlists_activity);
        // Set a click listener on PLAYLISTS Navigation Button
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(ArtistActivity.this, PlaylistActivity.class);
                startActivity(playlistsIntent);
            }
        });


        // Find the View that shows the ALBUMS Navigation button
        TextView albums = (TextView) findViewById(R.id.albums_activity);
        // Set a click listener on ALBUMS Navigation Button
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(ArtistActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });


        // Find the View that shows the SEARCH Navigation button
        TextView search = (TextView) findViewById(R.id.search_activity);
        // Set a click listener on SEARCH Navigation Button
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(ArtistActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

    }
}
