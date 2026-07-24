CREATE INDEX idx_country_date
ON covid_cases(country, report_date);

CREATE INDEX idx_report_date
ON covid_cases(report_date);

SHOW INDEX FROM covid_cases;
