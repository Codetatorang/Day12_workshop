package sg.edu.nus.iss.day12_workshop.service;

import java.util.List;

import sg.edu.nus.iss.day12_workshop.model.Country;
import sg.edu.nus.iss.day12_workshop.repository.CountryRepo;

public class CountryService {
    CountryRepo ctyRepo;

    public CountryService(){
        ctyRepo = new CountryRepo();
    }

    public List<Country> getAllCountries(){
        return ctyRepo.getAllCountries();
    }

    public Boolean createCountry(Country cty){
        boolean result = ctyRepo.createCountry(cty);
        return result;
    }
}
