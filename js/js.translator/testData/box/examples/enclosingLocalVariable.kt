// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1113
fun box(): String {
    val cl = 39
    return if (sum(200, { val m = { val r = { cl };  r() }; m() }) == 239) "OK" else "FAIL"
}

fun sum(arg: Int, f: () -> Int): Int {
    return arg + f()
}
