# 빌더패턴란

![](https://velog.velcdn.com/images/wnsqud70/post/86ed4eed-3f88-4504-8b9f-69588b4dde9d/image.png)

- **동일한 프로세스**를 거쳐 다양한 구성의 인스턴스를 만드는 방법

- (복잡한) 객체를 만드는 프로세스를 독립적으로 분리할 수 있다.

![](https://velog.velcdn.com/images/wnsqud70/post/62dd1d53-3656-42ec-a406-de4bc812135d/image.png)

# 빌더패턴

![](https://velog.velcdn.com/images/wnsqud70/post/23abff1e-5c4c-405b-9766-7870f8a62823/image.png)

- 클래스에서 필드들이 많으면 인스턴스를 생서할때나 생성자를 좀 더 다양하게 만들때 코드들이 복잡해지는 문제가 발생한다. 

![](https://velog.velcdn.com/images/wnsqud70/post/a9b0b0f9-eced-4b8a-864e-f561891f0598/image.png)

- 인터페이스를 만들어 각각 필드값들을 매개변수로 받는 메서드들을 생성해준다.

- 마지막 메서드에서는 각각의 메서드들로 만들어진 인스턴스를 검증 한다.

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

