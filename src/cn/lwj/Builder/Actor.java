package cn.lwj.Builder;

/**
 * Created by Administrator on 2018-01-13.
 * 具体产品（复杂对象）
 */
class Actor {
    private String type;
    private String hairStyle;
    private String sex;
    private String face;
    private String costume;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHairStyle() {
        return hairStyle;
    }

    public void setHairStyle(String hairStyle) {
        this.hairStyle = hairStyle;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }
}
