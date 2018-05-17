public class ArraySort {
    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        for (int i = 0; i < length; i++) {

            for (int k = 0; k < length; k++) {

                if (array[i] < array[k]) {

                    int temp = array[i];

                    array[i] = array[k];
                    array[k] = temp;
                }
            }
        }


        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

//        for(int k = 0; k < length - 1; k++)
//        {
//            //Оптимізація: перевірка на здійснення обмінів
//            int swaps = 0;
//
//            //обміняти сусідні елементи, якщо вони не впорядковані
//            //Пройтися по масиву
//            for(int i = 0; i < length - 1 - k; i++)
//            {
//                //Перевірити елементи i та i+1
//                if(array[i] > array[i+1])
//                {
//                    int temp = array[i+1];
//                    array[i+1] = array[i];
//                    array[i] = temp;
//                    swaps++;
//                }
//            }
//            if(!swaps)
//                break;
//        }









    }
}
