/**
 * Created by gpengtao on 15/9/29.
 */
def repeat(val) {
    for (i = 0; i < 5; ++i) {
        println val
    }
}

repeat(12);

def repeat2(val) {
    for (i in 0..'a') {
        println val;
    }
}

repeat2(123)