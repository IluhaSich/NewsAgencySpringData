package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "news")
public class News {
    private Journalist journalistId;
    private Editor editorId;
    private String title;
    private String newsContent;
    private String publicationsDate;
    private String subject;
    private Integer userViews;
    private String note;

    public News(Journalist journalistId, Editor editorId, String title, String newsContent, String publicationsDate, String subject, Integer userViews, String note) {
        this.journalistId = journalistId;
        this.editorId = editorId;
        this.title = title;
        this.newsContent = newsContent;
        this.publicationsDate = publicationsDate;
        this.subject = subject;
        this.userViews = userViews;
        this.note = note;
    }

    protected News() {
    }


    @ManyToOne
    @JoinColumn(name = "journalist_id")
    public Journalist getJournalistId() {
        return journalistId;
    }

    @ManyToOne
    @JoinColumn(name = "editor_id")
    public Editor getEditorId() {
        return editorId;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Column(name = "news_content")
    public String getNewsContent() {
        return newsContent;
    }

    @Column(name = "publications_date")
    public String getPublicationsDate() {
        return publicationsDate;
    }

    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    @Column(name = "user_views")
    public Integer getUserViews() {
        return userViews;
    }

    @Column(name = "note")
    public String getNote() {
        return note;
    }
}
