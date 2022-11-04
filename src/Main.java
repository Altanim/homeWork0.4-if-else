public class Main {
    public static void main(String[] args) {
        // Задание №1.1:
        System.out.println("Задание №1.1");
        int age = 12;
        if (age <= 0 || age > 120) {
            System.out.println("Некорректные данные");
        }
        if (age >= 18 && age <= 120) {
            System.out.println("Поздравляем, вам больше 18 лет!");
        }
        if (age < 18) {
            System.out.println("К сожалению, ваш возраст меньше 18, вам придется дождаться совершеннолетия.");
        }

        // Задание №1.2:
        System.out.println("\nЗадание №1.2");
        int age1 = 9;
        if (age1 <= 0 || age1 > 120) {
            System.out.println("Некорректные данные");
        }
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age1 >= 18 && age1 < 24) {
            System.out.println("Человек обучается в университете.");
        }
        if (age1 >= 24) {
            System.out.println("Человек ходит на работу.");
        }

        // Задание №1.3
        System.out.println("\nЗадание №1.3");

        int seats = 9; // занято сидячих мест
        int standing = 3; // занято стоячих мест

        int capacity = 102; // всего мест
        int seatsAmount = 60; // всего сидячих мест
        int standingAmount = capacity - seatsAmount; // всего стоячих мест
        if (seats < seatsAmount) {
            System.out.println("В вагоне есть " + (seatsAmount - seats) + " свободных сидчих мест.");
        }
        if (seatsAmount == seats) {
            System.out.println("В вагоне нет свободных сидячих мест.");
        }
        if (standing < standingAmount) {
            System.out.println("В вагоне есть " + (standingAmount - standing) + " свободных стоячих мест.");
        }
        if (standing >= standingAmount) {
            System.out.println("В вагоне нет свободных стоячих мест.");
        }

        // Задание №2.1
        System.out.println("\nЗадание №2.1");
        int age2 = 14;
        if (age2 <= 0 || age2 > 120) {
            System.out.println("Некорректные данные");
        }
        if (age2 < 18 && age2 > 0) {
            System.out.println("К сожалению, ваш возраст меньше 18, вам придется дождаться совершеннолетия.");
        } else if (age2 >= 18 && age2 <= 120) {
            System.out.println("Поздравляем, вам больше 18 лет.");
        }
        // Задание №2.2
        System.out.println("\nЗадание №2.2");
        int age3 = 27;
        if (age3 <= 0 || age3 > 120) {
            System.out.println("Некорректные данные");
        } else if (age3 >= 7 && age3 < 18) {
            System.out.println("Ребенок ходит в школу.");
        }
        if (age3 >= 18 && age3 < 24) {
            System.out.println("Человек обучается в университете.");
        } else {
            System.out.println("Человек ходит на работу.");
        }
        // Задание №2.3
        System.out.println("\nЗадание №2.3");

        int seats1 = 43; // занято сидячих мест
        int standing1 = 53; // занято стоячих мест

        int capacity1 = 102; // всего мест
        int seatsAmount1 = 60; // всего сидячих мест
        int standingAmount1 = capacity1 - seatsAmount1; // всего стоячих мест
        if (seats1 < seatsAmount1) {
            System.out.println("В вагоне есть " + (seatsAmount1 - seats1) + " свободных сидчих мест.");
        } else {
            System.out.println("В вагоне нет свободных сидячих мест.");
        }
        if (standing1 < standingAmount1) {
            System.out.println("В вагоне есть " + (standingAmount1 - standing1) + " свободных стоячих мест.");
        } else {
            System.out.println("В вагоне нет свободных стоячих мест.");
        }

        // Задание №3.1
        System.out.println("\nЗадание №3.1");
        int age4 = 66;
        if (age4 < 2 || age4 > 65) {
            System.out.println("Некорректные данные");
        }
        if (age4 >= 2 && age4 <= 6) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить в детский сад");
        } else if (age4 >= 7 && age4 < 18) {
            System.out.println("Если возраст человека равен " + age4 +
                    ", то ему нужно ходить в школу.");
        } else if (age4 >= 18 && age4 < 24) {
            System.out.println("Если возраст человека равен " + age4 +
                    ", то ему нужно ходить в университет.");
            
        } else if (age4 >= 24 && age4 < 66) {
            System.out.println("Если возраст человека равен " + age4 + ", то ему нужно ходить на работу.");
        }

        // Задание №3.2
        System.out.println("\nЗадание №3.2");
        int age5 = 9;
        boolean parents = true;
        if (age5 < 5) {
            System.out.println("Ребенок не может кататься на аттракционе.");
        } else if (age5 < 14 && parents) {
            System.out.println("Ребенок может кататься на аттракционе.");
        } else if (age5 < 14) { System.out.println("Ребенок не может кататься на аттракционе.");
        } else { System.out.println("Ребенок может кататься на аттракционе."); }

        // Задание №3.3
        System.out.println("\nЗадание №3.3");
        int one = 19;
        int two = 17;
        int three = 19;
        if (one >= two && one >= three) {
            System.out.println(one);
        } else if (two >= one && two >= three) {
            System.out.println(two);
        } else if (three >= one && three >= two) {
            System.out.println(three);
        }


    }
}
