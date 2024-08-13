public class soma {
    int n1, n2;
    float soma;
    
    

    public soma(int n1, int n2, float soma) {
        this.n1 = n1;
        this.n2 = n2;
        this.soma = soma;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma = soma;
    }

    void somar(){
        soma = n1 + n2;
    }
}
