fun main(args: Array<String>) {
  var soma = 0
    for (i in 1 .. 500) {
        if (i % 2 != 0 && i % 3 ==0)
            soma+=i
    }
    print(soma)
}