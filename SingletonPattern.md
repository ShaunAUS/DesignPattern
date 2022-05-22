# 싱글톤 패턴

 <싱글톤 패턴 규칙>
1. **인스턴스를 오직하나만** 만들며,  **new 사용 x**
2. 그 **인스턴스에 글로벌하게 접근할수 있는 방법을 제공**해야함

![](https://velog.velcdn.com/images/wnsqud70/post/accb1d3f-a91e-4c91-b155-049ceb28dafc/image.png)

- New 를사용하면 안됌   
=>**private 생성자. **  (아무데서나 막 호출하면 안돼니까)

![](https://velog.velcdn.com/images/wnsqud70/post/7c2c5323-ca15-4797-acf9-984dc3603845/image.png)

- 글로벌 접근 
=> **static 메서드 안에 private 생성자를 만들자**

- 하지만 new를 사용함으로 생성할떄마다 서로 다른 인스턴스가 나오므로 규칙 1을 위반함

![](https://velog.velcdn.com/images/wnsqud70/post/cb379f83-84d9-4111-9c4e-fbb5eb6a4f95/image.png)


- instance가 없다면, 즉 만들어 지지 않았다면 새로 만들고 아니면(기존 인스턴스가 존재하면) 그 인스턴스를 반환함. 
-> 매번 같은 인스턴스 반환

- 하지만 **이 방식은 우리가 주로 사용하는 웹 애플리케이션에서 주로 사용하는 멀티쓰레드 방식에서 큰 오점이 있다.**

- If 문 조건검사에서 쓰레드 1 이  통과되고 새로운 인스턴스를 만드는 그 순간에 쓰레드2가 if 조건문을 통과해 똑같이 인스턴스를 만들수 있다.  쓰레드 1, 쓰레드 2가 각각 다른 스레드들을 생성한다.


## 해결방법


### 방법1 .Synchronized
![](https://velog.velcdn.com/images/wnsqud70/post/e3226c0f-8fed-4a7a-b0a9-0792ba51d0cf/image.png)

- Synchronized 명령어사용 = **하나의 쓰레드만 들어오도록 허락함. **
  >문제점: 호출시 매**번 동기화 떄문에 성능저하도 생김**

![](https://velog.velcdn.com/images/wnsqud70/post/c40e6ae6-3192-444b-9f9d-ec470b08a998/image.png)


### 방법 2. 이른 초기화

- **성능에 좀더 신경쓰고 싶고 인스턴스를 나중에 만들 필요가 없다고 생각하면** 이른초기화 방법 사용

- “이른 초기화” 방법으로 **초기화시 아예 인스턴스를 생성해서 주입**시킴. 
-> **여러쓰레드가 와도 바로 초기화된 인스턴스를 반환하기떄문에** 틈이 다른쓰레드들이 들어올 틈이 없다.

> - **문제점:** 이 방법은 초기화시 인스턴스를 생성함으로 인스턴스 비용과 사용여부 (만들어놓고 사용 x) 을 고려해야함

그래서 사용이 될떄만들면서 synchronized 사용하기 싫을때는??
 
 ### 방법 3.Double checked locking

![](https://velog.velcdn.com/images/wnsqud70/post/6be3e18d-d667-4a2e-8dcb-809c7ed1eebe/image.png)

- If문 안쪽에 **synchronized 코드를 통해 한번더 검사**해준다

- 쓰레드 1 이 if문 통과 ->synchronized 진입 , 그때 쓰레드 2도 if문을 통과했지만 synchronized 코드 때문에 그 안으로는 들어갈수없고 대기

- 그사이 쓰레드 1이 인스턴스를 만들고 반환, 쓰레드 2는 이제서야 진입하지만 이미 인스턴스가 만들어 져있음으로 인스턴스 반환 

- 이 방법은 매번 메서드 호출시 synchronized를 사용하지 않는다 if문 =(인스턴스가 존재하는경우)

> - 문제점:복잡함

잠깐! volatile이란?

> **Volatile**
- volatile로 선언된 변수가 있는 코드는 최적화되지 않는다.
- volatile 키워드는 변수를 'Main Memory에 저장하겠다'라고 명시하는 것이다.
- 변수의 값을 Read할 때마다 CPU cache에 저장된 값이 아닌, Main Memory에서 읽는 것이다.
- 또한 변수의 값을 Write할 때마다 Main Memory에 작성하는 것이다.

### 방벙4. static inner class 
![](https://velog.velcdn.com/images/wnsqud70/post/40fa48e7-a51b-476a-ae15-a8b082b93c63/image.png)


- 안전하면서도 방법3처럼 복잡하지 않음

- **메서드 호출시 인스턴스를 만들**기 떄문에 레이지 로딩도 가능함 / **가장 간단해서 권장하는 방법중 하나이다.**

- 필요할때만 호출가능 + 간편함 +static 글로벌 접근 + final




 WIP
