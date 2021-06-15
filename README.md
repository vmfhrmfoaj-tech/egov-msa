[표준프레임워크] MSA 적용 개발 가이드 따라잡기
=====================

[전자정부프레임워크 MSA적용개발 가이드](https://www.egovframe.go.kr/home/ntt/nttRead.do?menuNo=76&bbsId=171&nttId=1809) 를 참고하여 MSA를 알아보고자 함.

참고문서 : [표준프레임워크]MSA_적용_개발_가이드_v1.2.0.pdf


```sh
# catalog : ui service project
cd ./catalog 

# run - http://localhost:8081/
./mvnw spring-boot:run

# api test - /catalogs/customerinfo/{id}
# eg) http://localhost:8081/catalogs/customerinfo/347
```


```sh
# customers : api service project
cd ./customers 

# run - http://localhost:8082/
./mvnw spring-boot:run

# api test - /customers/{id}
# eg) http://localhost:8082/customers/7865
```

a
b