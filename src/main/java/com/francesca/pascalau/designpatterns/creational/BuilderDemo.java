package com.francesca.pascalau.designpatterns.creational;

public class BuilderDemo {

    private final String field1;

    public BuilderDemo(Builder builder) {
        this.field1 = builder.field1;
    }

    public String getField1() {
        return field1;
    }

    public static class Builder {
        private String field1;

        public Builder() {
        }

        public BuilderDemo build() {
            return new BuilderDemo(this);
        }

        public Builder field1(String field1) {
            this.field1 = field1;
            return this;
        }
    }
}