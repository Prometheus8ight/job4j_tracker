package ru.job4j.tracker.actions;

import ru.job4j.tracker.*;

public class FindByIDAction implements UserAction {
    private final Output out;

    public FindByIDAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find By ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item);
        } else {
            out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}

