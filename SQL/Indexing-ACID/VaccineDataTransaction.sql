START TRANSACTION;

INSERT INTO vaccine_data (
    country,
    report_date,
    total_vaccinated
)
VALUES
(
    'India',
    '2024-01-15',
    500000
);

INSERT INTO vaccine_data (
    country,
    report_date,
    total_vaccinated
)
VALUES
(
    'USA',
    '2024-01-15',
    400000
);

COMMIT;


START TRANSACTION;

INSERT INTO vaccine_data (
    country,
    report_date,
    total_vaccinated
)
VALUES
(
    'India',
    '2024-01-16',
    550000
);

ROLLBACK;
