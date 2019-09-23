package entity;

import com.jk.pojo.QsAdmin;
import com.jk.pojo.QsMembers;

import java.io.Serializable;

public class Result implements Serializable{
    private boolean success;

    private String message;

    private QsMembers qsMembers;

    private QsAdmin qsAdmin;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public QsMembers getQsMembers() {
        return qsMembers;
    }

    public void setQsMembers(QsMembers qsMembers) {
        this.qsMembers = qsMembers;
    }

    public QsAdmin getQsAdmin() {
        return qsAdmin;
    }

    public void setQsAdmin(QsAdmin qsAdmin) {
        this.qsAdmin = qsAdmin;
    }

    public Result(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public Result(QsMembers qsMembers) {
        this.qsMembers = qsMembers;
    }

    public Result(QsAdmin qsAdmin) {
        this.qsAdmin = qsAdmin;
    }

    public Result(boolean success, String message, QsMembers qsMembers, QsAdmin qsAdmin) {
        this.success = success;
        this.message = message;
        this.qsMembers = qsMembers;
        this.qsAdmin = qsAdmin;
    }

    public Result(boolean success, String message, QsAdmin qsAdmin) {
        this.success = success;
        this.message = message;
        this.qsAdmin = qsAdmin;
    }

    public Result(boolean success, String message, QsMembers qsMembers) {
        this.success = success;
        this.message = message;
        this.qsMembers = qsMembers;
    }

    public Result() {
    }


    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", qsMembers=" + qsMembers +
                ", qsAdmin=" + qsAdmin +
                '}';
    }

}
