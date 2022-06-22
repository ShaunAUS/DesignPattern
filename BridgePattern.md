# 브릿지패턴

- **추상적인 것과 구체적인 것을 분리**하여 **연결**하는 패턴 

![](https://velog.velcdn.com/images/wnsqud70/post/93ad9adc-ada5-4dd0-afca-7b21ad84df51/image.png)

# 실습
![](https://velog.velcdn.com/images/wnsqud70/post/174013a6-17f4-4136-b443-ba258a979c40/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/7ab43561-a17d-42eb-9588-12ca6702432d/image.png)


- 코드에 대한 자세한 설명은 생략 하겠다. 중요한 포인트는 여기서 더 확장시키려고 한다면 똑같이 Champion을 구현하고 똑같은 방식으로 만들것이 분명하다.

- 중복된 코드도 많이 발생

**=> 하나의 구현체로 다양한 표현을 하려니 복잡해진다**

# 코드변경

![](https://velog.velcdn.com/images/wnsqud70/post/3480c552-5cd5-4a96-a2d7-494cb09f781e/image.png)

![](https://velog.velcdn.com/images/wnsqud70/post/05c804cf-70bf-4cba-81b7-5399a8cf8b6c/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/dad0f315-71f6-4716-bc70-8aec89eb6358/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/a7a3045f-8a8f-41d2-8b95-a3e35f341248/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/d3e6339d-7ef7-44a9-9431-9a2ad99840bc/image.png)


 - **공통된것을 최대한 묶어주고 최소한의 값만 입력받으면 변하도록(확장할수 있도록) 만들어준다**
 
 
 - 좀더 공통적인 부분을  묶어주고 (abstraction) 그 부분과 skin 부분을 나눠주고(implemetation 부분) 연결하는 BridgePattern 
 
 
 - 클라이언트는 추상적인 부분만 사용
 
 
 
 
 
#  장점/단점

**장점**
- 코드의 중복을 막을수 있다.

- **확장을 할때 구체적인 부분의 변화가 있어도 추상적인 부분(공통부분) 은 변화가 없다**

- 객체지향의 특징 OCP를 실현 할수 있다.

**단점**
- 코드의 복잡도가 높아짐.
