package Matrix;

public class Matrix2X2 {
    private double a11;
    private double a12;
    private double a21;
    private double a22;

    // Конструктор без аргументов
    public Matrix2X2() {
        this.a11 = 0;
        this.a12 = 0;
        this.a21 = 0;
        this.a22 = 0;
    }

    // Конструктор c аргументом - массивом
    public Matrix2X2(double a11, double a12, double a21, double a22) {
        this.a11 = a11;
        this.a12 = a12;
        this.a21 = a21;
        this.a22 = a22;
    }

    public String toString() {
        return "[" + this.a11 + ","+ this.a12 + ","
                + this.a21 + ","+ this.a22 + "]";
    }

    public void setValue(int i, int j, double v) {
        if(i == 0 && j == 0){
            this.a11 = v;
        }else if(i == 0 && j == 1){
            this.a12 = v;
        }else if(i == 1 && j == 0){
            this.a21 = v;
        }else if(i == 1 && j == 1){
            this.a22 = v;
        }
    }

    public double getValue(int i, int j) {
        if(i == 0 && j == 0){
            return this.a11;
        }else if(i == 0 && j == 1){
            return this.a12;
        }else if(i == 1 && j == 0){
            return this.a21;
        }else{
            return this.a22;
        }
    }

    public Matrix2X2 plus(Matrix2X2 arg2) {
        Matrix2X2 c = new Matrix2X2(this.a11 + arg2.getValue(0,0), this.a12 + arg2.getValue(0,1), this.a21 + arg2.getValue(1,0), this.a22 + arg2.getValue(1,1));
        return c;
    }

    public void multNumber(double a){
        this.a11 *= a;
        this.a12 *= a;
        this.a21 *= a;
        this.a22 *= a;
    }

    public void mult(Matrix2X2 mat){
        this.a11 = this.a11 * mat.getValue(0, 0) + this.a12 * mat.getValue(1, 0);
        this.a12 = this.a11 * mat.getValue(0, 1) + this.a12 * mat.getValue(1, 1);
        this.a21 = this.a21 * mat.getValue(0, 0) + this.a22 * mat.getValue(1, 0);
        this.a22 = this.a21 * mat.getValue(0, 1) + this.a22 * mat.getValue(1, 1);
    }

    public double det(){
        return this.a11*this.a22 - this.a12*this.a21;
    }

    public void transpon(){
        double a = this.a21;
        this.a21 = this.a12;
        this.a12 = a;
    }
}
