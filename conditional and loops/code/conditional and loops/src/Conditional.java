//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Conditional {
    public static void main(String[] args) {
        int salary = 21000;
//        if(salary>20000){
//            salary+=2000;
//            System.out.println(salary);
//        }
//        else {
//            System.out.println(salary+1000);
//        }

        if(salary>10000){
            salary+=2000;
        }
        else if(salary>20000){
            salary+=3000;//this is a bad code because it will never work because first condition will disrupt the output for this condition.
        }
        else{
            salary+=1000;
        }

        System.out.println(salary);
    }
}