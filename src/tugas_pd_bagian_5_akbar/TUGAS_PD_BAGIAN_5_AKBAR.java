
package tugas_pd_bagian_5_akbar;

import java.util.Scanner; //inputan
        
public class TUGAS_PD_BAGIAN_5_AKBAR {

    static Scanner masukan = new Scanner(System.in);//inputan
    public static void main(String[] args) {
        
        for (int i=1;i<=10;i++)
        {
            for (int j=1;j<=i;j++)
            {
            System.out.print("*"); 
            }
            System.out.println(""); 
        }   
    }
}
