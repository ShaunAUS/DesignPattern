# 빌더패턴란

![](https://velog.velcdn.com/images/wnsqud70/post/86ed4eed-3f88-4504-8b9f-69588b4dde9d/image.png)

- **동일한 프로세스**를 거쳐 **다양한 구성의 인스턴스**를 만드는 방법

- (복잡한) 객체를 만드는 프로세스를 독립적으로 분리할 수 있다.

![](https://velog.velcdn.com/images/wnsqud70/post/62dd1d53-3656-42ec-a406-de4bc812135d/image.png)

# 빌더패턴

![](https://velog.velcdn.com/images/wnsqud70/post/23abff1e-5c4c-405b-9766-7870f8a62823/image.png)

- 클래스에서 필드들이 많으면 인스턴스를 생서할때나 생성자를 좀 더 다양하게 만들때 코드들이 복잡해지는 문제가 발생한다. 

![](https://velog.velcdn.com/images/wnsqud70/post/a9b0b0f9-eced-4b8a-864e-f561891f0598/image.png)

- 인터페이스를 만들어 각각 **필드값들을 매개변수로 받는 메서드**들을 생성해준다.

- 마지막 메서드에서는 각각의 메서드들로** 만들어진 인스턴스를 검증** 한다.

![](https://velog.velcdn.com/images/wnsqud70/post/445629fd-378c-4ac8-ab76-ca163e3ce13b/image.png)

![](https://velog.velcdn.com/images/wnsqud70/post/b704f823-93c2-4b45-b0f0-1274e693d186/image.png)

![](https://velog.velcdn.com/images/wnsqud70/post/5bf3dcc8-a36d-46f0-b303-6f79be1657da/image.png)

![](https://velog.velcdn.com/images/wnsqud70/post/39dc3b6e-e7e1-4c87-a951-257af98c254b/image.png)





- 빌더 패턴을 사용해 원하는 인스턴스를 자유자재로 만들수 있다. **빌더패턴을 사용하지 않고 생성자로만 만들었으면 그만큼 생성자가 많아져 코드의 복잡도가 높아지고(생성자는 이름을 바꾸지 못하니 헷갈림) 사용하지 않는 필드값들도 null을 넣어줘야 하는 문제가 발생**

- 빌더패턴으로 묶어준 코드들중 반복되는 코드를 메서드 추출로 한번더 TourDirector 로 감싸준다.

# Pros/Cons
Pros
- 만드릭 복잡한 객체를 순차적으로 만들수 있다
- 복잡한 객체를 만드는 과정을 숨 수 있다 (캡슐화)
- 불완전한 객체를 사용하지 못하도록 방지가능 ( 마지막 getMethod)
- 동일한 프로세스를 통해 각기 다르게 구성된 객체를 만들수 있다.

Cons
- 복잡성 증가
- 원하는 객체를 만들려면 빌더부터 만들어야함


# 프로토타입 패턴

- 디비에서 혹은 네트워크를 통해서 가져온 인스턴스를 생성해야 하는경우 반복되면 리소스낭비가 심하다. 그런 방법대신에 복사를 해서 새로운 인스턴스를 만들고 그인스턴를 우리가 원하는대로 변경만해서 사용하면 훨씬 효율적으로 사용 가능하다

![](https://velog.velcdn.com/images/wnsqud70/post/c76ab473-2972-4beb-af6d-230707d52466/image.png)


- 복제 기능을 가지고 있는 **기존 인스턴스를 프로토타입을 사용**해서 **새로운 인스턴스**를 만들 수 있다.
![](https://velog.velcdn.com/images/wnsqud70/post/0aa2f94d-dad7-456e-bfa5-6fca213b5d0f/image.png)


- 기존 인스턴스를 사용해서 새로운 인스턴스를 만들때 반복되는 코드들이 많다. 


![](https://velog.velcdn.com/images/wnsqud70/post/95bdab6f-e004-4d95-975b-48fc753e9619/image.png)

- 새로운 인턴스라 **주소값은 다르지만 클론객체라 안쪽 내용은 같아야한다**.
### 프로토타입 패턴 실습

![](https://velog.velcdn.com/images/wnsqud70/post/3e4019e0-b3c9-4320-94d6-5d7aac0f944b/image.png)


1. **clone()** 를 사용하려면 사용하려는쪽에서 **cloneable 를 구현**해야 한다.

![](https://velog.velcdn.com/images/wnsqud70/post/0a6e337b-0510-4823-bdb1-1ca976de53a8/image.png)

2. clone method를 기본형식으로 오버라이드한뒤 바로 사용 가능하다.  앞서 말했듯이 **clone과 진짜 인스턴스의 주소는 달라야하며, 하지만 내용은 같아야한다.** 위 코드 경우에는 셋다 true가 나와야함
![](https://velog.velcdn.com/images/wnsqud70/post/eaffc62f-3f9e-4e6b-94f1-0a9efb322d48/image.png)


3. 기본적으로 자바에서 제공하는 clone()는 **얕은복사가 디폴트 값**이다. 즉 clone된 객체에 있는 repository는githubIssue에 들어있는 **같은repository를 가르킨다.** 원본 내용이 바뀌면 clone내용도 바뀜( 같은 객체를 가르키니까)

![](https://velog.velcdn.com/images/wnsqud70/post/c4455652-48cd-449d-a664-14eb2f1d884a/image.png)


4. override 한 clone()를 **깊은복사로 바꿔줄수 있다.** 깊은복사는 같은 객체를 가르키는것이 아니고 서로 다른 객체를 가르키기때문에 변동사항에대해 영향을 받지 않는다.


=> 객체생성이 복잡하고 길면 clone을 사용해주자!


# Pros/Cons
Pros
- 복잡한 객체 생성과정을 숨길수 있다.
- 기존 방식으로 인스턴스를 만드는것보다 메모리를 절약할수 있다.


Cons

- 순환참조가 있는경우 과정자체가 더 복잡해질수 있다.



