package com.vilin.core;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class AssertTests {

    @Test
    public void test1() {
        Object o = null;
        if (o == null) {
            throw new IllegalArgumentException("参数错误");
        }
    }

    @Test
    public void test2() {
        Object o = null;
        //用断言来替代if结构
        Assert.notNull(o, "参数错误");
    }
}
