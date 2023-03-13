import com.sun.org.apache.xpath.internal.operations.Bool
import java.lang.NumberFormatException
import javax.print.attribute.standard.PagesPerMinute

fun main() {
    /**2023.02.27 코틀린 시작*/

    //Log.v() - 상세한 로그 출력용
    //Log.d() - 개발에 필요한 내용 출력 위해 사용(개발자용) -코드보면서 제일 많이 본거같음
    //Log.i() - 정보성의 일반적인 메세지 전달
    //Log.w() - 에러는 아니지만 경고장
    //Log.e() - 실제 에러메세지 출력

    //선언과 동시에 초기화 하는 변수 선언
    var a = 1

    //값 초기화 하지 않고 선언 후 초기화
    var b: Int
    b = 1
    //해당 경우는 자료형을 지정해주었기 때문에 정수형 이외에 다른 자료형을 'b'에 담을 수 없다.

        /*단위(byte)
        실수형 : Double(64), float(32)
        정수형 : Long(64), Int(32), Short(16), Byte(8)
        문자형 : Char(1글자), String(다중글자)
        불린형 : Boolean(true, false)
        */


    var sCharText: Char = 'A'
    var sStringText: String = "안녕하세요!"

    //읽기전용함수 (한번 입력되면 변경할 수 없음)
    val c = "c"

    //const (주로 기준이 변하지 않는 값 입력) -> Error 나는데 잘 사용하는지 모르겠음
    //컴파일 시 값 결정됨으로 기본형, 문자열만 입력 가능

    //조건문!
    var array0 = "1,2,3,4,5"
    var array1 = "5,6,7,8,9,10"

    if (array0 == array1) {
        println("당첨!!")
    } else {
        println("꽝 x_x")
    }

    //논리 연산자는 현재 lua언어와 사용하는것과 동일합니다.

    //주석종류
    //한줄 주석 입니다.
    /*
      여러줄인경우
      이렇게 사용합니다.
     */

    /**문서화 해야하는 정보를 작성할 때!(이거는 어느 경우에 사용해야 할까요??..)*/



    var x = "1"
    var y = "2"
    var z = "3"

    //when (=switch 하고 비슷합니다.)
    when (x) {
        x -> {
            println("내가~~~~맞아!!")
        }

        y -> {
            println("난 아니다..")
        }

        z -> {
            println("나도 아니다..")
        }
    }

    //다중의 경우 특정값 동일하면 컴마로 구분해서 비교 가능
    var nCnt = 4
    when (nCnt) {
        1, 2, 3 -> {
            println("값에 해당하지 않습니다.")
        }

        4 -> {
            println("해당 값에 속합니다.")
        }

        else -> {
            println("아무것도 없습니다..!")
        }
    }

    var age = 29

    //in 으로 범위 값 구분이 가능합니다.
    when (age) {
        in 10..19 -> {
            println("아직 10대다!")
        }

        in 20..29 -> {
            println("아직 20대다!")
        }

        else -> {
            println("아직 청춘이다..!")
        }
    }

    //배열
    var arrInt = IntArray(10)
    var arrLong = LongArray(10)
    var arrChar = CharArray(10)
    var arrFloat = FloatArray(10)
    var arrDouble = DoubleArray(10)


   /**2023.03.05*/
    //사칙연산 출력
    println(3 + 5 + 6)    //14
    println(3 / 3.0)

    //"" 로 감싸는 경우 문자열로 인식하여 문자열대로 출력
    println("3+5+6")
    println("3/3.0")

    //리터럴타입(변수에 넣는 변하지 않는 데이터)는 연산 결과에 따라 자동으로 자료형이 설정된다.
    var literal0 = 10 + 23 + 5 // 자동으로 정수형 type

    //코틀린이 자바보다 타입체크가 엄격하므로, 타입체크를 잘 해야한다!
    var db0:Double = 3+4+5    //에러
    var db1: Double = 3.0 + 4 + 5  //리터럴 타입이 자동으로 double로 변하기 때문에 에러x

    //산술연산자 종류(+, -, *, / , %)
    //기본 연산자들하고 동일합니다.

    //비트 연산자(왼쪽 코틀린 : 오른쪽 자바)
    15 and 7 : 15&7      //비트단위로 and 연산
    5 or 2 : 5|2         //비트단위로 or 연산
    15 xor 5 : 15^5     //비트단위로 xor 연산
    333.inv() : ~333    // 비트단위로 반전
    1 shl 3 : 1<<3     // 1을 왼쪽으로 3칸 시프트
    8 shr 1 : 8>>1     // 8을 오른쪽으로 1칸 시프트
    -17 ushr 2 :-17>>>2    //부호 유지한 채 -17을 오른쪽으로 2칸 시프트

    //문자열 안에 표현값 넣는 방법
    var num0 = 10
    var num1 = 20

    println("num0:$num0")
    println("num1:$num1")
    println("num0 + num1 = ${num0 + num1}")


    /**2023.03.07*/

    //비교연산자
    ==, !=, <, >, <=, >=

    //논리연산자
    &&, ||, !


    var i = 1
    //while 반복문
    while (i < 10) {
        i += 1
    }

    //do while 반복문(1번은 무조건 실행한다.)
    do {
        i += 1
        break   //반복문 탈출!
    } while (i == 0)


    //함수(function)
    //fun 식별자():반환타입
    fun myFunction(): Int {
        var x = 3
        var y = 6
        println("x: " + x + ",y: " + y)    //x: 3,y: 6
        return x + y    //9
    }

    fun myFunction(): Int = 3 + 6
    fun myFunction() = 3 + 6   //반환type을 지정하지않아도 추론 가능함으로 type생략가능


    fun getAverage(a: Int = 0, b: Int = 0, print: Boolean = false): Double {
        if (print)
            println("매개변수 선언과 동시에 디폴트 인수값으로 초기화 가능하다.")
    }

    getAverage(100, 500, true)
    getAverage(print = true)

    getAverage(10, b=20, print = false) //매개변수 이름을 지정한 경우는 항상 오른쪽에 있어야한다.
    getAverage(print = false, 10,20) // 에러 x.x


    //배열 인수를 받는 함수 만들기
    //varage 를 붙이게 되면 여러개의 인수를 받을 수 있다.(가변인수)
    fun getSum(vararg nArray:Int):Int{
        var nCnt = nArray.size;  // nArray의 배열 갯수

        var i = 0 ; var sum = 0
        while(i<nCnt){
            sum+=nArray[i]
            i+=1
        }
        return sum
    }

    println(getSum(1,2,3,4,5,6))
    //결과 : 21

    //객체(Object) - key&value
    val person = object   //객체로 선언
    {
        val name:String = "홍길동"
        val age:Int = 29
    }

    println(person.name)   //홍길동
    println(person.age)    //29


    //class = 객체(object)의  틀
    //클래스로 한번 정의한 하게 되면 따로 객체를 일일이 만들지 않고도 정의가능하다.
    class Person{
        //프로퍼티 정의
        //클래스 내 생성된 객체 = 인스턴스 -> 구체적으로 정의 된 것!
        var name:String = ""
        var age:Int = 0
    }

    val person1:Person
    person1 = Person()      //참조변수는 반드시 초기화 작업이 필요함으로 선언 꼭 해줘야한다.
    person1.name = "홍길동"
    person1.age = 29

    val person2:Person
    person2 = Person()
    person2.name = "김철수"
    person2.age = 12

    /**2023.03.13*/

    //멤버함수

    class Building
    {
        var name = ""
        var date = ""
        var area = ""

        fun print()
    }

    fun print()
    {
        println("이름"+this.name)
        println("건축일자"+this.date)
    }

    //클래스 옆에 오는 생성자 : 주생성자
    //클래스 내부에 오는 생성자 : 보조생성자
    class Time(val second:Int)
    {
        init {
            println("init블록 실행중")
        }

        //보조생성자
        constructor(minute:Int, second : Int):this(minute*60+second){
            println("보조생성자 1 실행중")
        }

        constructor(hour:Int, minute:Int, second:Int):this(hour*60+minute, second){
            println("보조생성자 2 실행중")
        }

        init {
            println("또 다른 init 블록 실행중")      //init블록이 우선순위 높음(초기화기때문에)
        }
    }

    //오버로딩을 이용한 객체의 사칙연산
    class Point(var a:Int = 0, var b:Int = 0) {
        operator fun plus(other: Point): Point {
            return Point(a + other.a, b + other.b)
        }

        operator fun minus(other:Point):Point{
            return Point(a - other.a, b - other.b)
        }
        fun print() {
            println("a:$a, b:$b")
        }
    }

    val pt1 = Point(3, 7)
    val pt2 = Point(2, -6)

    val pt3 = pt1+pt2
    val pt4 = pt1-pt2

    pt3.print()      //결과: a:5, b:1
    pt4.print()     //결과: a:1, b:13


    //오버로딩 하게 되는 경우에 position을 받게되면 해당 위치의 프로퍼티를 반환할 수 있다.
    class Person1(var name:String, var birthday:String){
        operator fun get(position:Int):String{
            return when(position){
                0->name
                1->birthday
                else->"알 수 없음"
            }
        }
        operator fun set(position:Int, value: String){
            when(position){
                0->name = value
                1->birthday = value
            }
        }
    }

    val person3= Person1("Kotlin","2016-02-15")
    println(person3[0])    //Kotiln
    println(person3[1])    //2016-02-15

    //어떤 값이 객체에 포함되어있는지 여부 확인
    println('o' in "Kotlin")   //true


    //중위표기법
    class Point2(var f:Int=0, var d:Int=0){
        //base를 원점이라 생각했을때 좌표 반환
        infix fun from(base:Point2):Point2{
            return Point2(f-base.f, d-base.d)
        }
    }

    val pt5 = Point2(3,6) from Point2(1,1)
    println(pt5.f)         //2
    println(pt5.d)         //5


    //상속(상속 하용을 위해서는 앞에 'open'을 붙여줘야합니다.
    open class Person3(val name:String, val age:Int)
    class Students(name:String, age:Int, val id: Int):Person3(name, age)

    //예외처리
    try{
        //실행문
    }
    catch(e:NumberFormatException) {
        //예외가 발생한 경우
    }
    finally {
        //예외여부 상관없이 무조건 실행된다.
    }

    //고의로 예외상황을 만드는 경우(throw)
    try{
        something()  //main문 밖에 선언해둬서 검색해야함
    }catch(e:Exception){
        print(e.message)
    }

    //안전호출연산자:참조변수가 null이 아닐경우만 호출
    var obj:Building? = null
    obj?.print()    //null값이므로 출력x

    obj = Building()
    obj?.name = "서울월드컵경기장"
    obj?.print()    //null값이 아니므로 출력o


    //not-null 단정 연산자(null이 있으면 예외없이 표현식 결과를 null로 반환한다.
    var obj1:Building? = Building()
    obj1!!.name = "서울시청"
    println(obj1!!.name)

    obj1 = null
    obj1!!.print()  //KotilnNullPointerException 예외 발생x_x

    //엘비스 연산자(?:)
    //피연산자가 null이 아닌 경우 왼쪽 값, null인 경우 오른쪽 값
    val number:Int?=null
    println(number?:0)     //0

    val number1:Int?=15
    println(number1?:0)   //15

    //is 연산자 (참조변수가 어떤 클래스의 인스턴스를 가리키는지 확인)  = instanceof랑 비슷
    class Professor(name:String,age:Int):Person3(name, age)

    val person4:Person3 = Professor("bsa",33)
    println("${person4 is Person3}")   //true
    println("${person4 !is Professor}")   //false(반대)

    //when에서도 이렇게 사용 가능하다
    when(person4){
        is Person3 -> {}
        is Professor -> {}
    }

    //접근지정자
    //public : 모든곳에서 접근 가능
    //internal : 같은 모듈안에서 접근 가능
    //protected : 클래스내부, 서브클래스안에서만 접근 가능
    //private : 프로퍼티와 멤버함수, 해당클래스 안에서만 접근, 같은 파일내에서만 접근 가능

    //확장프로퍼티(클래스 밖에서 멤버함수를 선언하는 방법) -isLarge는 main문밖에 있음..
   println("12321313".isLarge)
}
fun something(){
    val num1 = 10
    val num2 = 0
    div(num1, num2)
}

fun div(a:Int, b:Int):Int{
    if (b == 0)
        throw  Exception("0으로 나눌 수 없습니다.")   //type: Nothing(모든 타입에 호환)
    return a/b
}

//확장프로퍼티
val String.isLarge:Boolean
    get() = this.length >=10

    
