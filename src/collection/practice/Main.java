package collection.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[]args){
//        Практическое задание для Java 8
//
//        1. Напишите программу на Java, чтобы создать новый список массивов,
//        добавить несколько городов, вывести их в консоль.
//
//        2. Напишите программу Java для вставки элемента в список массивов в первую позицию.
//
//        3. Напишите программу Java для извлечения элемента (по указанному индексу) из заданного списка массивов.
//
//        4. Напишите программу Java для обновления определенного элемента массива заданным элементом.
//
//        5. Напишите программу на Java для удаления третьего элемента из списка массивов.
//
//        6. Напишите программу Java для поиска элемента в списке массивов.
//
//        7. Напишите программу на Java для сортировки заданного списка массивов.
//
//        8. Напишите программу на Java для копирования одного списка массивов в другой.
//
//        9. Напишите программу на Java для перемешивания элементов в списке массивов.
//
//        10. Напишите программу на Java, чтобы поменять местами элементы в списке массивов.
//
//        11. Напишите программу Java для извлечения части массива




//        Java 8 үчүн практикалык тапшырма
//
//        1. Жаңы массив тизмесин түзүү үчүн Java программасын жазыңыз,
//        бир нече шаарларды  кошуп, аларды консольго чыгарыныз.
        ArrayList<String>strings=new ArrayList<>();
        strings.add("Osh");
        strings.add("Talas");
        strings.add("Naryn");
        System.out.println(strings);

        System.out.println("________________________-");

//
//        2. Массив тизмесине элементти биринчи орунга киргизүү үчүн Java программасын жаз.
        ArrayList<Integer>integers=new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        System.out.println(integers);
        integers.add(0,0);
        System.out.println(integers);
        System.out.println("____________________________");


//
//        3. Берилген массивдердин тизмесинен элементти (белгиленген индексте) алуу үчүн Java программасын жазыңыз.
        ArrayList<String>strings1=new ArrayList<>();
        strings1.add("Java-8");
        strings1.add("Java-7");
        strings1.add("Java-6");
        strings1.add("JavaScript");
        System.out.println(strings1);
        System.out.println(strings1.get(1));
        System.out.println("_________________________");

//
//        4. Берилген элемент боюнча белгилүү бир массив элементин озгортуу үчүн Java программасын жазыңыз.
        ArrayList<String>strings2=new ArrayList<>();
        strings2.add("Peaksoft House");
        strings2.add("Facebook");
        strings2.add("Game zone");
        strings2.add("Google");
        strings2.add("Apple");
        System.out.println("Offices in the peaksoft house: "+strings2);
        strings2.set(4,"Space X");
        System.out.println(strings2);

        System.out.println("_____________________________");

//
//        5. Массив тизмесинен үчүнчү элементти очуруп салуу үчүн Java программасын жазыңыз.
        ArrayList<Integer>integers1=new ArrayList<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        integers1.add(5);
        integers1.add(6);
        System.out.println(integers1);
        integers1.remove(3);
        System.out.println(integers1);
        System.out.println("_______________________");

//
//        6. Массив тизмесиндеги элементти издөө үчүн Java программасын жазыңыз.
        ArrayList<Character>characters=new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('$');
        characters.add('C');
        characters.add('D');
        System.out.println(characters);
        System.out.println(characters.contains('$'));
        System.out.println("_______________________________-");
//
//        7. Берилген массивдердин тизмесин сорттоо үчүн Java программасын жазыңыз.
        ArrayList<Integer>integers2=new ArrayList<>();
        integers2.add(56);
        integers2.add(45);
        integers2.add(98);
        integers2.add(43);
        integers2.add(23);
        integers2.add(67);
        System.out.println("integers2 before sort: "+integers2);
        Collections.sort(integers2);
        System.out.println("integers2 after sort: "+integers2);

        System.out.println("____________________________________");
//
//        8. Бир массив тизмесин экинчи масивге көчүрүү үчүн Java программасын жазыңыз.
        ArrayList<Character> characters1=new ArrayList<>();
        characters1.add('A');
        characters1.add('B');
        characters1.add('C');
        ArrayList<Character> characters2 = new ArrayList<>();
        characters2.add('1');
        characters2.add('2');
        characters2.add('3');
        System.out.println("List1:"+ characters1);
        Collections.copy(characters1,characters1);
        System.out.println("List2:"+characters2);
        System.out.println("____________________________");

//
//        9. Массив тизмесиндеги элементтерди аралаштыруу үчүн Java программасын жазып.
//        Маанилерин консольго чыгарыныз.

        ArrayList<String>strings3=new ArrayList<>();
        strings3.add("Naryn");
        strings3.add("Osh");
        strings3.add("Talas");
        strings3.add("Yssyk Kol");
        System.out.println(strings3);
        Collections.shuffle(strings3);
        System.out.println(strings3);
        System.out.println("_________________________");

//
//        10. Массив тизмесиндеги элементтерди тескери өзгөртүү үчүн Java программасын жазыңыз.
        ArrayList<String>colors=new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("pink");
        colors.add("yellow");
        colors.add("blue");
        System.out.println(colors);
        Collections.reverse(colors);
        System.out.println(colors);
        System.out.println("_________________________________");


//
//        11. Аррейлисттин бир бөлүгүн алуу үчүн Java программасын жазыңыз
        ArrayList<String> lessons=new ArrayList<>();
        lessons.add("English");
        lessons.add("Soft Skill");
        lessons.add("Event");
        lessons.add("Practice");
        lessons.add("Technical");
        System.out.println("Lessons:"+lessons);
        ArrayList<String>lessons2=new ArrayList<>(lessons.subList(0,2));
        System.out.println(lessons2);
    }
}
