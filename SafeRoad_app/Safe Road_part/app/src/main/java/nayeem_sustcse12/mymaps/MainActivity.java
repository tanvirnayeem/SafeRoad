package nayeem_sustcse12.mymaps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

    Button publicAwarnessButton;
    Button blackSpotButton;
    Button complainButton;
    Button trafficSignsButton;
    Button exitButton;
    Button aboutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        publicAwarnessButton= (Button)findViewById(R.id.publicAwarnessButton);
        blackSpotButton = (Button)findViewById(R.id.blackSpotButton);
        complainButton = (Button)findViewById(R.id.complainButton);
        trafficSignsButton = (Button)findViewById(R.id.trafficSignsButton);
        exitButton = (Button)findViewById(R.id.exitButton);
        aboutButton = (Button)findViewById(R.id.aboutButton);

       publicAwarnessButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(new Intent(MainActivity.this,Public_Awarness_Class.class));

           }
       });
        blackSpotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MapsActivity.class));

            }
        });

        complainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Complain_Box.class));

            }
        });
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, About.class));

            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });

    }


}
