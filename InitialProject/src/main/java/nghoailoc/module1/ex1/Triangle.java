package main.java.nghoailoc.module1.ex1;

public class Triangle {
    private int ma;
    private int mb;
    private int mc;

    public Triangle() {

    }

    public Triangle(int ma, int mb, int mc) {
        if (!isTriangle(ma, mb, mc)) {
            this.ma = 0;
            this.mb = 0;
            this.mc = 0;
            return;
        }
        setMa(ma);
        setMb(mb);
        setMc(mc);
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        if (ma > 0)
            this.ma = ma;
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        if (mb > 0)
            this.mb = mb;
    }

    public int getMc() {
        return mc;
    }

    public void setMc(int mc) {
        if (mc > 0)
            this.mc = mc;
    }

    public int calculatePerimeter() {
        int cv = ma + mb + mc;
        return cv;
    }

    public double calculateArea() {
        double p = calculatePerimeter() / 2f;
        double dt = Math.sqrt(p * (p - ma) * (p - mb) * (p - mc)); 
        return dt;
    }
    public String getTriangleType(){ 
        if(!isTriangle(this.ma, this.mb, this.mc)) return "Khong phai tam giac"; 
        if(ma == mb && mb == mc) return "Tam giac deu"; 
        if(ma == mb || ma == mc || mb == mc) return "Tam giac can"; 
        return "Tam giac thuong"; 

    }
    private boolean isTriangle(int ma, int mb, int mc) {

        if (ma <= 0 || mb <= 0 || mc <= 0) {
            return false;
        }
        return (ma + mb > mc) && (ma + mc > mb) && (mb + mc > ma);
    }
    @Override
    public String toString() {
        String type = getTriangleType(); 
        int cv = calculatePerimeter(); 
        double dt = calculateArea();
        return String.format("Tam giac thuoc kieu %s co 3 canh %d, %d, %d. Chu vi %d, Dien tich %.2f", type, ma, mb, mc , cv, dt ); 
    }
}
