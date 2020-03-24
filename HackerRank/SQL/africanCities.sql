Select city.name
from city, country
where country.code = city.countrycode and country.CONTINENT = 'Africa';

-- Output
-- Qina 
-- Warraq al-Arab 
-- Kempton Park 
-- Alberton 
-- Klerksdorp 
-- Uitenhage 
-- Brakpan 
-- Libreville
