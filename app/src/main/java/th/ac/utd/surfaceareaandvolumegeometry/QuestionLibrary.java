package th.ac.utd.surfaceareaandvolumegeometry;

public class QuestionLibrary {
    private String mQuestions [] = {
            "พีระมิดฐานสี่เหลี่ยมจัตุรัสมีเส้นรอบรูป 40 ซม. ถ้าความสูงของพีระมิดเป็น 12 ซม. ปริมาตรของพีระมิดจะเป็นเท่าใด",
            "รัศมีของฐานของกรวยเป็น 4 หน่วย และมีสูงเอียงเป็น 9 หน่วย แล้วพื้นที่ผิวทั้งหมดของกรวยเป็นเท่าใด",
            "The _______ holds the plant upright."
    };


    private String mChoices [][] = {
            {"120", "400", "240"},
            {"52", "36", "48"},
            {"Flower", "Leaves", "Stem"}
    };



    private String mCorrectAnswers[] = {"400", "52", "Stem"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
