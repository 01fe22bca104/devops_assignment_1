public class BasicCalculator1
{
    public float addition (float op1,float op2)
    {
        return(op1+op2);
    }
    /**
     * The function "substraction" takes two float numbers as input and returns their difference.
     * 
     * @param op1 The first operand for the subtraction operation.
     * @param op2 The second operand for the subtraction operation.
     * @return the result of subtracting `op2` from `op1`.
     */
    public float substraction(float op1,float op2)
    {
        return(op1-op2);
    }
    /**
     * The function "multiplication" takes two float numbers as input and returns their product.
     * 
     * @param op1 The first operand for multiplication. It is a floating-point number.
     * @param op2 The second operand for the multiplication operation.
     * @return the product of the two input numbers (op1 and op2).
     */
    public float multiplication(float op1,float op2)
    {
        return(op1*op2);
    }
    
    public float division(float op1,float op2)
    {
        return(op1/op2);
    }
}
public static void main(String[] args)
{
    float op1=10;
    float op2=5;
    BasicCalculator1 calc= new BasicCalculator1();
    float add_result=calc.addition(op1,op2);
    System.out.println("Result of addition is:"+add_result);

    float sub_result=calc.substraction(op1,op2);
    System.out.println("Result of substraction is:"+sub_result);

    float mul_result=calc.multiplication(op1,op2);
    System.out.println("Result of Multiplication is:"+mul_result);

    float div_result=calc.division(op1,op2);
    System.out.println("Result of Divison is:"+div_result);
}