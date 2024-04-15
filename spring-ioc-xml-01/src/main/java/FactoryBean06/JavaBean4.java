package FactoryBean06;

public class JavaBean4 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "JavaBean4{" +
                "name='" + name + '\'' +
                '}';
    }
}
