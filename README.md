# BinPacking
#### 근사알고리즘_통채우기 문제

가방채우기 문제와 비슷한 근사알고리즘 문제 중 통 채우기 문제이다.<br/>

총 4가지 적합방법으로 최초적합(`First Fit`), 다음적합(`Next Fit`), 최선적합(`Best Fit`), 최악적합(`Worst Fit`) 이 있다.<br/>

* 최초적합(`First Fit`) 
  * 맨 앞에 있는 통부터 채우는 방식
* 다음적합(`Next Fit`)
  * 새로운 물건이 들어오면 최근에 넣었던 통의 빈 자리를 확인, 만약 빈 자리가 없을 경우 새로운 통에 넣는 방식
* 최선적합(`Best Fit`)
  * 가장 빈 공간이 적은 통부터 채우는 방식
* 최악적합(`Worst Fit`) 
  * 가장 빈 공간이 많은 통부터 채우는 방식

<br/>

### 예제문제

입력: items : [7, 5, 6, 4, 2, 3, 7, 5] 가 들어갈 경우,

각 적합방식 별 통의 상황

결과: 

* 최초적합(`First Fit`) 

  ![](https://github.com/lgm1007/BinPacking/blob/master/ResultIMG/FirstFit.JPG?raw=true)

* 다음적합(`Next Fit`)

![](https://github.com/lgm1007/BinPacking/blob/master/ResultIMG/NextFit.JPG?raw=true)

* 최선적합(`Best Fit`)

![](https://github.com/lgm1007/BinPacking/blob/master/ResultIMG/BestFit.JPG?raw=true)

* 최악적합(`Worst Fit`) 

![](https://github.com/lgm1007/BinPacking/blob/master/ResultIMG/WorstFit.JPG?raw=true)