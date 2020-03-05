/*
Напишите метод, читающий входной поток и вычисляющий контрольную сумму прочитанных данных.

Контрольная сумма данных вычисляется по следующему алгоритму:

Контрольная сумма представляет собой число типа int. Контрольная сумма пустого набора данных равна нулю.
Контрольная сумма непустого набора данных вычисляется по следующей рекуррентной формуле: C_{n+1}=\mathrm{rotateLeft}(C_n)\ \mathrm{xor}\ b_{n+1}C
n+1 =rotateLeft(Cn) xor b n+1 , где C_nC n  — контрольная сумма первых n байт данных, rotateLeft — циклический сдвиг бит числа на один бит влево (чтобы не изобретать велосипед, используйте Integer.rotateLeft), b_nb
n
​
  — n-ный байт данных.
Поскольку метод не открывал данный InputStream, то и закрывать его он не должен. Выброшенное из методов InputStream исключение должно выбрасываться из метода.

Пример
На вход подан InputStream, последовательно возвращающий три байта: 0x33 0x45 0x01. В качестве контрольной суммы должно быть возвращено число 71.

 */

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Stepik_StreamByte {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {0x33, 0x45, 0x01}; //{1,2,3,4,5,6,7,8};
        InputStream input = new ByteArrayInputStream(bytes);
        ChekSum_Stepik_StreamByte ch = new ChekSum_Stepik_StreamByte();
        ch.checkSumOfStream(input);

    }

}


