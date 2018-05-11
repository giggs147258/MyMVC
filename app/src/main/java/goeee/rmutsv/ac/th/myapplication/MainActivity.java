package goeee.rmutsv.ac.th.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp1, mp2, mp3;
    Button bt1, bt2;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp1=MediaPlayer.create(this,R.raw.gg);
        mp2=MediaPlayer.create(this,R.raw.aa);
        mp3=MediaPlayer.create(this,R.raw.dbt);

        mp1.start();
        mp1.setLooping(true);

        bt1=(Button)findViewById(R.id.button);
        bt2=(Button)findViewById(R.id.button2);

        username = (EditText)findViewById(R.id.editText2);
        password = (EditText)findViewById(R.id.editText);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);

                intent.putExtra("name",username.getText().toString());
                intent.putExtra("passwd",password.getText().toString());

                mp2.start();
                startActivity(intent);
                mp1.stop();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent B2=new Intent(MainActivity.this,Main3Activity.class);
                mp3.start();
                startActivity(B2);
                mp1.stop();
                mp2.stop();
            }
        });
    }
}
