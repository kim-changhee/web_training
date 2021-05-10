package kr.mjc.changhee.web.dao;

import lombok.Data;

@Data
public class Article {
    int articleId;
    String title;
    String content;
    int userId;
    String name;
    String cdate;
    String udate;

    public String getContentHtml() {
        return content.replaceAll("\n", "<br>");
    }
}
