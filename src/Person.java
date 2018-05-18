import java.util.Date;
import java.util.List;

public abstract class Person {
    private String mId;
    private String mNameFamily;
    private String mUsername;
    private String mPassword;
    private Date mRegisterDate;
    private boolean mIsLoggedIn;
    private List<Message> mSendMessageList;
    private List<Message> mReceivedMessages;

    public List<Comment> getComments() {
        return mComments;
    }

    public void setComments(List<Comment> comments) {
        mComments = comments;
    }

    public List<Comment> getMentionedComments() {
        return mMentionedComments;
    }

    public void setMentionedComments(List<Comment> mentionedComments) {
        mMentionedComments = mentionedComments;
    }

    private List<Comment> mComments;
    private List<Comment> mMentionedComments;

    protected Person() {
    }

    protected String getId() {
        return mId;
    }

    protected String getNameFamily() {
        return mNameFamily;
    }

    protected String getUsername() {
        return mUsername;
    }

    protected String getPassword() {
        return mPassword;
    }

    protected Date getRegisterDate() {
        return mRegisterDate;
    }

    protected boolean isLoggedIn() {
        return mIsLoggedIn;
    }

    protected List<Message> getSendMessageList() {
        return mSendMessageList;
    }

    protected List<Message> getReceivedMessages() {
        return mReceivedMessages;
    }

    protected void setId(String id) {
        mId = id;
    }

    protected void setNameFamily(String nameFamily) {
        mNameFamily = nameFamily;
    }

    protected void setUsername(String username) {
        mUsername = username;
    }

    protected void setPassword(String password) {
        mPassword = password;
    }

    protected void setRegisterDate(Date registerDate) {
        mRegisterDate = registerDate;
    }

    protected void setLoggedIn(boolean loggedIn) {
        mIsLoggedIn = loggedIn;
    }

    protected void setSendMessageList(List<Message> sendMessageList) {
        mSendMessageList = sendMessageList;
    }

    protected void setReceivedMessages(List<Message> receivedMessages) {
        mReceivedMessages = receivedMessages;
    }

}
