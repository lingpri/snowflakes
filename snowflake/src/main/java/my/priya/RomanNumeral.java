package my.priya;

public class RomanNumeral {

    //how to convert a roman numeral to a standard base 10 number
    //how to convert a standard base 10 number to a Roman Numeral
    //10 is x
    //100 is C
    //1000 is M

    private Integer number;
    private String  roman;

    public void setNumber(Integer num){
        this.number = num;
    }

    public static void main(String[] args) {

        //refer : https://stackoverflow.com/questions/12967896/converting-integers-to-roman-numerals-java

        int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1} ;
        String[] romanNos = new String[]{"M", "CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        System.out.println(numbers.length);
        System.out.println(romanNos.length);
        System.out.println("Yippee..I ate all the chocolates...");


       for(int i=0;i<numbers.length;i++){
           System.out.println(numbers[i] + "=>" + romanNos[i]);
       }






    }

}
