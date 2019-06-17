public class FizzBuzz {
    public String fizzBuzz(int number) {
        for(int i = 1; i < 16; i++){
            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz"+" ");
            }
            else if(i % 3 ==0){
                System.out.println("Fizz"+" ");
            }
            else if(i % 5 ==0){
                System.out.println("Buzz"+" ");
            }
        }
        return "";
    }
}