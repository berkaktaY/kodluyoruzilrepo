class Scratch {
    public static void main(String[] args) {




        for (int i = 2; i <= 100; i++) {

            int counter = 0;

            for (int k=1; k <=i; k++) {

                if (i % k == 0) {
                    counter++;
                }
            }

                if (counter <= 2){
                    System.out.print(i + " ");
                }
            }
        }


    }
