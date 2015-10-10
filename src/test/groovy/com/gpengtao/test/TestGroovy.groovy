package com.gpengtao.test

import com.gpengtao.model.Person
import org.junit.Test

/**
 * Created by pengtao.geng on 2015/10/10.
 */
class TestGroovy {

    @Test
    void test() {
        def person = new Person(name: "gpengtao", age: 20, email: "123@qq.com")

        println person
    }
}
