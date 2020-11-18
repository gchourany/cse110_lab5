package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float i = this.getValue() - 32;
        i = (float) (i * (0.555555555));
        Temperature c = new Celsius(i);
        return c;
    }

    @Override
    public Temperature toFahrenheit() {

        return this;
    }

    public String toString()
    {
        String s = Float.toString(this.getValue());
        return s + " F";
    }
}
