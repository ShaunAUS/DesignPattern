# 컴포짓패턴

![](https://velog.velcdn.com/images/wnsqud70/post/b0685040-c687-484b-be7a-6e003f33db7a/image.png)


- **그룹 전체와 개별 객체를 동일하게 처리할 수 있는 패턴**

- 컴포넌트들의 공통된 인터페이스를 만들어주고 클라이언트는 이 인터페이스만 본다.

# 실습
![](https://velog.velcdn.com/images/wnsqud70/post/9f0ca2c0-21cc-4a5d-ba3f-a282b9b1e642/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/05042bf2-1cc4-43d1-b54c-4928b92235fc/image.png)

- 여기서 가장 큰 문제점은 **클라이언트 부분에서 너무 많은 정보를 알아야하며 메서드의 위치도 잘못됐다. **

- 이러한 문제점을 해결하기 위해 **컴포짓 패턴**을 사용해보자!

- **우리가 만들 bag 이나 item 들은 leaf 또는 composite 가 됀다**

> **leaf** = 가장 기본단위 

> **Composite** = leaf를 그룹으로 가져갈수 있는 compsite타입 객체
 -여러개의 component를 배열 ,list 로 가지고 있다.(**타입이 절대 leaf타입이 아닌 component 타입**)



![](https://velog.velcdn.com/images/wnsqud70/post/b07c4c6f-1861-4a16-b1a0-2fe399b71cd0/image.png)

- 일단 각각 컴포턴들의 **공통된 인터페이스**를 만들어 준다. 클라이언트 코드를 보면
공통된 부분은 가격을 구하는 부분이다.

![](https://velog.velcdn.com/images/wnsqud70/post/e9c97773-0435-4c22-bb20-a7830e7c3f5f/image.png)


![](https://velog.velcdn.com/images/wnsqud70/post/1d0358ce-6a84-4103-9fce-383882a3318e/image.png)

- **leaf 와 composite 에 해당하는 부분들은 공통된 인터페이스를 구현**하도록 만들어준다. 이때 주의해야할점은 **타입이 절대 leaf타입이 아닌 component타입!**

- 또한 이렇게 함으로써 clietn 부분에서는 쓸데없이 너무많은 정보를 알필요가 없다. 왜냐 각각 로직에 필요한 필드값을 사용하는 함수들은 각각의 클래스안에 있기때문




![](https://velog.velcdn.com/images/wnsqud70/post/ebcb72aa-1bbb-4e22-93d7-ca0ba991892a/image.png)
- 기존코드에서는 Bag과 Item 가격을 구하는 메서드가 각각 있었다면 이제는 그 둘을 **공통된 인터페이스로 묶어**줌으로써 두타입 모두 들어올수 있는 메서드를 만들어줬다.

- 두타입중 어떠한 타입으 들어와도 괜찮은 유연한코드이면서 동시에 코드양도 줄었다.

- 얼마든지 확장할수 있지만 Client코드는 변하지 않는다.(OCP)






