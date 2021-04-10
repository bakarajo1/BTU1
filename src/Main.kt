fun main() {

    var f1 = Fraction(3F,8F)

    var f2 = Fraction(2F,7F)

    println(f1)
    println(f1.sum(f1,f2))
    println(f1.multip(f1,f2))



}

class Fraction(private var numerator: Float, private var denominator: Float) {

    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator / denominator == other.numerator){
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }





    fun sum (a: Fraction, b:Fraction): Fraction {

        var finDenominator: Float= a.denominator * b.denominator

        var finNumerator:Float=a.numerator* b.denominator + b.numerator* a.denominator
        var finVar = Fraction(finNumerator,finDenominator)

        return finVar


    }

    fun multip (a: Fraction, b:Fraction): Fraction {
        var x = a.numerator * b.numerator
        var y = a.denominator * b.denominator
        var finVar= Fraction(x,y)

        return finVar
    }

    fun shekveca (a: Fraction): Fraction{
        var usg =1
        var i = 1
        while (i <= a.numerator && i <= a.denominator) {
            // Checks if i is factor of both integers
            if (a.numerator % i == 0 && a.denominator % i == 0)
                usg = i
            ++i
        }
        return var finFrac = Fraction(a.numerator/usg, a.denominator/usg)


    }
}