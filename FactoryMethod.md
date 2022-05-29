# 팩토리메서드

- 어떤 인스턴스를 만들지는 서브 클래스가 정한다.

- **확장에는 열려있고 변경에는 닫혀있는 구조로 만들어보자**

- 저번에 Refactoring에서 했던 방식과 매우 흡사함

![](https://velog.velcdn.com/images/wnsqud70/post/756da572-ee89-4186-85a4-7dad8216a061/image.png)



![](https://velog.velcdn.com/images/wnsqud70/post/e626c43c-c39e-430e-8011-fadfc7418aea/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/f0bb17bc-432a-493d-ae2f-3dc241627e45/image.png)

- 예제는 ship을 만드는 공장이 있고 점점 확장해 나가는 예제이다.

- ship을 만드는 과정의 코드들이 한곳에 모여있다.(orderShip)

- 이렇게 코드가 작성되면 **변경이 있을경우 서로에게 영향을 주며 변경이 있을때마다 코드들을 전체 수정을 해줘야한다.**

- 좀더 서로 독립적면서 나중에 **확장성**을 생각하며 만들어보자.

![](https://velog.velcdn.com/images/wnsqud70/post/69375ece-5e31-4b13-945f-9faebf5efcaf/image.png)


- interface에서 default와 private 메서드에 집중해주자. 

> -  둘다 하위클래스에서 공통으로 사용되는것을 미리 구현해놓는다는 공통점이 있지만 **default는 하위클래스에서 사용가능 ** **private 는 하위클래스에서 오버라이드,그리고 메서드 사용불가** 라   default메서드를 통해서 접근하도록 만들어 줬다.
