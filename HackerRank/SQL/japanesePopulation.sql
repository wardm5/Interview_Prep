Select sum(population)
FROM city
where COUNTRYCODE = 'JPN'
group by countryCode;

-- Output
-- 879196
