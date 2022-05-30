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


- **private메서드를 사용하지 않을거면** 인터페이스와 하위클래스 사이에 추상클래스를 하나 더 넣어줘서 공통된 메서드를 구현 해주고 그 클래스를 하위클래스들이 상속 받도록 한다.

![](https://velog.velcdn.com/images/wnsqud70/post/82244684-4ccc-409c-a678-60a0300506e5/image.png)
![](https://velog.velcdn.com/images/wnsqud70/post/b4791a9f-1fee-4779-8302-568f1ac8dc52/image.png)


- 공통으로 사용되는 값들을 interface로 묶어준다

![](https://velog.velcdn.com/images/wnsqud70/post/3c620355-ef60-4323-9306-0ed346a056b5/image.png)

![](https://velog.velcdn.com/images/wnsqud70/post/02e15e22-23fe-4b4d-b9a4-5bf731958ed3/image.png)

- product 부분도 공통으로 사용하는 부분(ship) 으로 묶어준뒤 하위클래스를 각각 구성해준다.

![](https://velog.velcdn.com/images/wnsqud70/post/78702745-4456-4007-82d6-b51e9947e1e6/image.png)


- 호출하는 부분도 공통프로세스 부분을 추출해줬다.


### 팩토리메서드 -실무


![](https://velog.velcdn.com/images/wnsqud70/post/9fa010b7-110d-41c1-8283-6a9962854779/image.png)


1. 단순핸 팩토리 버전 
-> 매개변수의 값에 따라 도는 메소드에 각기 다른 인스턴스를 리턴하는 단순버전(주로 if-else문)



![](https://velog.velcdn.com/images/wnsqud70/post/e7fa0721-e5c6-47d4-a498-9efe98a1f628/image.png)

2. 스프링 BeanFactory
-> Object타입의 Product를 만드는 **BeanFactory**라는 Creator


### 결론
> creator(factory) 와 product간의 관계가 느슨해야 OCP(확장에 열려있고 변경에는 닫혀있는) 에 가까워진다.

