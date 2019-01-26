SELECT
      table_name,
      table_rows,
      case
        WHEN table_name = "tcash_subscription" then "YES"
        WHEN table_name = "fsd_counter2" then "YES"
		WHEN table_name = "fsd_subscription" then "YES"
        else "NO"
      END as NEED_MIGRATE
FROM INFORMATION_SCHEMA.TABLES
WHERE TABLE_SCHEMA = 'belajar';