# Android Camera & Image Processing (Java)

## 📌 프로젝트 개요
본 프로젝트는 **Android Studio(Java)** 환경에서 카메라 기능을 구현하고,  
촬영된 이미지를 대상으로 **기본적인 이미지 처리(Image Processing)** 를 수행한 개인 학습 프로젝트입니다.

안드로이드 카메라 API의 동작 방식과 이미지 처리 흐름을 이해하는 것을 목표로 하였으며,  
신입 개발자로서 **기능 구현 → 처리 로직 분리 → 코드 구조화**에 집중했습니다.

---

## 🛠 사용 기술
- Language: **Java**
- Platform: **Android Studio**
- Android API: Camera / Bitmap
- Image Processing: Pixel 접근 기반 처리

---

## ✨ 주요 기능

### 1. 카메라 촬영 기능
- Android Camera API를 활용하여 사진 촬영
- 촬영된 이미지를 Bitmap 형태로 변환하여 처리 가능하도록 구성

### 2. 이미지 흑백 변환
- RGB 값을 직접 추출하여 Grayscale 처리
- 픽셀 단위 연산을 통해 명도 기반 흑백 이미지 생성

### 3. 노이즈(잡음) 제거
- 인접 픽셀 평균값을 활용한 간단한 Noise Reduction 처리
- 이미지 품질 개선 및 후처리 안정성 확보

### 4. 이미지 분류 기초 처리
- 픽셀 명도값을 기준으로 간단한 분류 기준 적용
- 이미지 처리 로직 분리로 확장 가능 구조 설계

---

## 🧩 코드 구조
Android-Camera-Image-Processing
┣ app
┃ ┣ CameraActivity.java # 카메라 촬영 및 화면 제어
┃ ┣ ImageProcessor.java # 이미지 처리 로직 분리
┃ ┗ MainActivity.java
┗ README.md


---

## 🧠 구현 포인트
- UI 로직과 이미지 처리 로직을 분리하여 가독성과 유지보수성 향상
- 픽셀 단위 연산을 직접 구현하여 이미지 처리 기본 원리 이해
- 단순 기능 구현이 아닌 **확장 가능한 구조**를 고려한 설계
- 카메라 촬영 후 Bitmap을 ImageProcessor로 전달하여 이미지 처리 로직을 분리함


---

## 🚀 향후 개선 방향
- OpenCV 연동을 통한 고급 이미지 처리 적용
- 카메라 권한 및 예외 처리 강화
- 다양한 필터 기능 추가

---

## 👤 작성자
- 김예은  
- Software / Android & QA Background
