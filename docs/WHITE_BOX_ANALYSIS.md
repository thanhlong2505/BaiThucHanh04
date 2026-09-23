# Phân tích kiểm thử hộp trắng

## 1. Rectangle

### `perimeter` / `area`
- Câu lệnh: kiểm tra dữ liệu, sau đó thực hiện công thức.
- Nhánh điều kiện:
  - Kích thước âm.
  - Kích thước không âm.
- Đường xử lý chính:
  - Dữ liệu hợp lệ -> tính kết quả.
  - Dữ liệu không hợp lệ -> ném `IllegalArgumentException`.

## 2. QuadraticEquation

### `solve`
Các nhánh:
1. `a == 0`
2. Khi `a == 0`, tiếp tục xét `b == 0`
3. `delta > 0`
4. `delta == 0`
5. `delta < 0`

Các đường xử lý chính:
- Phương trình bậc nhất.
- `a=b=0` -> lỗi.
- Phương trình bậc hai có hai nghiệm thực.
- Phương trình có nghiệm kép.
- Phương trình vô nghiệm thực.

## 3. DaysInMonth

Các nhánh:
- Tháng ngoài [1,12] -> lỗi.
- Tháng 2 -> xét năm nhuận.
- Tháng 4,6,9,11 -> 30 ngày.
- Các tháng còn lại -> 31 ngày.
- `isLeapYear` kiểm tra điều kiện chia hết cho 400 hoặc chia hết cho 4 nhưng không chia hết cho 100.

## 4. PrimeChecker

Các nhánh:
- `n < 2`.
- Vòng lặp kiểm tra ước.
- Nếu tìm thấy ước -> `false`.
- Nếu không tìm thấy -> `true`.

Các test sử dụng số nhỏ, số hợp và số nguyên tố để đi qua các nhánh trên.

## 5. AlternatingSum

Các nhánh:
- `n < 1` -> lỗi.
- Vòng lặp `i <= n`.
- `i` lẻ -> cộng.
- `i` chẵn -> trừ.

## 6. Gcd

Vòng lặp Euclid:
- `b != 0` -> tiếp tục tính phần dư.
- `b == 0` -> kết thúc và trả về UCLN.

Có test với số 0 và số âm để kiểm tra biên.

## 7. FactorialSum

### `factorial`
- `n < 0` -> lỗi.
- Vòng lặp từ 2 đến n.
- `n=0` hoặc `n=1` -> vòng lặp không thực hiện.
- `n>=2` -> vòng lặp thực hiện.

### `calculate`
- `n < 1` -> lỗi.
- Vòng lặp tính tổng.
- Mỗi vòng gọi `factorial(i)`.

## 8. Mục tiêu coverage

Mục tiêu của bộ test:
- Bao phủ các câu lệnh thực thi.
- Bao phủ các nhánh điều kiện chính.
- Bao phủ vòng lặp với cả trường hợp không chạy và có chạy.
- Bao phủ các giá trị biên.
- Bao phủ các đường xử lý lỗi được thiết kế trong chương trình.

Sau khi chạy:

```bash
mvn clean test
```

JaCoCo tạo báo cáo tại:

```text
target/site/jacoco/index.html
```

Dùng báo cáo này để chụp ảnh làm minh chứng coverage.
