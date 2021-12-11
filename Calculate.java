package FactorialNumberProgram;

public class Calculate
{
    double result = 1;
    public String cal(int n)
        {
            for(double i = 1; i<=n; i++)
            {
                result = i * result;
            }
            return String.valueOf(result);
        }
}
