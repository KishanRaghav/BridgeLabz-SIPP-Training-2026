DELIMITER $$

CREATE PROCEDURE UpdateCovidStats(

    IN p_country VARCHAR(100),
    IN p_date DATE,
    IN p_confirmed INT,
    IN p_deaths INT,
    IN p_recovered INT

)

BEGIN

    UPDATE covid_cases

    SET
        confirmed = p_confirmed,
        deaths = p_deaths,
        recovered = p_recovered

    WHERE country = p_country
    AND report_date = p_date;

END $$

DELIMITER ;

CALL UpdateCovidStats(
    'India',
    '2024-01-15',
    1200,
    25,
    1100
);