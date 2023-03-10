public class Konsumsi<M, K> {
    private M m;    private K k;    public M getM(){
        return m;    }
    public K getK(){
        return k;    }
    public void setKonsumsi( M makanan,K minuman)
    {
        this.m = makanan;        this.k = minuman;    }
}