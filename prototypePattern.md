# 프로토타입 패턴

- 디비에서 혹은 네트워크를 통해서 가져온 인스턴스를 생성해야 하는경우 반복되면 리소스낭비가 심하다. 그런대신에 복사를 해서 새로운 인스턴스를 만들고 그인스턴를 우리가 원하는대로 변경만해서 사용하면 훨씬 효율적으로 사용 가능하다

![](https://velog.velcdn.com/images/wnsqud70/post/c76ab473-2972-4beb-af6d-230707d52466/image.png)


- 복제 기능을 가지고 있는 **기존 인스턴스를 프로토타입을 사용**해서 **새로운 인스턴스**를 만들 수 있다.
![](https://velog.velcdn.com/images/wnsqud70/post/0aa2f94d-dad7-456e-bfa5-6fca213b5d0f/image.png)


- 기존 인스턴스를 사용해서 새로운 인스턴스를 만들때 반복되는 코드들이 많다. 


![](https://velog.velcdn.com/images/wnsqud70/post/95bdab6f-e004-4d95-975b-48fc753e9619/image.png)

- 새로운 인턴스라 주소값은 다르지만 클론객체라 안쪽 내용은 같아야한다.


WIP
