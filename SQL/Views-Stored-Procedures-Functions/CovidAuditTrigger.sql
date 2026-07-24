CREATE TABLE covid_audit (

    audit_id INT AUTO_INCREMENT PRIMARY KEY,

    country VARCHAR(100),

    report_date DATE,

    old_confirmed INT,
    new_confirmed INT,

    old_deaths INT,
    new_deaths INT,

    old_recovered INT,
    new_recovered INT,

    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP

);

DELIMITER $$

CREATE TRIGGER CovidAuditTrigger

BEFORE UPDATE

ON covid_cases

FOR EACH ROW

BEGIN

    INSERT INTO covid_audit(

        country,
        report_date,

        old_confirmed,
        new_confirmed,

        old_deaths,
        new_deaths,

        old_recovered,
        new_recovered

    )

    VALUES(

        OLD.country,
        OLD.report_date,

        OLD.confirmed,
        NEW.confirmed,

        OLD.deaths,
        NEW.deaths,

        OLD.recovered,
        NEW.recovered

    );

END $$

DELIMITER ;

UPDATE covid_cases

SET
    confirmed = 50000,
    deaths = 900,
    recovered = 47000

WHERE country = 'India'
AND report_date = '2024-01-15';

SELECT * FROM covid_audit;