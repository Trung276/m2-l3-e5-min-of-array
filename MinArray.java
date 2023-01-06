import java.util.Scanner;
public class MinArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap size mang: ");
        int size = scanner.nextInt();
        int i = 0;
        int [] arr = new int [size];
        while(i < size) {
            System.out.println("Nhap phan tu thu " + (i + 1));;
            arr[i] = scanner.nextInt();
            i++;
        }
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) min = arr[j];
        }
        System.out.println("Gia tri nho nhat la: " + min);;
    }
}
