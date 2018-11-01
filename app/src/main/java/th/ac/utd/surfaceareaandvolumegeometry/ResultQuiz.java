package th.ac.utd.surfaceareaandvolumegeometry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultQuiz extends AppCompatActivity {
    private TextView scoreResultText;
    private TextView scoreAll;
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_quiz);
        scoreResultText = (TextView)findViewById(R.id.score);
        scoreAll = (TextView)findViewById(R.id.score_all);
        exitButton = (Button)findViewById(R.id.quit3);

        scoreAll.setText(scoreResultText.getText()); // get score text from TestActivity.java

        exitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                openMainActivity();
            }
        });
    }
    public void openMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
