/**
 * Created by gpengtao on 15/9/29.
 */
def message = "hello groovy"
println message;

def hello = 12
println hello + 1;


def shell = new GroovyShell();

shell.parse("println(1+1)").run()