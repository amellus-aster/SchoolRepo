package main.java.nghoailoc.module1.ex1;

public class Student {
    private int mssv;
    private String fullName;
    private float lt;
    private float th;

    public Student() {
        this(1,"undefined", 0f, 0f); 

    }

    public Student(int mssv, String fullName, float lt, float th) {
        setMssv(mssv);
        setFullName(fullName);
        setLt(lt);
        setTh(th);
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        if (mssv <= 0) {
            throw new IllegalArgumentException("loi: mssv phai duong");
        }
        this.mssv = mssv;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("loi: ho va ten rong");
        }
        this.fullName = fullName.trim();
    }

    public float getLt() {
        return lt;
    }

    public void setLt(float lt) {
        if (lt < 0 || lt > 10) {
            throw new IllegalArgumentException("loi: diem lt vuot ngoai vung");
        }
        this.lt = lt;
    }

    public float getTh() {
        return th;
    }

    public void setTh(float th) {
        if (th < 0 || th > 10) {
            throw new IllegalArgumentException("loi: diem th vuot ngoai vung");
        }
        this.th = th;
    }

}