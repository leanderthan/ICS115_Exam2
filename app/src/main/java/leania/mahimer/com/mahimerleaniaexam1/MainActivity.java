package leania.mahimer.com.mahimerleaniaexam1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, CustomService.class);
        this.startService(i);
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.btn2){
            i = new Intent(this, SecondActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnMap){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.610057,120.9897273"));
            chooser = Intent.createChooser(i, "Select application");
            startActivity(chooser);
        }
    }
}
