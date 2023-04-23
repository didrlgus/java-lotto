# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 1단계 - 문자열 사칙 연산 계산기
### 체크리스트
- [x] 문자열을 입력 받는다.
  - [x] 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다.
  - [x] 입력 값이 null이거나 빈 공백 문자열일 경우 IllegalArgumentException 예외를 던진다.
  - [x] 사칙연산(`+,-,*,/`)이 와야할 자리에 사칙연산 기호가 아닌 다른 문자열이 입력되는 경우 IllegalArgumentException 예외를 던진다.
  - [x] 숫자가 와야할 자리에 숫자가 아닌 다른 문자열이 입력되는 경우 IllegalArgumentException 예외를 던진다.
    - 숫자라는 개념이 모호해서 양의 정수값만을 입력할 수 있다고 가정.
  - [x] 사칙연산은 문자열로 입력받은 연산자 순서에 따라 계산 순서가 결정된다.
- [x] 덧셈 기능을 구현한다.
- [x] 뺄셈 기능을 구현한다.
- [x] 곱셈 기능을 구현한다.
- [x] 나눗셈 기능을 구현한다.
  - [x] 나눗셈에 대한 몫은 정수로 떨어지는 값으로 한정한다.
  - [x] 0으로 나눌 시 IllegalArgumentException 예외를 던진다.
- [x] 결과 값을 출력한다.
- [x] main 메서드 추가

## 2단계 - 로또
### 체크리스트
- [ ] 구입 금액을 입력 받는다.
  - [ ] 숫자가 아닌 다른 문자 입력 시 IllegalArgumentException 예외를 던진다.
  - [ ] 1000원 보다 적은 금액 입력 시 IllegalArgumentException 예외를 던진다.
  - [ ] 1000으로 나눠 떨어지지 않는 수를 입력 시 IllegalArgumentException 예외를 던진다.
- [ ] 로또를 몇개 구매했는지 계산한다.
- [ ] 로또를 몇개 구매했는지 출력한다.
  - [ ] `n개를 구매했습니다.` 문자열을 출력한다.
- [x] 구매한 만큼의 로또를 생성한다.
- [x] 로또 한개당 1~45까지의 숫자를 랜덤으로 6개 선택한다. (단, 하나의 로또에 숫자가 겹칠 수는 없다.)
- [ ] 숫자를 선택한 모든 로또 현황을 출력한다.
- [ ] 지난 주 당첨 번호를 입력한다.
  - [ ] 입력한 숫자는 `, `로 구분한다.
  - [ ] 숫자가 아닌 다른 문자 입력 시 IllegalArgumentException 예외를 던진다.
  - [ ] 6개의 숫자를 입력하지 않을 경우 IllegalArgumentException 예외를 던진다.
  - [ ] 1~45까지 숫자가 아닌 경우 IllegalArgumentException 예외를 던진다.
- [ ] 당첨 통계 문자열을 출력한다.
  - [ ] `당첨 통계` 문자열을 출력한다.
- [ ] 구분선 문자열을 출력한다.
  - [ ] `---------` 문자열을 출력한다.
- [x] 구매한 로또와 지난 주 당첨 번호를 비교해 몇개가 일치하는 지에 대한 갯수를 계산한다.
- [ ] 일치 통계를 출력한다. (단, `3개, 4개, 5개, 6개` 일치에 해당하는 경우만 일치하는 갯수를 출력한다.)
- [ ] 총 수익률을 계산한다.
  - [ ] 수익률은 당첨금액을 구입금액으로 나눈 값에서 소수 둘째자리까지만 계산한다.  
- [ ] 손익 여부를 계산한다.
  - [ ] 1을 기준으로 수익률과 비교해 손익 여부를 계산한다. 
- [ ] 총 수익률과 손익 여부에 맞는 문자열을 출력한다.
  - [ ] `총 수익률은 ~입니다.(기준이 1이기 때문에 결과적으로 ~라는 의미임)` 문자열을 출력한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)