# 📸 Android Camera & Image Processing Project(Java)

Android Studio 환경에서 **카메라 촬영 기능**과  
촬영된 이미지를 대상으로 **전처리(Image Processing)** 를 구현한 프로젝트입니다.  
카메라 API 활용과 이미지 처리 흐름을 이해하는 것을 목표로 진행하였습니다.

---

## 📌 프로젝트 개요

- **개발 목적**  
  Android 카메라 기능 구현을 통해 모바일 환경에서의  
  이미지 취득 및 전처리 과정 이해

- **개발 형태**  
  개인 프로젝트

- **개발 기간**  
  2023-12-21 ~ 2024-04-15

---

## 🛠 기술 스택

- **Language** : Java  
- **Platform** : Android  
- **IDE** : Android Studio  
- **API** : Android Camera API  
- **Image Processing** : Bitmap, Canvas, Color Matrix

---

## 🧩 주요 기능

### 1️⃣ 카메라 촬영 기능
- Android Camera API를 활용한 사진 촬영
- 촬영 후 이미지 저장 및 Bitmap 변환
- 카메라 권한(Permission) 처리

### 2️⃣ 이미지 전처리 기능
- 촬영된 이미지 Bitmap 로딩
- 색상 값(RGB) 조작을 통한 이미지 처리
- 노이즈 제거 및 명암 보정 등 기본 전처리 수행

### 3️⃣ 촬영 이미지 활용 흐름
- 카메라 촬영 → 이미지 저장
- 저장된 이미지 불러오기
- 전처리 적용 후 화면 출력

---

## 🗂 프로젝트 구조

Android-Camera-Image-Processing
├─ app
│ ├─ java
│ │ └─ com.example.camera
│ │ ├─ MainActivity.java
│ │ ├─ CameraActivity.java
│ │ └─ ImageProcessing.java
│ │
│ └─ res
│ ├─ layout
│ └─ drawable
│
└─ README.md


---

## 📊 구현 흐름 설명

- 카메라 권한 요청 및 승인 확인
- 카메라 실행 후 이미지 촬영
- 촬영 이미지 Bitmap 변환
- 픽셀 단위 접근을 통한 이미지 전처리
- 처리된 이미지 UI에 출력

---

## ✨ 프로젝트를 통해 배운 점

- Android Camera API의 동작 원리 이해
- Bitmap 기반 이미지 처리 방식 학습
- 모바일 환경에서의 메모리 관리 중요성 인식
- 기능 구현 전 흐름 설계의 중요성 체감

---

## 🙋‍♀️ 담당 역할

- Android 카메라 촬영 기능 구현
- 이미지 전처리 로직 설계 및 개발
- 전체 기능 흐름 설계 및 테스트
