package com.sbs.java.text_board;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 자바 텍스트 게시판 시작 ==");

        while (true) {
            System.out.print("명령) ");
            String cmd = sc.nextLine();

            if (cmd.equals("/user/article/write")) {
                System.out.println("== 게시물 작성 ==");
                System.out.print("제목 : ");
                String subjectg = sc.nextLine();

                System.out.print("내용 : ");
                String content = sc.nextLine();

                int id = 1;

                System.out.printf("%d번 게시물이 등록되었습니다.\n", id);

            }

            else if(cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else {
                System.out.println("잘못 된 명령어입니다.");
            }


        }

        System.out.println("== 자바 텍스트 게시판 종료 ==");
        sc.close();
        }
    }
