package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the PLAYLISTS Navigation button
        TextView playlists = (TextView) findViewById(R.id.playlists_activity);
        // Set a click listener on PLAYLISTS Navigation Button
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the ARTISTS Navigation button
        TextView artists = (TextView) findViewById(R.id.artists_activity);
        // Set a click listener on ARTISTS Navigation Button
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the ALBUMS Navigation button
        TextView albums = (TextView) findViewById(R.id.albums_activity);
        // Set a click listener on ALBUMS Navigation Button
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the SEARCH Navigation button
        TextView search = (TextView) findViewById(R.id.search_activity);
        // Set a click listener on SEARCH Navigation Button
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });
    }
}
