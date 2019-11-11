package ai.guiji.mybatisgeneratordemo.model;

import java.util.Date;

/**
 *
 * t_oss_auth_comcode
 * @author zhouliliang
 * @date   2019/11/11
 */
public class TOssAuthComcode {
    /**
     * 
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 部门code
     */
    private String orgCode;

    /**
     * 所属公司 code
     */
    private String comCode;

    /**
     * 创建时间
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getComCode() {
        return comCode;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}