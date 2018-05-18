import java.util.Date;

public class Comment {
    private String mId;
    private Person mCommenter;
    private Person mMentionedComment;

    public Comment getReplyedComment() {
        return mReplyedComment;
    }

    public void setReplyedComment(Comment replyedComment) {
        mReplyedComment = replyedComment;
    }

    private Comment mReplyedComment;
    private String mText;
    private Date mDate;

    public Comment() {
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public Person getCommenter() {
        return mCommenter;
    }

    public void setCommenter(Person commenter) {
        mCommenter = commenter;
    }

    public Person getMentionedComment() {
        return mMentionedComment;
    }

    public void setMentionedComment(Person mentionedComment) {
        mMentionedComment = mentionedComment;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}