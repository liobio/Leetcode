

class Solution {
    public int reverse(int x) {
    
        int out=0;
        if(x==0){
            return out=0;
        }

        int a=0;//有几位数
        int b;//余数
        int[] c=new int[10];//可以去掉数组存储 由out接受数据
        int d=10;//权重初始值
        while(true){
            
            b=x%d;//取余数
            x=x/d;//去掉最后一位数字
            c[a]=b;
            if(x==0){
                break;
            }
            a++;
        } 
        int e=a;
        for(int i=0;i<=a;i++){
            out+=c[i]*Math.pow(10, e);
            e--;
        }  

        if(out>=(Math.pow(2,31)-1)||out<=Math.pow(-2,31))
            out=0;

        return out;
    
    }
    /*  
    int rev = 0;
        while (x != 0) {
            int pop = x % 10;//每次的余数
            x /= 10;//去掉尾数

            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

            rev = rev * 10 + pop;
        }
        return rev;

    */
}


