DELIMITER $$

CREATE FUNCTION CalculateRecoveryRate(

    p_country VARCHAR(100)

)

RETURNS DECIMAL(10,2)

DETERMINISTIC

BEGIN

    DECLARE recovery DECIMAL(10,2);

    SELECT
        (recovered * 100.0) / confirmed
    INTO recovery

    FROM covid_cases

    WHERE country = p_country

    ORDER BY report_date DESC

    LIMIT 1;

    RETURN recovery;

END $$

DELIMITER ;

SELECT CalculateRecoveryRate('India');