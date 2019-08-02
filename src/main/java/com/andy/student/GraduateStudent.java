package com.andy.student;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 70;

    public GraduateStudent(String name,int english, int math,int thesis) {
        super(name,english,math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        int average = getAverage();
        System.out.println(name + "\t" + english + "\t" + math +
                "\t" + thesis + "\t" + getAverage() + "\t" + (getAverage() >= pass ? "PASS":"FAILED"));
        char grading = 'F';

        switch (average/10) {
            case 10:
            case  9:
                grading = 'A';
                break;
            case  8:
                grading = 'B';
                break;
            case  7:
                grading = 'C';
                break;
            case  6:
                grading = 'D';
                break;
            default:
                grading = 'F';

        }

    }
    public int getAverage(){
        return (english+math+thesis)/3;
    }

}
