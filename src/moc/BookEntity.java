package moc;

import java.util.Date;

public class BookEntity {
    private String resultId;
    private String resultName;
    private  String resultPage;
    private Date resultStartdate;

    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public String getResultPage() {
        return resultPage;
    }

    public void setResultPage(String resultPage) {
        this.resultPage = resultPage;
    }

    public Date getResultStartdate() {
        return resultStartdate;
    }

    public void setResultStartdate(Date resultStartdate) {
        this.resultStartdate = resultStartdate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BookEntity{");
        sb.append("resultId='").append(resultId).append('\'');
        sb.append(", resultName='").append(resultName).append('\'');
        sb.append(", resultPage='").append(resultPage).append('\'');
        sb.append(", resultStartdate=").append(resultStartdate);
        sb.append('}');
        return sb.toString();
    }
}
