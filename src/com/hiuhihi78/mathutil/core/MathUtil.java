/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiuhihi78.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtil {
    // viết hàm toán học tính giai thừa n! = 1.2.3... n
    // quy ước : 0! = 1
    // không có giai thừa âm
    // 21! tràn kiểu giá trị long , long 18 số 0
    // túm lại : hàm tính gia thừa n = 0...20
    //Ta xài luôn kỹ thuật lập trình TDD - Test Driven Development
    //                                     Test First Development
    // nghĩ về test trước khi viết code , bộ dữ liệu test trước khi code
    
    public static long getFactorial(int n){
        
        if(n < 0 || n > 20){
            throw new IllegalArgumentException("n must be between 0 - 20");
        }
        
        if(n == 0 || n == 1){
            return 1;
        }
        
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
    
    // sure , getF(5) -> 120
    // sure , getF(6) -> 720
}