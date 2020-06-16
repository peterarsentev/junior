package ru.job4j.tracker;

public class ValidateStubInput extends ValidateInput {
    private String[] data;
    private int position;

    public ValidateStubInput(String[] data) {
        super(null);
        this.data = data;
    }

    @Override
    public String askStr(String question) {
        return data[position++];
    }
}
