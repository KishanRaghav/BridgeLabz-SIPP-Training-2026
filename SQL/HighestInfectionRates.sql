SELECT country_name,
       population,
       confirmed_cases,
       (confirmed_cases * 100.0 / population) AS infection_rate
FROM covid_cases
ORDER BY infection_rate DESC;