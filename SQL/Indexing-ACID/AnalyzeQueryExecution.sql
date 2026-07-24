SELECT
    c.country,
    c.confirmed,
    v.total_vaccinated
FROM covid_cases c
JOIN vaccine_data v
ON c.country = v.country
WHERE c.report_date = '2024-01-15';

EXPLAIN
SELECT
    country,
    confirmed,
    deaths
FROM covid_cases
WHERE country = 'India'
AND report_date = '2024-01-15';