package nayeem_sustcse12.mymaps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Sazzad on 10/18/2015.
 */
public class Complain_Box extends Activity {

    Button backButton;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_box);


        submitButton= (Button)findViewById(R.id.submitButton);
        backButton= (Button)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(Complain_Box.this, MainActivity.class));
                finish();

            }
        });

    }
}