package org.example.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "news_comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer news_comment_id;
    @Column(nullable = false)
    @ManyToOne(optional = false)
    private News news_id;
    @Column(nullable = false)
    @ManyToOne(optional = false)
    private User user_id;
    @Column(nullable = false)
    private String comment_content;
    @Column(nullable = false)
    private String publications_date;


    public Integer getNews_comment_id() {
        return news_comment_id;
    }

    public void setNews_comment_id(Integer news_comment_id) {
        this.news_comment_id = news_comment_id;
    }

    public News getNews_id() {
        return news_id;
    }

    public void setNews_id(News news_id) {
        this.news_id = news_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public String getPublications_date() {
        return publications_date;
    }

    public void setPublications_date(String publications_date) {
        this.publications_date = publications_date;
    }
}
