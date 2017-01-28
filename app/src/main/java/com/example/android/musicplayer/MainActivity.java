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
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistActivity.class);

                // Start the new activity
                startActivity(playlistsIntent);
            }
        });


        // Find the View that shows the ARTISTS Navigation button
        TextView artists = (TextView) findViewById(R.id.artists_activity);


        // Set a click listener on ARTISTS Navigation Button
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistActivity.class);

                // Start the new activity
                startActivity(artistsIntent);
            }
        });


        // Find the View that shows the ALBUMS Navigation button
        TextView albums = (TextView) findViewById(R.id.albums_activity);

        // Set a click listener on ALBUMS Navigation Button
        albums.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);

                // Start the new activity
                startActivity(albumsIntent);
            }
        });

        // Find the View that shows the GENRES Navigation button
        TextView genres = (TextView) findViewById(R.id.genres_activity);


        // Set a click listener on GENRES Navigation Button
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent genresIntent = new Intent(MainActivity.this, GenresActivity.class);

                // Start the new activity
                startActivity(genresIntent);
            }
        });

    }
}
