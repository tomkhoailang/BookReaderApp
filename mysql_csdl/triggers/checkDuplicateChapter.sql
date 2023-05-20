CREATE DEFINER = CURRENT_USER TRIGGER `project1`.`bookchapter_BEFORE_INSERT` BEFORE INSERT ON `bookchapter` FOR EACH ROW
BEGIN
	IF EXISTS (
    SELECT * 
    FROM bookChapter 
    WHERE chapter_serial = NEW.chapter_serial AND book_id = NEW.book_id
    ) THEN 
		SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'THE CHAPTER FOR THAT BOOK ID HAS ALREADY EXISTED';
	END IF;
END
