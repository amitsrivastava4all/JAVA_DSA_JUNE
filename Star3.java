public class Star3 {
    
    static void printLine(int line, int totalLine){
            if(line == 0 ){
                return ;
            }
            printLine(line-1,totalLine);
            printSpace(totalLine- line);
            printStar(line);
            System.out.println();

    }
    static void printSpace(int noOfSpaces){
        if(noOfSpaces == 0){
            return ;
        }
        System.out.print(" ");
        printSpace(noOfSpaces-1);

    }
    static void printStar(int noOfStar){
        if(noOfStar == 0){
            return ;
        }
        System.out.print("*");
        printStar(noOfStar-1);

    }
    public static void main(String[] args) {
       printLine(5, 5); 
    }
}
