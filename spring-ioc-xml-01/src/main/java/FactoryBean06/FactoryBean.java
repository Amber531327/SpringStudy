package FactoryBean06;

public class FactoryBean implements org.springframework.beans.factory.FactoryBean<JavaBean4> {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public JavaBean4 getObject() throws Exception {
        JavaBean4 javaBean4 = new JavaBean4();
        javaBean4.setName(name);
        return javaBean4;
    }


    @Override
    public Class<?> getObjectType() {
        return JavaBean4.class;
    }
}
