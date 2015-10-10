import java.util.function.Consumer

/**
 * Created by pengtao.geng on 2015/10/9.
 */

def collection = ["Groovy", "Java", "Ruby"]

assert collection instanceof Collection

assert collection instanceof ArrayList

collection.add("Python")

collection << "C++"

collection[5] = "Perl"

collection[10] = "C"

println "增加之后:" + collection

println "变为大写：" + collection*.toUpperCase()

////////////////////////////////////////////////

def numbers = [1, 2, 3, 4, 5]

numbers += [6, 7]

println numbers

numbers -= [4, 5]

println numbers

println numbers.join("-_-")

numbers[10] = 1

println numbers

println "1的数量" + [1, 2, 3, 4, 5].count(1)

// foreach
[1, 2, 3].forEach(new Consumer<Integer>() {
    @Override
    void accept(Integer integer) {
        println "foreach => " + integer
    }
})

[1, 2, 3].each {
    println "each => " + it
}