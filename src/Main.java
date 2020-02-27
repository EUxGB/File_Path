/*
По историческим причинам на разных платформах принят разный способ обозначения конца строки в текстовом файле.
На Unix-системах конец строки обозначается символом с кодом 10 ('\n'), на Windows — двумя последовательными
символами с кодами 13 и 10 ('\r' '\n').

Напишите программу, которая будет преобразовывать переводы строк из формата Windows в формат Unix.
Данные в формате Windows подаются программе в System.in, преобразованные данные должны выводиться в System.out.
На этот раз вам надо написать программу полностью, т.е. объявить класс (с именем Main — таково ограничение проверяющей системы),
метод main, прописать все import'ы.

Требуется заменить все вхождения пары символов '\r' и '\n' на один символ '\n'.
Если на входе встречается одиночный символ '\r', за которым не следует '\n', то символ '\r' выводится без изменения.

Кодировка входных данных такова, что символ '\n' представляется байтом 10, а символ '\r' — байтом 13.
Поэтому программа может осуществлять фильтрацию на уровне двоичных данных, не преобразуя байты в символы.

Из-за буферизации данных в System.out в конце вашей программы надо явно вызвать System.out.flush().
Иначе часть выведенных вами данных не будет видна проверяющей системе.

Пример

Из System.in зачитаны следующие байты: 65 13 10 10 13. Внимание! Это не строка "65 13 10 10 13", а последовательность чисел, возвращаемая методом System.in.read().

В System.out должны быть выведены байты: 65 10 10 13

 */

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        byte [] bytes = {65,13,10,10,13,15,25,13,13,13,10,10,10,65,13,10,10,10,13};
        InputStream inputStream = new ByteArrayInputStream(bytes);
        OutputStream outputStream = new ByteArrayOutputStream();
        //System.setIn(stream);

        int prev ;
        int next = 0;
        prev = inputStream.read();
        while ((next = inputStream.read()) != -1) {
            if (prev != 13 || next  != 10) {
                outputStream.write(prev);
                System.out.print(" "+ prev);
            }

            prev = next;

        }

        System.out.flush();
    }

    }

