/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hiuhihi78.mathutil.core;

import static com.hiuhihi78.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Admin
 */
// ta sẽ dùng kỹ thuật Data Driven Testing/Paramentzed Testing
// tham số hóa bộ dữ liệu test
// là kỹ thuật tách bộ dữ liệu test ra hẳn câu lệnh kiểm thử hàm
//xét cho bài getF()
// 0 -> 1
// 1 -> 1
//xét cho bài getF()
//Bộ data: đặt ở txt, Excel, table
//0 -> 1;
//1 > 1;
//2 -> 2;
//3 -> 6;
//4 -> 24;
//5 -> 120;
//nhồi/ fill bộ data này vào trong lời gọi hàm getF() + asserEquals
// tách bạch dâta và lời gọi hàm check kq -> tham số hóa
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    //chuẩn bị bộ data trước txt, excel, db,...
    //nếu để file ngoài, thì phải viết thêm đoạn code đọc data vào..

    @Parameters
    public static Object[][] innitData() {
        return new Integer[][]{
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120}
                              };
    }

    @Parameter(value = 0)
    public int n; // bạn muốn tính mấy giai thừa

    @Parameter(value = 1)
    public int expected; // bạn kỳ vọng trả về mấy

    @Test
    public void checkFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n));

    }
}
