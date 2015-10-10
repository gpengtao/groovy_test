import com.gpengtao.model.Person

/**
 * Created by pengtao.geng on 2015/10/10.
 */
class TestGroovy {

    static void main(args) {
        def person = new Person(name: "gpengtao", age: 20, email: "123@qq.com")

        println person
    }
}
