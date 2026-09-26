///version 5.0 
/// methords introduced for basic operations, trigonometry and higher operations ,18 in total
/// updated 26092026 124025
   
    import static java.lang.System.err;
    import static java.lang.System.out;
    import java.util.Scanner;

    public class scical5 {
    public static void  main(String[]Args){

        out.println("enter 1 your basic operations "); ////   \n 
        err.println("enter 2 for trignometry");
        err.println("enter 3 for higher operations");
    
         Scanner scanner = new Scanner(System.in);
         int first=scanner.nextInt();

        switch(first){
            case 1-> {basicOperations(scanner);}
            case 2-> {trignometry(scanner);}
            case 3-> {higherOperations(scanner);}
            default -> err.println("Invalid input, please refresh again to start over .");
        } }
    public static void basicOperations(Scanner scanner){

            double result  = 0.0;
            int count = 0;
     err.println("enter first number");    
     double num1=scanner.nextDouble();
        while(1!=2){
     err.println("enter  1 for addition ");
     err.println("enter  2 for subtraction ");
     err.println("enter  3 for division ");      
     err.println("enter  4 for multplication ");

      int operation =scanner.nextInt();

     err.println("enter second number");  
     double num2 =scanner.nextDouble();

      if (count==0){  switch (operation){
        case 1 -> result=(num1+num2);
        case 2 -> result=(num1-num2);
        case 3 -> result=(num1/num2); 
        case 4 -> result=(num1*num2); 
        default -> err.println("Invalid input, please refresh again to start over ."); 
       } 
      }
      else if(count>=1){
        switch (operation){
        case 1 -> result=(result+num2);
        case 2 -> result=(result-num2);
        case 3 -> result=(result/num2); 
        case 4 -> result=(result*num2); 
        default -> err.println("Invalid input, please refresh again to start over ."); 
       } 
      }
        out.printf("ans: %.3f\n",result);
        count++;
        }
    }  
    
    public static void trignometry(Scanner scanner) {
     
     out.println("enter 1 for degree and redians conversion ");
     out.println("enter 2 to find value of theta ");
     out.println("enter 3 to find value of theta by measurements");
     out.println("enter 4 for inverse trigonometry");
     int thetavalue = scanner.nextInt();
        switch(thetavalue){
            case 1 ->{degreeAndRadianConversion(scanner);}
            case 2-> {valueOfTheta(scanner);}
            case 3-> {valueOfThetaByMeasurements(scanner);}
            case 4-> {inverseTrigonometry(scanner);}
            default -> err.println("Invalid input, please refresh again to start over .");
        }
    }       
    
    public static void degreeAndRadianConversion(Scanner scanner) {
                out.println("enter 1 to convert degrees to radians");
                out.println("enter 2 to convert radians to degrees");
                int conversion = scanner.nextInt();
                switch(conversion){
                    case 1->{
                        out.println("enter value in degrees");
                        double degtorad = scanner.nextDouble();
                        double rad = Math.toRadians(degtorad);
                        err.printf("value in radians = %.3f",rad);
                    }
                    case 2 ->{
                        out.println("enter value in radians");
                        double radtodeg = scanner.nextDouble();
                        double deg = Math.toDegrees(radtodeg);
                        err.printf("value in degrees = %.3f",deg);
                    }
                }
            }
    public static void valueOfTheta(Scanner scanner){
                System.out.println("enter value of theta (in degrees)");
                double thetavalue1 = scanner.nextDouble();
                double prevvalue = (Math.toRadians(thetavalue1));
                double thevaluefortan = Math.tan(prevvalue);
                double thevalueforsin = Math.sin(prevvalue);
                double thevalueforcos = Math.cos(prevvalue);
                out.printf("tan" + thetavalue1+ " = %.3f\n",thevaluefortan);
                out.printf("sin" + thetavalue1+ " = %.3f\n",thevalueforsin);
                err.printf("cos" + thetavalue1+ " = %.3f\n",thevalueforcos);
                }
    public static void valueOfThetaByMeasurements(Scanner scanner){
                out.println("choose the trigonometric function");
                out.println("1 for tan");
                out.println("2 for sine");
                out.println("3 for cosine");
                int thevalue2 = scanner.nextInt();
                switch(thevalue2){
                    case 1->{valueOfThetaByMeasurementsForTan(scanner);}
                    case 2->{valueOfThetaByMeasurementsForSin(scanner);}
                    case 3->{valueOfThetaByMeasurementsForCos(scanner);}
                    default -> err.println("Invalid input, please refresh again to start over .");
                }
     }
    public static void valueOfThetaByMeasurementsForTan(Scanner scanner){
                        err.println("enter perpendicular ");
                        double perp = scanner.nextDouble();
                        err.println("enter base ");
                        double base = scanner.nextDouble();
                        double ratio1= (perp/base);
                        double thetafortan= Math.atan(ratio1);
                        double thetafortanindegrees= Math.toDegrees(thetafortan);
                        out.printf("theta in radians = %.3f\n",thetafortan);
                        err.printf("theta in degrees = %.3f\n" ,thetafortanindegrees);
                    }
    public static void valueOfThetaByMeasurementsForSin(Scanner scanner){
                        err.println("enter perpendicular :");
                        double perp2 = scanner.nextDouble();
                        err.println("enter hypotenuse :");
                        double hypo = scanner.nextDouble();
                        double ratio2 = (perp2/hypo);
                        double thetaforsin = Math.asin(ratio2);
                        double thetaforsinindegrees = Math.toDegrees(thetaforsin);
                        out.printf("theta in radians = %.3f\n",thetaforsin);
                        err.printf("theta in degrees = %.3f\n",thetaforsinindegrees);
                    }
    public static void valueOfThetaByMeasurementsForCos(Scanner scanner){
                        err.println("enter base :");
                        double base2 = scanner.nextDouble();
                        out.println("enter hypotenuse");
                        double hypo2 = scanner.nextDouble();
                        double ratio3 = (base2/hypo2);
                        double thetaforcos = Math.acos(ratio3);
                        double thetaforcosindegrees= Math.toDegrees(thetaforcos);
                        out.printf("theta in radians = %.3f\n",thetaforcos);
                        err.printf("theta in degrees = %.3f\n", thetaforcosindegrees);
                    }
    public static void inverseTrigonometry(Scanner scanner){

                    out.println("choose 1 for tan");
                    out.println("choose 2 for sin");
                    out.println("choose 3 for cos");

                    int invtrigno = scanner.nextInt();

                    switch (invtrigno){
                        case 1->{inverseForTan(scanner);}
                        case 2->{inverseForSin(scanner);}
                        case 3->{inverseForCos(scanner);}
                        default->out.println("Invald input, please refresh again to start over .");
                    }
                }
                    
    public static void inverseForTan(Scanner scanner){
                         out.print("enter value to be inversed");
                         double inverse = scanner.nextDouble();
                         double invtan = Math.atan(inverse);
                         double invtanindeg = Math.toDegrees(invtan);
                         out.printf("theta in radians is : %.3f\n",invtan);
                         out.printf("theta in degrees is : %.3f\n",invtanindeg);
                    } 
    public static void inverseForSin(Scanner scanner){ 
                         out.println("enter value to be inversed");     
                         double inverse = scanner.nextDouble();
                         double invsin = Math.asin(inverse);
                         double invsinindeg= Math.toDegrees(invsin);
                         out.printf("theta in radians is : %.3f\n",invsin);
                         out.printf("theta in degrees is : %.3f\n",invsinindeg);
                    }
    public static void inverseForCos(Scanner scanner){
                         out.println("enter value to be inversed ");
                         double inverse = scanner.nextDouble();
                         double cosinv =Math.acos(inverse);
                         double cosinvindeg=Math.toDegrees(cosinv);
                         out.printf("value of theta in radians is : %.3f\n",cosinv);
                         out.printf("value of cos in degrees is : %.3f\n",cosinvindeg);
                    }
    public static void higherOperations(Scanner scanner) {
        out.println("enter 1 for log functions");
        out.println("enter 2 for sq root");
        out.println("enter 3 for cube root ");
        out.println("enter 4 for exponents");
        out.println("enter 5 for customizable root");
            int foradv = scanner.nextInt();
            switch (foradv){
                case 1-> {logFunction(scanner);}
                case 2-> {sqrtFunction(scanner);}  
                case 3-> {cbrtFunction(scanner);}
                case 4-> {expFunction(scanner);}
                default->out.println("Invald input, please refresh again to start over .");
            }
        }
    public static void logFunction(Scanner scanner) {
                 out.println("enter 1 for base e ");
                 out.println("enter 2 for base 10");
                 out.println("enter 3 for customised base");
                 int foradv2 = scanner.nextInt();
                switch(foradv2){
                    case 1-> {
                        err.print("enter value");
                        double foradv2a = scanner.nextDouble();
                        double log1 = Math.log(foradv2a);
                        out.printf("loge" + foradv2a + " is %.3f\n",log1);
                    }
                    case 2 ->{
                        out.print("enter value");
                        double foradv2b = scanner.nextDouble();
                        double log2 = Math.log10(foradv2b);
                        out.printf("log10" + foradv2b + " is %.3f\n",log2);
                    }
                    case 3-> {
                        out.println("enter value for base ");
                        double basevalue = scanner.nextDouble();
                        out.println("enter value");
                        double foradv2c = scanner.nextDouble();
                        double log3 = Math.log(foradv2c)/Math.log(basevalue);
                        ////log (b)x = log x/log b
                        out.printf("log"+basevalue+"("+foradv2c+")is%.3f\n",log3); 
                    }
                    default -> {err.print("Invald input, please refresh again to start over .");}
                }
            }
                
    public static void sqrtFunction(Scanner scanner) {
                    err.println("enter value");
                    double sqrt = scanner.nextDouble();
                    double sqrtans = Math.sqrt(sqrt);
                    err.printf("square root of "+sqrt+" is %.3f\n",sqrtans);
                }
    public static void cbrtFunction(Scanner scanner) {
                    err.print("enter value");
                    double cbrt = scanner.nextDouble();
                    double cbrtans= Math.cbrt(cbrt);
                    err.printf("cube root of "+cbrt+" is %.3f\n",cbrtans);
                }
    public static void expFunction(Scanner scanner)  {
                    err.print("enter the base to be exponented");
                    double base2= scanner.nextDouble();
                    err.println("enter power");
                    double power = scanner.nextDouble();
                    double expans = Math.pow(base2,power);
                    out.printf(base2 +" to the power "+ power+" is %.3f\n",expans);
                }
    public static void rootFunction(Scanner scanner) {{
                    out.println("enter number to be rooted");
                    double othroot = scanner.nextDouble();
                    out.println("enter value for root");
                    double rootval= scanner.nextDouble();
                    double othrootans = Math.pow(othroot,1.0/rootval);
                    err.printf("value is %.3f",othrootans);
                }
                
            }
         }         