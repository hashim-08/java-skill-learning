public class Hello {
    public static void main(String[] args) {
        System.out.println("hello world");
        byte a=10;
        double b=20.5;
        float c=30.5f;
        short d=40;
        String e="Hello abdullah hashim ";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
      //ternary operator
        int x=10;
        int y=20;
        int max=(x>y)?x:y;
        System.out.println("max value is "+max);
      //logical operator
        int p=10;
        int q=20;
        if(p>5 && q>15){
            System.out.println("both conditions are true");
        }
        else{
            System.out.println("one of the condition is false");
            //increment and decrement operator
            int r=10;
            r++;
            System.out.println("incremented value of r is "+r);
            r--;
            System.out.println("decremented value of r is "+r);
            
        }  
    }
}

