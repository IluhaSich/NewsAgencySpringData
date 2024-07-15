package org.example.dto;

import org.example.entities.Editor;
import org.example.entities.Journalist;

import java.time.ZonedDateTime;

public class NewsDto {
    private Journalist journalistId;
    private Editor editorId;
    private String title;
    private String newsContent;
    private ZonedDateTime publicationsDate;
    private String subject;
    private Integer userViews;
    private String note;

    public NewsDto(Journalist journalistId, Editor editorId, String title, String newsContent, ZonedDateTime  publicationsDate, String subject, Integer userViews, String note) {
        this.journalistId = journalistId;
        this.editorId = editorId;
        this.title = title;
        this.newsContent = newsContent;
        this.publicationsDate = publicationsDate;
        this.subject = subject;
        this.userViews = userViews;
        this.note = note;
    }

    protected NewsDto() {
    }

    public Journalist getJournalistId() {
        return journalistId;
    }

    public void setJournalistId(Journalist journalistId) {
        this.journalistId = journalistId;
    }

    public Editor getEditorId() {
        return editorId;
    }

    public void setEditorId(Editor editorId) {
        this.editorId = editorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public ZonedDateTime getPublicationsDate() {
        return publicationsDate;
    }

    public void setPublicationsDate(ZonedDateTime publicationsDate) {
        this.publicationsDate = publicationsDate;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getUserViews() {
        return userViews;
    }

    public void setUserViews(Integer userViews) {
        this.userViews = userViews;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
