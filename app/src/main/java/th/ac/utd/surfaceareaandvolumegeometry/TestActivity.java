package th.ac.utd.surfaceareaandvolumegeometry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,scoreset;
    int num = 0;
    int qesYes=0;
    int qY=0;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        t1 = (TextView) findViewById(R.id.textView3);
        t2 = (TextView) findViewById(R.id.textView);
        t3 = (TextView) findViewById(R.id.textView2);
        t4 = (TextView) findViewById(R.id.textView4);
        t5 = (TextView) findViewById(R.id.textView5);

        scoreset = (TextView) findViewById(R.id.textView6);

        markQes();
    }
    public void nextQes(View view){
        markQes();
    }
    public void markQes(){
        scoreset.setText("คะแนนที่ได้ = "+String.valueOf(score));
        num++;
        if(num==1){
            question1();
        }else{
            question2();
        }
    }
    public void selQes1(View v){
        Log.i("LOGG","==> Process");
        qY=1;
        summary();
    }
    public void selQes2(View v){
        qY=2;
        summary();
    }
    public void selQes3(View v){
        qY=3;
        summary();
    }
    public void selQes4(View v){
        qY=4;
        summary();
    }
    public void summary(){
        if (qY==qesYes){
            score = score+10;
            markQes();
        }else{
            markQes();
        }

    }
    public void question1(){

        qesYes=3; //ข้อ 3 ถูก
        t1.setText("5 + 5 = ?");

        t2.setText("1. 6");  //1
        t3.setText("2. 8"); //2
        t4.setText("3. 10"); //3 ข้อถูก 3
        t5.setText("4. 12"); //4
    }
    public void question2(){
        qesYes=4;
        t1.setText("15 + 12 = ?");

        t2.setText("1. 13");
        t3.setText("2. 17");
        t4.setText("3. 20");
        t5.setText("4. 27");
    }
}
