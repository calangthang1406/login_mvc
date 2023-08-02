package model;

public class model {
    public static void main(String[] args) {
        String input = "715614:ca123:8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92:no";

        // Tìm vị trí của các dấu hai chấm trong chuỗi
        int firstColonIndex = input.indexOf(":");
        int secondColonIndex = input.indexOf(":", firstColonIndex + 1);

        if (firstColonIndex != -1 && secondColonIndex != -1) {
            // Tách chuỗi thành các phần
            String part1 = input.substring(firstColonIndex + 1, secondColonIndex);
            String part2 = input.substring(secondColonIndex + 1, input.length());

            System.out.println("Phần 1: " + part1);
            System.out.println("Phần 2: " + part2);
        } else {
            System.out.println("Chuỗi không hợp lệ");
        }
    }
}
