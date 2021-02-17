package geomex.models;

import java.sql.Timestamp;

public class CommentVO {
    public int id;
    public String user_id;
    public String article_id;
    public Timestamp date;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUser_id() {
        return user_id;
    }
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public String getArticle_id() {
        return article_id;
    }
    public void setArticle_id(String article_id) {
        this.article_id = article_id;
    }
    public Timestamp getDate() {
        return date;
    }
    public void setDate(Timestamp date) {
        this.date = date;
    }
}
