package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
            float i = this.getValue();
            i = (float) (i*1.8);
            i = i + 32;
            Temperature f = new Fahrenheit(i);
            return f;
    }

    public String toString()
    {
        var s = Float.toString(this.getValue());
        return s + " C";
    }
}
