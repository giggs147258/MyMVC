package goeee.rmutsv.ac.th.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    MediaPlayer mp1, mp2;
    Button bt1;
    EditText username, email, passwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        username=(EditText)findViewById(R.id.editText3);
        email=(EditText)findViewById(R.id.editText4);
        passwd=(EditText)findViewById(R.id.editText5);

        mp1=MediaPlayer.create(this,R.raw.oom);
        mp2=MediaPlayer.create(this,R.raw.cbt);

        mp1.start();
        mp1.setLooping(true);

        bt1=(Button)findViewById(R.id.button5);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B3 = new Intent(Main3Activity.this,MainActivity.class);
                mp2.start();
                startActivity(B3);
                mp1.stop();
            }
        });
    }
}
