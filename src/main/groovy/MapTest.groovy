/**
 * Created by pengtao.geng on 2015/10/9.
 */

def hashMap = [name: "gpengtao", age: 28]

// �������õķ�ʽ
hashMap.put("address", "����")
hashMap.mail = "123@qq.com"

println hashMap

// ȡֵ������ôȡ
println hashMap.age
println hashMap["age"]

hashMap.each { key, value ->
    println "each ������ $key => $value "
}