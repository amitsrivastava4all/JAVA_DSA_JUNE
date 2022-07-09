public class Star4 {

    static void printLine(int line, int totalLine){
        if(line == 0){
            return ;
        }
        printSpace(totalLine  - line);
        printStar(line);
        System.out.println();
        printLine(line-1, totalLine);
       
    }
    static void printSpace(int space){
        if(space == 0){
            return ;
        }
        System.out.print(" ");
        printSpace(space-1);
    }
    static void printStar(int star){
        if(star == 0){
            return ;
        }
        System.out.print("*");
        printStar(star-1);
    }

    public static void main(String[] args) {
        printLine(5, 5);
    }
}
