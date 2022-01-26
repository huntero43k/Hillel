package com.hillel.homeworks.homework07.task6.solution2;

public class LinerEquation {

        private final double a;
        private final double b;
        private final double c;
        private final double d;
        private final double e;
        private final double f;

        LinerEquation(double var1, double var3, double var5, double var7, double var9, double var11) {
            this.a = var1;
            this.b = var3;
            this.c = var5;
            this.d = var7;
            this.e = var9;
            this.f = var11;
        }

        public double getA() {
            return this.a;
        }

        public double getB() {
            return this.b;
        }

        public double getC() {
            return this.c;
        }

        public double getD() {
            return this.d;
        }

        public double getE() {
            return this.e;
        }

        public double getF() {
            return this.f;
        }

        public boolean isSolvable() {
            return this.a * this.d - this.b * this.c != 0.0D;
        }

        public double getX() {
            return (this.e * this.d - this.b * this.f) / (this.a * this.d - this.b * this.c);
        }

        public double getY() {
            return (this.a * this.f - this.e * this.c) / (this.a * this.d - this.b * this.c);
        }
}

