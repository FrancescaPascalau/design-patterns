package com.francesca.pascalau.designpatterns.creational.factory;

public class WebsiteFactory {

    public static Website getWebsite(String websiteType) {
        switch (websiteType) {
            case "blog": {
                return new Blog();

            }
            case "site": {
                return new Site();
            }
            default:
                return null;
        }
    }
}
