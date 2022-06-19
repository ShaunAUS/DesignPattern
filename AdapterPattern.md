# 어댑터패턴

![](https://velog.velcdn.com/images/wnsqud70/post/02fd4f11-c6ba-4fe2-8d30-42a9ea33c759/image.png)


- **기존 코드**를 **adapter**이란것을 통해 **클라이언트가 사용하는 인터페이스의 구현체**로 바꿔주는 패턴

- **클라이언트가 사용하는 인터페이스를 따르지 않는 기존 코드를 재사용할수 있게 도와줌**




![](https://velog.velcdn.com/images/wnsqud70/post/dea29cb3-fd55-455c-8ff0-6a60da37a303/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/f238bf7a-62ff-4095-8eb1-4ed2ba757d6b/image.png)



- security 패키지가 제공하는 UserDetails 인터페이스와 어플리케이션에 따라 달라지는 Account Class가 있다.

- **UserDetails 인터페이스는 다른 어플리케이션에서도 사용 가능 하지만 Account클래스는 해당 어플리케이션에서만 사용하는 용도임.**

- **Account클래스는 = Adaptee 에 해당하고 UserDetails는  Target인터페이스에 해당**

- Adaptee와 TargetInterface 를 연결해주는 Adapter를 구현해보자


![](https://velog.velcdn.com/images/wnsqud70/post/2f839e09-fb44-467a-861e-51654f5ca0fc/image.png)


- AccountService 와 UserDetailService 의 만남의 장소를 만들어준다. 문제는 인터페이스를 구현한 반환타입이 UserDetails 이고 AccountService 를 통해 얻은 값의 반환타입도 Account

- Account -> UserDetails 로 바꿔주도록 로직을 만들어보자 


![](https://velog.velcdn.com/images/wnsqud70/post/814c0004-6098-4bec-a00e-409fb630b227/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/a8dc0ad8-4c82-4872-b2c3-c1b49c1bbe70/image.png)


- **Adapter에 해당하는 부분**. -> AccountUserDetails 는 UserDetails 인터페이스를 구현 하였기때문에 **그타입도 해당함.**

## 결론

- 코드에 손을 댈수 없는 상황 -> **별도의 클래스(Adapter)**를 만들거나 
![](https://velog.velcdn.com/images/wnsqud70/post/6711a7c2-d1ab-4167-b8a3-d74330b73235/image.png)

![](https://velog.velcdn.com/images/wnsqud70/post/53d9533d-4607-4384-8e06-7b66ea69cd15/image.png)

- 코드에 손을 댈수 있는 상황이면 이렇게 바로 구현해준다. 복잡도가 더 낮아진다는 장점이 있다.


## 장점/단점

**장점**: 기존 코드를 변경하지 않고 인터페이스 구현체를 만들어 재사용할수 있다.

**단점**: 클래스가 추가됨으로 코드의 복잡도가 높아진다.
