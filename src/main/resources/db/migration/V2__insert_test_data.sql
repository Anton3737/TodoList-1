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
('John', '$2a$11$5I3ZvzO4hw.Sn/ulHYsefOkz7LLORix64UbplbsTOBqp5xkhm0TqG', 'user', true),
('Jane', '$2a$11$mNMgZdgRVnpoZ9Vtr1vNOuO.djkSQtI/dUKV.VngqDYXb04jyMNlS', 'admin', true),
('Alice', '$2a$11$AKt4pPvOmCqE9YUxYR/3aeyuEnKGziyk.VNMv7PXBSViRLI5a7Hl6', 'user', true),
('Bob', '$2a$11$T6X5uupp1.kzoghJsaXLpu1MCfoD13Mfy.jY74CCxcefanWguFCXq', 'user', true),
('Emily', '$2a$11$OqJSLVbPlJq8wtWwx5Kr2uOYuKtZndTy0SNTvHjNIDEfhHJ.oDZIu', 'user', true),
('Michael', '$2a$11$s5awUbzkCR5U4Nw/A17hkecXWfMQUjZxrXr9hhTtMdOlXxRYthYg6', 'admin', true),
('Sarah', '$2a$11$g.ZVNMlWol9FlHQ1ICMGFuxlrY.m2uLGkpa4RKIUgK7MIOXcsj2LG', 'user', true),
('David', '$2a$11$XRLueegLGnrH8inige6Jw./1E7g9TnZOfGp.zStQttgjotX3lp9hK', 'user', true),
('David', '$2a$11$XRLueegLGnrH8inige6Jw./1E7g9TnZOfGp.zStQttgjotX3lp9hK', 'user', true),
('Olivia', '$2a$11$uqiTRNiAzzLExraQH.8E7.IyLl9XUVp26x6Wj.32yt3n4Kod2kFJi', 'user', true),
('William', '$2a$11$v6YiRiVSdoWUZu1IofS/M.B3/SOyAvKWC0jqX2OPXLK5MSx1zPhqi', 'user', true);


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
