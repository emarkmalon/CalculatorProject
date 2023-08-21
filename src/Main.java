// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
/*
       double value1 = 100.0d;
       double value2 = 50.0d;
       double result = 0.0d;
       char opCode = 'c';

       if (opCode == 'a')
           result = value1 + value2;
       else if (opCode == 's')
           result = value1 - value2;
       else if (opCode == 'm')
           result = value1 * value2;
       else if (opCode == 'd')
           result = value1 / value2;
       else
           result = 0.0d;
        System.out.println(result);
*/

       /* double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        char opCode = 'a';

        switch (opCode){
            case 'a':
                result = value1 + value2;
                break;

            case 's':
                result = value1 - value2;
                break;

            case 'm':
                result = value1 * value2;
                break;

            case 'd':
                if(value2 != 0)
                result = value1 / value2;
                break;

            default:
            System.out.println("Invalid opCode" + opCode);
            result = 0.0d;
            break;

        }
        System.out.println(result);
*/
        double[]  leftVals = { 100.0d, 25.0d, 225.0d, 11.0d,};
        double[]  rightVals = { 50.0d, 92.0d, 17.0d, 3.0d,};
        char[] opCodes = {'d','a', 's', 'm',};
        double[] result = new double[opCodes.length];

        for (int i = 0; i < opCodes.length; i++) {
            



        switch (opCodes[i]){
                case 'a':
                    result[i] = leftVals[i] + rightVals[i];
                    break;

                case 's':
                    result[i] = leftVals[i]  - rightVals[i];
                    break;

                case 'm':
                    result[i] = leftVals[i]  * rightVals[i];
                    break;

                case 'd':
                    result[i] = rightVals[i] != 0 ? leftVals[i]  / rightVals[i]: 0.0d;
                    break;

                default:
                    System.out.println("Invalid opCode" + opCodes[i]);
                    result[i] = 0.0d;
                    break;

           }

        }
        System.out.println(result);



    }
}