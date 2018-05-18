import java.util.Date;

public class Message {
    private String mId;
    private String mSubject;
    private String mAttachmentUrl;
    private Date mSendDate;
    private Date mReadDate;
    private MessageType mType;
    private Person mFrom;
    private Person mTo;

    public Message() {
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getSubject() {
        return mSubject;
    }

    public void setSubject(String subject) {
        mSubject = subject;
    }

    public String getAttachmentUrl() {
        return mAttachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        mAttachmentUrl = attachmentUrl;
    }

    public Date getSendDate() {
        return mSendDate;
    }

    public void setSendDate(Date sendDate) {
        mSendDate = sendDate;
    }

    public Date getReadDate() {
        return mReadDate;
    }

    public void setReadDate(Date readDate) {
        mReadDate = readDate;
    }

    public MessageType getType() {
        return mType;
    }

    public void setType(MessageType type) {
        mType = type;
    }

    public Person getFrom() {
        return mFrom;
    }

    public void setFrom(Person from) {
        mFrom = from;
    }

    public Person getTo() {
        return mTo;
    }

    public void setTo(Person to) {
        mTo = to;
    }
}
