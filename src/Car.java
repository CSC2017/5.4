

    public class Car {
        static int carCounter = 0;
        String color;
        int horsepower;
        String make;
        double engineSize;

        public Car() {
            carCounter++;
            this.make = "Toyota";
            this.color = "Silver";
            this.horsepower = 250;
            this.engineSize = 2.5;
        }

        public Car(String color, String make, int horsepower, double engineSize) {
            carCounter++;
            this.color = color;
            this.make = make;
            this.horsepower = horsepower;
            this.engineSize = engineSize;
        }


        public String getMake() {
            return make;
        }

        public void setMake(String newMake) {
            this.make = newMake;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String newColor) {
            this.color = newColor;
        }

        public int getHorsepower() {
            return horsepower;
        }

        public void setHorsepower(int newHorsepower) {
            this.horsepower = newHorsepower;
        }

        public double getEngineSize() {
            return engineSize;
        }

        public void setEngineSize(double newEngineSize) {
            this.engineSize = newEngineSize;
        }

        public String toString() {
            String output = (this.color + " " + this.make + ", " + this.horsepower + ", " + this.engineSize);
            return output;
        }

        public static int getCount() {
            int count = carCounter;
            return count;
        }

        public boolean equals(Car car2) {
            if(this.getColor() == car2.getColor() && this.getMake() == car2.getMake() && this.getEngineSize() == car2.getEngineSize() && this.getHorsepower() == car2.getHorsepower()) {
                return true;
            } else {
                return false;
            }
        }
    }

