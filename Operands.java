public class Operands {
    private double sum=0.0;
    private double diff=0.0;
    private double prod=1.0;
    private double quot=1.0;
    public double add(double v)
    {sum=sum+v;
        return sum;
    }
    public double subtract(double v)
    {int c=Main.count;
        if(c==0){
            diff=v;
        }
        else {
            diff=diff-v;
        }
        return diff;
    }
    public double multiply(double v)
    {prod=prod*v;
        return prod;
    }
    public double divide(double v)
    {int c=Main.count;
            if(c==0)
            {quot=v;
            }
            else
            {quot = quot / v;
            }
        return quot;
    }
}
