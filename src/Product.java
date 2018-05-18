import java.util.Date;
import java.util.List;

public class Product {
    private String mId;
    private String mName;
    private short mAverageRate;
    private List<Comment> mComments;
    private int mPrice;
    private Date mAddedDate;
    private String mExplanations;

    public Product(){}

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public short getAverageRate() {
        return mAverageRate;
    }

    public void setAverageRate(short averageRate) {
        mAverageRate = averageRate;
    }

    public List<Comment> getComments() {
        return mComments;
    }

    public void setComments(List<Comment> comments) {
        mComments = comments;
    }

    public int getPrice() {
        return mPrice;
    }

    public void setPrice(int price) {
        mPrice = price;
    }

    public Date getAddedDate() {
        return mAddedDate;
    }

    public void setAddedDate(Date addedDate) {
        mAddedDate = addedDate;
    }

    public String getExplanations() {
        return mExplanations;
    }

    public void setExplanations(String explanations) {
        mExplanations = explanations;
    }
}
