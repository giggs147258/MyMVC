package goeee.rmutsv.ac.th.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MyMVC extends AppCompatActivity {
    ImageView imvAnimal;
    RadioGroup radAnswer;
    private String strAnswer;
    private MyAlerDialog objMyAlert;
    private Question objQuestion;
    private MyAlerDialog objMyAlertDialog;
    Button answer;
    int intTime = 1,userChoose,userScore;
    int userChooseArray[],trueAnswer[];
    private MediaPlayer objMediaPlayerButton,objMediaPlayerRadioButton,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
    RadioButton a1,a2,a3,a4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_mvc);
        initialWidget();
        answer=(Button)findViewById(R.id.button);
        userChooseArray=new int[11];
        trueAnswer=new int[11];
        setValueTrueAnswer();
        t1=MediaPlayer.create(this,R.raw.bee);
        t2=MediaPlayer.create(this,R.raw.bird);
        t3=MediaPlayer.create(this,R.raw.cat);
        t4=MediaPlayer.create(this,R.raw.cow);
        t5=MediaPlayer.create(this,R.raw.dog);
        t6=MediaPlayer.create(this,R.raw.elephant);
        t7=MediaPlayer.create(this,R.raw.horse);
        t8=MediaPlayer.create(this,R.raw.lion);
        t9=MediaPlayer.create(this,R.raw.pig);
        t10=MediaPlayer.create(this,R.raw.sheep);
        t1.start();
        t1.setLooping(true);
        a1=(RadioButton)findViewById(R.id.radioButton);
        a2=(RadioButton)findViewById(R.id.radioButton1);
        a3=(RadioButton)findViewById(R.id.radioButton2);
        a4=(RadioButton)findViewById(R.id.radioButton3);

        objQuestion=new Question();
        objQuestion.setOnQuestionChangeListener(new Question.onQuestionChangeListener() {
            @Override
            public void onQuestionChangeListener(Question question) {
                switch (question.getIntQuestion()){
                    case 1:
                        imvAnimal.setImageResource(R.drawable.bee);
                        a1.setText(MyMVC.this.getString(R.string.b5));
                        a2.setText(MyMVC.this.getString(R.string.b1));
                        a3.setText(MyMVC.this.getString(R.string.b2));
                        a4.setText(MyMVC.this.getString(R.string.b8));
                        radAnswer.clearCheck();
                        break;
                    case 2:
                        imvAnimal.setImageResource(R.drawable.bird);
                        a1.setText(MyMVC.this.getString(R.string.b7));
                        a2.setText(MyMVC.this.getString(R.string.b9));
                        a3.setText(MyMVC.this.getString(R.string.b2));
                        a4.setText(MyMVC.this.getString(R.string.b5));
                        t1.stop();
                        t2.start();
                        //t2.setLooping(true);
                        radAnswer.clearCheck();
                        break;
                    case 3:
                        imvAnimal.setImageResource(R.drawable.cat);
                        a1.setText(MyMVC.this.getString(R.string.b6));
                        a2.setText(MyMVC.this.getString(R.string.b3));
                        a3.setText(MyMVC.this.getString(R.string.b1));
                        a4.setText(MyMVC.this.getString(R.string.b10));
                        t2.stop();
                        t3.start();
                        //t3.setLooping(true);
                        radAnswer.clearCheck();
                        break;
                    case 4:
                        imvAnimal.setImageResource(R.drawable.cow);
                        a1.setText(MyMVC.this.getString(R.string.b5));
                        a2.setText(MyMVC.this.getString(R.string.b2));
                        a3.setText(MyMVC.this.getString(R.string.b7));
                        a4.setText(MyMVC.this.getString(R.string.b4));
                        t3.stop();
                        t4.start();
                        //t4.setLooping(true);
                        radAnswer.clearCheck();
                        break;
                    case 5:
                        imvAnimal.setImageResource(R.drawable.dog);
                        a1.setText(MyMVC.this.getString(R.string.b5));
                        a2.setText(MyMVC.this.getString(R.string.b9));
                        a3.setText(MyMVC.this.getString(R.string.b1));
                        a4.setText(MyMVC.this.getString(R.string.b10));
                        t4.stop();
                        t5.start();
                        //t5.setLooping(true);
                        radAnswer.clearCheck();
                        break;
                    case 6:
                        imvAnimal.setImageResource(R.drawable.elephant);
                        a1.setText(MyMVC.this.getString(R.string.b8));
                        a2.setText(MyMVC.this.getString(R.string.b9));
                        a3.setText(MyMVC.this.getString(R.string.b6));
                        a4.setText(MyMVC.this.getString(R.string.b1));
                        t5.stop();
                        t6.start();
                        //t6.setLooping(true);
                        radAnswer.clearCheck();
                        break;
                    case 7:
                        imvAnimal.setImageResource(R.drawable.horse);
                        a1.setText(MyMVC.this.getString(R.string.b2));
                        a2.setText(MyMVC.this.getString(R.string.b3));
                        a3.setText(MyMVC.this.getString(R.string.b8));
                        a4.setText(MyMVC.this.getString(R.string.b7));
                        t6.stop();
                        t7.start();
                        //t7.setLooping(true);
                        radAnswer.clearCheck();
                        break;
                    case 8:
                        imvAnimal.setImageResource(R.drawable.lion);
                        a1.setText(MyMVC.this.getString(R.string.b8));
                        a2.setText(MyMVC.this.getString(R.string.b6));
                        a3.setText(MyMVC.this.getString(R.string.b1));
                        a4.setText(MyMVC.this.getString(R.string.b3));
                        t7.stop();
                        t8.start();
                        //t8.setLooping(true);
                        radAnswer.clearCheck();
                        break;
                    case 9:
                        imvAnimal.setImageResource(R.drawable.pig);
                        a1.setText(MyMVC.this.getString(R.string.b7));
                        a2.setText(MyMVC.this.getString(R.string.b4));
                        a3.setText(MyMVC.this.getString(R.string.b2));
                        a4.setText(MyMVC.this.getString(R.string.b9));
                        t8.stop();
                        t9.start();
                        //t9.setLooping(true);
                        radAnswer.clearCheck();
                        break;
                    case 10:
                        imvAnimal.setImageResource(R.drawable.sheep);
                        a1.setText(MyMVC.this.getString(R.string.b10));
                        a2.setText(MyMVC.this.getString(R.string.b5));
                        a3.setText(MyMVC.this.getString(R.string.b8));
                        a4.setText(MyMVC.this.getString(R.string.b4));
                        t9.stop();
                        t10.start();
                        //t10.setLooping(true);
                        radAnswer.clearCheck();
                        break;
                }
                soundButton();
            }
        });

        radAnswer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radioButton:
                        strAnswer = "1";
                        userChoose=1;
                        break;
                    case R.id.radioButton1:
                        userChoose=2;
                        strAnswer = "1";
                        break;
                    case R.id.radioButton2:
                        userChoose=3;
                        strAnswer = "1";
                        break;
                    case R.id.radioButton3:
                        userChoose=4;
                        strAnswer = "1";
                        break;
                    default:
                        strAnswer = null;
                        break;

                }
                soundRadioButton();
            }
        });

        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkChooseAnswer();
            }
        });

    }

    private void initialWidget() {
        imvAnimal = (ImageView) findViewById(R.id.imageView);
        radAnswer = (RadioGroup) findViewById(R.id.radioGroup);
    }
    private void  checkChooseAnswer() {
        if (strAnswer != null) {
            Log.d("Answer", "IntTime = " + strAnswer);
            //sentValueToQuestion();
            checkScore();
            intTime++;

        } else {
            Log.d("Answer", "Please Choose Something");
            objMyAlertDialog = new MyAlerDialog();
            objMyAlertDialog.NoChooseEveryThing(MyMVC.this);
        }
    }

    private void setValueTrueAnswer() {

        trueAnswer[1] = 2;
        trueAnswer[2] = 3;
        trueAnswer[3] = 2;
        trueAnswer[4] = 4;
        trueAnswer[5] = 1;
        trueAnswer[6] = 3;
        trueAnswer[7] = 4;
        trueAnswer[8] = 1;
        trueAnswer[9] = 4;
        trueAnswer[10] = 1;

    }
    private void checkScore(){
        userChooseArray[intTime] = userChoose;
        Log.d("ChooseArray","userChooseArray["+String.valueOf(intTime)+"] = "+String.valueOf(userChoose));
        if (userChooseArray[intTime]==trueAnswer[intTime]){
            userScore++;
        }Log.d("Score","userScore  = "+String.valueOf(userScore));
        sentValueToQuestion();
    }
    private void soundRadioButton() {
        objMediaPlayerRadioButton=MediaPlayer.create(getBaseContext(),R.raw.effect);
        objMediaPlayerRadioButton.start();
    }
    private void soundButton() {
        objMediaPlayerButton=MediaPlayer.create(getBaseContext(),R.raw.effect);
        objMediaPlayerButton.start();
    }
    private void sentValueToQuestion(){

        if(intTime == 10) {
           /* intTime = 0;*/
            Intent showScore = new Intent(MyMVC.this,ShowAnswer.class);
            showScore.putExtra("Score",userScore);
            startActivity(showScore);
            t10.stop();
            finish();
        }

        objQuestion.setIntQuestion(intTime+1);
    }
}
