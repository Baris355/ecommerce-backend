-- Passwords are in the format: Password<UserLetter>"123. Unless specified otherwise.
-- Encrypted using https://www.javainuse.com/onlineBcrypt
INSERT INTO local_user(email, first_name, last_name, password, username, email_verified)
    VALUES ('UserA@junit.com', 'UserA-FirstName', 'UserA-LastName', '$2a$10$YzrSvDl/40VLxfTMq5rIfOM0esjgBqSmIMH3oIOlm9ZCkcsq8gGZC', 'UserA', true)
    , ('UserB@junit.com', 'UserB-FirstName', 'UserB-LastName', '$2a$10$PFvPX1vIP02zBtErfekyTOOYdcaPT.LI8QspeP7.LeViIMYSyypqW', 'UserB', false)