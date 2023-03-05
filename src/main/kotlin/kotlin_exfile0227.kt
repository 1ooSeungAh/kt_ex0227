fun main() {
    /** 2023.02.27 코틀린 시작 */
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

    /* 단위(byte)
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
    /**
    문서화 해야하는 정보를 작성할 때!(이거는 어느 경우에 사용해야 할까요??..)
     */

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


    /** 2023.03.05 */

    //사칙연산 출력
    println(3+5+6)    //14
    println(3/3.0)

    //"" 로 감싸는 경우 문자열로 인식하여 문자열대로 출력
    println("3+5+6")
    println("3/3.0")

    //리터럴타입(변수에 넣는 변하지 않는 데이터)는 연산 결과에 따라 자동으로 자료형이 설정된다.
    var literal0 = 10+23+5 // 자동으로 정수형 type

    //코틀린이 자바보다 타입체크가 엄격하므로, 타입체크를 잘 해야한다!
    //var db0:Double = 3+4+5    //에러
    var db1:Double = 3.0+4+5  //리터럴 타입이 자동으로 double로 변하기 때문에 에러x

    //산술연산자 종류(+, -, *, / , %)
    //기본 연산자들하고 동일합니다.

    //비트 연산자(왼쪽 코틀린 : 오른쪽 자바)
    15 and 7 : 15&7      //비트단위로 and 연산
    5 or 2 : 5|2         //비트단위로 or 연산
    15 xor 5 : 15^5     //비트단위로 xor 연산
    333.inv() : ~333    // 비트단위로 반전
    1 shl 3 : 1<<3     // 1을 왼쪽으로 3칸 시프트
    8 shr 1 : 8>>1     // 8을 오른쪽으로 1칸 시프트
    -17 ushr 2 : -17>>>2    //부호 유지한 채 -17을 오른쪽으로 2칸 시프트

    //문자열 안에 표현값 넣는 방법
    var num0 = 10
    var num1 = 20

    println("num0:$num0")
    println("num1:$num1")
    println("num0 + num1 = ${num0+num1}")






}



    