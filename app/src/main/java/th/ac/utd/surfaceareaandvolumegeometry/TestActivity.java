package th.ac.utd.surfaceareaandvolumegeometry;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonExit;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    private int mNextQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonExit = (Button)findViewById(R.id.quit);

        /*
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("");
        builder.setMessage("คำตอบคือ : " + mAnswer);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener()
        {
              @Override
               public void onClick(DialogInterface dialogInterface, int i)
               {
                    if(mQuestionNumber == 5)
                    {
                        Intent intent = new Intent(getApplicationContext(), ResultQuiz.class);
                        startActivity(intent);
                    }
                    else
                    {
                        updateQuestion();
                    }
               }
        });
        builder.setCancelable(false);
        builder.show();
        */


        //updateQuestion();
        mNextQuestionNumber = mQuestionNumber++;

        updateQuestion();
        //updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (mButtonChoice1.getText() == mAnswer) {

                    if (mQuestionNumber++ == 5) {
                        openResult();
                    }

                    else {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(TestActivity.this, "คำตอบถูกต้อง!", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    if (mQuestionNumber++ == 5) {
                        openResult();
                    }
                    else {
                        Toast.makeText(TestActivity.this, "คำตอบผิด.", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice2.getText() == mAnswer){
                    if (mQuestionNumber++ == 5) {
                        openResult();
                    }
                    else {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(TestActivity.this, "คำตอบถูกต้อง!", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    if (mQuestionNumber++ == 5) {
                        openResult();
                    }
                    else {
                        Toast.makeText(TestActivity.this, "คำตอบผิด.", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                if (mButtonChoice3.getText() == mAnswer){
                    if (mQuestionNumber++ == 5) {
                        openResult();
                    }
                    else {
                        mScore = mScore + 1;
                        updateScore(mScore);
                        updateQuestion();
                        Toast.makeText(TestActivity.this, "คำตอบถูกต้อง!", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    if (mQuestionNumber++ == 5) {
                        openResult();
                    }
                    else {
                        Toast.makeText(TestActivity.this, "คำตอบผิด.", Toast.LENGTH_SHORT).show();
                        updateQuestion();
                    }
                }
            }
        });

        mButtonExit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMainActivity();
            }
        });

    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;
    }
    public void openResult()
    {
        Intent intent = new Intent(this, ResultQuiz.class);
        startActivity(intent);
    }
    public void openMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }


}
