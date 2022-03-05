public class ArraySort {
    public static void main(String[] args) {
        //Создаём массив из 10 целочисленных значений
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        //Сортировка пузырьком
        int[] arr1 = arr;
        boolean check = false;
        int temp = 0;
        while (check != true) {
            check = true;
            for (int i = 0; i < arr1.length - 1; i++) {
                if (arr1[i] > arr1[i + 1]) {
                    temp = arr[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = temp;
                    check = false;
                }
            }
        }
        System.out.println("");
        System.out.println("Сортировка пузырьком");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        //Сортировка всавками
        System.out.println("");
        System.out.println("Сортировка вставками");
        int[] arr2 = arr;
        for (int i = 1; i < arr2.length; i++) {
            int current = arr2[i];
            int j = i - 1;
            while (j >= 0 && current < arr2[j]) {
                arr2[j + 1] = arr2[j];
                j--;
            }
            arr2[j + 1] = current;

        }
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + " ");
        }
        //Сортировка выбором
        System.out.println("");
        System.out.println("Сортировка выбором");
        int[] arr3=arr;
        for (int i = 0; i < arr3.length; i++) {
            int min = arr3[i];
            int minId=i;
            for (int j = i+1; j <arr3.length ; j++) {
                if(arr3[j]<min){
                    min = arr3[j];
                    minId = j;
                }
            }
            int temp1 = arr3[i];
            arr3[i]=min;
            arr3[minId]=temp1;
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}





