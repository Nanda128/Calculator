import java.util.*;
public class Main {
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values.");
        int count=sc.nextInt();
        double[] num =new double[count];
        double s=0,diff=0,prod=0,quot=0;
        for(int i=1;i<=count;i++)
        {System.out.println("Enter the "+count+"th number.");

        }
        System.out.println("Enter 1 if you wish to add, 2 if you wish to subtract, 3 if you wish to multiply, and 4 if you want to divide.");
        switch(sc.nextInt())
        {case 1:
            {for(int i=1;i<=count;i++)
                {s=add(num[i]);
                }
                System.out.println("The sum is "+s);
            }
            case 2:
            {for(int i=1;i<=count;i++)
            {s=subtract(num[i]);
            }
            System.out.println("The difference is "+diff);
            }
            case 3:
            {for(int i=1;i<=count;i++)
            {s=multiply(num[i]);
            }
                System.out.println("The product is "+diff);
            }
            case 4:
            {for(int i=1;i<=count;i++)
            {s=divide(num[i]);
            }
                System.out.println("The quotient is "+diff);
            }
        }
    }
}
