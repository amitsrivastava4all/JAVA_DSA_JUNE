public class ReverseAString {

    static String reverse(String name , int index){
        if(index == name.length()){
            return "";
        }
       //return reverse(name, index+1) +  name.charAt(index);
       String tempResult = reverse(name, index+1);
       return tempResult + name.charAt(index);
    }
    public static void main(String[] args) {
        String result = reverse("amit", 0);
        System.out.println(result);
    }
}
