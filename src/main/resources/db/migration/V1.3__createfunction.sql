--
-- TOC entry 229 (class 1255 OID 33018)
-- Name: selauthor(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION public.selauthor() RETURNS SETOF public.author
    LANGUAGE plpgsql
    AS $$
BEGIN
  RETURN QUERY SELECT * FROM author;
END
$$;


ALTER FUNCTION public.selauthor() OWNER TO postgres;


--
-- TOC entry 230 (class 1255 OID 33022)
-- Name: selauthorbooks(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION public.selauthorbooks() RETURNS SETOF public.author_books
    LANGUAGE plpgsql
    AS $$
BEGIN
  RETURN QUERY SELECT * FROM author_books;
END
$$;


ALTER FUNCTION public.selauthorbooks() OWNER TO postgres;


--
-- TOC entry 231 (class 1255 OID 33028)
-- Name: selbook(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION public.selbook() RETURNS SETOF public.book
    LANGUAGE plpgsql
    AS $$
BEGIN
  RETURN QUERY SELECT * FROM book;
END
$$;


ALTER FUNCTION public.selbook() OWNER TO postgres;


--
-- TOC entry 232 (class 1255 OID 33032)
-- Name: sellibrarycard(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION public.sellibrarycard() RETURNS SETOF public.library_card
    LANGUAGE plpgsql
    AS $$
BEGIN
  RETURN QUERY SELECT * FROM library_card;
END
$$;

ALTER FUNCTION public.sellibrarycard() OWNER TO postgres;

--
-- TOC entry 233 (class 1255 OID 32960)
-- Name: selreader(); Type: FUNCTION; Schema: public; Owner: postgres
--

CREATE FUNCTION public.selreader() RETURNS SETOF public.reader
    LANGUAGE plpgsql
    AS $$
BEGIN
  RETURN QUERY SELECT * FROM reader;
END
$$;


ALTER FUNCTION public.selreader() OWNER TO postgres;

