싱글톤 패턴
- 싱글톤 패턴 규칙
- 1,인스턴스를 오직하나만 만들며  new 사용 x
- 2,그 인스턴스에 글로벌하게 접근할수 있는 방법을 제공해야함

![](https://velog.velcdn.com/images/wnsqud70/post/accb1d3f-a91e-4c91-b155-049ceb28dafc/image.png)

- New 를사용하면 안됌   =>privatre 생성자. 

![](https://velog.velcdn.com/images/wnsqud70/post/7c2c5323-ca15-4797-acf9-984dc3603845/image.png)

- 글로벌 접근 => statifc 메서드 안에 private 생성자를 만들자
- 하지만 new를 사용함으로 생성할떄마다 서로 다른 인스턴스가 나오므로 규칙 1을 위반함
- 

![](https://velog.velcdn.com/images/wnsqud70/post/cb379f83-84d9-4111-9c4e-fbb5eb6a4f95/image.png)


- instance가 없다면, 즉 만들어 지지 않았다면 새로 만들고 아니면(기존 인스턴스가 존재하면) 그 인스턴스를 반환함. -> 매번 같은 인스턴스 반환
- 하지만 이 방식은 우리가 주로 사용하는 웹 애플리케이션에서 주로 사용하는 멀티쓰레드 방식에서 큰 오점이 있다.
- If 문 조건검사에서 쓰레드 1 이  통과되고 새로운 인스턴스를 만드는 그 순간에 쓰레드2가 if 조건문을 통과해 똑같이 인스턴스를 만들수 있다.  쓰레드 1, 쓰레드 2가 각각 다른 스레드들을 생성한다.

WIP
