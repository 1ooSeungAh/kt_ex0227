fun main() {
   /** 2023.02.27 코틀린 시작 */
    //Log.v() - 상세한 로그 출력용
    //Log.d() - 개발에 필요한 내용 출력 위해 사용(개발자용) -코드보면서 제일 많이 본거같음
    //Log.i() - 정보성의 일반적인 메세지 전달
    //Log.w() - 에러는 아니지만 경고장
    //Log.e() - 실제 에러메세지 출력

    //변수선언과 동시 값
    var a = 1

    //값 초기화 하지 않고 선언
    var b: Int
    b = 1
    //해당 경우는 자료형을 지정해주었기 때문에 정수형 이외에 다른 자료형을 'b'에 담을 수 없다.

    /*
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
    }else {
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
    when(x){
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
    when(nCnt)
    {
        1,2,3-> {
            println("값에 해당하지 않습니다.")
        }
        4-> {
            println("해당 값에 속합니다.")
        }
        else-> {
            println("아무것도 없습니다..!")
        }
    }

    var age = 29

    //in 으로 범위 값 구분이 가능합니다.
    when(age){
        in 10..19-> {
            println("아직 10대다!")
        }
        in 20..29-> {
            println("아직 20대다!")
        }
        else-> {
            println("몰라몰랑")
        }
    }

    //배열
    var arrInt = IntArray(10)
    var arrLong = LongArray(10)
    var arrChar = CharArray(10)
    var arrFloat = FloatArray(10)
    var arrDouble = DoubleArray(10)


}


    
