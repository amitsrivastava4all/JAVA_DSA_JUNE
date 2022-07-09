public class Star {

    static void printLine(int lineNumber){
            if(lineNumber == 0){
                return ;
            }
            printLine(lineNumber-1);
            printStar(lineNumber);
            System.out.println();
    }

    static void printStar(int star){
        if(star ==0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }

    public static void main(String[] args) {
        printLine(5);
    }
}
