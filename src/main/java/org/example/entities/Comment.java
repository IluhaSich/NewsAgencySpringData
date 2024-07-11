package org.example.entities;
import jakarta.persistence.*;
@Entity
@Table(name = "news_comment")
public class Comment extends BaseEntity{
    private News newsId;
    private User userId;
    private String commentContent;
    private String publicationsDate;

    public Comment(News newsId, User userId, String commentContent, String publicationsDate) {
        this.newsId = newsId;
        this.userId = userId;
        this.commentContent = commentContent;
        this.publicationsDate = publicationsDate;
    }

    protected Comment(){}

    @ManyToOne
    @JoinColumn(name = "news_id")
    public News getNewsId() {
        return newsId;
    }

    @ManyToOne
    @JoinColumn(name = "user_id")
    public User getUserId() {
        return userId;
    }

    @Column(name = "comment_content")
    public String getCommentContent() {
        return commentContent;
    }

    @Column(name = "publications_date")
    public String getPublicationsDate() {
        return publicationsDate;
    }
}
