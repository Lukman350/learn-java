package dev.lukmann.data;

public class Country {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class City {
        private String name;
        private int zipCode;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getZipCode() {
            return zipCode;
        }

        public void setZipCode(int zipCode) {
            this.zipCode = zipCode;
        }

        public String getCountry(Country country) {
            return country.getName();
        }
    }
}
