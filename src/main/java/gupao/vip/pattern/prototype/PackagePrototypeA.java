package gupao.vip.pattern.prototype;

import java.util.Date;

public class PackagePrototypeA implements Prototype{
    private String id;

    private String packageName;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    @Override
    public PackagePrototypeA clone() {
        PackagePrototypeA packagePrototypeA = new PackagePrototypeA();
        packagePrototypeA.setId(this.id);
        packagePrototypeA.setPackageName(this.packageName);
        packagePrototypeA.setCreatetime(this.createtime);
        packagePrototypeA.setCreateuser(this.createuser);
        packagePrototypeA.setUpdatetime(this.updatetime);
        packagePrototypeA.setUpdateuser(this.updateuser);
        return packagePrototypeA;
    }
}
