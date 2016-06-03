package com.gojavaonline3.dlenchuk.module03.fs;

/**
 * Created by Dmitrij Lenchuk on 01.06.2016.
 * Runner FS
 */
public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {

        Directory rootDir = new Directory("/");

        rootDir.add(new Directory("etc"));
        rootDir.add(new Directory("home"));
        rootDir.add(new Directory("opt"));
        rootDir.add(new Directory("tmp"));
        rootDir.add(new Directory("sys"));

        rootDir.add(new TextFile("read.me"));
        rootDir.add(new TextFile("license"));

        System.out.println();
        System.out.println("Opening Directory '" + rootDir + "'..." + (rootDir.fileCount() == 0 ? " is Empty" : ""));
        rootDir.open();

        System.out.println();
        System.out.println();
        Directory homeDir = (Directory) (rootDir.file("home"));
        homeDir.add(new Directory("user1"));
        Directory userDir = (Directory) (homeDir.file("user1"));
        userDir.add(new ImageFile("avatar.jpg"));
        userDir.add(new ImageFile("fingerprint1.jpg"));
        userDir.add(new ImageFile("fingerprint2.jpg"));
        userDir.add(new ImageFile("fingerprint3.jpg"));
        userDir.add(new ImageFile("fingerprint4.jpg"));
        userDir.add(new ImageFile("fingerprint5.jpg"));
        userDir.add(new AudioFile("voice_sample1.mp3"));
        userDir.add(new AudioFile("voice_sample2.mp3"));
        userDir.add(new AudioFile("voice_sample3.mp3"));
        userDir.add(new AudioFile("voice_sample4.mp3"));

        System.out.println();
        System.out.println("Opening Directory '" + userDir + "'..." + (userDir.fileCount() == 0 ? " is Empty" : ""));
        userDir.open();

        System.out.println();
        System.out.println();
        userDir.setName("user2");

        System.out.println();
        System.out.println("Opening Directory '" + userDir + "'..." + (userDir.fileCount() == 0 ? " is Empty" : ""));
        userDir.open();


        System.out.println();
        System.out.println("Coping directory '/' to '/etc'...");
        Directory etcDir = (Directory) rootDir.file("etc");
        try {
            etcDir.copy(rootDir);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Opening Directory '" + etcDir + "'..." + (etcDir.fileCount() == 0 ? " is Empty" : ""));
        etcDir.open();

        System.out.println();
        System.out.println("Coping directory '/user2' to '/etc'...");
        try {
            etcDir.copy(userDir);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Opening Directory '" + etcDir + "'..." + (etcDir.fileCount() == 0 ? " is Empty" : ""));
        etcDir.open();

        System.out.println();
        System.out.println("Moving directory...");
        Directory optDir = (Directory) (rootDir.file("opt"));
        rootDir.move(etcDir, optDir);
        System.out.println("Opening Directory '" + optDir + "'..." + (optDir.fileCount() == 0 ? " is Empty" : ""));
        optDir.open();

        System.out.println();
        System.out.println();
        rootDir.file("license").open();
        userDir.file("fingerprint2.jpg").open();
        userDir.file("voice_sample3.mp3").open();

        System.out.println();
        try {
            System.out.print("Opening not existed file... ");
            rootDir.file("not existed file").open();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        System.out.println();
        System.out.println();
        rootDir.delete("home");

        System.out.println();
        System.out.println("Opening Directory '" + rootDir + "'..." + (rootDir.fileCount() == 0 ? " is Empty" : ""));
        rootDir.open();

        System.out.println();
        System.out.println();
        rootDir.clear();

        System.out.println();
        System.out.println("Opening Directory '" + rootDir + "'..." + (rootDir.fileCount() == 0 ? " is Empty" : ""));
        rootDir.open();

    }
}
