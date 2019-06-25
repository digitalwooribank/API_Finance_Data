# API_Finance_Data
금융데이터조회 API서비스 레파지토리





## Protocol Rule
우리은행 오픈API 연동 방식은 REST(Representational State Transfer) 방식에 따라 구현한다. HTTP Method 및 리소스에 대한 URL에 따라 Request와 Response 데이터 타입은 JSOM을 사용한다.
또한 HTTP 1.1 Spec 규격을 따른다.
### Resource URL
우리은행 오픈API 서비스의 Request URL은 다음과 같다.
```
{HTTP_METHOD} http(s)://{host}:{port}/{directory}/{anyResource}?{Query}
```

항목 | 설명 | 비교
---- | ---- | ----
http://{host}:{port} | Host Address와 port | 	
/{directory} | Resource | /api/v1
/{anyResource}?{Query} | {anyResource}: Logical resource <br> {Query}: Parameter | 

※ 모든 데이터는 URL Encoding하여 전송해야 한다.

### Resource URL
우리은행의 오픈API 서비스는 기본적으로 자원 요청에 의해 리턴 되는 JSON(Content-Type: application/json) 및 HTML(Content-Type: text/html) Type만 사용한다.

### HTTP Method를 통한 Request Action 매핑
목록 및 상세정보 제공은 GET HTTP Method를 사용하며 수정은 PUT, PATCH를 사용하고 생성은 POST를 사용하고 삭제는 DELETE HTTP Method를 이용한다.

HTTP Method | Action | 설명 | 비고
---- | ---- | ---- | ----
GET | Read | 리소스 획득 | 
PUT | Update/Modify | 리소스 변경 | 
POST | Create/New | 리소스 생성 | 
DELETE | Delete | 리소스 삭제 | 

※ 필요에 따라 HTTP Method는 변경될 수 있음.

### Request HTTP Header 형태
우리은행 오픈API는 등록된 사용자 여부를 확인 하기 위하여 “appKey”와 “secretKey”를 HTTP Header에 적용하여야 하며, 인증은 OAuth 2.0을 지원하고 있다.
```
GET /oap/wb/v2/oauth/tokencheck HTTP/1.1
…
Content-Type: Applicatin/x-www-form-urlencoded
appKey: <APP Key>
Authorization: Bearer <Access Token>
…
```

### 공통 Request 데이터 형태
우리은행 오픈API 호출 시 다음의 필드를 추가하여 정보를 보내야 한다.
Code	설명	필수
여부	Type	비고
dataHeader				
	UTZPE_CNCT_IPAD	이용자접속IP주소	Y	S(39)	
	UTZPE_CNCT_MCHR_UNQ_ID	이용자접속기기고유ID	Y	S(100)	
	UTZPE_CNCT_TEL_NO_TXT	이용자접속전화번호	Y	S(40)	
	UTZPE_CNCT_MCHR_IDF_SRNO	이용자접속기기식별일련번호	Y	S(20)	
	UTZ_MCHR_OS_DSCD	이용기기운영체계구분코드	Y	S(1)	
	UTZ_MCHR_OS_VER_NM	이용기기운영체계버전명	Y	S(20)	
	UTZ_MCHR_MDL_NM	이용기기모델명	Y	S(20)	
	UTZ_MCHR_APP_VER_NM	앱 버전	Y	S(20)	
dataBody				
	…				

### Response 데이터의 형태
JSON Format인 경우 다음과 같다 JSON tag의 순서는 연동규격에 작성된 순서와 다를 수 있다.
```
{
    “dataHeader”: {
        …
    },
“dataBody”: {
        …
    },
}
```






