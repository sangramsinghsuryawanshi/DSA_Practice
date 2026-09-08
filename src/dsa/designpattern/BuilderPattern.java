package dsa.designpattern;

public class BuilderPattern {
    private final String name;
    private final String surname;
    private BuilderPattern(Builder builder){
        this.name = builder.name;
        this.surname = builder.surname;
    }
    static class Builder {
        private String name;
        private String surname;
        public Builder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }
        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }
    public String toString1(){
        return  String.format("name: %s, surname: %s", this.name, this.surname);
    }
    public static void main(String[] args) {
        BuilderPattern builderPattern = new Builder("s","s").setName("d").setName("d").build();
        System.out.println(builderPattern.toString1());
    }
}
