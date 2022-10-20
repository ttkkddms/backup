package com.kh.exam2;

import java.util.Scanner;

public class Student {
    // ��ü ������
    private String name;      // �̸�
    private int quizscore;      // ���� ����
    private int midtermscore;    // �߰����� ����
    private int finalscore;      // �⸻���� ����


    // �����ڸ޼ҵ�: �л��� �̸��� �Ѱ� �޾� ��ü�� �����Ѵ�
    public Student(String studentName) {
        this.name = studentName;
    }

    // �л��� �̸��� ��ȯ�Ѵ�
    public String getName() {
        return name;
    }

    // �л��� ���� ������ ��ȯ�Ѵ�
    public int getQuizScore() {
        return quizscore = getQuizScore();
    }

    // �л��� �߰����� ������ ��ȯ�Ѵ�
    public int getMidtermScore() {
        return midtermscore = getMidtermScore();
    }

    // �л��� �⸻���� ������ ��ȯ�Ѵ�
    public int getFinalScore() {
        return finalscore = getFinalScore();
    }


    //   �� Student ��ü�� ������ ���� ���ڿ��� ��ȯ�Ѵ�.
    public String toString() {
        String str = "";
        str += "�̸�: " + name + "\n";
        str += "�������� : " + quizscore + "\n";
        str += "�߰����� : " + midtermscore + "\n";
        str += "�⸻���� : " + finalscore + "\n";
        str += "���� : " + getGrade();
        return str;
    }

    // �̸��� �־��� ������ �����Ѵ�
    public void setName(String Name) {
        this.name = Name;
    }

    // ���� ������ �־��� ������ �����Ѵ�
    public void setQuizScore(int QuizScore) {
        this.quizscore = QuizScore;
    }

    // �߰����� ������ �־��� ������ �����Ѵ�
    public void setMidtermScore(int MidtermScore) {
        this.midtermscore = MidtermScore;
    }

    // �⸻���� ������ �־��� ������ �����Ѵ�
    public void setFinalScore(int FinalScore) {
        this.finalscore = FinalScore;
    }

    // ����ڿ��� �л��� ���� ����, �߰����� ������ �⸻���� ������ �о� ���δ�.
    // �Է� ��û�� �̸��� ����Ѵ�. ���� ���, ���浿�� �߰����� ������ �Է��϶�.��
    public void inputGrades() {
        Scanner scan = new Scanner(System.in);
        System.out.println(this.getName() + "�� ������ �Է��ϼ���.");



        System.out.print(this.getName() + "�л��� �������� : ");
        int score = Integer.parseInt(scan.nextLine());
        while (score < 0 || score > 100) {
            System.out.println("���������� 0�̻� 100�����Դϴ�.");
            System.out.print(this.getName() + "�л��� �������� : ");
            score = Integer.parseInt(scan.nextLine());
        }
        this.setQuizScore(score);



        System.out.print(this.getName() + "�л��� �߰���� ���� : ");
        score = Integer.parseInt(scan.nextLine());
        while (score < 0 || score > 100) {
            System.out.println("���������� 0�̻� 100�����Դϴ�.");
            System.out.print(this.getName() + "�л��� �߰����� : ");
            score = Integer.parseInt(scan.nextLine());
        }
        this.midtermscore = score;


        System.out.print(this.getName() + "�л��� �⸻��� ���� : ");
        score = Integer.parseInt(scan.nextLine());
        while (score < 0 || score > 100) {
            System.out.println("���������� 0�̻� 100�����Դϴ�.");
            System.out.print(this.getName() + "�л��� �⸻���� : ");
            score = Integer.parseInt(scan.nextLine());
        }
        this.finalscore = score;
    }


    // �л��� ���� �������� ������ ����Ͽ� ��ȯ�Ѵ�
    public double getTotal() {
        return quizscore + midtermscore + finalscore;
    }


    // �л��� ������ ��ȯ�Ѵ�
    public char getGrade() {
        double avg = getTotal() / 3;
        char grade = ' ';
//        switch ((int) avg) {
//            case 10:
//            case 9:
//                grade = 'A';
//                break;
//            case 8:
//                grade = 'B';
//                break;
//            case 7:
//                grade = 'C';
//                break;
//            case 6:
//                grade = 'D';
//                break;
//            default:
//                grade = 'F';
//        }
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}
