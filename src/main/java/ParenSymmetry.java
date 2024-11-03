import java.util.Arrays;
import java.util.List;

public class ParenSymmetry {

    public Boolean isBalanced(String s) {
        StringBuilder parenthesisOnlyBuilder = new StringBuilder();
        int leftParen = 0;
        int rightParen = 0;
        for (char c:s.toCharArray()) {
      //      if ((c == '(') || (c == ')')){
            if (c == '('){
                parenthesisOnlyBuilder.append(c);
                leftParen++;
            } else if (c == ')') {
                parenthesisOnlyBuilder.append(c);
                rightParen++;
            }
        }
        if (leftParen == rightParen){return true;
        }else return false;
//        String parenthesisOnly = parenthesisOnlyBuilder.toString();
//        String reversed = new StringBuilder(parenthesisOnly).reverse().toString();
//        return parenthesisOnly == reversed;

    }

    private void checkFile(String filename) {
        // open file named filename

        // for each line in the file
            // read the line
            // print whether or not the line's parenthesis are balanced

        // CLOSE the file
    }

    public static void main(String[] args) {
        ParenSymmetry ps = new ParenSymmetry();

        Boolean b0 = ps.isBalanced("()");
        printResult(b0, true);

        String[] falseStrings = {"(", "((", ")", "", "(()())((())))"};
        Boolean falses = true;
        for (String strToTest : falseStrings) {
            falses = ps.isBalanced(strToTest);
        }
        printResult(falses, false);

        String[] trueStrings = {"()", "(())", "(((())))", "", "(()())((()))", "(   )", "( () ( ) )"};
        Boolean trues = false;
        for (String strToTest : trueStrings) {
            trues = ps.isBalanced(strToTest);
        }
        printResult(trues, true);

    }

    private static void printResult(Boolean b0, boolean b) {
        if (b0 == null) {
            System.out.println("Null Failure");
            return;
        }
        if (b0 == b) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }
}
