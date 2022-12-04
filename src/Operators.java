public class Operators {
    public static void main(String []args){
        //Unary Operator: expr++ expr-- ++expr --expr
        int age=50;
        System.out.println(age++);//50
        System.out.println(++age);//52
        System.out.println(age--);//52
        System.out.println(--age);//50

        //Arithmetic Operator: * / % + -
        int x=5;
        int y=2;
        System.out.println(x*y);//10
        System.out.println(x/y);//2
        System.out.println(x%y);//1
        System.out.println(x-y);//3

       // Relational Operator

        if(x>y){
            System.out.println("x is greater than y :"+ x);
        }else if(x<y){
            System.out.println("Y is greater than x: "+ y);
        }else if(x==y){
            System.out.println("x is equal to y");
        }
        //Ternary Operator and
        int value=(x>y)?x:y;
        System.out.println(value);

        //Assignment Operator
        int a = 0;
        int b = 5;
        System.out.println(a+=1);
        System.out.println(a -= 1);
        System.out.println(b*=2);
        System.out.println(b/=2);
        System.out.println(b%=2);







    }
}
