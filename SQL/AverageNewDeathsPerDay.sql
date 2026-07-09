SELECT case_date,
       AVG(new_deaths) AS average_new_deaths
FROM covid_deaths
GROUP BY case_date
ORDER BY case_date;