/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiuhihi78.mathutil.core;

import org.junit.Assert;
import org.junit.Test; // JUnit 4


/**
 *
 * @author Admin
 */
public class FactoriallTest {
    
   @Test // biến 1 hàm đi kèm cái Anotation này thành hàm main()
   public void checkFactorialGivenRightArgumentReturnsWell(){
       long expected = 120; // tui hy vọng 120 trả về
       long actual = MathUtil.getFactorial(5); // nếu tui tính 5!
       
       Assert.assertEquals(expected, actual);
       Assert.assertEquals(720, MathUtil.getFactorial(6));
       Assert.assertEquals(1, MathUtil.getFactorial(0));
       
   }
   
   // test xem hàm có ném về ngoại lệ như kỳ vọng không
   // vd: nếu ta tính getF(-5) --> ném ra ngoại lệ
   // nếu đúng hàm getF(-5) mà ném ra ngoại lệ tương ứng -> hàm viết đúng   
   //--> ném ra màu xanh
   // hàm được thiết kế rằng đưa âm ném ngoại lệ, thực sụ khi chạy ném ra thật
   //-> có nghĩa là hàm đứng như kì vọng -> màu xanh
   //JUnit 4 coi ngoại lệ k là giá trị, ko AssertEquals(ngoại lệ, actual)
   @Test(expected = IllegalArgumentException.class)
   public void checkFactorialGivenWrongArgumentThrowsException(){
       MathUtil.getFactorial(-5); // phải ném ngoại lệ mới là đúng
   }
}


//---CHỐT HẠ CHO XANH ĐỎ---//
/*

 - XANH: KHI TẤT CẢ CÁC TÌNH HUỐNG TEST PHẢI LÀ MÀU XANH, TỨC LÀ MỌI EXPECTED
VÀ ACTUAL PHẢI KHỚP NHAU
 - ĐỎ : CHỈ CẦN 1 CÁI ĐỎ, COI NHƯ TẤT CẢ ĐỎ
 - LOGIC: HÀM ĐÃ ĐÚNG THÌ PHẢI ĐÚNG TẤT CHO MỌI TÌNH HUỐNG TEST KHÔNG CHẤP NHẬN
LÚC ĐÚNG LÚC SAI

*/
