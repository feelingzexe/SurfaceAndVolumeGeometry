package th.ac.utd.surfaceareaandvolumegeometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultQuiz extends AppCompatActivity {
    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_score);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("คุณได้คะแนน " + score + " คะแนน\nจากคะแนนเต็ม " + QuestionLibrary.questions.length + " คะแนน");

        if (score == 5){
            mGrade.setText("ยินดีด้วย!");
        }else if (score == 4){
            mGrade.setText("ยินดีด้วย!");
        }else if (score == 3) {
            mGrade.setText("คุณทำได้ดี!");
        }else {
            mGrade.setText("กรุณาตั้งใจมากกว่านี้!");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultQuiz.this, TestActivity.class));
                ResultQuiz.this.finish();
            }
        });

    }

}
