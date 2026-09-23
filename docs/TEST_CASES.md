# Danh sách Test Case

| ID | Chức năng | Input | Expected |
|---|---|---|---|
| TC01 | Chu vi HCN | 3, 4 | 14 |
| TC02 | Diện tích HCN | 3, 4 | 12 |
| TC03 | Kích thước bằng 0 | 0, 3 | Chu vi 6, diện tích 0 |
| TC04 | Chiều dài âm | -1, 3 | IllegalArgumentException |
| TC05 | Chiều rộng âm | 3, -1 | IllegalArgumentException |
| TC06 | PT bậc 2, 2 nghiệm | a=1,b=-3,c=2 | x1=2, x2=1 |
| TC07 | PT bậc 2, nghiệm kép | 1,2,1 | x=-1 |
| TC08 | PT bậc 2, vô nghiệm thực | 1,0,1 | NO_REAL_ROOT |
| TC09 | a=0, PT bậc nhất | 0,2,-4 | x=2 |
| TC10 | a=b=0 | 0,0,5 | IllegalArgumentException |
| TC11 | Tháng 31 ngày | 1,2025 | 31 |
| TC12 | Tháng 30 ngày | 4,2025 | 30 |
| TC13 | Tháng 2 năm nhuận | 2,2024 | 29 |
| TC14 | Tháng 2 năm thường | 2,2025 | 28 |
| TC15 | Năm chia hết cho 400 | 2000 | Nhuận |
| TC16 | Thế kỷ không chia hết cho 400 | 1900 | Không nhuận |
| TC17 | Tháng không hợp lệ | 13,2025 | IllegalArgumentException |
| TC18 | n < 2 | 1 | false |
| TC19 | Số nguyên tố nhỏ nhất | 2 | true |
| TC20 | Hợp số chẵn | 4 | false |
| TC21 | Hợp số lẻ | 9 | false |
| TC22 | Số nguyên tố | 17 | true |
| TC23 | Tổng luân phiên n=1 | 1 | 1 |
| TC24 | Tổng luân phiên n chẵn | 4 | -2 |
| TC25 | Tổng luân phiên n lẻ | 5 | 3 |
| TC26 | n không hợp lệ | 0 | IllegalArgumentException |
| TC27 | UCLN thông thường | 48,18 | 6 |
| TC28 | UCLN với b=0 | 7,0 | 7 |
| TC29 | UCLN với a=0 | 0,5 | 5 |
| TC30 | UCLN số âm | -48,-18 | 6 |
| TC31 | UCLN cả hai bằng 0 | 0,0 | 0 |
| TC32 | 0! | 0 | 1 |
| TC33 | 5! | 5 | 120 |
| TC34 | Giai thừa số âm | -1 | IllegalArgumentException |
| TC35 | Tổng giai thừa n=1 | 1 | 1 |
| TC36 | Tổng giai thừa n=4 | 4 | 33 |
| TC37 | Tổng giai thừa n không hợp lệ | 0 | IllegalArgumentException |
