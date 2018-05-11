package goeee.rmutsv.ac.th.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    MediaPlayer mp1, mp2, mp3;
    Button bt1,bt2;
    TextView name1, passwd1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mp1=MediaPlayer.create(this,R.raw.oom);
        mp2=MediaPlayer.create(this,R.raw.bbt);
        mp3=MediaPlayer.create(this,R.raw.aa);

        mp1.start();
        mp1.setLooping(true);

        name1 = (TextView)findViewById(R.id.textView2);
        passwd1 = (TextView)findViewById(R.id.textView3);

        bt1=(Button)findViewById(R.id.button3);
        bt2=(Button)findViewById(R.id.button4);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B2=new Intent(Main2Activity.this,MainActivity.class);
                mp2.start();
                startActivity(B2);
                mp1.stop();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B3=new Intent(Main2Activity.this,MyMVC.class);
                mp3.start();
                startActivity(B3);
                mp1.stop();
            }
        });
        name1.setText(getIntent().getStringExtra("name"));
        passwd1.setText(getIntent().getStringExtra("passwd"));
    }
}
