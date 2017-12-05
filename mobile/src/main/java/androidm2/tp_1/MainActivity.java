package androidm2.tp_1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ButtonListesBals = (Button) findViewById(R.id.buttonListe);

        ButtonListesBals.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent IntentListesBals = new Intent(MainActivity.this, ActivityListBals.class);
                startActivity(IntentListesBals);
            }
        });

        Button ButtonCalendar = (Button) findViewById(R.id.buttonCalendar);
        ButtonCalendar.setOnClickListener(new View.OnClickListener(){
                @Override

            public void onClick(View v){

             Intent intentCalendar = new Intent(Intent.ACTION_VIEW,android.net.Uri.parse("content://com.android.calendar/time/"));
             startActivity(intentCalendar);

            }
        });
    }
}
