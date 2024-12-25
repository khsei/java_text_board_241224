package com.sbs.java.text_board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lastArticleId = 0; // 전역변수
        Article lastArticle = null;
        List<Article> articles = new ArrayList<>();


        System.out.println("== 자바 텍스트 게시판 시작 ==");

        while (true) {
            System.out.print("명령) ");
            String cmd = sc.nextLine();

            if(cmd.equals("/usr/article/write")) {
                System.out.println("== 게시물 작성 ==");
                System.out.print("제목 : ");
                String subject = sc.nextLine();

                System.out.print("내용 : ");
                String content = sc.nextLine();

                int id = ++lastArticleId;

                Article article = new Article(id, subject, content);
                lastArticle = article;

                articles.add(article);

                // (삭제) System.out.println("생성 된 게시물 객체 : " + article);
                System.out.printf("%d번 게시물이 등록되었습니다.\n", article.id);
            }
            else if(cmd.equals("/usr/article/list")) {
                if(articles.isEmpty()){    //  또는 if(articles.size() == 0) {}
                    System.out.println("현재 게시물이 존재하지 않습니다.");
                    continue;
                }


                System.out.println("== 게시물 리스트 ==");

                System.out.println("번호 | 제목");

                /*
                // 반복문 v1
                for(int i = 0; i < articles.size(); i++) {
                    Article article = articles.get(i);
                    System.out.printf("%d | %s\n", article.id, article.subject);
                }
                */

                /*
                // 반복문 v2
                for(Article article : articles) {
                    System.out.printf("%d | %s\n", article.id, article.subject);
                }
                 */

                // 반복문 v3
                articles.forEach(
                        article -> System.out.printf("%d | %s\n", article.id, article.subject)
                );
            }

            else if(cmd.equals("/usr/article/detail")) {
                Article article = lastArticle;
                if(article == null) {
                    System.out.println("게시물이 존재하지 않습니다.");
                    continue;
                }
                System.out.println("== 게시물 상세보기 ==");
                System.out.printf("번호 : %d\n", article.id);
                System.out.printf("제목 : %s\n", article.subject);
                System.out.printf("내용 : %s\n", article.content);
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

class Article {
    int id;
    String subject;
    String content;
    Article(int id, String subject, String content) {
        this.id = id;
        this.subject = subject;
        this.content = content;
    }

    @Override
    public String toString() {
//        return "{id: %d, subject: \"%s\", content: \"%s\"}".format(id, subject, content);
        return String.format("{id: %d, subject: \"%s\", content: \"%s\"}", id, subject, content);
    }
}