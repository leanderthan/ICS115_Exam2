package leania.mahimer.com.mahimerleaniaexam1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent i = new Intent(this, CustomService.class);
        this.startService(i);
    }
    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.btn1){
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }
    }
}
