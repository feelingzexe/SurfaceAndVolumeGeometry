package th.ac.utd.surfaceareaandvolumegeometry;

public class QuestionLibrary {
    private String mQuestions [] = {
            "พีระมิดฐานสี่เหลี่ยมจัตุรัสมีฐานยาวด้านละ 10 ซม. ถ้าความสูงของพีระมิดเป็น 12 ซม. ปริมาตรของพีระมิดจะเป็นเท่าใด?",
            "รัศมีของฐานของกรวยเป็น 4 หน่วย และมีสูงเอียงเป็น 9 หน่วย แล้วพื้นที่ผิวทั้งหมดของกรวยเป็นเท่าใด?",
            "ถังน้ำทรงกระบอกมีรัศมี 5 เมตร สูง 21 เมตร มีน้ำอยู่เต็มถัง ปริมาตรของน้ำเป็นเท่าใด?",
            "ลูกฟุตบอลทรงกลมลูกหนึ่ง มีเส้นผ่านศุนย์กลาง 14 ซม. พื้นที่ผิวโดยประมาณเป็นเท่าใด?",
            "ปริซึมฐานสี่เหลี่ยมจัตุรัส มีเส้นรอบรูปฐานยาว 48 ซม. มีความสูง 1 เมตร ปริซึมนี้มีปริมาตรกี่ซม?",
            "" // end quiz session
    };


    private String mChoices [][] = {
            {"1,200", "400", "240"},
            {"52", "36", "48"},
            {"330", "1,560", "1,650"},
            {"616", "154", "2,464"},
            {"230,400", "14,400", "144"},
            {"","",""}
    };



    private String mCorrectAnswers[] = {"400", "52", "1,650", "616", "14,400",""};




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
