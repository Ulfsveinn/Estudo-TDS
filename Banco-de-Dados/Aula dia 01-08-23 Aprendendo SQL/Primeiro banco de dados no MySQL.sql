Create table if not exists task (
tasks_id INT AUTO_INCREMENT PRIMARY KEY,
title VARCHAR(255) NOT NULL,
start_date DATE,
due_date DATE,
STATUS TINYINT NOT NULL,
priority TINYINT NOT NULL,
description TEXT,
created_at timestamp DEFAULT CURRENT_TIMESTAMP 
) ENGINE=INNODB;

describe task

;CREATE TABLE IF NOT EXISTS checklists(
todo_id INT AUTO_INCREMENT,
questoes_id INT,
todo VARCHAR(255) NOT NULL,
is_completed BOOLEAN  NOT NULL DEFAULT FALSE,
PRIMARY KEY (todo_id, questoes_id),
FOREIGN KEY (questoes_id)
REFERENCES questoes (questoes_id)
ON UPDATE RESTRICT ON DELETE CASCADE
);

describe checklists
