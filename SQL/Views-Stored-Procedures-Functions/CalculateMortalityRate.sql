DELIMITER $$

CREATE FUNCTION CalculateMortalityRate(
    p_country VARCHAR(100),
    p_date DATE
)
RETURNS DECIMAL(10,2)

DETERMINISTIC

BEGIN

    DECLARE mortality DECIMAL(10,2);

    SELECT
        (deaths * 100.0) / confirmed
    INTO mortality
    FROM covid_cases
    WHERE country = p_country
    AND report_date = p_date;

    RETURN mortality;

END $$

DELIMITER ;

SELECT CalculateMortalityRate('India', '2024-01-15');