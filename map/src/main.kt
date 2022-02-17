fun main() {

    val x: HashMap<Int, String> = hashMapOf(1 to "Danil",2 to "Tom",3 to "Bob",4 to "Daria",5 to "Angela")
    println(x)

    // get()

    println(x.get(5))

    // put,set,remove

    println(x.put(99, "John"))
    println(x.set(3, "Yurii"))
    println(x.remove(2))
    println(x) // Output result


}