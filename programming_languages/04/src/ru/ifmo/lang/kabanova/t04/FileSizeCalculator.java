package ru.ifmo.lang.kabanova.t04;

import java.io.IOException;

/**
 * Created by catherine on 27.05.15.
 */
public interface FileSizeCalculator {
    /**
     * Подсчитывает суммарный размер удовлетворяющих шаблону файлов, расположенных в указаной папке
     *
     * @param pathToDir    корневая папка, в которой осуществлять поиск файлов
     * @param fileTemplate шаблон имени файла
     * @return размер в байтах
     */
    long getSize(final String pathToDir, final String fileTemplate) throws IOException;

}
