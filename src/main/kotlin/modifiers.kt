fun main ()
{
        val obj = Modifier()  //classes k object
        val obj2 = Modifier2()

    // modifier class mein y dono accesible hein
        obj.public
        obj.internal

        obj2.public
        obj2.internal
}

open class Modifier
{
    public var public = 10
    internal var internal = 7
    protected var protected= 3
    private var private =9
}

class Modifier2: Modifier()
{
    fun test ()
    {
        println(public)
        println(internal)
        println(protected)
        println(private)   //private wale ka yahan error a raha h q k y usse class m call ho skta h
    }
}