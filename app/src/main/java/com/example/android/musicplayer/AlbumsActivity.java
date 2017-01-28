package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        // Find the View that shows the RECENTS Navigation button
        TextView recents = (TextView) findViewById(R.id.recents_activity);
        // Set a click listener on RECENTS Navigation Button
        recents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recentsIntent = new Intent(AlbumsActivity.this, MainActivity.class);
                startActivity(recentsIntent);
            }
        });

        // Find the View that shows the PLAYLISTS Navigation button
        TextView playlists = (TextView) findViewById(R.id.playlists_activity);
        // Set a click listener on PLAYLISTS Navigation Button
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(AlbumsActivity.this, PlaylistActivity.class);
                startActivity(playlistsIntent);
            }
        });

        // Find the View that shows the ARTISTS Navigation button
        TextView artists = (TextView) findViewById(R.id.artists_activity);
        // Set a click listener on ARTISTS Navigation Button
        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(AlbumsActivity.this, ArtistActivity.class);
                startActivity(artistsIntent);
            }
        });

        // Find the View that shows the SEARCH Navigation button
        TextView search = (TextView) findViewById(R.id.search_activity);
        // Set a click listener on SEARCH Navigation Button
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(AlbumsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

    }

}
