INSERT INTO tasks (title, content) VALUES
    ('Планування зустрічі', 'Підготувати порядок денний та списки учасників'),
    ('Аналіз ринку', 'Провести дослідження конкурентів та потенційних клієнтів'),
    ('Відправити прес-реліз', 'Написати та розіслати прес-реліз про новий продукт'),
    ('Оновлення веб-сайту', 'Додати нові сторінки та оновити існуючий контент'),
    ('Підготовка звіту', 'Зібрати дані та підготувати звіт про фінансовий стан компанії'),
    ('Тренінг персоналу', 'Організувати тренінг з підвищення кваліфікації для співробітників'),
    ('Планування рекламної кампанії', 'Розробити стратегію та розпочати підготовку рекламних матеріалів'),
    ('Проведення тестування програмного забезпечення', 'Перевірити нову версію програми на наявність помилок'),
    ('Організація корпоративного заходу', 'Забезпечити місце проведення, розваги та харчування для учасників'),
    ('Підготовка фінансових звітів', 'Зібрати дані та підготувати звіти для подання до влади та банків')
;


INSERT INTO users (username, password, role, enabled) VALUES
('John', '$2a$10$8aMDCQqAbprVY.MXpm/rqu', 'user', true),
('Jane', '$2a$10$8aMDCQqAbprVY.MXpm/rqu', 'admin', true),
('Alice', '$2a$10$8aMDCQqAbprVY.MXpm/rqu', 'user', true),
('Bob', '$2a$10$8aMDCQqAbprVY.MXpm/rqu', 'user', true),
('Emily', '$2a$10$8aMDCQqAbprVY.MXpm/rqu', 'user', true),
('Michael', '$2a$10$8aMDCQqAbprVY.MXpm/rqu', 'admin', true),
('Sarah', '$2a$10$8aMDCQqAbprVY.MXpm/rqu', 'user', true),
('David', '$2a$10$8aMDCQqAbprVY.MXpm/rqu', 'user', true),
('Olivia', '$2a$10$8aMDCQqAbprVY.MXpm/rqu', 'user', true),
('William', '$2a$10$8aMDCQqAbprVY.MXpm/rqu', 'user', true);


--INSERT INTO users (username, password, role, enabled) VALUES
--    ('John', 'password123', 'user', TRUE),
--    ('Jane', 'password456', 'admin', TRUE),
--    ('Alice', 'password789', 'user', TRUE),
--    ('Bob', 'passwordabc', 'user', TRUE),
--    ('Emily', 'passworddef', 'user', TRUE),
--    ('Michael', 'passwordghi', 'admin', TRUE),
--    ('Sarah', 'passwordjkl', 'user', TRUE),
--    ('David', 'passwordmno', 'user', TRUE),
--    ('Olivia', 'passwordpqr', 'user', TRUE),
--    ('William', 'passwordstu', 'user', TRUE);
