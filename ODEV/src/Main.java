public class Main {

        public static void main(String[] args) {
            int[] minutes = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
            String[] names = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};
            for (int i = 0; i < minutes.length; i++) {
                if (method1(minutes) == minutes[i]) {
                    System.out.println("Birinci: " + names[i] + " " + minutes[i] + "'");
                }
            }
            for (int i = 0; i < minutes.length; i++) {
                if (method2(minutes) == minutes[i]) {
                    System.out.println("İkinci: " + names[i] + " " + minutes[i] + "'");
                }
            }
            for (int i = 0; i < minutes.length; i++) {
                if (method3(minutes) == minutes[i]) {
                    System.out.println("Üçüncü: " + names[i] + " " + minutes[i] + "'");
                }
            }
            Grouping(minutes);
        }

        public static int method1(int[] array) {
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public static int method2(int[] array2) {
            int min = method1(array2);
            int min2 = array2[0];
            for (int i = 0; i < array2.length; i++) {
                if (array2[i] < min2 && array2[i] > min) {
                    min2 = array2[i];
                }
            }
            return min2;
        }

        public static int method3(int[] array3) {
            int min2 = method2(array3);
            int min3 = array3[0];
            for (int i = 0; i < array3.length; i++) {
                if (array3[i] < min3 && array3[i] > min2) {
                    min3 = array3[i];
                }
            }
            return min3;
        }

        public static void Grouping(int[] array4) {
            int A = 0;
            int B = 0;
            int C = 0;
            for (int i = 0; i < array4.length; i++) {
                if (array4[i] >= 200 && array4[i] <= 299) {
                    A++;
                }
                if (array4[i] >= 300 && array4[i] <= 399) {
                    B++;
                }
                if (array4[i] >= 400) {
                    C++;
                }
            }
            System.out.println("A ->" + " " + A);
            System.out.println("B ->" + " " + B);
            System.out.println("C ->" + " " + C);
        }
    }

