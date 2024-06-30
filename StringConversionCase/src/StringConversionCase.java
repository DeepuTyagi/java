public class StringConversionCase {
    public static void main(String[] args) {
        String input = "nitin";
        String output = input.toUpperCase();
        //System.out.println(output);
       /* asciiValue('A');
        asciiValue('a');
        asciiValue('Z');
        asciiValue('z');*/

        convertIntoLowerCase("NITIN");
    }

    private static int asciiValue(char input){
        int n = (int)input;
        //System.out.println("ASCII vslue of "+input + " is = "+n);
        return n;
    }

    private static String convertIntoLowerCase(String inputStr){
        System.out.println("Input String = "+inputStr);
        char[] inputCharArray = inputStr.toCharArray();
        char [] outPutCharAyyar = new char[inputStr.length()];
        for (int i=0; i<inputCharArray.length;i++){
            int asciiVal = asciiValue(inputCharArray[i]);
            if(asciiVal >= 97 && asciiVal <=122){
                //Its already small letter
                System.out.println("Already small letter");
                outPutCharAyyar[i] = inputCharArray[i];
            }else{
                int newAsciiVal = asciiVal + 32;
                char newChar = (char)newAsciiVal;
                outPutCharAyyar[i] = newChar;
            }
        }
        String output = String.valueOf(outPutCharAyyar);
        System.out.println("Output String = "+output);
        return output;
    }

    private static String convertIntoUpperCase(String inputStr){
        System.out.println("Input String = "+inputStr);
        char[] inputCharArray = inputStr.toCharArray();
        char [] outPutCharAyyar = new char[inputStr.length()];
        for (int i=0; i<inputCharArray.length;i++){
            int asciiVal = asciiValue(inputCharArray[i]);
            if(asciiVal >= 97 && asciiVal <=122){
                //Its already small letter
                System.out.println("Already small letter");
                outPutCharAyyar[i] = inputCharArray[i];
            }else{
                int newAsciiVal = asciiVal + 32;
                char newChar = (char)newAsciiVal;
                outPutCharAyyar[i] = newChar;
            }
        }
        String output = String.valueOf(outPutCharAyyar);
        System.out.println("Output String = "+output);
        return output;
    }
}