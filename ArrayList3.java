import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args){
        ArrayList<Integer> nilai1 = new ArrayList<Integer>();
        ArrayList<Integer> nilai2 = new ArrayList<Integer>();
        ArrayList<Integer> jumlah = new ArrayList<Integer>();

        System.out.println("Nilai 1");
        for(int i=0; i<5; i++){
            nilai1.add(i); System.out.println("Index ke "+i+" = "+nilai1.get(i));
        }
        System.out.println("Nilai 2");
        for(int i=0; i<5; i++){
            nilai2.add(i); System.out.println("Index ke "+i+" = "+nilai2.get(i));
        }
        for(int i=0; i<5; i++){
            jumlah.add(nilai1.get(i)+nilai2.get(i));
        }
        System.out.println("Hasil Penjumlahan Nilai 1 dan Nilai 2");
        for(int i=0; i<5; i++){
            System.out.println("Jumlah index ke "+i+" = " +jumlah.get(i));
        }
    }
}
