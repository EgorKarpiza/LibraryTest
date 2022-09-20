--
-- TOC entry 3268 (class 0 OID 33013)
-- Dependencies: 209
-- Data for Name: author; Type: TABLE DATA; Schema: public; Owner: postgres
--


INSERT INTO author (id_author, author_name) VALUES (1, 'Иван Тургенев');
INSERT INTO author (id_author, author_name) VALUES (2, 'Михаил Булгаков');
INSERT INTO author (id_author, author_name) VALUES (3, 'Иван Бунин');
INSERT INTO author (id_author, author_name) VALUES (4, 'Антон Чехов');
INSERT INTO author (id_author, author_name) VALUES (5, 'Фёдор Достоевский');
INSERT INTO author (id_author, author_name) VALUES (6, 'Лев Толстой');
INSERT INTO author (id_author, author_name) VALUES (7, 'Илья Ильф');
INSERT INTO author (id_author, author_name) VALUES (8, 'Евгений Петров');
INSERT INTO author (id_author, author_name) VALUES (9, 'Максим Горький');
INSERT INTO author (id_author, author_name) VALUES (10, 'Борис Пастернак');

--
-- TOC entry 3270 (class 0 OID 33023)
-- Dependencies: 211
-- Data for Name: book; Type: TABLE DATA; Schema: public; Owner: postgres
--


INSERT INTO book (id_book, title, number_of_pages) VALUES (1, 'Отцы и дети', 416);
INSERT INTO book (id_book, title, number_of_pages) VALUES (2, 'Собачье сердце', 110);
INSERT INTO book (id_book, title, number_of_pages) VALUES (3, 'Лёгкое дыхание', 96);
INSERT INTO book (id_book, title, number_of_pages) VALUES (4, 'Дуэль', 88);
INSERT INTO book (id_book, title, number_of_pages) VALUES (5, 'Преступление и наказание', 432);
INSERT INTO book (id_book, title, number_of_pages) VALUES (6, 'Анна Каренина', 1130);
INSERT INTO book (id_book, title, number_of_pages) VALUES (7, 'Кавказский пленник', 60);
INSERT INTO book (id_book, title, number_of_pages) VALUES (8, 'Одноэтажная Америка', 512);
INSERT INTO book (id_book, title, number_of_pages) VALUES (9, 'На дне', 160);
INSERT INTO book (id_book, title, number_of_pages) VALUES (10, 'Доктор Живаго', 704);

--
-- TOC entry 3269 (class 0 OID 33019)
-- Dependencies: 210
-- Data for Name: author_books; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 1, 1);
INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 2, 2);
INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 3, 3);
INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 4, 4);
INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 5, 5);
INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 6, 6);
INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 6, 7);
INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 7, 8);
INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 8, 8);
INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 9, 9);
INSERT INTO author_books (id_author_books, id_author, id_book) VALUES (nextval('seq_aut_book'), 10, 10);

--
-- TOC entry 3272 (class 0 OID 33033)
-- Dependencies: 213
-- Data for Name: reader; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO reader (id_reader, full_name, addres, phone_number) VALUES (1, 'Смирнов Владимир Маркович', 'г. Томск, Урожайный переулок, 28В' , 89526861151);
INSERT INTO reader (id_reader, full_name, addres, phone_number) VALUES (2, 'Алешина Варвара Тимофеевна', 'г. Томск, Ленская улица, 31' , 89526576154);
INSERT INTO reader (id_reader, full_name, addres, phone_number) VALUES (3, 'Воробьев Артемий Дамирович', 'г. Томск, Ново-Станционный переулок, 26' , 89525561153);
INSERT INTO reader (id_reader, full_name, addres, phone_number) VALUES (4, 'Андрианов Серафим Георгиевич', 'г. улица Смирнова, 3А' , 89526441157);
INSERT INTO reader (id_reader, full_name, addres, phone_number) VALUES (5, 'Шарова Софья Марковна', 'г. Томск, проспект Мира, 52' , 89526861557);

--
-- TOC entry 3271 (class 0 OID 33029)
-- Dependencies: 212
-- Data for Name: library_card; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO library_card (id_library_card, id_reader, id_author_books, refund, date_of_issue, return_date) VALUES (nextval('seq_lib_card'), 1, 3, false, '2022-03-10', '2022-04-10');
INSERT INTO library_card (id_library_card, id_reader, id_author_books, refund, date_of_issue, return_date) VALUES (nextval('seq_lib_card'), 4, 5, true, '2022-09-15', '2022-11-15');
