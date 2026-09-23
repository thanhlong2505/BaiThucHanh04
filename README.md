# Bài thực hành 03 – Kiểm thử hộp trắng

## 1. Mục tiêu

Cài đặt 8 bài toán bằng Java, tổ chức thành các phương thức riêng và xây dựng kiểm thử tự động bằng JUnit 5. Bộ kiểm thử được thiết kế để bao phủ các câu lệnh, nhánh điều kiện và các trường hợp biên quan trọng.

## 2. Danh sách bài

1. Tính chu vi hình chữ nhật
2. Tính diện tích hình chữ nhật
3. Giải phương trình bậc 2
4. Tính số ngày của một tháng
5. Kiểm tra số nguyên tố
6. Tính tổng `S = 1 - 2 + 3 - 4 + ... + n`
7. Tìm UCLN của `a` và `b`
8. Tính tổng `S = 1! + 2! + ... + n!`, có sử dụng hàm `factorial`

## 3. Công nghệ

- Java 17
- Maven
- JUnit 5
- JaCoCo

## 4. Cấu trúc thư mục

```text
white-box-java-junit/
├── pom.xml
├── README.md
├── docs/
│   ├── TEST_CASES.md
│   └── WHITE_BOX_ANALYSIS.md
├── src/
│   ├── main/java/com/gdragon/whiteboxtesting/
│   │   ├── Rectangle.java
│   │   ├── QuadraticEquation.java
│   │   ├── DaysInMonth.java
│   │   ├── PrimeChecker.java
│   │   ├── AlternatingSum.java
│   │   ├── Gcd.java
│   │   └── FactorialSum.java
│   └── test/java/com/gdragon/whiteboxtesting/
│       ├── RectangleTest.java
│       ├── QuadraticEquationTest.java
│       ├── DaysInMonthTest.java
│       ├── PrimeCheckerTest.java
│       ├── AlternatingSumTest.java
│       ├── GcdTest.java
│       └── FactorialSumTest.java
└── results/
    └── test-results.log
```

## 5. Chạy test

Mở terminal tại thư mục project:

```bash
mvn clean test
```

Xem báo cáo JaCoCo sau khi chạy:

```text
target/site/jacoco/index.html
```

Mở file `index.html` bằng trình duyệt.

## 6. Tạo package trên GitHub

Tên repository đề xuất:

```text
white-box-testing-java
```

Sau khi tạo repository, chạy:

```bash
git init
git add .
git commit -m "Initial commit: Java white-box testing with JUnit"
git branch -M main
git remote add origin https://github.com/<USERNAME>/white-box-testing-java.git
git push -u origin main
```

Thay `<USERNAME>` bằng GitHub username của em.

## 7. GitHub Issues

### Issue 1
Tiêu đề:

`Viết test JUnit kiểm thử hộp trắng cho các đường xử lý hợp lệ`

Nội dung có thể dựa trên `docs/WHITE_BOX_ANALYSIS.md` và `docs/TEST_CASES.md`.

### Issue 2
Tiêu đề:

`Viết test JUnit kiểm thử các nhánh lỗi, điều kiện biên, vòng lặp và trường hợp biên của vòng lặp`

Nội dung có thể dựa trên `docs/WHITE_BOX_ANALYSIS.md` và `docs/TEST_CASES.md`.

## 8. Lưu ý

Các phương thức có kiểm tra đầu vào sẽ ném `IllegalArgumentException` đối với dữ liệu không hợp lệ. Các test JUnit tương ứng dùng `assertThrows`.

Không đưa thư mục `target/` lên GitHub. Có thể tạo `.gitignore` như sau:

```gitignore
target/
.idea/
*.iml
.vscode/
```
