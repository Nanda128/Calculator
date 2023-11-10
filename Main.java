import java.util.*;
public class Main {
    public static int count;
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values.");
        count=sc.nextInt();
        double[] num =new double[count];
        double s=0,diff=0,prod=0,quot=0;
        for(int i=0;i<count;i++)
        {System.out.println("Enter the "+i+"th number.");
        num[i]=sc.nextDouble();
        }
        System.out.println("Enter 1 if you wish to add, 2 if you wish to subtract, 3 if you wish to multiply, and 4 if you want to divide.");
        Operands op=new Operands();
        switch(sc.nextInt())
        {case 1:
            {for(int i=0;i<count;i++)
                {s=op.add(num[i]);
                }
                System.out.println("The sum is "+s);
                break;
            }
            case 2:
            {for(int i=0;i<count;i++)
                {diff=op.subtract(num[i]);
                }
            System.out.println("The difference is "+diff);
                break;
            }
            case 3:
            {for(int i=0;i<count;i++)
                {prod=op.multiply(num[i]);
                }
                System.out.println("The product is "+prod);
                break;
            }
            case 4:
            {for(int i=0;i<count;i++)
                {quot=op.divide(num[i]);
                }
                System.out.println("The quotient is "+diff);
                break;
            }
        }
    }
}