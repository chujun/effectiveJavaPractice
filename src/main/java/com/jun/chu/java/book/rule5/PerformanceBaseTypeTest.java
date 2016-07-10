package com.jun.chu.java.book.rule5;

/**
 * Created by chujun on 16/7/10.
 * 包装器类和基本类型
 * 基本装箱有性能问题
 *
 */
public class PerformanceBaseTypeTest {
    public static void main(String[] args){
        long start=System.currentTimeMillis();
        long sum1=testPrimitiveType();
        System.out.println((System.currentTimeMillis()-start)+",sum1:"+sum1);

        start=System.currentTimeMillis();
        long sum2=testBoxedPrimitiveType();
        System.out.println((System.currentTimeMillis()-start)+",sum2:"+sum2);

        //
        //1891,sum1:2305843005992468481
        //7842,sum2:2305843005992468481
    }

    public static long testPrimitiveType(){
        long sum=0L;
        for(long i=0;i<Integer.MAX_VALUE;i++){
            sum+=i;
        }
        return sum;
    }

    public static long testBoxedPrimitiveType(){
        Long sum=0L;
        for(long i=0;i<Integer.MAX_VALUE;i++){
            sum+=i;
        }
        return sum;
    }
}
