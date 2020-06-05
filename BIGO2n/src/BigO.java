public class BigO {

    public static double startTime = System.nanoTime();

    static int printFibo(int count){
        if(count<1){

            return 1;
        }
        System.out.println(count);
        //Recursive Metodekald i Return
        // Kalder 2 gange, det ene metode kald trækker den 2 fra
        // Det andet metode kald trækker den 1 fra
        return printFibo(count - 2) + printFibo(count-1);
    }

    //Driver Kode
    public static void main(String[] args) {
        int count=100; // n værdi
        System.out.print(printFibo(count));


        //Checker tid/Runtime
        
        double endTime = System.nanoTime();
        System.out.println("        Took "+(endTime - startTime));
    }
}

