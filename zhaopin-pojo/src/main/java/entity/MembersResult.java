package entity;

import com.jk.pojo.QsCompanyProfile;
import com.jk.pojo.QsMembers;

import java.io.Serializable;

/**
 * <pre>项目名称：zhaopin-parent
 * 类名称：MembersResult
 * 类描述：
 * 创建人： 程龙
 * 创建时间：2019-09-19 14:47
 * 修改人： 程龙
 * 修改时间：2019-09-19 14:47
 * 修改备注：
 * @version </pre>
 */
public class MembersResult implements Serializable {
    private QsCompanyProfile qsCompanyProfile;
    private QsMembers qsMembers;

    public QsCompanyProfile getQsCompanyProfile() {
        return qsCompanyProfile;
    }

    public QsMembers getQsMembers() {
        return qsMembers;
    }

    public void setQsCompanyProfile(QsCompanyProfile qsCompanyProfile) {
        this.qsCompanyProfile = qsCompanyProfile;
    }

    public void setQsMembers(QsMembers qsMembers) {
        this.qsMembers = qsMembers;
    }

    @Override
    public String toString() {
        return "MembersResult{" +
                "qsCompanyProfile=" + qsCompanyProfile +
                ", qsMembers=" + qsMembers +
                '}';
    }
}
