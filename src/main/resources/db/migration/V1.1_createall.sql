--
-- PostgreSQL database dump
--

-- Dumped from database version 14.5
-- Dumped by pg_dump version 14.4

-- Started on 2022-09-16 19:20:21

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

CREATE TABLE public.author (
    id_author bigint NOT NULL,
    author_name character varying NOT NULL
);

--
-- TOC entry 210 (class 1259 OID 32941)
-- Name: author_books; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.author_books (
    id_author_books bigint NOT NULL,
    id_author bigint,
    id_book bigint
);


--
-- TOC entry 230 (class 1255 OID 32944)
-- Name: selauthorbooks(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE TABLE public.book (
    id_book bigint NOT NULL,
    title character varying NOT NULL,
    number_of_pages bigint NOT NULL
);

--
-- TOC entry 212 (class 1259 OID 32951)
-- Name: library_card; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.library_card (
    id_library_card bigint NOT NULL,
    id_reader bigint,
    id_author_books bigint,
    refund boolean,
    return_date date,
    date_of_issue date
);

-- TOC entry 213 (class 1259 OID 32955)
-- Name: reader; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.reader (
    id_reader bigint NOT NULL,
    full_name character varying NOT NULL,
    addres character varying NOT NULL,
    phone_number bigint NOT NULL
)