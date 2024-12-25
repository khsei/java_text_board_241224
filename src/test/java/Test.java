public class Test {
    public static void main(String[] args) {

        Article article = new Article();
        article.id = 1;
        article.subject = "제목 1";
        article.content = "내용 1";

        System.out.println(article.id);

    }
}

class Article {
    int id;
    String subject;
    String content;

    @Override
    public String toString() {
        return "{id : %d, subject: %s}".concat(id, subject);

    }
}
