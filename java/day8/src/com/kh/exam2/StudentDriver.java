package com.kh.exam2;

public class StudentDriver {
    public static void main(String[] args) {
        // �� �л��� ���� ����� ��Ÿ���� ��ü���� �����
        Student stud1 = new Student("����");
        Student stud2 = new Student("����");


        // ù ��° �л��� ���� ����, �߰����� ������ �⸻���� ������ �о� ���δ�
        stud1.inputGrades();
        // ù ��° �л��� ������ ����Ѵ�
        double total1 = stud1.getTotal();
        // ù ��° �л��� ������ �ο��Ѵ�
        char grade1 = stud1.getGrade();

        // ù ��° �л��� �̸�, ������ ������ ����Ѵ�
        System.out.println(stud1.getName() + "�� ������ " + total1 + "�̰� ������ " + grade1 + "�̴�.");


        // �� ��° �л��� ���� ����, �߰����� ������ �⸻���� ������ �о� ���δ�
        stud2.inputGrades();
        // �� ��° �л��� ������ ����Ѵ�
        double total2 = stud2.getTotal();
        // �� ��° �л��� ������ �ο��Ѵ�
        char grade2 = stud2.getGrade();

        // �� ��° �л��� �̸�, ������ ������ ����Ѵ�
        System.out.println(stud2.getName() + "�� ������ " + total2 + "�̰� ������ " + grade2 + "�̴�.");

        System.out.println(stud1);
        System.out.println(stud2);
    }
}