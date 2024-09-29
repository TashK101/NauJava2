package org.example;

import classes.PortScanner;

public class task5 {
    public static void main(String[] args) throws InterruptedException {
        PortScanner scanner = new PortScanner("scanme.nmap.org", 70, 1024);
        scanner.start();

        // to demo the stop() implementation
        Thread.sleep(5000);
        scanner.stop();
    }
}
