/**
 * Created by pengtao.geng on 2015/10/9.
 */

def hashMap = [name: "gpengtao", age: 28]

// 几种设置的方式
hashMap.put("address", "东升")
hashMap.mail = "123@qq.com"

println hashMap

// 取值可以这么取
println hashMap.age
println hashMap["age"]

hashMap.each { key, value ->
    println "each 遍历： $key => $value "
}