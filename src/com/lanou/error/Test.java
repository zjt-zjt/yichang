package com.lanou.error;

public class Test {

	public static void main(String[] args) {
		int[] array = {1,2,3,4};
//		int num = array[5];
//         System.out.println(array[5]);   //运行期异常
         int result = 0;
         int a =100;
         int b = 0;
//         System.out.println(a/b);//运行期异常
         
         try {
        	result = a/b; 
        	int num = array[5];
         }catch (ArrayIndexOutOfBoundsException e) {
			int num = array[2];
			System.out.println(num);
		}catch (ArithmeticException e) {
			b = 1;
			result = a/b;
			System.out.println(result);
		}finally {
			System.out.println("最先执行");
		}
         
         
	}

}
