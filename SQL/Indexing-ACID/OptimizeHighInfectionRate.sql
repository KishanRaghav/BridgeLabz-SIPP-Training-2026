CREATE INDEX idx_infection_rate
ON covid_cases(infection_rate);

SELECT country, infection_rate
FROM covid_cases
ORDER BY infection_rate DESC
LIMIT 10;
