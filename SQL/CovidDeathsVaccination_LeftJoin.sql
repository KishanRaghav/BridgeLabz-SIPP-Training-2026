SELECT d.country_id,
       d.total_deaths,
       v.vaccination_status
FROM covid_deaths d
LEFT JOIN covid_vaccines v
ON d.country_id = v.country_id;