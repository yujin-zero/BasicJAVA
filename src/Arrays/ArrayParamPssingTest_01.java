package Arrays;

public class ArrayParamPssingTest_01 {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,500};
        System.out.println("호출 전 배열에 저장된 값");
        for(int i=0; i<arr.length; i++){
            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }
        System.out.println();

        calledMethod(arr,3);

        System.out.println("호출 후 배열에 저장된 값");
        for(int i=0; i<arr.length; i++){
            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }

    }

    public static void calledMethod(int[] arr, int b) {
        for(int i=0; i<arr.length; i++){
            arr[i] *= b;
        }
        System.out.println("호출된 메소드 내에서 계산된 결과");
        for (int i=0; i<arr.length; i++){
            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }
        System.out.println();
    }
}
