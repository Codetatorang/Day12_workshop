package sg.edu.nus.iss.day12_workshop.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import sg.edu.nus.iss.day12_workshop.model.Country;

@Repository
public class CountryRepo {
    List<Country> countryList;
    public List<Country> getAllCountries(){
        countryList = new ArrayList<>();
        Country city = new Country("SG","Singapore",6_000_000);
        countryList.add((city));
        city = new Country("MY","Malaysia",33_000_000);
        countryList.add((city));
        city = new Country("CN","China",1_430_000_000);
        countryList.add((city));
        city = new Country("HK","Hong Kong",7_000_000);
        countryList.add((city));

        return countryList;
    }

    public Boolean createCountry(Country cty){
        if(countryList == null){
            countryList = new ArrayList<>();
        }
        countryList.add(cty);
        return true;
    }
}
