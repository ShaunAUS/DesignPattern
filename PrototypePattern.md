# 프로토타입 패턴

- 디비에서 혹은 네트워크를 통해서 가져온 인스턴스를 생성해야 하는경우 반복되면 리소스낭비가 심하다. 그런대신에 복사를 해서 새로운 인스턴스를 만들고 그인스턴를 우리가 원하는대로 변경만해서 사용하면 훨씬 효율적으로 사용 가능하다

![](https://velog.velcdn.com/images/wnsqud70/post/c76ab473-2972-4beb-af6d-230707d52466/image.png)


- 복제 기능을 가지고 있는 **기존 인스턴스를 프로토타입을 사용**해서 **새로운 인스턴스**를 만들 수 있다.
![](https://velog.velcdn.com/images/wnsqud70/post/0aa2f94d-dad7-456e-bfa5-6fca213b5d0f/image.png)


- 기존 인스턴스를 사용해서 새로운 인스턴스를 만들때 반복되는 코드들이 많다. 


![](https://velog.velcdn.com/images/wnsqud70/post/95bdab6f-e004-4d95-975b-48fc753e9619/image.png)

- 새로운 인턴스라 주소값은 다르지만 클론객체라 안쪽 내용은 같아야한다.

### 프로토타입 패턴 실습

![](https://velog.velcdn.com/images/wnsqud70/post/3e4019e0-b3c9-4320-94d6-5d7aac0f944b/image.png)


1. **clone()** 를 사용하려면 사용하려는쪽에서 **cloneable 를 구현**해야 한다.

![](https://velog.velcdn.com/images/wnsqud70/post/0a6e337b-0510-4823-bdb1-1ca976de53a8/image.png)

2. clone method를 기본형식으로 오버라이드한뒤 바로 사용 가능하다.  앞서 말했듯이 **clone과 진짜 인스턴스의 주소는 달라야하며, 하지만 내용은 같아야한다.** 위 코드 경우에는 셋다 true가 나와야함
![](https://velog.velcdn.com/images/wnsqud70/post/eaffc62f-3f9e-4e6b-94f1-0a9efb322d48/image.png)


3. 기본형식 으로 오버라이드 clone()는 **얕은복사가 디폴트 값**이다. 즉 clone된 객체에 있는 repository는githubIssue에 들어있는 **같은repository를 가르킨다.** 원본 내용이 바뀌면 clone내용도 바뀜( 같은 객체를 가르키니까)

![](https://velog.velcdn.com/images/wnsqud70/post/c4455652-48cd-449d-a664-14eb2f1d884a/image.png)


4. override 한 clone()를 **깊은복사로 바꿔줄수 있다.** 깊은복사는 같은 객체를 가르키는것이 아니고 서로 다른 객체를 가르키기때문에 변동사항에대해 영향을 받지 않는다.

WIP
