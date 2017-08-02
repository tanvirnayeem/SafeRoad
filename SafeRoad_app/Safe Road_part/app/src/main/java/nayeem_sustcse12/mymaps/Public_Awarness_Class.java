package nayeem_sustcse12.mymaps;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Sazzad on 10/17/2015.
 */
public class Public_Awarness_Class extends Activity {

    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.public_awarness_activity1);

        backButton= (Button)findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(Public_Awarness_Class.this, MainActivity.class));
                finish();

            }
        });

    }



}
