# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 1단계 - 문자열 사칙 연산 계산기
### 체크리스트
- [ ] 문자열을 입력 받는다.
  - [ ] 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다.
  - [ ] 입력 값이 null이거나 빈 공백 문자열일 경우 IllegalArgumentException 예외를 던진다.
  - [ ] 사칙연산(`+,-,*,/`)이 와야할 자리에 사칙연산 기호가 아닌 다른 문자열이 입력되는 경우 IllegalArgumentException 예외를 던진다.
  - [ ] 숫자가 와야할 자리에 숫자가 아닌 다른 문자열이 입력되는 경우 IllegalArgumentException 예외를 던진다.
    - 숫자라는 개념이 모호해서 양의 정수값만을 입력할 수 있다고 가정.
  - [ ] 사칙연산은 문자열로 입력받은 연산자 순서에 따라 계산 순서가 결정된다.
- [x] 덧셈 기능을 구현한다.
- [x] 뺄셈 기능을 구현한다.
- [x] 곱셈 기능을 구현한다.
- [ ] 나눗셈 기능을 구현한다.
  - [ ] 나눗셈에 대한 몫은 정수로 떨어지는 값으로 한정한다.
  - [ ] 0으로 나눌 시 IllegalArgumentException 예외를 던진다.
- [ ] 결과 값을 출력한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)