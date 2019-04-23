package umb.fasilkom.a6april_19;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
Button button1;

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToPage();


        Log.d(TAG, "Message");
    }



    public void goToPage() {

        button1 = (Button) findViewById(R.id.button1);
        final Context context = this;
        button1.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, Activity2.class);
                startActivity(intent);

            }

        });

    }
}
