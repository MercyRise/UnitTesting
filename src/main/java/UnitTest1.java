public class UnitTest1 {

    public String name;

    public long multiplyNum(long x, long z){
        return x*z;
    }
    public int addNumber(int a, int b){
        return a + b;
    }

    public String addString(String c, String d){
        return c+d;
    }

    public boolean equals(Object obj) {
        if(this.name.equalsIgnoreCase(((UnitTest1)obj).name)){
            return true;
        }
        return false;
    }
}
