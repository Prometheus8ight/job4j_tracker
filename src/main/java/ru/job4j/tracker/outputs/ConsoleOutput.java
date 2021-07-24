package ru.job4j.tracker.outputs;

import ru.job4j.tracker.Output;

public class ConsoleOutput implements Output {
    @Override
    public void println(Object obj) {
        System.out.println(obj);
    }
}
