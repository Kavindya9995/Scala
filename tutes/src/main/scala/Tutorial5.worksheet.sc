//Q1
var k = 2

var i = 2

var j = 2

var m = 5

var n = 5

var f = 12.0f

var g = 4.0f

var c = 'X'


k+12*m

m/j

n%j

m/j*j

f+10*5+g

// ++i*n  (Increment operator is not available in Scala)
(i+1)*n

//Q2

var a: Int =2

var b: Int =3

var c2: Int =4

var d: Int =5

var k2 : Float = 4.3f


//println(--b*a+c*d--)  (Decrement operator is not available in Scala)
println((b-1)*a+c*(d-1));

//println(a++) (Increment operator is not available in Scala)
a=a+1;
println(a);

println(-2*(g-k2)+c2);

//println(c=c++) (Increment operator is not available in Scala)
println(c2);

//println(c=++c*a++); (Increment operator is not available in Scala)
println((c2+1)*(a+1));




//Q4
def Wage(hours:Int): Int = hours*250

def OT(hours:Int): Int = hours*85

def Income(h1:Int, h2:Int): Int = Wage(h1) + OT(h2)

def Tax(Income:Int): Double = Income*0.12

def Salary(h1:Int, h2:Int): Double = Income(h1, h2) - Tax(Income(h1,h2))

Salary(40, 30)



//Q4 (b)

def Attendees(Tprice:Int):Int = 120+(15-Tprice)/5*20

def Income(TPrice: Int): Int = Attendees(TPrice) * TPrice

def Cost(TPrice:Int):Int=500+3*Attendees(TPrice)

def Profit(TPrice:Int):Int = Income(TPrice)- Cost(TPrice)

Profit(10)

