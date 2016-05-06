import java.io.IOException;
import java.net.MalformedURLException;
import net.aksingh.owmjapis.CurrentWeather;
import net.aksingh.owmjapis.OpenWeatherMap;
import org.json.JSONException;

public class OwmJapisExample1 {

    public static void main(String[] args)
            throws IOException, MalformedURLException, JSONException {

    	
    	// declaring object of "OpenWeatherMap" class
        OpenWeatherMap owm = new OpenWeatherMap(OpenWeatherMap.Units.METRIC,"050355886f1a877aedb52abd1a036d3c");


        // getting current weather data for the "London" city
        CurrentWeather cwd = owm.currentWeatherByCityName("Bucharest");

        // checking data retrieval was successful or not
        if (cwd.isValid()) {

            // checking if city name is available
            if (cwd.hasCityName()) {
                //printing city name from the retrieved data
                System.out.println("City: " + cwd.getCityName());
            }
  
            if (cwd.getMainInstance().hasMaxTemperature())
            	System.out.println("Max Temperature: " + cwd.getMainInstance().getMaxTemperature() + " C");
            if (cwd.getMainInstance().hasMinTemperature())
            	System.out.println("Min Temperature: " + cwd.getMainInstance().getMinTemperature() + " C");
            if (cwd.getMainInstance().hasPressure())
            	System.out.println("Pressure: " + cwd.getMainInstance().getPressure());
            if (cwd.getMainInstance().hasHumidity())
            	System.out.println("Humidity: " + cwd.getMainInstance().getHumidity()+ "%");
            
            if(cwd.hasCloudsInstance())
            	if(cwd.getCloudsInstance().hasPercentageOfClouds())
            	System.out.println("Percentage Of Clouds: " + cwd.getCloudsInstance().getPercentageOfClouds() + "%");

            if(cwd.hasWindInstance())
            	if(cwd.getWindInstance().hasWindDegree())
            		System.out.println("Wind Degree: " + cwd.getWindInstance().getWindDegree());
            if(cwd.hasWindInstance())
            	if(cwd.getWindInstance().hasWindSpeed())
            		System.out.println("Wind Speed: " + cwd.getWindInstance().getWindSpeed() + "km/h");
            if(cwd.hasSysInstance())
            	System.out.println("Sunrise Time: " + cwd.getSysInstance().getSunriseTime());
            if(cwd.hasSysInstance())
            	System.out.println("Sunset Time: " + cwd.getSysInstance().getSunsetTime());
            
           

    }
}
}    