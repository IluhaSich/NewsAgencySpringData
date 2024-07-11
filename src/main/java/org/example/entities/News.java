package org.example.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer news_id;
    @Column(nullable = false)
    @ManyToOne(optional = false)
//    @JoinColumn(name = "journalist_id", referencedColumnName = "journalist_id")
    private Journalist journalist_id;
    @Column(nullable = false)
    @ManyToOne(optional = false)
//    @JoinColumn(name = "editor_id", referencedColumnName = "editor_id")
    private Editor editor_id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String news_content;
    @Column(nullable = false)
    private String publications_date;
    @Column(nullable = false)
    private String subject;
    @Column(nullable = false)
    private Integer user_views;
    private String note;

    public Integer getNews_id() {
        return news_id;
    }

    public void setNews_id(Integer news_id) {
        this.news_id = news_id;
    }

    public Journalist getJournalist_id() {
        return journalist_id;
    }

    public void setJournalist_id(Journalist journalist_id) {
        this.journalist_id = journalist_id;
    }

    public Editor getEditor_id() {
        return editor_id;
    }

    public void setEditor_id(Editor editor_id) {
        this.editor_id = editor_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNews_content() {
        return news_content;
    }

    public void setNews_content(String news_content) {
        this.news_content = news_content;
    }

    public String getPublications_date() {
        return publications_date;
    }

    public void setPublications_date(String publications_date) {
        this.publications_date = publications_date;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getUser_views() {
        return user_views;
    }

    public void setUser_views(Integer user_views) {
        this.user_views = user_views;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
