CREATE VIEW LatestCovidData AS
SELECT
    c.country,
    c.report_date,
    c.confirmed,
    c.deaths,
    c.recovered
FROM covid_cases c
JOIN
(
    SELECT
        country,
        MAX(report_date) AS latest_date
    FROM covid_cases
    GROUP BY country
) latest
ON c.country = latest.country
AND c.report_date = latest.latest_date;

SELECT * FROM LatestCovidData;