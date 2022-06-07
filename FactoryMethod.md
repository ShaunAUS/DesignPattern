# 팩토리메서드

- 어떤 인스턴스를 만들지는 **서브 클래스**가 정한다.

- **확장에는 열려있고 변경에는 닫혀있는 구조로 만들어보자**

- 저번에 Refactoring에서 했던 방식과 매우 흡사함

![](https://velog.velcdn.com/images/wnsqud70/post/756da572-ee89-4186-85a4-7dad8216a061/image.png)



![](https://velog.velcdn.com/images/wnsqud70/post/e626c43c-c39e-430e-8011-fadfc7418aea/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/f0bb17bc-432a-493d-ae2f-3dc241627e45/image.png)

- 예제는 ship을 만드는 공장이 있고 점점 확장해 나가는 예제이다.

- ship을 만드는 과정의 코드들이 **한곳에 다** 모여있다.(orderShip)

- 이렇게 코드가 작성되면 **변경이 있을경우 서로에게 영향을 주며 변경이 있을때마다 코드들을 전체 수정을 해줘야한다.**

- 좀더 서로 **독립적**면서 나중에 **확장성**을 생각하며 만들어보자.

![](https://velog.velcdn.com/images/wnsqud70/post/69375ece-5e31-4b13-945f-9faebf5efcaf/image.png)


- interface에서 default와 private 메서드에 집중해주자. 

> -  둘다 **하위클래스에서 공통으로 사용**되는것을 미리 구현해놓는다는 공통점이 있지만 **default는 하위클래스에서 바로 사용가능 ** 
- **private 는 하위클래스에서 오버라이드,그리고 메서드 사용불가** 라   **default메서드를 통해서 접근**하도록 만들어 줬다.

- **private메서드를 사용하지 않을거면** 인터페이스와 하위클래스 사이에 추상클래스를 하나 더 넣어줘서 공통된 메서드를 구현 해주고 그 클래스를 하위클래스들이 상속 받도록 한다.

![](https://velog.velcdn.com/images/wnsqud70/post/82244684-4ccc-409c-a678-60a0300506e5/image.png)
![](https://velog.velcdn.com/images/wnsqud70/post/b4791a9f-1fee-4779-8302-568f1ac8dc52/image.png)


- 공통으로 사용되는 값들을 interface로 묶어준다

![](https://velog.velcdn.com/images/wnsqud70/post/3c620355-ef60-4323-9306-0ed346a056b5/image.png)

![](https://velog.velcdn.com/images/wnsqud70/post/02e15e22-23fe-4b4d-b9a4-5bf731958ed3/image.png)

- product 부분도 공통으로 사용하는 부분(ship) 으로 묶어준뒤 하위클래스를 각각 구성해준다.

![](https://velog.velcdn.com/images/wnsqud70/post/78702745-4456-4007-82d6-b51e9947e1e6/image.png)


- 호출하는쪽 공통프로세스 부분도 추출해줬다.


### 팩토리메서드 -실무


![](https://velog.velcdn.com/images/wnsqud70/post/9fa010b7-110d-41c1-8283-6a9962854779/image.png)


1. 단순핸 팩토리 버전 
-> 매개변수의 값에 따라 도는 메소드에 각기 다른 인스턴스를 리턴하는 단순버전(주로 if-else문)



![](https://velog.velcdn.com/images/wnsqud70/post/e7fa0721-e5c6-47d4-a498-9efe98a1f628/image.png)

2. 스프링 BeanFactory
-> Object타입의 Product를 만드는 **BeanFactory**라는 Creator


### 결론
> creator(factory) 와 product간의 관계가 느슨해야 OCP(**확장에 열려있고 변경에는 닫혀있는**) 에 가까워진다.



# 추상팩토리패턴
![](https://velog.velcdn.com/images/wnsqud70/post/c7fc631f-27ad-44df-8e9a-fb0b9b532a6e/image.png)



- 팩토리메서드 방법과 매우 흡사하지만 좀더 **client**에 초점을 맞춘 방법.

- 구체적으로 **어떤 인스턴스를 사용하는지 감출수 있다.**

![](https://velog.velcdn.com/images/wnsqud70/post/271e5072-3636-4a7b-a648-5f5fa081fcbd/image.png)

- ** 구체적인 인스턴스를 받는 부분도 문제**가 될수있다. 시간이 지남에 따라 기능이 추가됨에따라 이러한 **인스턴스 또한 다양하게 바뀔가능성이 있으며 그로인해 전체적인 코드가 변경될수있다.**

- 좀더 변경에 유연하게 바꿔보자


![](https://velog.velcdn.com/images/wnsqud70/post/2b37d2d5-bd7e-4dfd-97fd-d61a29582775/image.png)

- 먼저 추상팩토리를 만들어 준다. (Creator)


![](https://velog.velcdn.com/images/wnsqud70/post/a42deab8-ce57-4824-8fdc-af5018bddbff/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/06b0e1ca-d85e-42d9-a8ba-f158c3bf1fa7/image.png)



![](https://velog.velcdn.com/images/wnsqud70/post/ab453e74-c698-4af7-81b7-aa4ef9f9b2bd/image.png)

- 추상팩토리에 걸맞게 product inerface를 구현하는 클래스도 만들어준다. 이전에 했던 Creator-product 패턴 방법과 흡사하다.

![](https://velog.velcdn.com/images/wnsqud70/post/3cdf2b1d-b949-446d-a616-f8e1ff81f274/image.png)



- 인스턴스를 직접 호출하는 부분을 인터페이스를 통해 호출하는 코드로 변경해준다.  이제 이부분은 변경사항이 있어도 수정되지 않는다.


![](https://velog.velcdn.com/images/wnsqud70/post/434335b7-3f1c-425b-b3a4-a2132ce99ecd/image.png)
![](https://velog.velcdn.com/images/wnsqud70/post/3b9ebfa2-b11e-4008-8499-3804f8637aee/image.png)

![](https://velog.velcdn.com/images/wnsqud70/post/db723cb9-e163-4573-a4b6-e12d01d99222/image.png)


- 예제처럼 pro라는 Product들이 **추가,확장**되어도 그에 걸맞는 factory(creator)클래스만 만들어주면 된다. 이렇게 **확장을해도 기존 whiteShipFacotry에는 코드수정이 없다.**


### **결론**

> - 클라이언트 입장에서는 **concreate 클래스를 직접호출해 인스턴스를 호출하지 않고 interface(facotry)를 통해 호출**한다.

# 팩토리메서드 vs 추상팩토리패턴
### 팩토리메서드
- **팩토리를 구현하는 방법**에 초점을 둔다
- **구체적인 객체 생성 과정을 하위 또는 구체적인 클래스로 옮기는 것**이 목적.

### 추상팩토리 패턴
- 추상 팩토리 패턴은 **팩토리를 사용하는 방법**에 초점을 둔다
- **관련있는 여러 객체를 구체적인 클래스에 의존하지 않고 만들 수 있게 해주는 것이 목적**.

### 결론
 둘다 객체 만드는 과정을 추상화 했다는 점은 같지만 **팩토리메서드** 같은 경우는 **객체를 만드는 과정**에 조금더 집중해있고 **추상팩토리패턴**은 조금더 사용하는쪽, **클라이언트쪽의 관점**에서 본다.
 
 

> 즉 디자인패턴은 서로서로 어느정도 비슷비슷하다. **보는 관점이 다를뿐**

## 스프링-팩토리패턴/추상팩토리 패턴

=> 실제 우리가 사용하는 스프링에서도 이러한 방법을 찾아볼수 있다. FactoryBean에 우리가 object를 bean으로 등록해주면 스프링에서 처리를 해주고 우리가 그 objcet를 주입해 사용하는 과정이 매우 흡사함.

=> 스프링 내부코드는 변경되지 않고 직접적인 변화부분(우리가 코드를 작성해 bean 으로 등록) 해주는 부분만 변경해주면 전체코드가 바뀌는 점을보면 지금까지 배웠던 OCP에 매우 가깝다는점을 알수있다.


