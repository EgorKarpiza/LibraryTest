-- Table: public.author

-- DROP TABLE IF EXISTS public.author;

CREATE TABLE IF NOT EXISTS public.author
(
    id_author bigint NOT NULL,
    author_name character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT author_pkey PRIMARY KEY (id_author)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.author
    OWNER to postgres;

-- Table: public.book

-- DROP TABLE IF EXISTS public.book;

CREATE TABLE IF NOT EXISTS public.book
(
    id_book bigint NOT NULL,
    title character varying COLLATE pg_catalog."default" NOT NULL,
    number_of_pages bigint NOT NULL,
    CONSTRAINT book_pkey PRIMARY KEY (id_book)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.book
    OWNER to postgres;

-- Table: public.author_books

-- DROP TABLE IF EXISTS public.author_books;

CREATE TABLE IF NOT EXISTS public.author_books
(
    id_author_books bigint NOT NULL,
    id_author bigint,
    id_book bigint,
    CONSTRAINT author_of_books_pkey PRIMARY KEY (id_author_books),
    CONSTRAINT fk_author FOREIGN KEY (id_author)
        REFERENCES public.author (id_author) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_book FOREIGN KEY (id_book)
        REFERENCES public.book (id_book) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.author_books
    OWNER to postgres;

-- Table: public.reader

-- DROP TABLE IF EXISTS public.reader;

CREATE TABLE IF NOT EXISTS public.reader
(
    id_reader bigint NOT NULL,
    full_name character varying COLLATE pg_catalog."default" NOT NULL,
    addres character varying COLLATE pg_catalog."default" NOT NULL,
    phone_number bigint NOT NULL,
    CONSTRAINT reader_pkey PRIMARY KEY (id_reader)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.reader
    OWNER to postgres;

-- Table: public.library_card

-- DROP TABLE IF EXISTS public.library_card;

CREATE TABLE IF NOT EXISTS public.library_card
(
    id_library_card bigint NOT NULL,
    id_reader bigint,
    id_author_books bigint,
    refund boolean,
    return_date date,
    date_of_issue date,
    CONSTRAINT book_issuance_pkey PRIMARY KEY (id_library_card),
    CONSTRAINT fk_author_books FOREIGN KEY (id_author_books)
        REFERENCES public.book (id_book) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID,
    CONSTRAINT fk_reader FOREIGN KEY (id_reader)
        REFERENCES public.reader (id_reader) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.library_card
    OWNER to postgres;