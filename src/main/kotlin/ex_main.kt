/** package에 대한 예시*/

 //1)
 package ex_package
 import ex_package.max  //2)
 import ex_package.min as ex_min //3)ex_min 이름으로 ex_package에 있는 min 함수를 정의한다.

 //소스파일이 서로 같은 패키지에 있으면 호출 할 수 있지만, 다른 패키지인 경우 호출이 불가능하다.
 fun main(args:Array<String>){
     //1)
     println(ex_package.min(30,10))

     //2)
     println(max(55,47))

     //3)
     println(ex_min(3, 10))
 }
