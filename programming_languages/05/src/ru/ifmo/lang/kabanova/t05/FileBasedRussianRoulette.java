package ru.ifmo.lang.kabanova.t05;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

/**
 * Created by catherine on 31.05.15.
 */
public class FileBasedRussianRoulette implements RussianRoulette {

    public static void main(final String[] args) throws IOException {
        String pathToAim = args[0];
        String numberOf = args[1];
        Path directoryOfAim = Paths.get(pathToAim);
        RussianRoulette russianRoulette = new FileBasedRussianRoulette(directoryOfAim);
        if (numberOf.equals("bonus")) {
            Gun bonusGun = new BonusGun(listOfAims);
            russianRoulette.play(bonusGun);
        } else {
            final int numberOfBullets = Integer.parseInt(numberOf);
            Gun gun = new SixGun(numberOfBullets);
            russianRoulette.play(gun);
        }

    }

    public final Path pathToDelete;
    public static List<Path> listOfAims = new ArrayList<Path>();

    public FileBasedRussianRoulette(Path pathToDelete) throws IOException {
        this.pathToDelete = pathToDelete;
        final FileVisitor<Path> fileVisitor = new SimpleFileVisitor<Path>() {
            public FileVisitResult visitFile(Path path, BasicFileAttributes attrs)
                    throws IOException {
                listOfAims.add(path);
                return FileVisitResult.CONTINUE;
            }
        };
        Files.walkFileTree(pathToDelete, fileVisitor);

    }

    public static class SixGun implements RussianRoulette.Gun {
        private int numberOfBullets;

        public SixGun(int numberOfBullets) {
            this.numberOfBullets = numberOfBullets;
        }

        public boolean fire() {
            int randomShot = new Random().nextInt(6) + 1;
            return randomShot <= numberOfBullets;
        }
    }

    public static class BonusGun implements RussianRoulette.Gun {
        private List<Path> listOfAims;

        public BonusGun(List<Path> listOfAims) {
            this.listOfAims = listOfAims;
        }

        public boolean fire() {
            Calendar calendar = new GregorianCalendar();
            return ((calendar.get(Calendar.MONTH) == Calendar.JANUARY) | (calendar.get(Calendar.MONTH) == Calendar.JUNE)) && (listOfAims.size() < new Random().nextInt(5));
        }
    }

    public void play(Gun gun) {
        if ((listOfAims.isEmpty())) {
            System.out.println("Удалить нечего, так как директория пуста!");
        } else {
            Path pathOfAim = listOfAims.get(new Random().nextInt(listOfAims.size()));
            final boolean fire = gun.fire();
            if (fire) {
                try {
                    Files.delete(pathOfAim);
                    System.out.println("Файл " + pathOfAim.toString() + " был удален.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Файл " + pathOfAim.toString() + " мог быть удален, но этого не произошло.");
            }
        }
    }
}
